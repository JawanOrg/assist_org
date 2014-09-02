package com.free.assist.web.servlet;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.framework.io.FtpClientTemplate;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.util.SpringContextUtil;

public class FileDownloadServlet extends HttpServlet {

    private static final long serialVersionUID = -3105726864644223483L;

    /**
    	 * Constructor of the object.
    	 */
    public FileDownloadServlet() {
        super();
    }

    /**
    	 * Destruction of the servlet. <br>
    	 */
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
    	 * The doGet method of the servlet. <br>
    	 *
    	 * This method is called when a form has its tag value method equals to get.
    	 * 
    	 * @param request the request send by the client to the server
    	 * @param response the response send by the server to the client
    	 * @throws ServletException if an error occurred
    	 * @throws IOException if an error occurred
    	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String host = null;
        int port = 21;
        String user = null;
        String password = null;
        String encoding = null;
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
                }
            }
        }
        String attachId = request.getParameter("attachId");
        if (attachId == null || attachId.trim().length() == 0) {
            return;
        }
        CommonOperateService commonOperateService =
                SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
        SuptAttach attachKey = new SuptAttach();
        attachKey.setAttachId(attachId);
        SuptAttach attach = (SuptAttach) commonOperateService.selectByPrimaryKey(attachKey);
        if (attach == null) {
            return;
        }
        FtpClientTemplate ftpClientTemplate = new FtpClientTemplate(host, port, user, password, encoding);
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = ftpClientTemplate.fetch(attach.getFtpPath());
            byte[] buffer = new byte[inStream.available()];
            inStream.read(buffer);
            inStream.close();
            response.reset();
            response.addHeader("content-type", "application/x-msdownload");
            response.addHeader("Content-Disposition",
                    "attachment;filename=" + java.net.URLEncoder.encode(attach.getFileName(), "UTF-8"));
            response.addHeader("Content-Length", attach.getFileSize().toString());
            response.setContentType("application/octet-stream");
            outStream = new BufferedOutputStream(response.getOutputStream());
            outStream.write(buffer);
            outStream.flush();
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (inStream != null) {
                    inStream.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (inStream != null) {
                    inStream.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
    	 * The doPost method of the servlet. <br>
    	 *
    	 * This method is called when a form has its tag value method equals to post.
    	 * 
    	 * @param request the request send by the client to the server
    	 * @param response the response send by the server to the client
    	 * @throws ServletException if an error occurred
    	 * @throws IOException if an error occurred
    	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(", using the POST method");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    /**
    	 * Initialization of the servlet. <br>
    	 *
    	 * @throws ServletException if an error occurs
    	 */
    public void init() throws ServletException {
        // Put your code here
    }

}
