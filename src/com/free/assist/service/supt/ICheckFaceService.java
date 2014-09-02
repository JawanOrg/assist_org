package com.free.assist.service.supt;

import java.util.List;
import java.util.Map;

import org.dom4j.Document;

import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptCheckOutExample;
import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptReturn;
import com.free.assist.service.BaseService;

public interface ICheckFaceService extends BaseService {
	/**
	 * �ӿڵ��� ���XML��У��
	 *
	 * @param noticeInfo
	 * @return
	 * @throws BOException
	 */
	public Map<String, Object> checkXml(Document document, String methodId, String applicationId) throws Exception;

	/**
	 * ת��xml��ʽ�뾲̬����
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> changerXml(Document document, SuptFace suptFace, String applicationId,String tgr_applicationId) throws Exception;
	
	/**
	 * Ԥ��xml
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String getOutXml(String methodId) throws Exception;
	
	/**
	 * ��ѯ��֤��������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public List<SuptCheck> selectSuptCheckByExample(SuptCheckExample exp) throws Exception;
	
	/**
	 * ɾ����֤��������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteCheck(String  ids) throws Exception;
	
	/**
	 * ��ѯת����������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public List<SuptCheckOut> selectCheckOutByExample(SuptCheckOutExample exp) throws Exception;
	
	/**
	 * ɾ��ת����������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteCheckOut(String  ids) throws Exception;
	
	/**
	 * ɾ������ֵ��������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteReturnValue(String  ids) throws Exception;
	

	/**
	 * ���뷵��ID������
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String insertReturn(SuptReturn sre) throws Exception;
}
