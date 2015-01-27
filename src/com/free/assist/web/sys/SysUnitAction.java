package com.free.assist.web.sys;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.service.sys.ISysUnitService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysUnitAction")
public class SysUnitAction extends BaseAction {
	@Autowired private ISysUnitService sysUnitService;
	@Autowired
	private CommonOperateService commonOperateService;
	
	public ActionForward showTreeWithTypeInit(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
		String id=commonOperateService.queryUserUnitId(currentUser.getUserId());
		if(id==null||"".equals(id)){
			id = "0";
		}
		request.setAttribute("id", id);
		return new ActionForward("/jsp/sys/unit/sysUnitManager.jsp");
	}
	
	public ActionForward showTreeWithTypeInitUser(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
		String id=commonOperateService.queryUserUnitId(currentUser.getUserId());
		if(id==null||"".equals(id)){
			id = "0";
		}
		request.setAttribute("id", id);
		return new ActionForward("/jsp/sys/unit/sysUserManager.jsp");
	}
		

	/**
	 * 根据父节点取得子节点列表 并构成DHTML TREE的XML 
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws RegaltecException
	 * @throws IOException
	 */
	public ActionForward showTreeWithType(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String parentId="";
		String id=StringUtil.nullToEmptyOfObject(request.getParameter("id"));

		String type = "";
		String[]ids =id.split("_");
		if(ids!=null && ids.length==2){
			parentId = ids[0];
			type = ids[1];
		}
		parentId = (parentId == null ? id : parentId);
		parentId = (parentId.equals("")? id : parentId);
		List nodeList=null;
		
		SysUnitExample example=new SysUnitExample();
		example.createCriteria().andParentUnitidEqualTo(parentId);
		example.setOrderByClause(" Sort_Order");
		
		nodeList = this.sysUnitService.selectByExample(example);
		
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");

		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding='GBK'?>\n");
		sb.append("<tree id=\"" + id + "\">");
		if (nodeList != null && nodeList.size() > 0) {
			sb.append(this.makeTreeXMLWithType(nodeList));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		//System.out.println("\n\n\n"+sb.toString()+"\n\n\n");
		return null;
	}

	/**
	 * 构造树节点的XML字符串
	 * @param nodeList
	 * @return
	 */
	private String makeTreeXMLWithType(List nodeList) {
		StringBuffer sb = new StringBuffer();
		for (Object obj : nodeList) {
			SysUnit model = (SysUnit) obj;
			sb.append("<item child=\"" + model.getChildCount() + "\" text=\"" + model.getUnitName() + "\" id=\"" + model.getUnitId() +"_"+ model.getUnitType() + "\"></item>");
		}
		return sb.toString();
	}
	
	
	/**
	 * 跳转到表的主页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUnitManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUnitManager.jsp");
	}
	
	/**
	 * 跳转到查询页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUnitSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUnitSrch.jsp");
	}
	
	
	/**
	 * 跳转到新增输入页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUnitAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String unitId=StringUtil.nullToEmptyOfObject(request.getParameter("unitId"));

		if(unitId.equals("-1")||unitId.equals("")||unitId.equals("0"))
		{
			request.setAttribute("parentUnitid", "0");
			request.setAttribute("parentName", "----");
			request.setAttribute("unitName", "");
			request.setAttribute("unitType", "");
			request.setAttribute("unitId", "");
			
			request.setAttribute("unitDes", "");
			request.setAttribute("phone", "");
			request.setAttribute("isValid", "");
			request.setAttribute("sortOrder", "");
			request.setAttribute("remark", "");
		} else {
			SysUnit hma = new SysUnit();
			hma.setUnitId(unitId);
			hma = (SysUnit) this.sysUnitService.selectByPrimaryKey(hma);
			if(hma!=null) {
				request.setAttribute("parentUnitid",hma.getUnitId());
				request.setAttribute("parentName", hma.getUnitName());
				request.setAttribute("unitName","");
				request.setAttribute("unitType", hma.getUnitType());
				request.setAttribute("unitId", "");
				
				request.setAttribute("unitDes", hma.getUnitDes());
				request.setAttribute("phone", hma.getPhone());
				request.setAttribute("isValid", hma.getIsValid());
				request.setAttribute("sortOrder", "");
				request.setAttribute("remark", hma.getRemark());
			}
		}
		return new ActionForward("/jsp/sys/unit/sysUnitAdd.jsp");
	}
	
	/**
	 * 跳转到查看页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUnitView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String unitId=StringUtil.nullToEmptyOfObject(request.getParameter("unitId"));

		SysUnit hma = new SysUnit();
		hma.setUnitId(unitId);
		hma = (SysUnit) this.sysUnitService.selectByPrimaryKey(hma);
		if(hma!=null) {
			if(StringUtil.nullToEmptyOfObject(hma.getParentName()).length()==0)
			{
				request.setAttribute("parentName", "----");
			} else {
				request.setAttribute("parentName", hma.getParentName());
			}
			request.setAttribute("parentUnitid","");
			request.setAttribute("unitName",hma.getUnitName());
			request.setAttribute("unitType", hma.getUnitType());
			request.setAttribute("unitTypeName", hma.getUnitTypeName());
			request.setAttribute("unitId", hma.getUnitId());
			
			request.setAttribute("unitDes", hma.getUnitDes());
			request.setAttribute("unitDesName", commonOperateService.queryUserName(hma.getUnitDes()));
			request.setAttribute("phone", hma.getPhone());
			request.setAttribute("isValid", hma.getIsValid());
			request.setAttribute("isValidName", hma.getIsValidName());
			request.setAttribute("sortOrder", hma.getSortOrder());
			request.setAttribute("remark", hma.getRemark());
		}
		return new ActionForward("/jsp/sys/unit/sysUnitView.jsp");
	}
	
	
	/**
	 * 跳转到修改页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUnitEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String unitId=StringUtil.nullToEmptyOfObject(request.getParameter("unitId"));

		SysUnit hma = new SysUnit();
		hma.setUnitId(unitId);
		hma = (SysUnit) this.sysUnitService.selectByPrimaryKey(hma);
		if(hma!=null) {
			if(StringUtil.nullToEmptyOfObject(hma.getParentName()).length()==0)
			{
				request.setAttribute("parentName", "----");
			} else {
				request.setAttribute("parentName", hma.getParentName());
			}
			request.setAttribute("parentUnitid","");
			request.setAttribute("unitName",hma.getUnitName());
			request.setAttribute("unitType", hma.getUnitType());
			request.setAttribute("unitId", hma.getUnitId());
			
			request.setAttribute("unitDes", hma.getUnitDes());
			request.setAttribute("unitDesName", commonOperateService.queryUserName(hma.getUnitDes()));
			request.setAttribute("phone", hma.getPhone());
			request.setAttribute("isValid", hma.getIsValid());
			request.setAttribute("sortOrder", hma.getSortOrder());
			request.setAttribute("remark", hma.getRemark());
		}
		return new ActionForward("/jsp/sys/unit/sysUnitEdit.jsp");
	}
	
	/**
	 *  DWR函数--新增一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysUnit(SysUnitActionForm form) throws Exception {
		SysUnit xi = new SysUnit();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.addDataSysUnit(xi);
	}
	
	/**
	 * DWR函数--保存一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysUnit(SysUnitActionForm form) throws Exception {
		SysUnit xi = new SysUnit();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.updateDataSysUnit(xi);
	}
	
	/**
	 *  DWR函数--删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysUnit(String ids) throws Exception {
		return this.sysUnitService.deleteDataSysUnit(ids);
	}
	
	/**
	 *  DWR函数--获取表一行记录的对象
	 * @param id--记录主键
	 * @return 
	 * @throws Exception
	 */
	public SysUnit getDataHurryStoreType(String id) throws Exception {
		SysUnit xi = new SysUnit();
		xi.setUnitId(id);
		xi = (SysUnit) this.sysUnitService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR函数--返回列表页面的字符串
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysUnitList(SysUnitActionForm form) throws Exception {
		SysUnitExample ex=new SysUnitExample();
		List list=this.sysUnitService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/unit/sysUnitList.jsp");
	}
}
