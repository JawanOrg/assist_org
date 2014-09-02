/*
 * <p>����: �ۺ���Ӫ֧��ϵͳ֧��ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceDaemonDocument;
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
import com.free.assist.service.BaseService;

/**
 * <p>�ù����ṩ��־�Ĺ��ܣ�public���ε�Ϊ�ⲿ�ӿڣ�����Ϊ����ģ�Ͱ�ʹ�á�</p>
 * @author ����
 * @version 1
 * @date 2009-09-24 10:01:09
 */
public interface IfaceLogFacade extends BaseService {

	public static final String IFACE_LOG_CATEGORY_TRACE = "TRACE";
	
	public static final String IFACE_LOG_CATEGORY_ERROR = "ERROR";
	
	public static final String TRACE_INDICATOR_REQUEST  = "REQUEST";   //��־������
	
	public static final String TRACE_INDICATOR_RESPONSE = "RESPONSE";  //��־������

	/**
	 * <p>��¼������־���쳣����־ʹ��errorǩ����</p>
	 * @author ����
	 * @date 2009-09-24 10:06:48
	 * @param applicationId��Ӧ�ó����ʶ
	 * @param portName���ӿڵķ���������ص�
	 * @param billDcument����������
	 * @param noteText����־��Ϣ
	 */
	public TraceRecordDTO trace(TraceRecordDTO traceRecordDTO);
	
	/**
	 * <p>��¼�쳣��־</p>
	 * @author ����
	 * @date 2009-09-24 10:14:50
	 * @param applicationId��Ӧ�ó����ʶ
	 * @param portName���ӿڵķ���������ص�
	 * @param billDcument����������
	 * @param errorText��������Ϣ
	 */
	public TraceRecordDTO error(TraceRecordDTO traceRecordDTO);

	/**
	 * <p>��־��ѯ���÷���Ӧ��ֻ��iface��ʹ�ã�����Ҫ��¶����������ģ�顣</p>
	 * @param example
	 * @return ������������־�б�
	 */
	//List<IfaceLogRepository> findRepository(IfaceLogRepositoryExample example);
	
	/**
	 * <p>��־����������ͬһ�����̵�������־����Ȼʹ��findRepository(IfaceLogRepositoryMixedExample)ǩ����
	 * �趨parentId�ǿ�������ģ���ʵ�ϸýӿڵĴ����������ʵ�ֵģ������ýӿڲ��˱�¶����������ģ�顣</p>
	 * @param parentId
	 * @return ������������־�б�
	 */
	public List<IfaceLogRepository> findRepository(String parentId);

	/**
	 * <p>������־ģ��</p>
	 * @param ifaceLogRepositoryKey
	 * @return IfaceLogRepositoryMixedWithBLOBs����־ģ�͸��϶���
	 */
	public IfaceLogRepository getRepository(IfaceLogRepositoryKey ifaceLogRepositoryKey);
	
	/**
	 * <p>������־ģ��</p>
	 * @param ifaceLogRepositoryHisKey
	 * @return IfaceLogRepositoryMixedWithBLOBs����־ģ�͸��϶���
	 */
	public IfaceLogRepositoryHis getRepositoryHis(IfaceLogRepositoryHisKey ifaceLogRepositoryHisKey);

	/**
	 * <p>��ȡϵͳʧ�ܵ���־��ʵ�����ǻ�ȡ�������ݣ���IfaceLogRepositoryWithBLOBs#billDocument�ֶ��</p>
	 * @param maxResults������������һ��ȡ���ļ�¼�������Ϊ�������ʾ�����ơ�
	 * @return ������������־�б�
	 */
	List<IfaceDaemonDocument> getDocumentTaskList(int maxResults);
	
	public void updateDocumentTask(IfaceDaemonDocument ifaceDaemonDocument);

	/**
	 * <p>�����޸�������¼��</p>
	 * @param IfaceLogRepositoryMixedExample
	 * @return
	 */
	public List<IfaceLogRepairMixedWithBLOBs> findRepair(IfaceLogRepairMixedExample example);

	/**
	 * <p>�����޸�</p>
	 * @param ifaceLogRepairKey
	 * @return
	 */
	public IfaceLogRepairMixedWithBLOBs getRepair(IfaceLogRepairKey ifaceLogRepairKey);
	/**
	 * <p>������������¼�޸�ԭ�򣬻��۴���ԭ��⡣</p>
	 * @param ifaceLogRepairKey����־��¼ģ��������
	 */
	public void repair(IfaceLogRepairWithBLOBs ifaceLogRepairWithBLOBs);

}
