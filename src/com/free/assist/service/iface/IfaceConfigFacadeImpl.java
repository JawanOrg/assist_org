/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.free.assist.dao.IfaceConfigDeclareDAO;
import com.free.assist.dao.IfaceConfigInstanceDAO;
import com.free.assist.dao.IfaceConfigMappingDAO;
import com.free.assist.dao.IfaceConfigProtocolDAO;
import com.free.assist.dao.IfaceConfigSystemDAO;
import com.free.assist.domain.IfaceConfigCommand;
import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigDeclareExample;
import com.free.assist.domain.IfaceConfigDeclareKey;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceExample;
import com.free.assist.domain.IfaceConfigInstanceKey;
import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolKey;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceConfigInstanceExample.Criteria;
import com.free.assist.domain.vo.MorphDTO;
import com.free.assist.exception.DuplicateKeyException;
import com.free.assist.exception.IfaceConfigException;
import com.free.assist.exception.OccupiedException;
import com.free.assist.service.BaseServiceImpl;

/**
 * @author ����
 * @version 1
 * @date 2009-9-29 16:59:56
 */
@Service("ifaceConfigFacade")
public class IfaceConfigFacadeImpl extends BaseServiceImpl implements IfaceConfigFacade {

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#exists(java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean exists(String applicationId, String declareSn, String instanceSn) {
		IfaceConfigDeclareExample declareExample = new IfaceConfigDeclareExample();
		declareExample.createCriteria().andApplicationIdEqualTo(applicationId).andDeclareSnEqualTo(declareSn);
		List<IfaceConfigDeclare> ifaceConfigDeclareList= ifaceConfigDeclareDAO.selectByExample(declareExample);
		if (ifaceConfigDeclareList == null || ifaceConfigDeclareList.isEmpty()) {
			return false;
		}
		if (ifaceConfigDeclareList.size() > 1 && logger.isWarnEnabled()) {
			logger.warn("�ӿڳ���{}�ж������Ϊ{}�ľ�̬���ݣ��ôβ���ȡ��һ�����ݣ����º��鶨�����", applicationId, ifaceConfigDeclareList.size());
		}
		IfaceConfigDeclare ifaceConfigDeclare = ifaceConfigDeclareList.iterator().next();
		IfaceConfigInstanceExample instanceExample = new IfaceConfigInstanceExample();
		instanceExample.createCriteria().andDeclareIdEqualTo(ifaceConfigDeclare.getDeclareId()).andInstanceSnEqualTo(instanceSn);
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(instanceExample);
		if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#findDeclare(com.regaltec.blocimp.domain.IfaceApplicationKey)
	 */
	public List<IfaceConfigDeclare> findDeclare(String applicationId) {
		if (StringUtils.isBlank(applicationId)) {
			throw new IllegalArgumentException("argument applicationId must not be null");
		}
		IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andAvailableEqualTo("Y");
		return ifaceConfigDeclareDAO.selectByExample(example);
	}
	
	public List<IfaceConfigDeclare> findDeclareWithChildren(String applicationId) {
		if (StringUtils.isBlank(applicationId)) {
			throw new IllegalArgumentException("argument applicationId must not be null");
		}
		IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andParentIdIsNull().andAvailableEqualTo("Y");
		List<IfaceConfigDeclare> ifaceConfigDeclareList = ifaceConfigDeclareDAO.selectByExample(example);
		if (ifaceConfigDeclareList != null && !ifaceConfigDeclareList.isEmpty()) {
			for (IfaceConfigDeclare ifaceConfigDeclare : ifaceConfigDeclareList) {
				List<IfaceConfigDeclare> childrenList = getDeclareChildrenList(applicationId, ifaceConfigDeclare.getDeclareId());
				ifaceConfigDeclare.setChildren(childrenList);
			}
		}
		return ifaceConfigDeclareList;
	}
	
	private List<IfaceConfigDeclare> getDeclareChildrenList(String applicationId, String declareId) {
		IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andParentIdEqualTo(declareId).andAvailableEqualTo("Y");
		List<IfaceConfigDeclare> ifaceConfigDeclareList = ifaceConfigDeclareDAO.selectByExample(example);
		if (ifaceConfigDeclareList != null && !ifaceConfigDeclareList.isEmpty()) {
			for (IfaceConfigDeclare ifaceConfigDeclare : ifaceConfigDeclareList) {
				List<IfaceConfigDeclare> childrenList = getDeclareChildrenList(applicationId, ifaceConfigDeclare.getDeclareId());
				ifaceConfigDeclare.setChildren(childrenList);
			}
		}
		return ifaceConfigDeclareList;
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#findInstance(com.regaltec.blocimp.domain.IfaceConfigInstanceExample)
	 */
	public List<IfaceConfigInstance> findInstance(String sourcePid, String resultPid) { 
		if (StringUtils.isBlank(sourcePid)) {
			throw new IllegalArgumentException("argument declareId must not be null or empty");
		}
		IfaceConfigDeclareKey ifaceConfigDeclareKey = new IfaceConfigDeclareKey();
		ifaceConfigDeclareKey.setDeclareId(sourcePid);
		IfaceConfigDeclare ifaceConfigDeclare = ifaceConfigDeclareDAO.selectByPrimaryKey(ifaceConfigDeclareKey);
		
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		if (StringUtils.isNotBlank(ifaceConfigDeclare.getParentId())) {
			example.createCriteria().andDeclareIdEqualTo(ifaceConfigDeclare.getParentId());
		} else {
			example.createCriteria().andDeclareIdEqualTo(sourcePid).andParentIdIsNull();
		}
		List<IfaceConfigInstance> ifaceConfigInstanceList =  ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList != null && !ifaceConfigInstanceList.isEmpty()) {
			for (IfaceConfigInstance ifaceConfigInstance : ifaceConfigInstanceList) {
				if (StringUtils.isNotBlank(resultPid) && StringUtils.equals(ifaceConfigInstance.getDeclareId(), sourcePid)) {
					IfaceConfigMappingExample example2 = new IfaceConfigMappingExample();
					String sourceId = ifaceConfigInstance.getInstanceId();
					example2.clear();
					example2.createCriteria().andSourceIdEqualTo(sourceId).andSourcePidEqualTo(sourcePid)
						.andResultPidEqualTo(resultPid).andAvailableEqualTo("Y");
					List<IfaceConfigMapping> ifaceConfigMappingList = ifaceConfigMappingDAO.selectByExample(example2);
					if (ifaceConfigMappingList == null || ifaceConfigMappingList.isEmpty()) {
						continue;
					}
					if (ifaceConfigMappingList.size() > 1) {
						logger.error(String.format("t_iface_conf_mapping�����˶��ӳ�䣬���޸����ݿ�����{sourcePid: %s, sourceId: %s, resultPid: %s}", sourcePid, sourceId, resultPid));
					}
					IfaceConfigMapping ifaceConfigMapping = ifaceConfigMappingList.iterator().next();
					ifaceConfigInstance.setMappingId(ifaceConfigMapping.getMappingId());
					ifaceConfigInstance.setMappingSn(ifaceConfigMapping.getResultSn());
					ifaceConfigInstance.setMappingName(ifaceConfigMapping.getResultName());
				}
				List<IfaceConfigInstance> childrenList = getInstanceChildrenList(sourcePid, ifaceConfigInstance.getInstanceId(), resultPid);
				if (!StringUtils.equals(ifaceConfigInstance.getDeclareId(), sourcePid)) {
					ifaceConfigInstance.setChildren(childrenList);
				}
			}
		}
		return ifaceConfigInstanceList;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#findInstance(com.regaltec.blocimp.domain.IfaceConfigDeclareKey)
	 */
	public List<IfaceConfigInstance> findInstance(String declareId) {
		if (StringUtils.isBlank(declareId)) {
			throw new IllegalArgumentException("argument declareId must not be null or empty");
		}
		IfaceConfigDeclareKey ifaceConfigDeclareKey = new IfaceConfigDeclareKey();
		ifaceConfigDeclareKey.setDeclareId(declareId);
		IfaceConfigDeclare ifaceConfigDeclare = ifaceConfigDeclareDAO.selectByPrimaryKey(ifaceConfigDeclareKey);
		
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		if (StringUtils.isNotBlank(ifaceConfigDeclare.getParentId())) {
			example.createCriteria().andDeclareIdEqualTo(ifaceConfigDeclare.getParentId());
		} else {
			example.createCriteria().andDeclareIdEqualTo(declareId).andParentIdIsNull();
		}
		List<IfaceConfigInstance> ifaceConfigInstanceList =  ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList != null && !ifaceConfigInstanceList.isEmpty()) {
			for (IfaceConfigInstance ifaceConfigInstance : ifaceConfigInstanceList) {
				List<IfaceConfigInstance> childrenList = getInstanceChildrenList(declareId, ifaceConfigInstance.getInstanceId(), null);
				if (!StringUtils.equals(ifaceConfigInstance.getDeclareId(), declareId)) {
					ifaceConfigInstance.setChildren(childrenList);
				}
			}
		}
		return ifaceConfigInstanceList;
	}
	
	private List<IfaceConfigInstance> getInstanceChildrenList(String declareId, String instanceId, String resultPid) {
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		example.createCriteria().andDeclareIdEqualTo(declareId).andParentIdEqualTo(instanceId);
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList != null && !ifaceConfigInstanceList.isEmpty()) {
			for (IfaceConfigInstance ifaceConfigInstance : ifaceConfigInstanceList) {
				if (StringUtils.isNotBlank(resultPid) && StringUtils.equals(ifaceConfigInstance.getDeclareId(), declareId)) {
					IfaceConfigMappingExample example2 = new IfaceConfigMappingExample();
					String sourceId = ifaceConfigInstance.getInstanceId();
					example2.clear();
					example2.createCriteria().andSourceIdEqualTo(sourceId).andSourcePidEqualTo(declareId)
						.andResultPidEqualTo(resultPid).andAvailableEqualTo("Y");
					List<IfaceConfigMapping> ifaceConfigMappingList = ifaceConfigMappingDAO.selectByExample(example2);
					if (ifaceConfigMappingList == null || ifaceConfigMappingList.isEmpty()) {
						continue;
					}
					if (ifaceConfigMappingList.size() > 1) {
						logger.error(String.format("t_iface_conf_mapping�����˶��ӳ�䣬���޸����ݿ�����{sourcePid: %s, sourceId: %s, resultPid: %s}", declareId, instanceId, resultPid));
					}
					IfaceConfigMapping ifaceConfigMapping = ifaceConfigMappingList.iterator().next();
					ifaceConfigInstance.setMappingId(ifaceConfigMapping.getMappingId());
					ifaceConfigInstance.setMappingSn(ifaceConfigMapping.getResultSn());
					ifaceConfigInstance.setMappingName(ifaceConfigMapping.getResultName());
				}
				List<IfaceConfigInstance> childrenList = getInstanceChildrenList(declareId, ifaceConfigInstance.getInstanceId(), resultPid);
				if (!StringUtils.equals(ifaceConfigInstance.getDeclareId(), declareId)) {
					ifaceConfigInstance.setChildren(childrenList);
				}
			}
		}
		return ifaceConfigInstanceList;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#findMapping(com.regaltec.blocimp.domain.IfaceConfigMappingExample)
	 */
	public List<IfaceConfigMapping> findMapping(IfaceConfigMappingExample example) {
		if (example == null) {
			example = new IfaceConfigMappingExample();
		}
		return ifaceConfigMappingDAO.selectByExample(example);
	}

	public List<IfaceConfigSystem> getApplicationList() {
		IfaceConfigSystemExample example = new IfaceConfigSystemExample();
		example.createCriteria().andAvailableEqualTo("Y");
		return ifaceConfigSystemDAO.selectByExample(example);
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#getDeclare(com.regaltec.blocimp.domain.IfaceConfigDeclareKey)
	 */
	public IfaceConfigDeclare getDeclare(String declareId) {
		if (StringUtils.isBlank(declareId)) {
			throw new IllegalArgumentException("argument declareId must not be null or empty");
		}
		IfaceConfigDeclareKey ifaceConfigDeclareKey = new IfaceConfigDeclareKey();
		ifaceConfigDeclareKey.setDeclareId(declareId);
		return ifaceConfigDeclareDAO.selectByPrimaryKey(ifaceConfigDeclareKey);
	}
	
	public IfaceConfigDeclare getDeclare(String applicationId, String declareSn) {
		IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andDeclareSnEqualTo(declareSn).andAvailableEqualTo("Y");
		List<IfaceConfigDeclare> ifaceConfigDeclareList = ifaceConfigDeclareDAO.selectByExample(example);
		if (ifaceConfigDeclareList == null || ifaceConfigDeclareList.isEmpty()) {
			throw new IfaceConfigException(String.format("Declare Not Found [applicationSn: %s, declareSn: %s]", applicationId, declareSn));
		}
		if (ifaceConfigDeclareList.size() > 1) {
			throw new DuplicateKeyException(String.format("Duplicate DeclareSN [applicationSn: %s, declareSn: %s]", applicationId, declareSn));
		}
		return ifaceConfigDeclareList.iterator().next();
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#getInstance(com.regaltec.blocimp.domain.IfaceConfigInstanceKey)
	 */
	public IfaceConfigInstance getInstance(String instanceId) {
		if (StringUtils.isBlank(instanceId)) {
			throw new IllegalArgumentException("argument instanceId must not be null or empty");
		}
		IfaceConfigInstanceKey ifaceConfigInstanceKey = new IfaceConfigInstanceKey();
		ifaceConfigInstanceKey.setInstanceId(instanceId);
		return ifaceConfigInstanceDAO.selectByPrimaryKey(ifaceConfigInstanceKey);
	}
	
	public IfaceConfigInstance getInstance(String declareId, String instanceSn) {
		if (StringUtils.isBlank(declareId)) {
			throw new IllegalArgumentException("argument declareId must not be null or empty");
		}
		if (StringUtils.isBlank(instanceSn)) {
			throw new IllegalArgumentException("argument instanceSn must not be null or empty");
		}
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		example.createCriteria().andDeclareIdEqualTo(declareId).andInstanceSnEqualTo(instanceSn).andAvailableEqualTo("Y");
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
			throw new IfaceConfigException(String.format("Instance Not Found [declareId: %s, instanceSn: %s]", declareId, instanceSn));
		}
		if (ifaceConfigInstanceList.size() > 1) {
			throw new DuplicateKeyException(String.format("Duplicate Instance [declareId: %s, instanceSn: %s]", declareId, instanceSn));
		}
		return ifaceConfigInstanceList.iterator().next();
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#getMapping(com.regaltec.blocimp.domain.IfaceConfigMappingKey)
	 */
	public IfaceConfigMapping getMapping(String mappingId) {
		if (StringUtils.isBlank(mappingId)) {
			throw new IllegalArgumentException("argument mappingId must not be null or empty");
		}
		IfaceConfigMapping ifaceConfigMapping = new IfaceConfigMapping();
		ifaceConfigMapping.setMappingId(mappingId);
		return ifaceConfigMappingDAO.selectByPrimaryKey(ifaceConfigMapping);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#morph(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public String morph(MorphDTO morphDTO) {//����ʹ��cascadeSn��
		String applicationId = morphDTO.getHostId();
		String declareSn = morphDTO.getHostSn();
		String instanceSn = morphDTO.getNodeText();		
		String instanceId = null, resultId = null;
		
		if (StringUtils.isBlank(instanceSn)) {
			logger.error("ת����̬����{}ʱû�д���ڵ�ֵ���������ݡ�", declareSn);
			throw new IfaceConfigException(String.format("ת����̬����%sʱû�д���ڵ�ֵ���������ݡ�", declareSn));
		}
		
		//��ȡinstanceId
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId).andDeclareSnEqualTo(declareSn).andInstanceSnEqualTo(instanceSn);
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
			logger.error(String.format("�׶�ϵͳ��û��{ declareSn: %s, instanceSn: %s }��̬���ݣ��������Ϊ��from v_iface_config_instance where APPLICATION_ID='%s' AND DECLARE_SN='%s' AND INSTANCE_SN='%s'��", declareSn, instanceSn, applicationId, declareSn, instanceSn));
			throw new IfaceConfigException(String.format("Instance not found. { applicationId: %s, declareSn: %s, instanceSn: %s }", applicationId, declareSn, instanceSn));
		}
		if (ifaceConfigInstanceList.size() > 1 && logger.isWarnEnabled()) {
			logger.error(String.format("�׶�ϵͳ��%s��{ declareSn: %s, instanceSn: %s }��̬���ݣ��������Ϊ��from v_iface_config_instance where APPLICATION_ID='%s' AND DECLARE_SN='%s' AND INSTANCE_SN='%s'��", ifaceConfigInstanceList.size(), declareSn, instanceSn, applicationId, declareSn, instanceSn));
			throw new IfaceConfigException(String.format("Instance duplicate. { applicationId��%s��declareSn��%s, instanceSn: %s }", applicationId, declareSn, instanceSn));
		}
		IfaceConfigInstance ifaceConfigInstance = ifaceConfigInstanceList.iterator().next();
		instanceId = ifaceConfigInstance.getInstanceId();
		ifaceConfigInstanceList.clear();
		example.clear();
		
		//��ȡmapping
		IfaceConfigMappingExample ifaceConfigMappingExample = new IfaceConfigMappingExample();
		if (StringUtils.isNotBlank(morphDTO.getCascadeSn())) {
			ifaceConfigMappingExample.createCriteria().andCascadeSnEqualTo(morphDTO.getCascadeSn()).andSourceIdEqualTo(instanceId);
		} else {
			ifaceConfigMappingExample.createCriteria().andSourceIdEqualTo(instanceId);
		}
		List<IfaceConfigMapping> ifaceConfigMappingList = ifaceConfigMappingDAO.selectByExample(ifaceConfigMappingExample);
		if (ifaceConfigMappingList == null || ifaceConfigMappingList.isEmpty()) {
			throw new IfaceConfigException(String.format("Mapping not found. { applicationId: %s, declareSn: %s, instanceSn: %s }", applicationId, declareSn, instanceSn));
		}
		if (ifaceConfigMappingList.size() > 1 && logger.isWarnEnabled()) {
			logger.error(String.format("Mapping duplicate. { applicationId��%s��declareSn��%s, instanceSn: %s }", applicationId, declareSn, instanceSn));
		}
		IfaceConfigMapping ifaceConfigMapping = ifaceConfigMappingList.iterator().next();
		resultId = ifaceConfigMapping.getResultId();
		ifaceConfigMapping = null; ifaceConfigMappingList.clear(); ifaceConfigMappingList = null;
		
		//���ս��
		IfaceConfigInstanceKey ifaceConfigInstanceKey = new IfaceConfigInstanceKey();
		ifaceConfigInstanceKey.setInstanceId(resultId);
		IfaceConfigInstance result = ifaceConfigInstanceDAO.selectByPrimaryKey(ifaceConfigInstanceKey);
		if (result == null) {
			throw new IfaceConfigException(String.format("result instance not found. { instanceId: %s }", resultId));
		}
		
		return result.getInstanceSn();
	}
	
	public String trans(MorphDTO morphDTO) {
		if (morphDTO == null) {
			throw new IllegalArgumentException("Expected Argument morphDTO But null.");
		}
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		Criteria criteria = example.createCriteria().andApplicationIdEqualTo(morphDTO.getHostId());
		if (StringUtils.equals(morphDTO.getIndicator(), "E2C")) {
			criteria.andDeclareSnEqualTo(morphDTO.getHostSn()).andInstanceSnEqualTo(morphDTO.getNodeName()); //�������һ������Ӧ��ҪΪnodeText�ģ��д�������
		} else {
			criteria.andDeclareSnEqualTo(morphDTO.getHostSn()).andInstanceNameEqualTo(morphDTO.getNodeText());
		}
		if (StringUtils.isNotBlank(morphDTO.getCascadeSn())) {
			criteria.andParentSnEqualTo(morphDTO.getCascadeSn());
		} else {
			criteria.andParentSnIsNull();
		}
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
			logger.warn(String.format("t_iface_conf_instance��ƥ������APPLICATION_ID=%s AND DECLARE_SN=%s AND INSTANCE_SN=%s�ļ�¼��Ϊ0��", morphDTO.getHostId(), morphDTO.getHostSn(), morphDTO.getNodeName()));
			//throw new IfaceConfigException(String.format("�ӿھ�̬�����������޷��ҵ���¼ { applicationId: %s, declareSn: %s, instanceSn: %s }", morphDTO.getApplicationId(), morphDTO.getDeclareSn(), morphDTO.getNodeName()));
			return null;
		}
		IfaceConfigInstance ifaceConfigInstance = ifaceConfigInstanceList.iterator().next();
		if (StringUtils.equals(morphDTO.getIndicator(), "E2C")) {
			return ifaceConfigInstance.getInstanceName();
		} else {
			return ifaceConfigInstance.getInstanceSn();
		}
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#addDeclare(com.regaltec.blocimp.domain.IfaceConfigDeclare)
	 */
	public void addDeclare(IfaceConfigDeclare ifaceConfigDeclare) {
		if (ifaceConfigDeclare == null) {
			throw new IllegalArgumentException("argument ifaceConfigDeclare must not be null");
		}
		if (StringUtils.isBlank(ifaceConfigDeclare.getApplicationId())) {
			throw new IllegalArgumentException("property applicationId is require");
		}
		if (StringUtils.isBlank(ifaceConfigDeclare.getDeclareName())) {
			throw new IllegalArgumentException("property declareName is require");
		}
		if (StringUtils.isBlank(ifaceConfigDeclare.getDeclareSn())) {
			throw new IllegalArgumentException("property declareSn is require");
		}
		IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
		example.createCriteria().andApplicationIdEqualTo(ifaceConfigDeclare.getApplicationId()).andDeclareSnEqualTo(ifaceConfigDeclare.getDeclareSn()).andAvailableEqualTo("Y");
		int result = ifaceConfigDeclareDAO.countByExample(example);
		if (result > 0) {
			throw new DuplicateKeyException(String.format("%s(%s)�ľ�̬���������Ѿ�����", ifaceConfigDeclare.getDeclareName(), ifaceConfigDeclare.getDeclareSn()));
		}
		StringBuilder stringBuilder = new StringBuilder();
		if (StringUtils.isNotBlank(ifaceConfigDeclare.getParentId())) {
			IfaceConfigDeclareKey ifaceConfigDeclareKey = new IfaceConfigDeclareKey();
			ifaceConfigDeclareKey.setDeclareId(ifaceConfigDeclare.getParentId());
			IfaceConfigDeclare parent = ifaceConfigDeclareDAO.selectByPrimaryKey(ifaceConfigDeclareKey);
			if (parent == null) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}�����ļ�¼Ϊ0����", ifaceConfigDeclare.getParentId());
				throw new IllegalStateException(String.format("%s(%s)������̬�������Ͳ����ڣ�", ifaceConfigDeclare.getDeclareName(), ifaceConfigDeclare.getDeclareSn()));
			}
			if (StringUtils.isBlank(parent.getStructSn())) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}�ļ�¼û������STRUCT_SN�ֶΣ�", parent.getDeclareId());
				throw new IllegalStateException(String.format("%sû�����������롣", parent.getDeclareName()));
			}
			if (!StringUtils.isNumeric(parent.getStructSn())) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", parent.getDeclareId());
				throw new IllegalStateException(String.format("%s���������ַ������֡�", parent.getDeclareName()));
			}
			if (parent.getStructSn().length()%10 != 0) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", parent.getDeclareId());
				throw new IllegalStateException(String.format("%s�����������ַ����Ȳ���ȷ��", parent.getDeclareName()));
			}
			stringBuilder.append(parent.getStructSn());
			example.clear();
			example.createCriteria().andApplicationIdEqualTo(ifaceConfigDeclare.getApplicationId()).andAvailableEqualTo("Y").andParentIdEqualTo(ifaceConfigDeclare.getParentId());
		} else {
			example.clear();
			example.createCriteria().andApplicationIdEqualTo(ifaceConfigDeclare.getApplicationId()).andAvailableEqualTo("Y").andParentIdIsNull();
		}
		example.setOrderByClause("STRUCT_SN DESC");
		example.setSkipResults(0).setMaxResults(1);
		List<IfaceConfigDeclare> ifaceConfigDeclareList = ifaceConfigDeclareDAO.selectByExample(example);
		if (ifaceConfigDeclareList == null || ifaceConfigDeclareList.isEmpty()) {
			stringBuilder.append(StringUtils.leftPad("1", 10, "0"));
		} else {
			IfaceConfigDeclare sibling = ifaceConfigDeclareList.iterator().next();
			if (!StringUtils.isNumeric(sibling.getStructSn())) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", sibling.getDeclareId());
				throw new IllegalStateException(String.format("%s���������ַ���Ϊ���֡�", sibling.getDeclareName()));
			}
			if (sibling.getStructSn().length()%10 != 0) {
				logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", sibling.getDeclareId());
				throw new IllegalStateException(String.format("%s�����������ַ����Ȳ���ȷ��", sibling.getDeclareName()));
			}
			int increment = Integer.parseInt(StringUtils.substring(sibling.getStructSn(), -10));
			stringBuilder.append(StringUtils.leftPad(String.valueOf(increment+1), 10, "0"));
		}
		ifaceConfigDeclare.setStructSn(stringBuilder.toString());
		
		if (StringUtils.isBlank(ifaceConfigDeclare.getStructureType())) {
			ifaceConfigDeclare.setStructureType(IfaceConfigDeclare.STRUCTURE_TYPE_LINEAR);
		}

		ifaceConfigDeclare.setUpdateDate(new java.util.Date());
		ifaceConfigDeclare.setAvailable("Y");
		ifaceConfigDeclare.setMatrix("N");
		ifaceConfigDeclareDAO.insert(ifaceConfigDeclare);
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#updateDeclare(com.regaltec.blocimp.domain.IfaceConfigDeclare)
	 */
	public void updateDeclare(IfaceConfigDeclare ifaceConfigDeclare) {
		
		if (ifaceConfigDeclare == null) {
			throw new IllegalArgumentException("argument ifaceConfigDeclare must not be null");
		}
		/*��ʼ������ʱ�ɴ�
		if (StringUtils.isBlank(ifaceConfigDeclare.getStructSn())) {
			StringBuilder stringBuilder = new StringBuilder();
			IfaceConfigDeclareExample example = new IfaceConfigDeclareExample();
			example.createCriteria().andDeclareIdNotEqualTo(ifaceConfigDeclare.getDeclareId()).andApplicationIdEqualTo(ifaceConfigDeclare.getApplicationId()).andAvailableEqualTo("Y").andStructSnIsNotNull().andParentIdIsNull();
			example.setOrderByClause("STRUCT_SN DESC");
			List<IfaceConfigDeclare> ifaceConfigDeclareList = ifaceConfigDeclareDAO.selectByExample(example, 0, 1);
			if (ifaceConfigDeclareList == null || ifaceConfigDeclareList.isEmpty()) {
				stringBuilder.append(StringUtils.leftPad("1", 10, "0"));
			} else {
				IfaceConfigDeclare sibling = ifaceConfigDeclareList.iterator().next();
				if (!StringUtils.isNumeric(sibling.getStructSn())) {
					logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", sibling.getDeclareId());
					throw new IllegalStateException(String.format("%s���������ַ���Ϊ���֡�", sibling.getDeclareName()));
				}
				if (sibling.getStructSn().length()%10 != 0) {
					logger.error("��T_IFACE_CONF_DECLARE��ƥ��DECLARE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", sibling.getDeclareId());
					throw new IllegalStateException(String.format("%s�����������ַ����Ȳ���ȷ��", sibling.getDeclareName()));
				}
				int increment = Integer.parseInt(StringUtils.substring(sibling.getStructSn(), -10));
				stringBuilder.append(StringUtils.leftPad(String.valueOf(increment+1), 10, "0"));
			}
			ifaceConfigDeclare.setStructSn(stringBuilder.toString());
		}*/
		ifaceConfigDeclareDAO.updateByPrimaryKeySelective(ifaceConfigDeclare);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#addInstance(com.regaltec.blocimp.domain.IfaceConfigInstance)
	 */
	public void addInstance(IfaceConfigInstance ifaceConfigInstance) {
		if (ifaceConfigInstance == null) {
			throw new IllegalArgumentException("argument ifaceConfigDeclare is required");
		}
		if (StringUtils.isBlank(ifaceConfigInstance.getDeclareId())) {
			throw new IllegalArgumentException("property declareId is required");
		}
		if (StringUtils.isBlank(ifaceConfigInstance.getInstanceName())) {
			throw new IllegalArgumentException("property instanceName is required");
		}
		if (StringUtils.isBlank(ifaceConfigInstance.getInstanceSn())) {
			throw new IllegalArgumentException("property instanceSn is required");
		}
		
		IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeclareIdEqualTo(ifaceConfigInstance.getDeclareId()).andInstanceSnEqualTo(ifaceConfigInstance.getInstanceSn()).andAvailableEqualTo("Y");
		if (StringUtils.isNotBlank(ifaceConfigInstance.getParentId())) {
			criteria.andParentIdEqualTo(ifaceConfigInstance.getParentId());
		}
		int amount = ifaceConfigInstanceDAO.countByExample(example);
		if (amount > 0) {
			throw new DuplicateKeyException(String.format("%s(%s)��̬����ʵ���Ѿ����ڡ�", ifaceConfigInstance.getInstanceName(), ifaceConfigInstance.getInstanceSn()));
		}
		StringBuilder stringBuilder = new StringBuilder();
		if (StringUtils.isNotBlank(ifaceConfigInstance.getParentId())) {
			IfaceConfigInstanceKey ifaceConfigInstanceKey = new IfaceConfigInstanceKey();
			ifaceConfigInstanceKey.setInstanceId(ifaceConfigInstance.getParentId());
			IfaceConfigInstance parent = ifaceConfigInstanceDAO.selectByPrimaryKey(ifaceConfigInstanceKey);
			if (parent == null) {
				logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}�����ļ�¼Ϊ0����", ifaceConfigInstance.getParentId());
				throw new IllegalStateException("�޷��ҵ�ʵ���ĸ�����̬���ݣ�");
			}
			if (StringUtils.isBlank(parent.getStructSn())) {
				logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}�ļ�¼û������STRUCT_SN�ֶΣ�", parent.getInstanceId());
				throw new IllegalStateException(String.format("%sû�����������롣", parent.getInstanceName()));
			}
			if (parent.getStructSn().length()%10 != 0) {
				logger.error("��T_IFACE_CONF_INSTANCE��INSTANCE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", parent.getInstanceId());
				throw new IllegalStateException(String.format("%s���������볤�Ȳ���ȷ��", parent.getInstanceName()));
			}
			if (!StringUtils.isNumeric(parent.getStructSn())) {
				logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", parent.getDeclareId());
				throw new IllegalStateException(String.format("%s���������ַ������֡�", parent.getDeclareName()));
			}
			stringBuilder.append(parent.getStructSn());
			example.clear();
			example.createCriteria().andDeclareIdEqualTo(ifaceConfigInstance.getDeclareId()).andAvailableEqualTo("Y").andParentIdEqualTo(ifaceConfigInstance.getParentId());
		} else {
			example.clear();
			example.createCriteria().andDeclareIdEqualTo(ifaceConfigInstance.getDeclareId()).andAvailableEqualTo("Y").andParentIdIsNull();
		}
		example.setOrderByClause("STRUCT_SN DESC");
		example.setSkipResults(0).setMaxResults(0);
		List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
		if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
			stringBuilder.append(StringUtils.leftPad("1", 10, "0"));
		} else {
			IfaceConfigInstance sibling = ifaceConfigInstanceList.iterator().next();
			if (!StringUtils.isNumeric(sibling.getStructSn())) {
				logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", sibling.getDeclareId());
				throw new IllegalStateException(String.format("%s���������ַ���Ϊ���֡�", sibling.getDeclareName()));
			}
			if (sibling.getStructSn().length()%10 != 0) {
				logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", sibling.getDeclareId());
				throw new IllegalStateException(String.format("%s�����������ַ����Ȳ���ȷ��", sibling.getDeclareName()));
			}
			int increment = Integer.parseInt(StringUtils.substring(sibling.getStructSn(), -10));
			stringBuilder.append(StringUtils.leftPad(String.valueOf(increment+1), 10, "0"));
		}
		ifaceConfigInstance.setStructSn(stringBuilder.toString());
		
		ifaceConfigInstance.setAvailable("Y");
		ifaceConfigInstance.setUpdateDate(new java.util.Date());
		ifaceConfigInstanceDAO.insert(ifaceConfigInstance);
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#updateInstance(com.regaltec.blocimp.domain.IfaceConfigInstance)
	 */
	public void updateInstance(IfaceConfigInstance ifaceConfigInstance) {
		if (ifaceConfigInstance == null) {
			throw new IllegalArgumentException("argument ifaceConfigDeclare is required");
		}
		if (StringUtils.isBlank(ifaceConfigInstance.getInstanceId())) {
			throw new IllegalArgumentException("property instanceId is required");
		}
		//��ʼ������ʱ�ɴ�
		if (StringUtils.isBlank(ifaceConfigInstance.getStructSn())) {
			StringBuilder stringBuilder = new StringBuilder();
			IfaceConfigInstanceExample example = new IfaceConfigInstanceExample();
			example.createCriteria().andInstanceIdNotEqualTo(ifaceConfigInstance.getDeclareId()).andDeclareIdEqualTo(ifaceConfigInstance.getDeclareId()).andAvailableEqualTo("Y").andStructSnIsNotNull().andParentIdIsNull();
			example.setOrderByClause("STRUCT_SN DESC");
			example.setSkipResults(0).setMaxResults(1);
			List<IfaceConfigInstance> ifaceConfigInstanceList = ifaceConfigInstanceDAO.selectByExample(example);
			if (ifaceConfigInstanceList == null || ifaceConfigInstanceList.isEmpty()) {
				stringBuilder.append(StringUtils.leftPad("1", 10, "0"));
			} else {
				IfaceConfigInstance sibling = ifaceConfigInstanceList.iterator().next();
				if (!StringUtils.isNumeric(sibling.getStructSn())) {
					logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}��STRUCT_SN�ֶ����ò�Ϊ�����͵��ַ���", sibling.getDeclareId());
					throw new IllegalStateException(String.format("%s���������ַ���Ϊ���֡�", sibling.getDeclareName()));
				}
				if (sibling.getStructSn().length()%10 != 0) {
					logger.error("��T_IFACE_CONF_INSTANCE��ƥ��INSTANCE_ID={}�ļ�¼��STRUCT_SN�ֶ����õĳ��Ȳ�Ϊ10�ı�����", sibling.getDeclareId());
					throw new IllegalStateException(String.format("%s�����������ַ����Ȳ���ȷ��", sibling.getDeclareName()));
				}
				int increment = Integer.parseInt(StringUtils.substring(sibling.getStructSn(), -10));
				stringBuilder.append(StringUtils.leftPad(String.valueOf(increment+1), 10, "0"));
			}
			ifaceConfigInstance.setStructSn(stringBuilder.toString());
		}
		ifaceConfigInstance.setUpdateDate(new java.util.Date());
		ifaceConfigInstance.setAvailable("Y");
		ifaceConfigInstanceDAO.updateByPrimaryKeySelective(ifaceConfigInstance);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#addMapping(com.regaltec.blocimp.domain.IfaceConfigMapping)
	 */
	public void addMapping(IfaceConfigMapping ifaceConfigMapping) {
		if (ifaceConfigMapping == null) {
			throw new IllegalArgumentException("argument ifaceConfigMapping must not be null");
		}
		if (StringUtils.isBlank(ifaceConfigMapping.getSourceId())) {
			throw new IllegalArgumentException("property sourceId is required");
		}
		if (StringUtils.isBlank(ifaceConfigMapping.getResultId())) {
			throw new IllegalArgumentException("property resultId is required");
		}
		IfaceConfigMappingExample example = new IfaceConfigMappingExample();
		example.createCriteria().andSourceIdEqualTo(ifaceConfigMapping.getSourceId()).andAvailableEqualTo("Y");
		//����Ӧ�ý�resultIdҲ����������
		if (ifaceConfigMappingDAO.countByExample(example) > 0) {
			throw new DuplicateKeyException("��̬�����Ѿ�ƥ����ˡ�");
		}
		ifaceConfigMapping.setAvailable("Y");
		ifaceConfigMapping.setUpdateDate(new java.util.Date());
		ifaceConfigMappingDAO.insert(ifaceConfigMapping);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#removeDeclare(com.regaltec.blocimp.domain.IfaceConfigDeclare)
	 */
	public void removeDeclare(String declareId) {
		if (StringUtils.isBlank(declareId)) {
			throw new IllegalArgumentException("argument declareId must not be null or empty");
		}
		IfaceConfigDeclareExample ifaceConfigDeclareExample = new IfaceConfigDeclareExample();
		ifaceConfigDeclareExample.createCriteria().andParentIdEqualTo(declareId).andAvailableEqualTo("Y");
		int result = ifaceConfigDeclareDAO.countByExample(ifaceConfigDeclareExample);
		if (result > 0) {
			throw new OccupiedException("���̬�����м������ݡ�");
		}
		
		IfaceConfigInstanceExample ifaceConfigInstanceExample = new IfaceConfigInstanceExample();
		ifaceConfigInstanceExample.createCriteria().andDeclareIdEqualTo(declareId).andAvailableEqualTo("Y");
		result = ifaceConfigInstanceDAO.countByExample(ifaceConfigInstanceExample);
		if (result > 0) {
			throw new OccupiedException("���̬������ʵ�����ݡ�");
		}
		
		IfaceConfigInstance ifaceConfigInstance = new IfaceConfigInstance();
		ifaceConfigInstance.setAvailable("N");
		ifaceConfigInstanceExample = new IfaceConfigInstanceExample();
		ifaceConfigInstanceExample.createCriteria().andDeclareIdEqualTo(declareId);
		ifaceConfigInstanceDAO.updateByExampleSelective(ifaceConfigInstance, ifaceConfigInstanceExample);
		
		IfaceConfigDeclare ifaceConfigDeclare = new IfaceConfigDeclare();
		ifaceConfigDeclare.setDeclareId(declareId);
		ifaceConfigDeclare.setAvailable("N");
		ifaceConfigDeclareDAO.updateByPrimaryKeySelective(ifaceConfigDeclare);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#removeInstance(com.regaltec.blocimp.domain.IfaceConfigInstance)
	 */
	public void removeInstance(String instanceId) {
		if (StringUtils.isBlank(instanceId)) {
			throw new IllegalArgumentException("argument instanceId must not be null or empty");
		}
		IfaceConfigMappingExample example = new IfaceConfigMappingExample();
		example.createCriteria().andSourceIdEqualTo(instanceId).andAvailableEqualTo("Y");
		example.or(example.createCriteria().andResultIdEqualTo(instanceId).andAvailableEqualTo("Y"));
		int result = ifaceConfigMappingDAO.countByExample(example);
		if (result > 0) {
			throw new OccupiedException("���̬����ʵ������ӳ�䡣");
		}
		IfaceConfigInstance ifaceConfigInstance = new IfaceConfigInstance();
		ifaceConfigInstance.setInstanceId(instanceId);
		ifaceConfigInstance.setAvailable("N");
		ifaceConfigInstanceDAO.updateByPrimaryKeySelective(ifaceConfigInstance);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceConfigFacade#removeMapping(com.regaltec.blocimp.domain.IfaceConfigMappingKey)
	 */
	public void removeMapping(String mappingId) {
		if (StringUtils.isBlank(mappingId)) {
			throw new IllegalArgumentException("argument mappingId must not be null or empty");
		}
		IfaceConfigMapping ifaceConfigMapping = new IfaceConfigMapping();
		ifaceConfigMapping.setMappingId(mappingId);
		ifaceConfigMappingDAO.deleteByPrimaryKey(ifaceConfigMapping);
	}
	
	/** TODO Ŀǰ��û�����ݱ��棬��ʵ�֡� */
	public IfaceConfigCommand findCommand(String applicationSn, String serviceName) {
		IfaceConfigCommand ifaceConfigCommand = new IfaceConfigCommand();
		ifaceConfigCommand.setApplicationId("94fc2864ba7911deb5da00145e1c9ce0");
		if (StringUtils.equals(applicationSn, "sh_wx") && StringUtils.equalsIgnoreCase(serviceName, "static_code_change")) {
			ifaceConfigCommand.setBeanName("wxDeclareChangeCommand");
		} else {
			throw new IllegalArgumentException(String.format("can not found bean [ systemId: %s, servicename: %s]", applicationSn, serviceName));
		}
		return ifaceConfigCommand;
	}
	
	public IfaceConfigProtocol getProtocol(String protocolId) {
		if (StringUtils.isBlank(protocolId)) {
			throw new IllegalArgumentException("argument protocolId can't be blank");
		}
		IfaceConfigProtocolKey ifaceConfigProtocolKey = new IfaceConfigProtocolKey();
		ifaceConfigProtocolKey.setProtocolId(protocolId);
		return ifaceConfigProtocolDAO.selectByPrimaryKey(ifaceConfigProtocolKey);
	}
	
	/*public List<IfaceConfMappingMixed> findViewIfaceConfMapping(IfaceConfMappingMixedExample example) {
		return ifaceConfigMappingDAO.findViewIfaceConfMapping(example,example.getSkipResults(),example.getMaxResults());
	}*/

	@Resource private IfaceConfigDeclareDAO ifaceConfigDeclareDAO;
	
	@Resource private IfaceConfigInstanceDAO ifaceConfigInstanceDAO;
	
	@Resource private IfaceConfigMappingDAO ifaceConfigMappingDAO;
	
	@Resource private IfaceConfigSystemDAO ifaceConfigSystemDAO;
	
	@Resource private IfaceConfigProtocolDAO ifaceConfigProtocolDAO;
}
