/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
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
 * @author 李猛
 * @version 1
 * @date 2009-11-8 下午05:36:39
 */
public class ScanAttachmentTask extends SysTask {

	/**
	 * 构造函数
	 */
	public ScanAttachmentTask() {
		super();
	}

	@Resource(name = "sysParameterConfService")
	private ISysParameterConfService sysParameterConfService;

	@Override
	public void run() {
		try {
			// 更新后台服务记录表
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
			// 执行实际任务
			IfaceDaemonAttachmentExample example = new IfaceDaemonAttachmentExample();
			example.createCriteria().andAvailableEqualTo("Y").andRunCountLessThan(Integer.parseInt(sysParameterConfService.getParValueByParName("FTP_RUN_COUNT", "5")));
			List<IfaceDaemonAttachment> attachmentTasks = ifaceAttachFacade.selectByExample(example);
			for (IfaceDaemonAttachment attachmentTask : attachmentTasks) {
				try {
					Attachment attachment = ifaceAttachFacade.getAttachment(attachmentTask);
					ifaceAttachFacade.replicate(attachment, attachmentTask.getSiteId(), attachmentTask.getSiteLocation());
					attachmentTask.setAvailable("N");
				} catch (Exception e) {
					logger.error("附件处理出现异常：", e);
					attachmentTask.setAvailable("Y");
				} finally {
					attachmentTask.setRunCount(attachmentTask.getRunCount() + 1);
					attachmentTask.setUpdateOn(currentTime);
					ifaceAttachFacade.updateByPrimaryKeySelective(attachmentTask);
				}
			}
		} catch (Exception e) {
			logger.error("在执行附件上传下载服务时出现异常：", e);
		}
	}

	@Resource
	private IfaceAttachFacade ifaceAttachFacade;
}
