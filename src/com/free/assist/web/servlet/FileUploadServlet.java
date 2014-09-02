package com.free.assist.web.servlet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.domain.SysUser;
import com.free.assist.framework.io.FtpClientTemplate;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.util.Constant;
import com.free.assist.util.Helper;
import com.free.assist.util.SpringContextUtil;

public class FileUploadServlet extends HttpServlet {
    private static final long serialVersionUID = -50233024355861570L;

    private static final String FILE_UPLOAD_JSP = "/jsp/common/uploadFile.jsp";
    private static final int HTTP_REDUNDANT_LENGTH = 1024;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher(FILE_UPLOAD_JSP);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        String returnMessage = Constant.OPERATE_RESULT_SUCCESS;
        try {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (isMultipart) {

                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                String host = null;
                int port = 21;
                String user = null;
                String password = null;
                String encoding = null;
                Long maxLength = 0L;
                ISysDicService sysDicService = SpringContextUtil.getBean("sysDicService", ISysDicService.class);
                SysDicItemExample itemEx = new SysDicItemExample();
                SysDicConfigExample configEx = new SysDicConfigExample();
                configEx.createCriteria().andDictionaryCodeEqualTo("pub_acctach_config").andIsValidEqualTo("Y");
                @SuppressWarnings("unchecked")
                List<SysDicConfig> configList = sysDicService.selectByExample(configEx);
                if (configList != null && configList.size() == 1) {
                    itemEx.createCriteria().andDictionaryIdEqualTo(configList.get(0).getDictionaryId());
                    @SuppressWarnings("unchecked")
                    List<SysDicItem> itemList = sysDicService.selectByExample(itemEx);
                    for (SysDicItem item : itemList) {
                        if ("host".equals(item.getItemCode())) {
                            host = item.getItemValue();
                        } else if ("port".equals(item.getItemCode())) {
                            port = Integer.parseInt(item.getItemValue());
                        } else if ("user".equals(item.getItemCode())) {
                            user = item.getItemValue();
                        } else if ("password".equals(item.getItemCode())) {
                            password = item.getItemValue();
                        } else if ("encoding".equals(item.getItemCode())) {
                            encoding = item.getItemValue();
                            upload.setHeaderEncoding(encoding);
                        } else if ("maxLength".equals(item.getItemCode())) {
                            maxLength = Long.parseLong(item.getItemValue());
                            upload.setFileSizeMax(maxLength);
                            upload.setSizeMax(maxLength);
                        }
                    }

                }
                int filesSize = request.getContentLength() - HTTP_REDUNDANT_LENGTH;
                if (filesSize >= maxLength) {
                    returnMessage =
                            "文件大小限制为" + maxLength / (1024 * 1024) + "M，但当前文件大小为： " + filesSize / (1024 * 1024) + "M";
                    return;
                }
                if (host == null || user == null || password == null || encoding == null || maxLength == 0L) {
                    returnMessage = "文件上传参数配置问题，请联系系统管理员！";
                    return;
                }
                SuptAttach attach = new SuptAttach();
                SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
                attach.setCreator(currentUser.getUserId());
                Class<?> clazz = Class.forName(attach.getClass().getName());
                Method[] methodArray = clazz.getDeclaredMethods();
                String methodName = null;
                List<FileItem> fileItemList = upload.parseRequest(request);
                Iterator<FileItem> fileItemIter = fileItemList.iterator();
                while (fileItemIter.hasNext()) {
                    FileItem filder = (FileItem) fileItemIter.next();
                    if (filder.isFormField()) {
                        methodName =
                                "set" + filder.getFieldName().substring(0, 1).toUpperCase()
                                        + filder.getFieldName().substring(1);
                        request.setAttribute(filder.getFieldName(), filder.getString(encoding));
                        for (Method method : methodArray) {
                            if (method.getName().equals(methodName)) {
                                method.invoke(attach, filder.getString(encoding));
                            }
                        }

                    }
                }
                FtpClientTemplate ftpClientTemplate = null;
                String filePath = null;
                String extendName = null;
                BufferedInputStream stream = null;
                CommonOperateService commonOperateService =
                        SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
                fileItemIter = fileItemList.iterator();
                while (fileItemIter.hasNext()) {
                    FileItem filder = (FileItem) fileItemIter.next();
                    if (!filder.isFormField()) {
                        if (filder.getSize() >= maxLength) {
                            returnMessage =
                                    "文件大小限制为" + maxLength / (1024 * 1024) + "M，但当前文件大小为： " + filder.getSize()
                                            / (1024 * 1024) + "M";
                            return;
                        }
                        if (filder.getName().lastIndexOf(".") == -1) {
                            returnMessage = "文件类型未知，不允许上传！";
                            return;
                        } else {
                            extendName = filder.getName().substring(filder.getName().lastIndexOf(".") + 1);
                        }
                        if (ftpClientTemplate == null) {
                            ftpClientTemplate = new FtpClientTemplate(host, port, user, password, encoding);
                        }
                        stream = new BufferedInputStream(filder.getInputStream());
                        filePath = Helper.getCurrentDateMonth() + "/" + Helper.getCurrentTime() + "." + extendName;
                        ftpClientTemplate.store(stream, filePath);

                        attach.setFileName(filder.getName());
                        attach.setExtendName(extendName);
                        attach.setFileSize(filder.getSize());
                        attach.setFtpPath(filePath);
                        commonOperateService.uploadFile(attach);
                    }
                }
            }
        } catch (Exception e) {
            returnMessage = e.toString();
            e.printStackTrace();
        } finally {
            request.setAttribute("returnMessage", returnMessage);
            RequestDispatcher rd = request.getRequestDispatcher(FILE_UPLOAD_JSP);
            rd.forward(request, response);
        }
    }
}
