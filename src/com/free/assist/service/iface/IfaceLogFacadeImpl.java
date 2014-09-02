/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.sf.cglib.beans.BeanCopier;

import org.apache.commons.lang.StringUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.IfaceDaemonDocumentDAO;
import com.free.assist.dao.IfaceLogRepairDAO;
import com.free.assist.dao.IfaceLogRepositoryDAO;
import com.free.assist.dao.IfaceLogRepositoryHisDAO;
import com.free.assist.domain.IfaceDaemonDocument;
import com.free.assist.domain.IfaceDaemonDocumentExample;
import com.free.assist.domain.IfaceLogListener;
import com.free.assist.domain.IfaceLogRepairExample;
import com.free.assist.domain.IfaceLogRepairKey;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;
import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryHis;
import com.free.assist.domain.IfaceLogRepositoryHisKey;
import com.free.assist.domain.IfaceLogRepositoryKey;
import com.free.assist.domain.vo.TraceRecordDTO;
import com.free.assist.service.BaseServiceImpl;

/**
 * @author 李猛
 * @version 1
 * @date 2009-09-25 09:53:28
 */
@Service("ifaceLogFacade")
public class IfaceLogFacadeImpl extends BaseServiceImpl implements IfaceLogFacade {

	private BeanCopier beanCopier;

	public IfaceLogFacadeImpl() {
		beanCopier = BeanCopier.create(TraceRecordDTO.class, IfaceLogRepository.class, false);
	}
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#error(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public TraceRecordDTO error(TraceRecordDTO traceRecordDTO) {
		//IfaceLogStrategyExample example = new IfaceLogStrategyExample();
		//example.createCriteria().andApplicationIdEqualTo(applicationId);
		//List<IfaceLogStrategy> ifaceLogStrategyList = ifaceLogStrategyDAO.selectByExample(example);
		//ifaceLogStrategyList.iterator().next();
		//ApplicationEvent applicationEvent = new MailSendEvent(this, "huili1725@163.com", "接口出错", errorText);
		//applicationContext.publishEvent(applicationEvent);
		return this.trace(traceRecordDTO, IfaceLogFacade.IFACE_LOG_CATEGORY_ERROR);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#error(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable)
	 */
	public IfaceLogRepositoryKey error(String applicationId, String portName, String traceIndicator, String billDcument, Throwable throwable, String parentId) {
		return null;//this.error(applicationId, portName, traceIndicator, billDcument, throwable.toString(), parentId);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#findRepository(com.regaltec.blocimp.domain.IfaceLogRepositoryMixedExample)
	 */
	public List<IfaceLogRepository> findRepository(IfaceLogRepositoryExample example) {
		List<IfaceLogRepository> IfaceLogRepositoryMixedWithBLOBsList = ifaceLogRepositoryDAO.selectByExample(example);
		return IfaceLogRepositoryMixedWithBLOBsList;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#findRepository(java.lang.String)
	 */
	public List<IfaceLogRepository> findRepository(String parentId) {
		if (StringUtils.isBlank(parentId)) {
			throw new IllegalArgumentException("parameter parentId must not be null or empty");
		}
		IfaceLogRepositoryExample example = new IfaceLogRepositoryExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		example.createCriteria().andParentIdIsNull();
		return ifaceLogRepositoryDAO.selectByExample(example);
	}

	public IfaceLogRepository getRepository(IfaceLogRepositoryKey ifaceLogRepositoryKey) {
		if (ifaceLogRepositoryKey == null) {
			throw new IllegalArgumentException("parameter ifaceLogRepositoryKey must not be null");
		}
		if (StringUtils.isBlank(ifaceLogRepositoryKey.getRepositoryId())) {
			throw new IllegalArgumentException("property repositoryId in ifaceLogRepositoryKey is requied");
		}
		return ifaceLogRepositoryDAO.selectByPrimaryKey(ifaceLogRepositoryKey);
	}
	
	public IfaceLogRepositoryHis getRepositoryHis(IfaceLogRepositoryHisKey ifaceLogRepositoryHisKey) {
		if (ifaceLogRepositoryHisKey == null) {
			throw new IllegalArgumentException("parameter ifaceLogRepositoryHisKey must not be null");
		}
		if (StringUtils.isBlank(ifaceLogRepositoryHisKey.getRepositoryId())) {
			throw new IllegalArgumentException("property repositoryId in ifaceLogRepositoryHisKey is requied");
		}
		return ifaceLogRepositoryHisDAO.selectByPrimaryKey(ifaceLogRepositoryHisKey);
	}
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#findListener(com.regaltec.blocimp.domain.IfaceLogStrategyKey)
	 */
	public List<IfaceLogListener> findListener(String strategyId) {
		/*if (StringUtils.isBlank(strategyId)) {
			throw new IllegalArgumentException("argument strategyId ");
		}
		IfaceLogListenerExample example = new IfaceLogListenerExample();
		example.createCriteria().andStrategyIdEqualTo(strategyId);
		return ifaceLogListenerDAO.selectByExample(example);*/
		return null;
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true, rollbackFor=Exception.class)
	public List<IfaceLogRepairMixedWithBLOBs> findRepair(IfaceLogRepairMixedExample example) {
		if(example == null) {
			example = new IfaceLogRepairMixedExample();
		}
		/*if (example.getOredCriteria().isEmpty()) {
			example.createCriteria().andTraceLevelEqualTo(IfaceLogFacade.IFACE_LOG_CATEGORY_ERROR);
		} else {
			for (com.regaltec.blocimp.domain.IfaceLogRepairMixedExample.Criteria criteria : example.getOredCriteria()) {
				criteria.andTraceLevelEqualTo(IfaceLogFacade.IFACE_LOG_CATEGORY_ERROR);
			}
		}*/
		List<IfaceLogRepairMixedWithBLOBs> ifaceLogRepairMixedWithBLOBsList = ifaceLogRepairDAO.selectByExample(example, example.getSkipResults(), example.getMaxResults());
		return ifaceLogRepairMixedWithBLOBsList;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#getTaskList(int)
	 */
	public List<IfaceDaemonDocument> getDocumentTaskList(int maxResults) {
		if (maxResults < 1) {
			maxResults = Integer.MAX_VALUE;
			logger.warn("记录数量无限制，系统自动设置为{}。", maxResults);
		}
		IfaceDaemonDocumentExample example = new IfaceDaemonDocumentExample();
		example.createCriteria().andAvailableEqualTo("Y");
		example.setSkipResults(0).setMaxResults(maxResults);
		return ifaceDaemonDocumentDAO.selectByExample(example);
	}
	
	public void updateDocumentTask(IfaceDaemonDocument ifaceDaemonDocument) {
		if (ifaceDaemonDocument == null) {
			throw new IllegalArgumentException("argument ifaceDaemonDocument can not be null.");
		}
		ifaceDaemonDocumentDAO.updateByPrimaryKeySelective(ifaceDaemonDocument);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#getRepair(java.lang.String)
	 */
	public IfaceLogRepairMixedWithBLOBs getRepair(IfaceLogRepairKey ifaceLogRepairKey) {
		if (ifaceLogRepairKey == null) {
			throw new IllegalArgumentException("parameter ifaceLogRepairKey must not be null");
		}
		if (StringUtils.isBlank(ifaceLogRepairKey.getRepairId())) {
			throw new IllegalArgumentException("property repairId in ifaceLogRepairKey is required");
		}
		//这里的selectByPrimaryKey重载过。
		IfaceLogRepairMixedWithBLOBs ifaceLogRepairMixedWithBLOBs = (IfaceLogRepairMixedWithBLOBs) ifaceLogRepairDAO.selectByPrimaryKey(ifaceLogRepairKey);
		return ifaceLogRepairMixedWithBLOBs;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#repair(com.regaltec.blocimp.domain.IfaceLogRepair)
	 */
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void repair(IfaceLogRepairWithBLOBs ifaceLogRepairWithBLOBs) {
		if (ifaceLogRepairWithBLOBs == null) {
			throw new IllegalArgumentException("parameter ifaceLogRepairWithBLOBs must not be null");
		}
		if (StringUtils.isBlank(ifaceLogRepairWithBLOBs.getRepositoryId())) {
			throw new IllegalArgumentException("property repositoryId in ifaceLogRepairWithBLOBs is required");
		}
		if (StringUtils.isBlank(ifaceLogRepairWithBLOBs.getRepairId())) {
			IfaceLogRepairExample example = new IfaceLogRepairExample();
			example.createCriteria().andRepositoryIdEqualTo(ifaceLogRepairWithBLOBs.getRepositoryId());
			int totalRows = ifaceLogRepairDAO.countByExample(example);
			if (totalRows == 0) {
				ifaceLogRepairDAO.insert(ifaceLogRepairWithBLOBs);
				return;
			} else {
				List<IfaceLogRepairWithBLOBs> ifaceLogRepairWithBLOBsList = ifaceLogRepairDAO.selectByExample(example);
				if (ifaceLogRepairWithBLOBsList != null) {
					IfaceLogRepairWithBLOBs temp = ifaceLogRepairWithBLOBsList.iterator().next();
					ifaceLogRepairWithBLOBs.setRepairId(temp.getRepairId());
				}
			}
		}
		ifaceLogRepairDAO.updateByPrimaryKeySelective(ifaceLogRepairWithBLOBs);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogFacade#trace(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public TraceRecordDTO trace(TraceRecordDTO traceRecordDTO) {
		return trace(traceRecordDTO, IfaceLogFacade.IFACE_LOG_CATEGORY_TRACE);
	}
	
	private TraceRecordDTO trace(TraceRecordDTO traceRecordDTO, String traceLevel) {
		if (traceRecordDTO == null) {
			throw new IllegalArgumentException("argument ifaceLogRepositoryDTO must not be null");
		}
		if (StringUtils.isBlank(traceRecordDTO.getXmlDocument())) {
			throw new IllegalArgumentException("property xmlDocument is required");
		}
		if (StringUtils.isBlank(traceRecordDTO.getTraceText())) {
			throw new IllegalArgumentException("property traceText is required");
		}
		
		IfaceLogRepository ifaceLogRepository = new IfaceLogRepository();
		beanCopier.copy(traceRecordDTO, ifaceLogRepository, null);
		
		int sequenceId = 0;
		if (StringUtils.isNotBlank(traceRecordDTO.getParentId())) {
			IfaceLogRepositoryKey ifaceLogRepositoryKey = new IfaceLogRepositoryKey();
			ifaceLogRepositoryKey.setRepositoryId(traceRecordDTO.getParentId());
			IfaceLogRepository parent = ifaceLogRepositoryDAO.selectByPrimaryKey(ifaceLogRepositoryKey);
			if (parent != null && parent.getSequenceId() != null) {
				sequenceId = parent.getSequenceId();
			}
		}
		ifaceLogRepository.setSequenceId(sequenceId + 1);
		ifaceLogRepository.setCreateDate(new Date());
		ifaceLogRepository.setTraceLevel(traceLevel);
		ifaceLogRepositoryDAO.insert(ifaceLogRepository);
		
		traceRecordDTO.setRepositoryId(ifaceLogRepository.getRepositoryId());
		
		if (traceRecordDTO.getTryAgain()) {
			IfaceDaemonDocumentExample example = new IfaceDaemonDocumentExample();
			example.createCriteria().andRelateIdEqualTo(traceRecordDTO.getRelateId());
			int result = ifaceDaemonDocumentDAO.countByExample(example);
			if (result == 0) {
				IfaceDaemonDocument ifaceLogMonitor = new IfaceDaemonDocument();
				ifaceLogMonitor.setRelateId(traceRecordDTO.getRelateId());
				ifaceLogMonitor.setRunCount(0);
				ifaceLogMonitor.setInputXML(traceRecordDTO.getXmlDocument());
				ifaceLogMonitor.setResultXML("");
				ifaceLogMonitor.setAvailable("Y");
				ifaceLogMonitor.setUpdateOn(new java.util.Date());
				ifaceDaemonDocumentDAO.insert(ifaceLogMonitor);
			}
		}
		
		if (StringUtils.equals(traceRecordDTO.getTraceIndicator(), IfaceLogFacade.IFACE_LOG_CATEGORY_ERROR)) {
			//getStrategy(traceRecordDTO.getApplicationId());
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo("huili1725@163.com");
			simpleMailMessage.setFrom("huili1725@163.com");
			simpleMailMessage.setCc(new String[] {"huili1725@163.com", "huili1725@163.com"});
			simpleMailMessage.setSubject("接口平台出现异常：" + StringUtils.left(traceRecordDTO.getTraceText(), 10));
			simpleMailMessage.setText(traceRecordDTO.getTraceText());
			try {
				//javaMailSender.send(simpleMailMessage);
			} catch (Exception e) {
				logger.error("发送邮件出错。", e);
			}
		}
		
		return traceRecordDTO;
	}

	@Resource private IfaceLogRepositoryDAO ifaceLogRepositoryDAO;
	
	@Resource private IfaceLogRepairDAO ifaceLogRepairDAO;
	
	@Resource private IfaceDaemonDocumentDAO ifaceDaemonDocumentDAO;
	
	//@Resource private JavaMailSender javaMailSender;
	
	@Resource private IfaceLogRepositoryHisDAO ifaceLogRepositoryHisDAO;
}
