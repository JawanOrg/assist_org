/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.framework.io.FtpClientTemplate;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.iface.attach.Attachment;
import com.free.assist.service.iface.attach.FtpAttachment;
import com.free.assist.service.iface.attach.HttpAttachment;

/**
 * @author 李猛
 * @version 1
 * @date 2009-11-08 21:12:19
 */
@Service("ifaceAttachFacade")
public class IfaceAttachFacadeImpl extends BaseServiceImpl implements IfaceAttachFacade {

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.attach.AttachmentService#getAttachment(com.regaltec.blocimp.domain.IfaceDaemonAttachment)
	 */
	public Attachment getAttachment(IfaceDaemonAttachment ifaceDaemonAttachment) throws MalformedURLException {
		URL locationUrl = null;
		if (StringUtils.startsWithIgnoreCase(ifaceDaemonAttachment.getHostLocation(), "http")) {
			locationUrl = new URL(ifaceDaemonAttachment.getHostLocation());
			return new HttpAttachment(locationUrl);
		} else {
			IfaceConfigProtocol ifaceConfigProtocol = findProtocol(ifaceDaemonAttachment.getHostId(), IfaceConfigProtocol.PROTOCOL_NAME_FTP);
			if (StringUtils.isNotBlank(ifaceConfigProtocol.getAuthAccount())) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("ftp://").append(ifaceConfigProtocol.getAuthAccount());
				if (StringUtils.isNotBlank(ifaceConfigProtocol.getAuthPassword())) {
					stringBuilder.append(":").append(ifaceConfigProtocol.getAuthPassword());
				}
				stringBuilder.append("@").append(ifaceConfigProtocol.getRemoteHost());
				stringBuilder.append(":").append(ifaceConfigProtocol.getRemotePort());
				stringBuilder.append(StringUtils.replace(FilenameUtils.normalize(ifaceDaemonAttachment.getHostLocation()), "\\", "/"));
				locationUrl = new URL(stringBuilder.toString());
			}
			return new FtpAttachment(locationUrl);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.attach.AttachmentService#replicate(com.regaltec.blocimp.service.attach.Attachment, java.lang.String)
	 */
	public void replicate(Attachment attachment, String protocolId, String fileNameWithPath) {
		IfaceConfigProtocol ifaceConfigProtocol = ifaceConfigFacade.getProtocol(protocolId);
		String host = ifaceConfigProtocol.getRemoteHost();
		Integer port = ifaceConfigProtocol.getRemotePort();
		String user = ifaceConfigProtocol.getAuthAccount();
		String password = ifaceConfigProtocol.getAuthPassword();
		FtpClientTemplate ftpClientTemplate = new FtpClientTemplate(host, port, user, password, "GBK");
		ftpClientTemplate.store(attachment.getInputStream(), fileNameWithPath);
	}

	private IfaceConfigProtocol findProtocol(String applicationId, String protocolName) {
		IfaceConfigProtocolExample example = new IfaceConfigProtocolExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andProtocolNameEqualTo(protocolName).andAvailableEqualTo("Y");
		List<IfaceConfigProtocol> protocolList = ifaceConfigFacade.selectByExample(example);
		if (protocolList == null || protocolList.isEmpty()) {
			logger.error("没有配置FTP信息 [applicationId: {}]", applicationId);
			throw new RuntimeException("目标系统没有配置FTP信息。");
		}
		IfaceConfigProtocol ifaceConfigProtocol = protocolList.iterator().next();
		return ifaceConfigProtocol;
	}
	
	public static void main(String[] args) throws Exception {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "classpath*:/applicationContext-dao.xml", "classpath*:/applicationContext.xml"});
		//IfaceAttachFacade ifaceAttachFacade = (IfaceAttachFacade) applicationContext.getBean("ifaceAttachFacade");
		HttpAttachment httpAttachment = new HttpAttachment(new URL("http://10.7.188.171/WHXF_WebApp/Controls/Attachment.aspx?id=115558"));
		InputStream inputStream = httpAttachment.getInputStream();
		OutputStream outputStream = new FileOutputStream("H:\\115558.txt");
		FileCopyUtils.copy(inputStream, outputStream);
	}
	
	@Resource private IfaceConfigFacade ifaceConfigFacade;
}
