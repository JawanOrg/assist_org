package com.free.assist.framework.io;

import org.apache.commons.net.ftp.FTPClient;

/**
 * <p>FtpClient�ص�</p>
 * @author ����
 * @date Jul 30, 2008
 */
public interface FtpClientCallBack {

	public Object doInFtpClient(FTPClient ftpClient) throws FtpException;
}
