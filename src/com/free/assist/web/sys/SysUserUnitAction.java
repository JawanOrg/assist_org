package com.free.assist.web.sys;

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

import com.free.assist.domain.SysUserUnit;
import com.free.assist.domain.SysUserUnitExample;
import com.free.assist.service.sys.ISysUnitService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysUserUnitAction")
public class SysUserUnitAction extends BaseAction {
	@Autowired private ISysUnitService sysUnitService;

	
	/**
	 * 跳转到表的主页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitManager.jsp");
	}
	
	/**
	 * 跳转到查询页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitSrch.jsp");
	}
	
	
	/**
	 * 跳转到新增输入页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitAdd.jsp");
	}
	
	/**
	 * 跳转到查看页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		
		return new ActionForward("/jsp/sys/unit/sysUserUnitView.jsp");
	}
	
	
	/**
	 * 跳转到修改页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitEdit.jsp");
	}
	
	/**
	 *  DWR函数--新增一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysUserUnit(SysUserUnitActionForm form) throws Exception {
		SysUserUnit xi = new SysUserUnit();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.addDataSysUserUnit(xi);
	}
	
	/**
	 * DWR函数--保存一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysUserUnit(SysUserUnitActionForm form) throws Exception {
		SysUserUnit xi = new SysUserUnit();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.updateDataSysUserUnit(xi);
	}
	
	/**
	 *  DWR函数--删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysUserUnit(String unitId,String ids) throws Exception {
		return this.sysUnitService.deleteDataSysUserUnit(unitId,ids);
	}
	
	/**
	 *  DWR函数--获取表一行记录的对象
	 * @param id--记录主键
	 * @return 
	 * @throws Exception
	 */
	public SysUserUnit getDataSysUserUnit(String id) throws Exception {
		SysUserUnit xi = new SysUserUnit();
		return xi;
	}
	/**
	 * DWR函数--返回列表页面的字符串
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysUserUnitList(SysUserUnitActionForm form) throws Exception {
		String unitId=StringUtil.nullToEmptyOfObject(form.getUnitId());
		SysUserUnitExample ex=new SysUserUnitExample();
		ex.createCriteria().andUnitIdEqualTo(unitId);
		List list=this.sysUnitService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/unit/sysUserUnitList.jsp");
	}
}
