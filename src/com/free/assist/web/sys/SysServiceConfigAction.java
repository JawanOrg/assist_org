package com.free.assist.web.sys;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.domain.SysServiceConfigExample.Criteria;
import com.free.assist.framework.SysTask;
import com.free.assist.framework.SysTaskManager;
import com.free.assist.service.sys.ISysServiceConfig;
import com.free.assist.util.ObjectUtil;
import com.free.assist.web.BaseAction;

@Controller("/sys/sysServiceConfigAction")
public class SysServiceConfigAction extends BaseAction {
	
	@Resource private ISysServiceConfig sysServiceConfig;

	public void setSysServiceConfig(ISysServiceConfig sysServiceConfig) {
		this.sysServiceConfig = sysServiceConfig;
	}
	
	public ActionForward initSysServiceConfig(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/systask/sysTaskSrch.jsp");
	} 
	
	/**
	 * @author  x :Oct 21, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getSysTaskList(SysServiceConfigActionForm form) throws ServletException, IOException {
		SysServiceConfigExample example = new SysServiceConfigExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			if(form.getServiceName()!=null && !"".equals(form.getServiceName())) {
				criteria.andServiceNameLike("%"+form.getServiceName().trim()+"%");
			}
			if(form.getServiceClass()!=null && !"".equals(form.getServiceClass())) {
				criteria.andServiceClassLike("%"+form.getServiceClass().trim()+"%");
			}
		}
		criteria.andIsDeletedEqualTo("N");
		example.setSkipResults(form.getSkipResults());
		example.setMaxResults(form.getMaxResults());
		List<SysServiceConfig> list = (List<SysServiceConfig>)sysServiceConfig.selectByExample(example);
		
		WebContext wctx = WebContextFactory.get();
		if(list!=null && list.size()>0) {
			HttpServletRequest request = wctx.getHttpServletRequest();
			request.setAttribute("sysTaskServiceList", list);
		}
		return wctx.forwardToString("/jsp/systask/sysTaskSrchList.jsp");
	}
	
	/**
	 * @author  x :Oct 21, 2009
	 * @param ids
	 */
	public void removeSysTaskBuCheckbox(String ids) {
		if(ids!=null && !"".equals(ids)) {
			String[] serviceIds = ids.split(",");
			for(int i=0;i<serviceIds.length;i++) {
				SysServiceConfig key = new SysServiceConfig();
				String serviceId = serviceIds[i];
				key.setServiceId(serviceId);
				sysServiceConfig.deleteByPrimaryKey(key);
			}
			
			SysTaskManager.stopAllSelectedSysTask(ids);
		}
	}
	
	/**
	 * @author  x :Oct 21, 2009
	 * @param form
	 * @return
	 */
	public String insertSelectiveDataToSysServiceConfig(SysServiceConfigActionForm form) {
		if(form!=null && form.getServiceClass()!=null && !"".equals(form.getServiceClass())) {
			SysServiceConfigExample example = new SysServiceConfigExample();
			example.createCriteria().andServiceClassEqualTo(form.getServiceClass().trim()).andIsDeletedEqualTo("N");
			Integer count = sysServiceConfig.selectCountByExample(example);
			if(count>=1) {
				return "您提交的服务CLASS已经存在!";
			}
		}
		SysServiceConfig record = new SysServiceConfig();
		ObjectUtil.copyObjectToObject(form, record);
		record.setIsDeleted("N");
		sysServiceConfig.insert(record);
		
		SysTaskManager.addSysTask(record);
		if ("Y".equalsIgnoreCase(record.getStartDefault())) {
			SysTaskManager.startSysTask(record);
		}
		return "";
	}
	
	/**
	 * @author  x :Oct 21, 2009
	 * @param serviceId
	 * @return
	 */
	public SysServiceConfig getSysServiceConfigByServiceId(String serviceId) {
		SysServiceConfig key = new SysServiceConfig();
		key.setServiceId(serviceId);
		return (SysServiceConfig)sysServiceConfig.selectByPrimaryKey(key);
	}
	
	/**
	 * @author  x :Oct 21, 2009
	 * @param form
	 * @return
	 */
	public String updateSelectiveDataToSysServiceConfig(SysServiceConfigActionForm form) {
		SysServiceConfig record = new SysServiceConfig();
		ObjectUtil.copyObjectToObject(form, record);
		//1.更新系统初始化时读取的配置文件选项
		int flag = sysServiceConfig.updateByPrimaryKeySelective(record);
		if(flag!=-1) {
			//1.1更新时，变更默认启动选项为打开
			if(record!=null && "Y".equals(record.getStartDefault())) {
				//1.1.1更新(变更后的后台服务)的选项到所有后台服务中
				SysServiceConfig sc = new SysServiceConfig();
				if(SysTaskManager.sysHashMap.get(record.getServiceId())!=null) {
					sc = SysTaskManager.sysHashMap.get(record.getServiceId());
					sc.setStartDefault(record.getStartDefault());
					sc.setRunMode("Y");
				}
				//1.1.2判断正在运行中的后台服务是否包含变更的后台服务，如果没有包含就启动，如果已经包含就重新启动
				if(!SysTaskManager.runningTask.containsKey(record.getServiceId())) {
					SysTaskManager.startSysTask(sc);
				} else {
					SysTaskManager.restartSysTaskOnSysRunning(record);
				}
			} 
			//1.2更新时，变更默认启动选项为关闭
			else if(record!=null && "N".equals(record.getStartDefault())) {
				//1.2.1更新(变更后的后台服务)的选项到所有后台服务中
				if(SysTaskManager.sysHashMap.containsKey(record.getServiceId())) {
					SysServiceConfig sc = SysTaskManager.sysHashMap.get(record.getServiceId());
					sc.setStartDefault(record.getStartDefault());
					sc.setRunMode("N");
				}
				//1.2.2如果正在运行中的后台服务包含变更的后台服务，停止这个后台服务
				if(SysTaskManager.runningTask.containsKey(record.getServiceId())) {
					SysTaskManager.stopSysTask(record);
				}
			}
			return "1";
		} else {
			return "";
		}
	}

}
