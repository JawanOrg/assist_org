package com.free.assist.web.iface;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.IfaceConfigProtocolExample.Criteria;
import com.free.assist.service.iface.IfaceConfigSystemService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceConfigProtocolAction")
public class IfaceConfigProtocolAction extends BaseAction {

	@Resource private IfaceConfigSystemService ifaceConfigSystemService;
	
	public void setIfaceConfigSystemService(IfaceConfigSystemService ifaceConfigSystemService) {
		this.ifaceConfigSystemService = ifaceConfigSystemService;
	}
	
	/**
	 * 初始化，根据外键applicationId查询接口系统配置列表
	 * @author gms:Nov 3, 2009
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward ifaceConfigProtocolInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String applicationId = (String)request.getParameter("applicationId");
		return new ActionForward("/jsp/iface/protocol/protocolSrch.jsp?applicationId="+applicationId);
	}
	
	/**
	 * DWR--初始化，根据外键applicationId查询接口系统配置列表
	 * @author gms:Nov 3, 2009
	 * @param applicationId
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceConfigProtocolList(IfaceConfigProtocolActionForm form) throws ServletException, IOException {
		IfaceConfigProtocolExample example = new IfaceConfigProtocolExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			if(form.getApplicationId()!=null && !"".equals(form.getApplicationId())) {
				criteria.andApplicationIdEqualTo(form.getApplicationId().trim());
			}
		}
		criteria.andAvailableEqualTo("Y");
		example.setMaxResults(form.getMaxResults());
		example.setSkipResults(form.getSkipResults());
		List<IfaceConfigProtocol> list = this.ifaceConfigSystemService.selectByExample(example);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		if(list!=null && list.size()>0) {
			request.setAttribute("ifaceConfigProtocolList", list);
		}
		return wctx.forwardToString("/jsp/iface/protocol/protocolList.jsp");
	}
	
	public ActionForward getAttachProtocolList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		IfaceConfigProtocolExample example = new IfaceConfigProtocolExample();
		example.createCriteria().andProtocolNameEqualTo(IfaceConfigProtocol.PROTOCOL_NAME_FTP);
		List<IfaceConfigProtocol> protocolList = ifaceConfigSystemService.selectByExample(example);
		
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		jsonGenerator.writeStartObject();
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceConfigProtocol protocol : protocolList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("protocolId", protocol.getProtocolId());
			jsonGenerator.writeStringField("applicationName", protocol.getApplicationName());
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
		
		return null;
	}
	
	/**
	 * DWR--插入一条新记录
	 * @author gms:Nov 4, 2009
	 * @param form
	 */
	public void insertIfaceConfigProtocolRecord(IfaceConfigProtocolActionForm form) {
		IfaceConfigProtocol record = new IfaceConfigProtocol();
		if(form!=null) {
			ObjectUtil.copyObjectToObject(form, record);
			record.setAvailable("Y");
			if(this.getCurrentUser()!=null) {
				record.setUpdateUser(this.getCurrentUser().getUserName());
			} else {
				record.setUpdateUser("");
			}
		}
		this.ifaceConfigSystemService.insertIfaceConfigProtocolRecord(record);
	}
	
	/**
	 * DWR--更新已存在记录
	 * @author gms:Nov 4, 2009
	 * @param form
	 */
	public void updateIfaceConfigProtocolRecord(IfaceConfigProtocolActionForm form) {
		IfaceConfigProtocol record = new IfaceConfigProtocol();
		if(form!=null) {
			ObjectUtil.copyObjectToObject(form, record);
			record.setAvailable("Y");
			record.setUpdateDate(new Date());
			if(this.getCurrentUser()!=null) {
				record.setUpdateUser(this.getCurrentUser().getUserName());
			} else {
				record.setUpdateUser("");
			}
		}
		this.ifaceConfigSystemService.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * DWR--逻辑删除已存在记录
	 * @author gms:Nov 4, 2009
	 * @param ids
	 */
	public void deleteIfaceConfigProtocolData(String ids) {
		IfaceConfigProtocol record = new IfaceConfigProtocol();
		String[] args = ids.split(":");
		for(String arg : args) {
			record.setProtocolId(arg);
			record.setAvailable("N");
			this.ifaceConfigSystemService.updateByPrimaryKeySelective(record);
		}
	}
	
	/**
	 * DWR--根据主键选择一条记录
	 * @author gms:Nov 4, 2009
	 * @param protocolId
	 * @return
	 */
	public IfaceConfigProtocol selectProtocolByPrimaryKey(String protocolId) {
		if(protocolId!=null && !"".equals(protocolId)) {
			IfaceConfigProtocol record = new IfaceConfigProtocol();
			record.setProtocolId(protocolId);
			record.setAvailable("Y");
			return (IfaceConfigProtocol)this.ifaceConfigSystemService.selectByPrimaryKey(record);
		}
		return null;
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
