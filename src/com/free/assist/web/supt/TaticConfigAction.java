package com.free.assist.web.supt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.domain.SuptIfaceGroupRelation;
import com.free.assist.domain.SuptIfaceGroupRelationExample;
import com.free.assist.domain.SuptTaticElement;
import com.free.assist.domain.SuptTaticElementExample;
import com.free.assist.domain.SuptTaticGroup;
import com.free.assist.domain.SuptTaticGroupExample;
import com.free.assist.domain.SuptTaticInstance;
import com.free.assist.domain.SuptTaticInstanceExample;
import com.free.assist.domain.SuptTaticRelation;
import com.free.assist.domain.SuptTaticRelationExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.supt.ITaticConfigService;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.util.Helper;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/supt/taticConfigAction")
public class TaticConfigAction extends BaseAction {
	private ITaticConfigService taticConfigService;

	@Autowired
	public void setTaticConfigService(ITaticConfigService taticConfigService) {
		this.taticConfigService = taticConfigService;
	}

	private ISysDicService sysDicService;

	@Autowired
	public void setSysDicService(ISysDicService sysDicService) {
		this.sysDicService = sysDicService;
	}

	/**
	 * 策略元素初始化
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward taticElementInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/supt/taticConfig/elementQuery.jsp");
	}

	/**
	 * 策略元素列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String taticElementList(TaticConfigForm form) throws ServletException, IOException {
		SuptTaticElementExample ex = new SuptTaticElementExample();
		String elementName = StringUtil.nullToEmptyOfObject(form.getElementname());
		String elementCode = StringUtil.nullToEmptyOfObject(form.getElementcode());
		ex.createCriteria().andElementnameLike("%" + elementName + "%").andElementcodeLike("%" + elementCode + "%");
		List<SuptTaticElement> elementList = this.taticConfigService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("elementList", elementList);
		return wctx.forwardToString("/jsp/supt/taticConfig/elementList.jsp");
	}

	/**
	 * 策略元素详情
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward taticElementDetail(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaticConfigForm modelForm = (TaticConfigForm) form;
		if (modelForm.getElementid() != null && !modelForm.getElementid().equals("")) {
			SuptTaticElement model = new SuptTaticElement();
			model.setElementid(modelForm.getElementid());
			model = (SuptTaticElement) this.taticConfigService.selectByPrimaryKey(model);
			request.setAttribute("suptTaticElement", model);
		}
		return new ActionForward("/jsp/supt/taticConfig/elementDetail.jsp");
	}

	/**
	 * 策略元素列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String saveElement(TaticConfigForm form) throws ServletException, IOException {
		String s = "";
		SuptTaticElement model = new SuptTaticElement();
		ObjectUtil.copyModeltoModel(form, model);
		if (form.getElementid() != null && !form.getElementid().equals("")) {
			this.taticConfigService.updateByPrimaryKey(model);
		} else {
			this.taticConfigService.insert(model);
		}
		return s;
	}

	/**
	 * 策略元素列表
	 *
	 * @return
	 * @throws Exception
	 * @throws Exception
	 */
	public String delElement(String checkids) throws Exception {
		String s = "";
		String[] tokens = Helper.split(checkids, "|");
		for (int i = 0; i < tokens.length; i++) {
			// 判断元素是否已使用
			SuptTaticRelationExample trEx = new SuptTaticRelationExample();
			trEx.createCriteria().andElementidEqualTo(tokens[i]);
			Integer n = this.taticConfigService.selectCountByExample(trEx);
			if (n > 0) {
				throw new Exception("所选择的策略元素已经使用，请先删除策略组");
			}
			SuptTaticElement model = new SuptTaticElement();
			model.setElementid(tokens[i]);
			this.taticConfigService.deleteByPrimaryKey(model);
		}
		return s;
	}

	/**
	 * 策略元素初始化
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward taticGroupInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/supt/taticConfig/taticGroupQuery.jsp");
	}

	/**
	 * 策略元素列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String taticGroupList(TaticConfigForm form) throws ServletException, IOException {
		SuptTaticGroupExample ex = new SuptTaticGroupExample();
		String taticgoupname = StringUtil.nullToEmptyOfObject(form.getTaticgoupname());
		ex.createCriteria().andTaticgoupnameLike("%" + taticgoupname + "%");
		List<SuptTaticGroup> taticGroupList = this.taticConfigService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("taticGroupList", taticGroupList);
		return wctx.forwardToString("/jsp/supt/taticConfig/taticGroupList.jsp");
	}

	/**
	 * 策略组详情
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward taticGroupDetail(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaticConfigForm modelForm = (TaticConfigForm) form;
		if (modelForm.getTaticgoupid() != null && !modelForm.getTaticgoupid().equals("")) {
			SuptTaticGroup model = new SuptTaticGroup();
			model.setTaticgoupid(modelForm.getTaticgoupid());
			model = (SuptTaticGroup) this.taticConfigService.selectByPrimaryKey(model);
			request.setAttribute("suptTaticGroup", model);
			// 取得策略组包含的策略元素
			SuptTaticRelationExample ex = new SuptTaticRelationExample();
			ex.createCriteria().andTaticgoupidEqualTo(modelForm.getTaticgoupid());
			List taticElementList = this.taticConfigService.selectByExample(ex);
			request.setAttribute("taticElementList", taticElementList);
		}
		return new ActionForward("/jsp/supt/taticConfig/taticGroupDetail.jsp");
	}

	/**
	 * 保存策略组
	 *
	 * @return
	 * @throws Exception
	 */
	public String saveTaticGroup(TaticConfigForm form){
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		try {
		SuptTaticGroup model = new SuptTaticGroup();
		ObjectUtil.copyModeltoModel(form, model);
		String elementCheckids = StringUtil.nullToEmptyOfObject(form.getElementCheckids());
		String[] tokens = Helper.split(elementCheckids, "|");
		List<SuptTaticElement> list = new ArrayList();
		for (int i = 0; i < tokens.length; i++) {
			SuptTaticElement m = new SuptTaticElement();
			m.setElementid(tokens[i]);
			list.add(m);
		}
		model.setTaticElementList(list);
		if (form.getTaticgoupid() != null && !form.getTaticgoupid().equals("")) {
			this.taticConfigService.updateTaticGroup(model, user);
		} else {
			this.taticConfigService.insertTaticGroup(model, user);
		}} catch (Exception ex) {
			s = ex.getMessage();
		}
		return s;
	}

	/**
	 * 策略元素列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String delTaticGroup(String checkids) throws ServletException, IOException {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		String[] tokens = Helper.split(checkids, "|");
		try {
			for (int i = 0; i < tokens.length; i++) {
				SuptTaticGroup model = new SuptTaticGroup();
				model.setTaticgoupid(tokens[i]);
				this.taticConfigService.delTaticGroup(model, user);
			}
		} catch (Exception ex) {
			s = ex.getMessage();
		}
		return s;
	}

	/**
	 * 取得系统接口树
	 *
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	public ActionForward showIfaceTree(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id") == null ? "0" : request.getParameter("id");
		String[] ids = Helper.split(id, "|");
		String queryId = id;
		List nodeList = null;
		String type = "";
		String parentType = "";
		if (ids.length >= 2) {
			parentType = ids[1];
			queryId = ids[0];
		}
		if (id.equals("0")) {
			IfaceConfigSystemExample example = new IfaceConfigSystemExample();
			example.createCriteria().andAvailableEqualTo("Y");
			example.setOrderByClause(" APPLICATION_NAME desc");
			nodeList = taticConfigService.selectByExample(example);
			type = "application";
		} else if (parentType.equals("application")) {
			SuptFaceExample example = new SuptFaceExample();
			example.createCriteria().andApplicationIdEqualTo(queryId).andIsValidEqualTo("Y");
			example.setOrderByClause(" cimp_name asc");
			nodeList = taticConfigService.selectByExample(example);
			type = "iface";
		} else {
			SuptIfaceGroupRelationExample ex = new SuptIfaceGroupRelationExample();
			ex.createCriteria().andInterfacecodeEqualTo(queryId);
			ex.setOrderByClause(" priority asc");
			nodeList = taticConfigService.selectByExample(ex);
			type = "taticgroup";
		}
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding='GBK'?>\n");

		sb.append("<tree id=\"" + id + "\">");
		if (nodeList != null && nodeList.size() > 0) {
			sb.append(this.makeTreeXML(nodeList, type));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		return null;
	}

	/**
	 * 构造节点的XML文档
	 *
	 * @param nodeList
	 * @return
	 */
	private String makeTreeXML(List nodeList, String type) {
		StringBuffer sb = new StringBuffer();
		for (Object obj : nodeList) {
			if (type.equals("application")) {
				IfaceConfigSystem model = (IfaceConfigSystem) obj;
				sb.append("<item   child=\"" + "1" + "\" text=\"" + model.getApplicationName() + "\" id=\"" + model.getApplicationId() + "|" + type + "\"></item>");
			} else if (type.equals("iface")) {
				SuptFace model = (SuptFace) obj;
				sb.append("<item  style=\"color:red\"  child=\"" + "1" + "\" text=\"" + model.getCimpName() + "\" id=\"" + model.getCimpFaceId() + "|" + type + "\"></item>");
			} else if (type.equals("taticgroup")) {
				SuptIfaceGroupRelation model = (SuptIfaceGroupRelation) obj;
				String name = sysDicService.getItemName("SUPT_TACTIC_TYPE", model.getTatictype());
				sb.append("<item   style=\"color:red\"  child=\"" + "0" + "\" text=\"" + model.getTaticgoupName() + "(" + name + ")" + "\" id=\"" + model.getTaticgoupid() + "|" + type + "|" + "\"></item>");
			}
		}
		return sb.toString();
	}

	/**
	 * 策略配置列表
	 *
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getInstanceList(TaticConfigForm form) throws ServletException, IOException {
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		// 查找此策略组所包含的元素名
		SuptTaticRelationExample rEx = new SuptTaticRelationExample();
		rEx.createCriteria().andTaticgoupidEqualTo(form.getTaticgoupid());
		rEx.setOrderByClause(" elementid asc");
		List<SuptTaticRelation> elementList = this.taticConfigService.selectByExample(rEx);
		// 所选策略组信息
		SuptTaticGroup model = new SuptTaticGroup();
		model.setTaticgoupid(form.getTaticgoupid());
		model = (SuptTaticGroup) this.taticConfigService.selectByPrimaryKey(model);
		request.setAttribute("suptTaticGroup", model);
		// 查找策略实例值
		SuptTaticInstanceExample ex = new SuptTaticInstanceExample();
		ex.createCriteria().andInterfacecodeEqualTo(form.getCimpFaceId()).andTaticgoupidEqualTo(form.getTaticgoupid());
		ex.setOrderByClause("  taticinstanceid asc");
		List<SuptTaticInstance> taticInstanceList = this.taticConfigService.selectByExample(ex);
		List<SuptTaticInstance> newInstanceList = new ArrayList();
		Map map = new HashMap();
		for (SuptTaticInstance tis : taticInstanceList) {
			String rowrecordid = tis.getRowrecordid();
			if (map.get(rowrecordid) == null) {
				tis.setElementInstanceList(getChildList(taticInstanceList, rowrecordid, elementList));
				map.put(rowrecordid, tis);
			}
		}

		// 查找所有系统
		IfaceConfigSystemExample ieEx = new IfaceConfigSystemExample();
		ieEx.createCriteria().andAvailableEqualTo("Y");
		List<IfaceConfigSystem> applicationList = this.taticConfigService.selectByExample(ieEx);
		request.setAttribute("applicationList", applicationList);
		request.setAttribute("instanceMap", map);
		request.setAttribute("elementList", elementList);
		request.setAttribute("taticConfigForm", form);
		return wctx.forwardToString("/jsp/supt/taticConfig/instanceList.jsp");
	}

	/**
	 * 接口与策略组配置列表
	 *
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceGroupList(TaticConfigForm form) throws ServletException, IOException {
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		SuptIfaceGroupRelationExample example = new SuptIfaceGroupRelationExample();
		example.createCriteria().andInterfacecodeEqualTo(form.getCimpFaceId());
		example.setOrderByClause(" priority asc");
		List list = this.taticConfigService.selectByExample(example);
		request.setAttribute("ifaceGroupList", list);
		request.setAttribute("taticConfigForm", form);
		return wctx.forwardToString("/jsp/supt/taticConfig/ifaceGroupList.jsp");
	}

	/**
	 * 将统一条实例的元素归类
	 *
	 * @param list
	 * @param rowrecordid
	 * @param elementList
	 * @return
	 */
	private List<SuptTaticInstance> getChildList(List<SuptTaticInstance> list, String rowrecordid, List<SuptTaticRelation> elementList) {
		List<SuptTaticInstance> tempList = new ArrayList();
		List<SuptTaticInstance> childList = new ArrayList();
		if (rowrecordid != null && !rowrecordid.equals("")) {
			for (SuptTaticInstance tis : list) {
				if (rowrecordid.equals(tis.getRowrecordid())) {
					tempList.add(tis);
				}
			}
		}
		// 按照元素的顺序排序
		for (SuptTaticRelation tr : elementList) {
			String elementid = tr.getElementid();
			for (SuptTaticInstance x : tempList) {
				if (elementid.equals(x.getElementid())) {
					x.setSourcetype(tr.getSourcetype());
					x.setSqlstr(tr.getSqlstr());
					childList.add(x);
				}
			}
		}
		return childList;
	}

	/**
	 * 策略元素初始化
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward toAddInstance(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaticConfigForm modelForm = (TaticConfigForm) form;
		// 查找此策略组所包含的元素名
		SuptTaticRelationExample rEx = new SuptTaticRelationExample();
		rEx.createCriteria().andTaticgoupidEqualTo(modelForm.getTaticgoupid());
		rEx.setOrderByClause(" elementid asc");
		List<SuptTaticRelation> elementList = this.taticConfigService.selectByExample(rEx);
		request.setAttribute("elementList", elementList);
		// 所选策略组信息
		SuptTaticGroup model = new SuptTaticGroup();
		model.setTaticgoupid(modelForm.getTaticgoupid());
		model = (SuptTaticGroup) this.taticConfigService.selectByPrimaryKey(model);
		request.setAttribute("suptTaticGroup", model);
		// 查找所有系统
		IfaceConfigSystemExample ex = new IfaceConfigSystemExample();
		ex.createCriteria().andAvailableEqualTo("Y");
		List<IfaceConfigSystem> applicationList = this.taticConfigService.selectByExample(ex);
		request.setAttribute("applicationList", applicationList);
		// 查找已有数据
		String rowrecordid = modelForm.getRowrecordid() == null ? "" : modelForm.getRowrecordid();
		if (!rowrecordid.equals("")) {
			SuptTaticInstanceExample tiEx = new SuptTaticInstanceExample();
			tiEx.createCriteria().andRowrecordidEqualTo(rowrecordid);
			List<SuptTaticInstance> instanceList = this.taticConfigService.selectByExample(tiEx);
			request.setAttribute("instanceList", instanceList);
			if (instanceList != null && instanceList.size() > 0) {
				request.setAttribute("instanceModel", instanceList.get(0));
			}
		}
		return new ActionForward("/jsp/supt/taticConfig/instanceDetail.jsp");
	}

	/**
	 * 保存实例
	 *
	 * @param form
	 * @param list
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String saveInstance(TaticConfigForm form, List<SuptTaticInstance> list) throws ServletException, IOException {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptTaticInstance model = new SuptTaticInstance();
		ObjectUtil.copyModeltoModel(form, model);
		this.taticConfigService.insertTaticInstance(model, list, user);
		return s;
	}

	/**
	 * 删除实例
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String delTaticInstance(String checkids) throws ServletException, IOException {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		String[] tokens = Helper.split(checkids, "|");
		for (int i = 0; i < tokens.length; i++) {
			SuptTaticInstanceExample ex = new SuptTaticInstanceExample();
			ex.createCriteria().andRowrecordidEqualTo(tokens[i]);
			this.taticConfigService.deleteByExample(ex);
		}
		return s;
	}

	/**
	 * 策略元素初始化
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward selectTaticGroupInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaticConfigForm modelForm = (TaticConfigForm) form;
		return new ActionForward("/jsp/supt/taticConfig/selectTaticGroupQuery.jsp");
	}

	/**
	 * 保存策略组与接口关系
	 *
	 * @param form
	 * @param list
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String saveIfaceGroup(TaticConfigForm form) throws ServletException, IOException {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptIfaceGroupRelation model = new SuptIfaceGroupRelation();
		model.setInterfacecode(form.getCimpFaceId());
		List<SuptIfaceGroupRelation> list = new ArrayList();
		String[] tokens = Helper.split(form.getElementCheckids(), "|");
		for (int i = 0; i < tokens.length; i++) {
			SuptIfaceGroupRelation gr = new SuptIfaceGroupRelation();
			gr.setTaticgoupid(tokens[i]);
			gr.setInterfacecode(form.getCimpFaceId());
			list.add(gr);
		}
		this.taticConfigService.insertIfaceGroup(model, list, user);
		return s;
	}

	/**
	 * 修改策略组与接口关系中的优先级
	 *
	 * @param form
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public String updateIfaceGroup(TaticConfigForm form) throws Exception {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		List<SuptIfaceGroupRelation> list = new ArrayList();
		String[] ifaceGroupIds = Helper.split(form.getIfaceGroupId(), "|");
		String[] prioritys = Helper.split(form.getPriority(), "|");
		for (int i = 0; i < ifaceGroupIds.length; i++) {
			SuptIfaceGroupRelation gr = new SuptIfaceGroupRelation();
			gr.setIfaceGroupId(ifaceGroupIds[i]);
			gr.setPriority(prioritys[i]);
			list.add(gr);
		}
		this.taticConfigService.updateIfaceGroup(list, user);
		return s;
	}

	/**
	 * 删除实例
	 *
	 * @return
	 * @throws Exception
	 */
	public String delIfaceGroup(String checkids) {
		String s = "";
		SysUser user = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		String[] tokens = Helper.split(checkids, "|");
		try {
			for (int i = 0; i < tokens.length; i++) {
				SuptIfaceGroupRelation model = new SuptIfaceGroupRelation();
				model.setIfaceGroupId(tokens[i]);
				this.taticConfigService.delIfaceGroup(model, user);
			}
		} catch (Exception e) {
			s = e.getMessage();
		}
		return s;
	}

}
