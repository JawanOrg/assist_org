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
	 * 接口调用 检查XML的校验
	 *
	 * @param noticeInfo
	 * @return
	 * @throws BOException
	 */
	public Map<String, Object> checkXml(Document document, String methodId, String applicationId) throws Exception;

	/**
	 * 转换xml格式与静态数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> changerXml(Document document, SuptFace suptFace, String applicationId,String tgr_applicationId) throws Exception;
	
	/**
	 * 预览xml
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String getOutXml(String methodId) throws Exception;
	
	/**
	 * 查询验证规则数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public List<SuptCheck> selectSuptCheckByExample(SuptCheckExample exp) throws Exception;
	
	/**
	 * 删除验证规则数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteCheck(String  ids) throws Exception;
	
	/**
	 * 查询转出规则数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public List<SuptCheckOut> selectCheckOutByExample(SuptCheckOutExample exp) throws Exception;
	
	/**
	 * 删除转出规则数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteCheckOut(String  ids) throws Exception;
	
	/**
	 * 删除返回值规则数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String deleteReturnValue(String  ids) throws Exception;
	

	/**
	 * 插入返回ID表数据
	 *
	 * @param document
	 * @param methodId
	 * @param applicationId
	 * @return
	 * @throws Exception
	 */
	public String insertReturn(SuptReturn sre) throws Exception;
}
