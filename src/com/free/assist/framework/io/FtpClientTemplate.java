package com.free.assist.framework.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;

/**
 * <p>该对象为common io的FTPClient模板类，目前提供保存与下载二个操作。</p>
 * <p>因为FtpClientManager要经常更换，使用prototype适用。</p>
 * @author 李猛
 * @date 2000-11-03 13:15:32
 */
public class FtpClientTemplate {

    protected Logger logger = LoggerFactory.getLogger(FtpClientTemplate.class);

    private String host;

    private int port;

    private String user;

    private String password;

    private String encoding;

    public FtpClientTemplate(String host, int port, String user, String password, String encoding) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.encoding = encoding;
    }

    public Object execute(FtpClientCallBack action) {
        FTPClient ftpClient = buildFtpClient();
        Object object = null;
        try {
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            object = action.doInFtpClient(ftpClient);
        } catch (IOException e) {
            throw new FtpException(e.getMessage(), e);
        } finally {
            try {
                ftpClient.logout();
            } catch (IOException e) {
                throw new FtpException(e.getMessage(), e);
            } finally {
                try {
                    ftpClient.disconnect();
                } catch (IOException e) {
                    throw new FtpException(e.getMessage(), e);
                }
            }
            ftpClient = null;
        }
        return object;
    }

    public String store(final InputStream inputStream, final String fileNameWithPath) {
        String filename = (String) execute(new FtpClientCallBack() {
            public Object doInFtpClient(FTPClient ftpClient) throws FtpException {
                String fileName = FilenameUtils.getName(fileNameWithPath);
                String pathName = FilenameUtils.getFullPath(fileNameWithPath);
                try {
                    FTPFile[] files = ftpClient.listFiles(pathName);
                    if (files.length == 0) {
                        ftpClient.makeDirectory(pathName);
                    }
                    boolean result = ftpClient.changeWorkingDirectory(pathName);
                    if (!result) {
                        throw new FtpException(ftpClient.getReplyString());
                    }

                    /*
                     * String[] fileNames = ftpClient.listNames(fileName); for (int i = 1; fileNames != null; i++) {
                     * StringBuilder buffer = new StringBuilder();
                     * buffer.append(FilenameUtils.getBaseName(fileNameWithPath
                     * )).append("[").append(i).append("].").append(FilenameUtils.getExtension(fileName)); fileName =
                     * buffer.toString(); fileNames = ftpClient.listNames(fileName); }
                     */
                    result = ftpClient.storeFile(fileName, inputStream);
                    if (!result) {
                        throw new FtpException(ftpClient.getReplyString());
                    }
                } catch (IOException e) {
                    throw new FtpException(e.getMessage(), e);
                }
                return pathName + fileName;
            }
        });
        return filename;
    }

    public InputStream fetch(final String fileNameWithPath) {
        return (InputStream) execute(new FtpClientCallBack() {
            public Object doInFtpClient(FTPClient ftpClient) throws FtpException {
                InputStream inputStream = null;
                try {
                    InputStream is = ftpClient.retrieveFileStream(fileNameWithPath);
                    if (ftpClient.getReplyCode() != FTPReply.CODE_150) {
                        throw new FtpException(ftpClient.getReplyString());
                    }
                    // 这里读出来的数据如果不copy出来，会因为ftp中断而丢失数据。
                    byte[] buf = FileCopyUtils.copyToByteArray(is);
                    inputStream = new ByteArrayInputStream(buf);
                } catch (IOException e) {
                    throw new FtpException(e.getMessage(), e);
                }
                return inputStream;
            }
        });
    }

    private FTPClient buildFtpClient() {
        FTPClient ftpClient = new FTPClient();
        ftpClient.setControlEncoding(StringUtils.defaultIfEmpty(encoding, "GBK"));
        try {
            ftpClient.connect(host, port);
        } catch (IOException e) {
            throw new FtpException(String.format("failed to connect to %s.", host));
        }
        if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
            }
            throw new FtpException(String.format("%s refused connection.", host));
        }

        if (StringUtils.isBlank(user)) {
            user = "anonymous";
            password = "";
        }
        try {
            if (!ftpClient.login(user, password)) {
                throw new FtpException(ftpClient.getReplyString());
            }
        } catch (IOException e) {
            try {
                ftpClient.disconnect();
            } catch (IOException e1) {
            }
            throw new FtpException(e.getMessage(), e);
        }
        return ftpClient;
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
        /*
         * URL locationHost = new URL("http://10.7.188.171/WHXF_WebApp/Controls/Attachment.aspx?id=115698");
         * HttpAttachment httpAttachment = new HttpAttachment(locationHost); InputStream inputStream =
         * httpAttachment.getInputStream();
         * 
         * FtpClientTemplate ftpClientTemplate2 = new FtpClientTemplate("132.33.2.72", 21, "sh_eoms", "sh_eoms", "GBK");
         * String result = ftpClientTemplate2.store(inputStream, "/sh_eoms/sa/common_download/0911120024111131.doc");
         * System.out.println(result);
         */
    }
}
