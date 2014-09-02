package com.free.assist.web.iface;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.IfaceConfCache;
import com.free.assist.domain.IfaceConfCacheExample;
import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceExample;
import com.free.assist.domain.IfaceConfigInstanceKey;
import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceConfCacheExample.Criteria;
import com.free.assist.service.iface.IfaceConfigCacheService;
import com.free.assist.service.iface.IfaceConfigFacade;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceConfigCacheAction")
public class IfaceConfigCacheAction extends BaseAction {

	private IfaceConfigCacheService ifaceConfigCacheService;
	
	private IfaceConfigFacade ifaceConfigFacade;
	
	@Autowired
	public void setIfaceConfigFacade(IfaceConfigFacade ifaceConfigFacade) {
		this.ifaceConfigFacade = ifaceConfigFacade;
	}
	
	@Autowired
	public void setIfaceConfigCacheService(IfaceConfigCacheService ifaceConfigCacheService) {
		this.ifaceConfigCacheService = ifaceConfigCacheService;
	}
	
	/**
	 * t_iface_conf_cache配置初始化
	 * @author  x :Nov 2, 2009
	 */
	public ActionForward initIfaceWxtogbeoms(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/iface/ifaceConfigCacheSrch.jsp");
	}
	
	/**
	 * 初始化显示解析的XML
	 * １：特别注意点，响应类别在界面中固定为＂成功＂= 0，＂失败＂ = -1
	 *    所以在进行查询时要进行特别处理；
	 * @author  x :Nov 3, 2009
	 * @param form
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public String getIfaceWxtogbeomsList(IfaceConfigCacheActionForm form) throws ServletException, IOException {
		IfaceConfCacheExample example = new IfaceConfCacheExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			//操作类型
			if(form.getChangetype()!=null && !"".equals(form.getChangetype())) {
				criteria.andChangetypeEqualTo(form.getChangetype().trim());
			}
			//响应类别
			if(form.getResponseCode()!=null && !"".equals(form.getResponseCode())) {
				if("0".equals(form.getResponseCode())) {
					criteria.andResponseCodeEqualTo(form.getResponseCode().trim());
				} else if("-1".equals(form.getResponseCode())){
					criteria.andResponseCodeNotEqualTo("0");
				}
			}
			//静态数据类别编码
			if(form.getSysCode()!=null && !"".equals(form.getSysCode())) {
				criteria.andSysCodeEqualTo(form.getSysCode().trim());
			}
			//静态数据实例编码
			if(form.getItemId()!=null && !"".equals(form.getItemId())) {
				criteria.andItemIdEqualTo(form.getItemId().trim());
			}
		}
		criteria.andIsAvailableEqualTo("Y");
		example.setSkipResults(form.getSkipResults());
		example.setMaxResults(form.getMaxResults());
		example.setOrderByClause("changetype");
		List list = this.ifaceConfigCacheService.selectByExample(example);
		WebContext wctx = WebContextFactory.get();
		if(list!=null && list.size()>0) {
			HttpServletRequest request = wctx.getHttpServletRequest();
			request.setAttribute("ifaceWxtogbeomsList", list);
		}
		return wctx.forwardToString("/jsp/iface/ifaceConfigCacheSrchList.jsp");
	}
	
	public String selectRecordByRootId(String rootId) {
		String instanceId = "";
		IfaceConfCache key = new IfaceConfCache();
		key.setRootId(rootId);
		IfaceConfCache ifaceConfCache = (IfaceConfCache)this.ifaceConfigCacheService.selectByPrimaryKey(key);
		instanceId = this.getInstanceIdByIfaceConfCache(ifaceConfCache);
		return instanceId.trim()+":"+rootId.trim();
	}
	
	/**
	 * 获取WX系统的ApplicationId的值
	 * @author  x :Nov 2, 2009
	 * @return
	 */
	public String getApplicationId() {
		String applicationId = "";
		//获取ApplicationId的值
		IfaceConfigSystemExample example = new IfaceConfigSystemExample();
		example.createCriteria().andApplicationSnEqualTo("sh_wx").andAvailableEqualTo("Y");
		List<IfaceConfigSystem> appList = ifaceConfigFacade.selectByExample(example);
		if(appList!=null && appList.size()==1){
			return applicationId = appList.get(0).getApplicationId();
		}
		return applicationId;
	}
	
	/**
	 * 根据declareSn和instanceSn查询出instanceId
	 * @author  x :Nov 2, 2009
	 * @param ifaceConfCache
	 * @return
	 */
	private String getInstanceIdByIfaceConfCache(IfaceConfCache ifaceConfCache) {
		String declareSn = "";
		String instanceSn = "";
		String instanceId = "";
		IfaceConfigInstance ifaceConfigInstance;
		String applicationId = getApplicationId();
		//获取declareSn的值
		declareSn = (ifaceConfCache.getSysCode() == null)?"":ifaceConfCache.getSysCode();
		instanceSn = (ifaceConfCache.getItemId() == null)?"":ifaceConfCache.getItemId();
		
		IfaceConfigDeclare ifaceConfigDeclare = ifaceConfigFacade.getDeclare(applicationId, declareSn);
		if(ifaceConfigDeclare.getDeclareId()!=null && !"".equals(ifaceConfigDeclare.getDeclareId().trim())) {
			IfaceConfigInstanceExample instanceExample = new IfaceConfigInstanceExample();
			String declareId =  ifaceConfigDeclare.getDeclareId().trim();
			instanceExample.createCriteria().andDeclareIdEqualTo(declareId).andInstanceSnEqualTo(instanceSn).andAvailableEqualTo("Y");
			List<IfaceConfigInstance> instanceList = (List)ifaceConfigFacade.selectByExample(instanceExample);
			if(instanceList!=null && instanceList.size()==1) {
				ifaceConfigInstance = instanceList.get(0);
				if(ifaceConfigInstance!=null && ifaceConfigInstance.getInstanceId()!=null && !"".equals(ifaceConfigInstance.getInstanceId().trim())) {
					instanceId = ifaceConfigInstance.getInstanceId().trim();
				}
			}
		}
		return instanceId;
	}
	
	/**
	 * 根据静态数据同步缓存表中的记录的主键，查询出静态数据实例是否已经存在记录
	 * １：存在，从静态数据实例表中删除记录后，再插入新的记录；
	 * ２：不存在，直接将记录插入静态数据实例表中；
	 * @author  x :Nov 3, 2009
	 * @param instanceAndRootId
	 */
	public void insertBySelective(String instanceAndRootId) {
		if(instanceAndRootId!=null && !"".equals(instanceAndRootId)){
			IfaceConfigInstance ifaceConfigInstance = new IfaceConfigInstance();
			String[] strArr = instanceAndRootId.split(":");
			String instanceId = strArr[0];
			String rootId = strArr[1];
			IfaceConfCache key = new IfaceConfCache();
			key.setRootId(rootId);
			//获取applicationId
			String applicationId = this.getApplicationId();
			String declareId = "";
			IfaceConfCache ifaceConfCache = (IfaceConfCache)this.ifaceConfigCacheService.selectByPrimaryKey(key);
			//根据applicationId和declareSn获取declareId
			if(ifaceConfCache!=null && ifaceConfCache.getSysCode()!=null && !"".equals(ifaceConfCache.getSysCode())) {
				IfaceConfigDeclare ifaceConfigDeclare = ifaceConfigFacade.getDeclare(applicationId, ifaceConfCache.getSysCode().trim());
				declareId = ifaceConfigDeclare.getDeclareId();
			}
			
			//新插入的记录
			if("".equals(instanceId)) {
				ifaceConfigInstance.setDeclareId(declareId);
				ifaceConfigInstance.setInstanceSn(ifaceConfCache.getItemId());
				ifaceConfigInstance.setInstanceName(ifaceConfCache.getItemName());
				ifaceConfigCacheService.insertIfaceConfigInstanceBySelective(ifaceConfigInstance);
			} 
			//已经存在记录，删除掉后再插入
			else {
				IfaceConfigInstanceKey key1 = new IfaceConfigInstanceKey();
				key1.setInstanceId(instanceId);
				int flag = ifaceConfigCacheService.deleteIfaceConfigInstance(key1);
				if(flag!=-1) {
					ifaceConfigInstance.setDeclareId(declareId);
					ifaceConfigInstance.setInstanceSn(ifaceConfCache.getItemId());
					ifaceConfigInstance.setInstanceName(ifaceConfCache.getItemName());
					ifaceConfigCacheService.insertIfaceConfigInstanceBySelective(ifaceConfigInstance);
				}
			}
			
			if(!"".equals(rootId)) {
				this.updateBySelective(rootId);
			}
		}
	}
	
	/**
	 * 根据实例ID，更新静态数据实例中的记录
	 * 更新方式：可选更新
	 * @author  x :Nov 3, 2009
	 * @param rootId
	 */
	private void updateBySelective(String rootId) {
		IfaceConfCache ifaceConfCache = new IfaceConfCache();
		ifaceConfCache.setRootId(rootId);
		ifaceConfCache.setIsAvailable("N");
		this.ifaceConfigCacheService.updateByPrimaryKeySelective(ifaceConfCache);
	}
	
	/**
	 * 根据主键删除静态数据实例数据中的一条对应记录
	 * @author  x :Nov 3, 2009
	 * @param instanceId
	 * @return
	 */
	public String deleteByPrimaryKey(String instanceId) {
		this.ifaceConfigFacade.removeInstance(instanceId);
		return instanceId;
	}
	
	/**
	 * 根据实例ID，更新静态数据实例表和静态数据同步缓存表中的记录
	 * @author  x :Nov 3, 2009
	 * @param instanceAndRootId
	 */
	public void updateInstanceByInstanceAndRootId(String instanceAndRootId) {
		if(instanceAndRootId!=null && !"".equals(instanceAndRootId)){
			String[] strArr = instanceAndRootId.split(":");
			String instanceId = strArr[0];
			String rootId = strArr[1];
			IfaceConfCache key = new IfaceConfCache();
			key.setRootId(rootId);
			IfaceConfCache ifaceConfCache = (IfaceConfCache)this.ifaceConfigCacheService.selectByPrimaryKey(key);
			IfaceConfigInstance ifaceConfigInstance = ifaceConfigFacade.getInstance(instanceId);
			String itemName = (ifaceConfCache.getItemName()==null?"":ifaceConfCache.getItemName().trim());
			String parentItemId = (ifaceConfCache.getParentItemId()==null?"":ifaceConfCache.getParentItemId().trim());
			ifaceConfigInstance.setInstanceName(itemName);
			ifaceConfigInstance.setParentId(parentItemId);
			this.ifaceConfigFacade.updateInstance(ifaceConfigInstance);
			
			if(rootId!=null && !"".equals(rootId)) {
				this.updateBySelective(rootId);
			}
		}
	}
	
	/**
	 * 查看实例ID在静态映射表中是否存在：
	 * １，如果存在，提示不能进行删除操作；
	 * ２,如果不存在，从静态数据实例表和静态数据同步缓存表中删除记录；
	 * @author  x :Nov 3, 2009
	 * @param sourceId
	 * @return
	 */
	public String findMapping(String sourceId) {
		String[] args = sourceId.split(":");
		String instanceId = (args[0]==null)?"":args[0];
		String rootId = (args[1]==null)?"":args[1];
		IfaceConfigMappingExample example = new IfaceConfigMappingExample();
		example.createCriteria().andSourceIdEqualTo(instanceId).andAvailableEqualTo("Y");
		List<IfaceConfigMapping> list = this.ifaceConfigFacade.findMapping(example);
		if(list!=null && list.size()>0) {
			return "cannotDelete";
		}
		if(!"".equals(instanceId)) {
			this.ifaceConfigFacade.removeInstance(instanceId);
		}
		
		if(rootId!=null && !"".equals(rootId)) {
			this.updateBySelective(rootId);
		}
		return "";
	}
	
	/**
	 * 解析传入的XML字符串并无检查的保存到t_iface_conf_cache表中
	 * @author  x :Nov 2, 2009
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward paserXMLStr(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String xmlStr = "<?xml version=\"1.0\" encoding=\"GB2312\"?><ROOT><DATA><RESPONSEDATA><RESPONSE_CODE>0</RESPONSE_CODE><RESPONSE_INFO></RESPONSE_INFO></RESPONSEDATA><LOOP_DATA><SYS_CODE>FAULT_POSITION_TYPE_ID</SYS_CODE><SYS_CODENAME>业务类型与故障部位关系表</SYS_CODENAME><ITEM_ID>391</ITEM_ID><ITEM_NAME>工单编号2</ITEM_NAME><PARENT_ITEM_ID>102008</PARENT_ITEM_ID><CHANGETYPE>DELETE</CHANGETYPE><SERIAL_NUMBER>2</SERIAL_NUMBER></LOOP_DATA><LOOP_DATA><SYS_CODE>FAULT_POSITION_TYPE_ID</SYS_CODE><SYS_CODENAME>业务类型与故障部位关系表</SYS_CODENAME><ITEM_ID>488</ITEM_ID><ITEM_NAME>名称</ITEM_NAME><PARENT_ITEM_ID>102008</PARENT_ITEM_ID><CHANGETYPE>INSERT</CHANGETYPE><SERIAL_NUMBER>2</SERIAL_NUMBER></LOOP_DATA></DATA></ROOT>";
		//String xmlStr = "<?xml version=\"1.0\" encoding=\"GB2312\"?><ROOT><DATA><RESPONSEDATA><RESPONSE_CODE>0</RESPONSE_CODE><RESPONSE_INFO>通讯故障</RESPONSE_INFO></RESPONSEDATA></DATA></ROOT>";
		this.ifaceConfigCacheService.paserXML(xmlStr);
		return null;
	}
}
