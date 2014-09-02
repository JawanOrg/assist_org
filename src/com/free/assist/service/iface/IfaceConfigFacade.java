/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceConfigCommand;
import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.vo.MorphDTO;
import com.free.assist.service.BaseService;

/**
 * @author ����
 * @version 1
 * @date 2009-09-29 16:24:33
 */
public interface IfaceConfigFacade extends BaseService {

	/**
	 * <p>У���ֶ�ֵ�Ƿ��ھ�̬���ݷ�Χ�</p>
	 * @param applicationId��������Ӧ�ýӿڳ���(ϵͳ)���Ǹ���ʶ�����Ǳ��롣
	 * @param declareSn����̬���ݵ��ֵ���룬������XML�ı�ǩ��tagһ��������xml�����뾲̬�����޷������ϡ�
	 * @param instanceSn����̬���ݵ���Ŀ(ʵ��)ֵ��
	 * @return ��������ڸþ�̬���ݡ����߲��洢��̬����ֵ���᷵��false��
	 */
	public boolean exists(String applicationId, String declareSn, String instanceSn);
	
	/**
	 * <p>��̬����ת����</p>
	 * @param morphDTO��ת�����ݶ���
	 * @return ת������ַ����������̬����û������ӳ�䣬�������instanceSn��
	 */
	public String morph(MorphDTO morphDTO);
	
	/**
	 * <p>��̬���ݷ��롣</p>
	 * @param morphDTO���������ݶ���
	 * @return �������ַ����������̬����û������ӳ�䣬�������instanceSn��
	 */
	public String trans(MorphDTO morphDTO);

	public List<IfaceConfigSystem> getApplicationList();

	/**
	 * <p>����һ����̬���ݶ���ļ�¼</p>
	 * @param ifaceConfigDeclareKey
	 * @return ��̬���ݶ������
	 */
	IfaceConfigDeclare getDeclare(String declareId);
	
	/**
	 * <p>����ϵͳ��ʶ����̬���ݱ������һ����¼</p>
	 * @param applicationSn
	 * @param declareSn
	 * @return ��̬���ݶ������
	 */
	IfaceConfigDeclare getDeclare(String applicationId, String declareSn);

	/**
	 * <p>���뾲̬���ݶ���</p>
	 * @param ifaceConfigDeclare
	 */
	void addDeclare(IfaceConfigDeclare ifaceConfigDeclare);
	
	/**
	 * <p>���±�̬���ݶ���</p>
	 * @param ifaceConfigDeclare
	 */
	void updateDeclare(IfaceConfigDeclare ifaceConfigDeclare);

	/**
	 * <p>ɾ����̬���ݶ���</p>
	 * @param ifaceConfigDeclare
	 */
	void removeDeclare(String declareId);

	/**
	 * <p>��̬���ݶ������</p>
	 * @param ifaceConfigDeclareExample
	 * @return ��̬���ݶ��弯��
	 */
	//List<IfaceConfigDeclare> findDeclare(IfaceConfigDeclareExample example);

	/**
	 * <p>����ϵͳӦ�ó��������̬���ݶ���</p>
	 * @param ifaceApplicationKey
	 * @return ��̬���ݶ��弯��
	 */
	public List<IfaceConfigDeclare> findDeclare(String applicationId);
	
	public List<IfaceConfigDeclare> findDeclareWithChildren(String applicationId);

	/**
	 * <p>����һ����̬������Ŀ�ļ�¼</p>
	 * @param ifaceConfigInstanceKey
	 * @return ��̬������Ŀ����
	 */
	IfaceConfigInstance getInstance(String instanceId);

	/**
	 * <p>���ݾ�̬���ݱ�ʶ��ʵ��ֵ����ʵ����</p>
	 * @param declareId
	 * @param instanceSn
	 * @return ʵ��
	 */
	public IfaceConfigInstance getInstance(String declareId, String instanceSn);

	/**
	 * <p>
	 * @param ifaceConfigInstance
	 */
	void addInstance(IfaceConfigInstance ifaceConfigInstance);

	/**
	 * <p>���¾�̬����ʵ��</p>
	 * @param ifaceConfigInstance
	 */
	void updateInstance(IfaceConfigInstance ifaceConfigInstance);

	/**
	 * 
	 * @param ifaceConfigInstance
	 */
	void removeInstance(String instanceId);

	//List<IfaceConfigInstance> findInstance(IfaceConfigInstanceExample example);
	
	/**
	 * <p>���������ҵ�������ʵ������</p>
	 * @param declareId�����ͱ�ʶ
	 * @return ʵ���б�
	 */
	public List<IfaceConfigInstance> findInstance(String declareId);
	
	//public List<IfaceConfigInstance> findInstanceWithChildren(String declareId);
	
	public List<IfaceConfigInstance> findInstance(String sourcePid, String resultPid);
	
	IfaceConfigMapping getMapping(String mappingId);
	
	void addMapping(IfaceConfigMapping ifaceConfigMapping);
	
	void removeMapping(String mappingId);
	
	List<IfaceConfigMapping> findMapping(IfaceConfigMappingExample example);
	
	//List<IfaceConfigMapping> findMapping(IfaceConfigDeclareKey ifaceConfigDeclareKey);
	
	//List<IfaceConfigMapping> findMapping(String applicationId);
	
	public IfaceConfigCommand findCommand(String applicationSn, String serviceName);
	
	public IfaceConfigProtocol getProtocol(String protocolId);
}
