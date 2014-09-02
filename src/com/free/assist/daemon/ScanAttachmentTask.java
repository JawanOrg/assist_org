/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.daemon;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.Resource;

import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.domain.IfaceDaemonAttachmentExample;
import com.free.assist.domain.SuptBackgroundConf;
import com.free.assist.framework.SysTask;
import com.free.assist.service.iface.IfaceAttachFacade;
import com.free.assist.service.iface.attach.Attachment;
import com.free.assist.service.sys.ISysParameterConfService;

/**
 * @author ����
 * @version 1
 * @date 2009-11-8 ����05:36:39
 */
public class ScanAttachmentTask extends SysTask {

	/**
	 * ���캯��
	 */
	public ScanAttachmentTask() {
		super();
	}

	@Resource(name = "sysParameterConfService")
	private ISysParameterConfService sysParameterConfService;

	@Override
	public void run() {
		try {
			// ���º�̨�����¼��
			SuptBackgroundConf confKey = new SuptBackgroundConf();
			confKey.setBackgroundType("SYNCHRONIZE_ATTACHMENT");
			SuptBackgroundConf conf = (SuptBackgroundConf) ifaceAttachFacade.selectByPrimaryKey(confKey);
			Date currentTime = new Date();
			if (conf != null && "T".equals(conf.getIsValid())) {
				currentTime = conf.getCurrentTime();
				conf.setLastRunTime(currentTime);
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(currentTime);
				gc.add(Calendar.SECOND, conf.getExecInterval());
				conf.setNextRunTime(gc.getTime());
				ifaceAttachFacade.updateByPrimaryKeySelective(conf);
			}
			// ִ��ʵ������
			IfaceDaemonAttachmentExample example = new IfaceDaemonAttachmentExample();
			example.createCriteria().andAvailableEqualTo("Y").andRunCountLessThan(Integer.parseInt(sysParameterConfService.getParValueByParName("FTP_RUN_COUNT", "5")));
			List<IfaceDaemonAttachment> attachmentTasks = ifaceAttachFacade.selectByExample(example);
			for (IfaceDaemonAttachment attachmentTask : attachmentTasks) {
				try {
					Attachment attachment = ifaceAttachFacade.getAttachment(attachmentTask);
					ifaceAttachFacade.replicate(attachment, attachmentTask.getSiteId(), attachmentTask.getSiteLocation());
					attachmentTask.setAvailable("N");
				} catch (Exception e) {
					logger.error("������������쳣��", e);
					attachmentTask.setAvailable("Y");
				} finally {
					attachmentTask.setRunCount(attachmentTask.getRunCount() + 1);
					attachmentTask.setUpdateOn(currentTime);
					ifaceAttachFacade.updateByPrimaryKeySelective(attachmentTask);
				}
			}
		} catch (Exception e) {
			logger.error("��ִ�и����ϴ����ط���ʱ�����쳣��", e);
		}
	}

	@Resource
	private IfaceAttachFacade ifaceAttachFacade;
}
