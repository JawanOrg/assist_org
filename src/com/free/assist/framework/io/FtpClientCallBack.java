package com.free.assist.framework.io;

import org.apache.commons.net.ftp.FTPClient;

/**
 * <p>FtpClientªÿµ˜</p>
 * @author ¿Ó√Õ
 * @date Jul 30, 2008
 */
public interface FtpClientCallBack {

	public Object doInFtpClient(FTPClient ftpClient) throws FtpException;
}
