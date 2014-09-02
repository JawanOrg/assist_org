package com.free.assist.web.iface;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.IfaceConfigSystemExample.Criteria;
import com.free.assist.service.iface.IfaceConfigFacade;
import com.free.assist.service.iface.IfaceConfigSystemService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceConfigSystemAction")
public class IfaceConfigSystemAction extends BaseAction {
	
	private IfaceConfigSystemService ifaceConfigSystemService;
	
	private IfaceConfigFacade ifaceConfigFacade;
	
	@Autowired
	public void setIfaceConfigFacade(IfaceConfigFacade ifaceConfigFacade) {
		this.ifaceConfigFacade = ifaceConfigFacade;
	}

	@Autowired
	public void setIfaceConfigSystemService(IfaceConfigSystemService ifaceConfigSystemService) {
		this.ifaceConfigSystemService = ifaceConfigSystemService;
	}

	/**
	 * 初始化接口系统配置(新)
	 * @author gms:Nov 3, 2009
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward ifaceConfigSystemInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/iface/system/systemSrch.jsp");
	}
	
	/**
	 * 初始化接口系统配置集合
	 * @author gms:Nov 3, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceConfigSystemList(IfaceConfigSystemActionForm form) throws ServletException, IOException {
		IfaceConfigSystemExample example = new IfaceConfigSystemExample();
		Criteria criteria = example.createCriteria();
		if(form!=null){
			if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
				criteria.andApplicationNameEqualTo(form.getApplicationName().trim());
			}
			if(form.getApplicationSn()!=null && !"".equals(form.getApplicationSn())) {
				criteria.andApplicationSnEqualTo(form.getApplicationSn().trim());
			}
		}
		criteria.andAvailableEqualTo("Y");
		example.setSkipResults(form.getSkipResults());
		example.setMaxResults(form.getMaxResults());
		
		List<IfaceConfigSystem> list = this.ifaceConfigSystemService.selectByExample(example);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		if(list!=null && list.size()>0) {
			request.setAttribute("ifaceConfigSystemList", list);
		}
		return wctx.forwardToString("/jsp/iface/system/systemList.jsp");
	}
	
	/**
	 * 插入新记录(可选插入)
	 * @author gms:Nov 3, 2009
	 * @param form
	 * @return
	 */
	public String insertBySelective(IfaceConfigSystemActionForm form) {
		IfaceConfigSystemExample example = new IfaceConfigSystemExample();
		if(form!=null) {
			example.createCriteria().andApplicationSnEqualTo(form.getApplicationSn().trim()).andAvailableEqualTo("Y");
		}
		int count = this.ifaceConfigSystemService.selectCountByExample(example);
		if(count>0) {
			return "已存在相同的系统编码!";
		}
		
		IfaceConfigSystem record = new IfaceConfigSystem();
		if(form!=null) {
			ObjectUtil.copyObjectToObject(form, record);
			record.setAvailable("Y");
			record.setCreateDate(new Date());
			record.setUpdateDate(new Date());
			record.setUpdateUser(this.getCurrentUser().getUserName());
		}
		this.ifaceConfigSystemService.insertBySelective(record);
		return "";
	}
	
	/**
	 * 更新记录(可选更新)
	 * @author gms:Nov 3, 2009
	 * @param form
	 */
	public void updateByPrimaryKeySelective(IfaceConfigSystemActionForm form) {
		IfaceConfigSystem ifaceConfigSystem = new IfaceConfigSystem();
		IfaceConfigSystem record = new IfaceConfigSystem();
		if(form!=null) {
			ifaceConfigSystem.setApplicationId(form.getApplicationId().trim());
			record = (IfaceConfigSystem)this.ifaceConfigSystemService.selectByPrimaryKey(ifaceConfigSystem);
			record.setUpdateDate(new Date());
			record.setUpdateUser(this.getCurrentUser().getUserName());
			record.setApplicationName(form.getApplicationName().trim());
			record.setApplicationSn(form.getApplicationSn().trim());
		}
		this.ifaceConfigSystemService.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 对传入的主键串进行删除
	 * @author gms:Nov 3, 2009
	 * @param ids
	 */
	public String deleteLogicByPrimaryKey(String applicationId) {
		//t_iface_conf_declare是否存在对应applicationId的记录
		List<IfaceConfigDeclare> list = this.ifaceConfigFacade.findDeclare(applicationId);
		if(list!=null && list.size()>0) {
			return "静态数据定义表中存在对应applicationId的记录，请先删除这些记录!";
		}
		//t_supt_face是否存在对应applicationId的记录
		SuptFaceExample example = new SuptFaceExample();
		example.createCriteria().andApplicationIdEqualTo(applicationId);
		int count = this.ifaceConfigSystemService.selectCountByExample(example);
		if(count>0){
			return "接口方法配置表中存在对应applicationId的记录，请先删除这些记录!";
		}
		
		//applicationId对应的接口配置协议表所有记录置成N
		IfaceConfigProtocolExample protocolExample = new IfaceConfigProtocolExample();
		protocolExample.createCriteria().andApplicationIdEqualTo(applicationId);
		IfaceConfigProtocol protocol = new IfaceConfigProtocol();
		List<IfaceConfigProtocol> proList = this.ifaceConfigSystemService.selectByExample(protocolExample);
		if(proList!=null && proList.size()>0) {
			for(IfaceConfigProtocol pro : proList) {
				protocol.setProtocolId(pro.getProtocolId());
				protocol.setAvailable("N");
				this.ifaceConfigSystemService.updateByPrimaryKeySelective(protocol);
			}
		}
		
		//applicationId对应的接口系统表所有记录置成N
		IfaceConfigSystem record = new IfaceConfigSystem();
		record.setApplicationId(applicationId);
		record.setAvailable("N");
		this.ifaceConfigSystemService.updateByPrimaryKeySelective(record);
		return "";
	}
	
	/**
	 * 获取当前用户
	 * @author gms:Nov 3, 2009
	 * @return
	 */
	private SysUser getCurrentUser() {
		HttpSession session = super.getSessionByDWR();
		return (SysUser)session.getAttribute("currentUser");
	}

}
