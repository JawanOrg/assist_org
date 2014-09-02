package com.free.assist.web.supt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
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
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptCheckOutExample;
import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceErrTack;
import com.free.assist.domain.SuptFaceErrTackExample;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.domain.SuptReturnValid;
import com.free.assist.domain.SuptReturnValidExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.service.iface.IfaceConfigFacade;
import com.free.assist.service.supt.ICheckFaceService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.Pager;
import com.free.assist.web.BaseAction;

@Controller("/supt/checkAction")
public class CheckAction extends BaseAction {
	
	@Resource private ICheckFaceService checkFaceService;
	
	@Resource private IfaceConfigFacade ifaceConfigFacade;

	/**
	 * 接口信息列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward faceDataList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		CheckActionForm f = (CheckActionForm) form;
		SuptFaceExample ex = new SuptFaceExample();
		ex.setSkipResults(f.getSkipResults());
		ex.setMaxResults(f.getMaxResults());
		if (StringUtils.isNotBlank(f.getCimpName())) {
			ex.setBeforeOrSQL(" and sf.cimp_name like '%"+f.getCimpName()+"%'");
		}
		if (StringUtils.isNotBlank(f.getMethodName())){
			ex.setBeforeOrSQL(" and sf.method_name like '%"+f.getMethodName()+"%'");
		}
		ex.createCriteria().andIsValidEqualTo(StringUtils.defaultIfEmpty(f.getIsValid(), "Y"));
		ex.setOrderByClause(" sf.application_id,sf.cimp_name ");
		Pager<SuptFace> result = this.checkFaceService.selectPageByExample(ex);
		
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", result.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (SuptFace suptFace : result) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("actionpath", StringUtils.defaultIfEmpty(suptFace.getActionpath(), ""));
			jsonGenerator.writeStringField("applicationId", StringUtils.defaultIfEmpty(suptFace.getApplicationId(), ""));
			jsonGenerator.writeStringField("applicationName", StringUtils.defaultIfEmpty(suptFace.getApplicationName(), ""));
			jsonGenerator.writeStringField("backLimite", StringUtils.defaultIfEmpty(suptFace.getBackLimite(), ""));
			jsonGenerator.writeStringField("billOfSystems", StringUtils.defaultIfEmpty(suptFace.getBillOfSystems(), ""));
			jsonGenerator.writeStringField("cimpFaceId", StringUtils.defaultIfEmpty(suptFace.getCimpFaceId(), ""));
			jsonGenerator.writeStringField("cimpName", StringUtils.defaultIfEmpty(suptFace.getCimpName(), ""));
			jsonGenerator.writeStringField("errorTake", StringUtils.defaultIfEmpty(suptFace.getErrorTake(), ""));
			jsonGenerator.writeStringField("exetMethodname", StringUtils.defaultIfEmpty(suptFace.getExetMethodname(), ""));
			jsonGenerator.writeStringField("indicantNode", StringUtils.defaultIfEmpty(suptFace.getIndicantNode(), ""));
			jsonGenerator.writeStringField("inXml", StringUtils.defaultIfEmpty(suptFace.getInXml(), ""));
			jsonGenerator.writeStringField("isautoTake", StringUtils.defaultIfEmpty(suptFace.getIsautoTake(), ""));
			jsonGenerator.writeStringField("isjudgebillsystem", StringUtils.defaultIfEmpty(suptFace.getIsjudgebillsystem(), ""));
			jsonGenerator.writeStringField("isReturnid", StringUtils.defaultIfEmpty(suptFace.getIsReturnid(), ""));
			jsonGenerator.writeStringField("isReturnvalue", StringUtils.defaultIfEmpty(suptFace.getIsReturnvalue(), ""));
			jsonGenerator.writeStringField("isSend", StringUtils.defaultIfEmpty(suptFace.getIsSend(), ""));
			jsonGenerator.writeStringField("isValid", StringUtils.defaultIfEmpty(suptFace.getIsValid(), ""));
			jsonGenerator.writeStringField("keyPaths", StringUtils.defaultIfEmpty(suptFace.getKeyPaths(), ""));
			jsonGenerator.writeStringField("methodName", StringUtils.defaultIfEmpty(suptFace.getMethodName(), ""));
			jsonGenerator.writeStringField("needdealaction", StringUtils.defaultIfEmpty(suptFace.getNeeddealaction(), ""));
			jsonGenerator.writeStringField("notneeddealaction", StringUtils.defaultIfEmpty(suptFace.getNotneeddealaction(), ""));
			jsonGenerator.writeStringField("outXml", StringUtils.defaultIfEmpty(suptFace.getOutXml(), ""));
			jsonGenerator.writeStringField("paramater", StringUtils.defaultIfEmpty(suptFace.getParamater(), ""));
			jsonGenerator.writeStringField("protocolType", StringUtils.defaultIfEmpty(suptFace.getProtocolType(), ""));
			jsonGenerator.writeStringField("returnAppid", StringUtils.defaultIfEmpty(suptFace.getReturnAppid(), ""));
			jsonGenerator.writeStringField("returnAppname", StringUtils.defaultIfEmpty(suptFace.getReturnAppname(), ""));
			jsonGenerator.writeStringField("returnCodePath", StringUtils.defaultIfEmpty(suptFace.getReturnCodePath(), ""));
			jsonGenerator.writeStringField("successValue", StringUtils.defaultIfEmpty(suptFace.getSuccessValue(), ""));
			jsonGenerator.writeStringField("xmlNode", StringUtils.defaultIfEmpty(suptFace.getXmlNode(), ""));
			jsonGenerator.writeStringField("xmlstr", StringUtils.defaultIfEmpty(suptFace.getXmlstr(), ""));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
		
		return null;
	}
	
	public ActionForward systemList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		IfaceConfigSystemExample example = new IfaceConfigSystemExample();
		example.createCriteria().andAvailableEqualTo("Y");
		Pager<IfaceConfigSystem> result = ifaceConfigFacade.selectPageByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", result.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceConfigSystem ifaceConfigSystem : result) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("applicationId", ifaceConfigSystem.getApplicationId());
			jsonGenerator.writeStringField("applicationName", ifaceConfigSystem.getApplicationName());
			jsonGenerator.writeStringField("applicationSn", ifaceConfigSystem.getApplicationSn());
			jsonGenerator.writeStringField("createDate", DateFormatUtils.format(ifaceConfigSystem.getCreateDate(), "yyyy-MM-dd HH:mm:ss"));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
		return null;
	}

	/**
	 * 接口信息列表(选择用)
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String selectfaceDataList(CheckActionForm form)
			throws ServletException, IOException {
		SuptFaceExample ex = new SuptFaceExample();

		List<SuptFace> elementList = this.checkFaceService
				.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("elementList", elementList);
		return wctx.forwardToString("/jsp/faceSupt/selectfaceDatatList.jsp");
	}

	/**
	 * 插入接口信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void insertFace(CheckActionForm form) throws Exception{
		SuptFace record = new SuptFace();
		ObjectUtil.copyObjectToObject(form, record);
		if(record.getCimpFaceId()!=null && !"".equals(record.getCimpFaceId())){
			this.checkFaceService.updateByPrimaryKey(record);
		}else{
			//保证转入接口编码唯一性
			if(record.getMethodName()!=null && !"".equals(record.getMethodName())){
				SuptFaceExample sf = new SuptFaceExample();
				sf.createCriteria().andMethodNameEqualTo(record.getMethodName());
				sf.createCriteria().andReturnAppidEqualTo(record.getReturnAppid());
				List list = checkFaceService.selectByExample(sf);
				if(list!=null && list.size()>0){
					throw new Exception("您输入的转入接口编码在系统中已存在!");
				}
			}
		   this.checkFaceService.insert(record);
		}
	}

	/**
	 * 修改接口信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward toModifyFace(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		if(id==null || "".equals(id)){
			throw new Exception("传入的ID为空!");
		}
		SuptFace suptFace = new SuptFace();
		suptFace.setCimpFaceId(id);
		suptFace = (SuptFace)this.checkFaceService.selectByPrimaryKey(suptFace);
		List<IfaceConfigProtocol> renprolist = null;
		//查询所有系统列表
		List<IfaceConfigSystem> list = ifaceConfigFacade.getApplicationList();
		//查询所有协议
		if(suptFace!=null){
			IfaceConfigProtocolExample exp = new IfaceConfigProtocolExample();
			exp.createCriteria().andApplicationIdEqualTo(suptFace.getApplicationId());
			List<IfaceConfigProtocol> prolist = this.checkFaceService.selectByExample(exp);
			if(prolist!=null && prolist.size()>0) {
				renprolist = new ArrayList<IfaceConfigProtocol>(prolist.size());
				IfaceConfigProtocol e = new IfaceConfigProtocol();
				e.setProtocolId("");
				e.setProtocolName("");
				renprolist.add(e);
				for(IfaceConfigProtocol pro : prolist) {
					renprolist.add(pro);
				}
			}
		}
		request.setAttribute("face", suptFace);
		request.setAttribute("list", list);
		request.setAttribute("prolist", renprolist);
		return new ActionForward("/jsp/faceSupt/faceDataAdd.jsp");
	}

	/**
	 * 验证信息界面
	 *
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showSuptCheck(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sysid = request.getParameter("id");
		return new ActionForward("/jsp/faceSupt/faceValidDataSrch.jsp?sysid="+sysid);
	}

	/**
	 * 验证规则信息列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String faceValidDataList(CheckActionForm form)
			throws ServletException, IOException,Exception {
		SuptCheckExample ex = new SuptCheckExample();
		if(form.getCimpFaceId()!=null && !"".equals(form.getCimpFaceId())){
			ex.setBeforeOrSQL(" and sf.cimp_face_id ='"+form.getCimpFaceId()+"'");
		}
		List<SuptCheck> elementList = this.checkFaceService
				.selectSuptCheckByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("elementList", elementList);
		return wctx.forwardToString("/jsp/faceSupt/faceValidDatatList.jsp");
	}

	/**
	 * 插入验证信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void insertCheck(CheckActionForm form) {
		SuptCheck record = new SuptCheck();
		ObjectUtil.copyObjectToObject(form, record);
		if(record.getCheckId()!=null && !"".equals(record.getCheckId())){
			this.checkFaceService.updateByPrimaryKey(record);
		}else{
		   this.checkFaceService.insert(record);
		}
	}

	/**
	 * 删除验证信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void deleteCheck(String ids) throws Exception{
		if(ids==null || "".equals(ids)){
			throw new Exception("传入的ID为空!");
		}
		this.checkFaceService.deleteCheck(ids);
	}

	/**
	 * 修改验证信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward toModifyCheck(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		if(id==null || "".equals(id)){
			throw new Exception("传入的ID为空!");
		}
		//SuptCheck suptCheck = new SuptCheck();
		//suptCheck.setCheckId(id);
		//SuptCheck check = (SuptCheck)this.checkFaceService.selectByPrimaryKey(suptCheck);
		 SuptCheckExample ex = new SuptCheckExample();
	     ex.setBeforeOrSQL(" and sc.check_id ='"+id+"'");
	     List<SuptCheck> elementList = this.checkFaceService
			.selectSuptCheckByExample(ex);
	     if(elementList==null || elementList.size()<1){
				throw new Exception("查出的记录为空!");
			}
		request.setAttribute("check", elementList.get(0));
		return new ActionForward("/jsp/faceSupt/faceValidDataAdd.jsp?id="+elementList.get(0).getCimpFaceId());
	}

	/**
	 * 转出规则界面
	 *
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showCheckOut(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String faceId = request.getParameter("faceId");
		SuptCheckOutExample ex = new SuptCheckOutExample();
		if(StringUtils.isNotBlank(faceId)){
			ex.setBeforeOrSQL(" and sf.cimp_face_id ='" + faceId + "' order by sc.order_id ");
		}
		List<SuptCheckOut> elementList = this.checkFaceService
				.selectCheckOutByExample(ex);
		String k = "1";
		if(elementList!=null && elementList.size()>0){
		  Float j = elementList.get(elementList.size()-1).getOrderId()+1.0f;
		  k= j.toString();
		  k = k.substring(0, k.lastIndexOf("."));
		}
		request.setAttribute("elementList", elementList);
		request.setAttribute("num", k);
		return new ActionForward("/jsp/faceSupt/checkOutDataSrch.jsp");
	}

	/**
	 * 转出规则信息列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public List<SuptCheckOut> checkOutDataList(CheckActionForm form)
			throws ServletException, Exception {
		SuptCheckOutExample ex = new SuptCheckOutExample();
		if(form.getCimpFaceId()!=null && !"".equals(form.getCimpFaceId())){
			ex.setBeforeOrSQL(" and sf.cimp_face_id ='"+form.getCimpFaceId()+"' order by sc.order_id ");
		}
		List<SuptCheckOut> elementList = this.checkFaceService
				.selectCheckOutByExample(ex);
		/*String k = "1";
		if(elementList!=null && elementList.size()>0){
		  Float j = elementList.get(elementList.size()-1).getOrderId()+1.0f;
		  k= j.toString();
		  k = k.substring(0, k.lastIndexOf("."));
		}*/
		//WebContext wctx = WebContextFactory.get();
		//HttpServletRequest request = wctx.getHttpServletRequest();
		//request.setAttribute("elementList", elementList);
		//request.setAttribute("num", k);
		return elementList;
	}

	/**
	 * 插入转出信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void insertCheckOut(CheckActionForm form) {
		SuptCheckOut record = new SuptCheckOut();
		ObjectUtil.copyObjectToObject(form, record);
		if(record.getSendId()!=null && !"".equals(record.getSendId())){
			this.checkFaceService.updateByPrimaryKey(record);
		}else{
		   this.checkFaceService.insert(record);
		}
	}

	public ActionForward addCheckOut(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cimpFaceId = ((CheckActionForm)form).getCimpFaceId();
		//String applicationId = ((CheckActionForm)form).getApplicationId();
		Float orderId = ((CheckActionForm)form).getOrderId();
		IfaceConfigProtocolExample example = new IfaceConfigProtocolExample();
		example.createCriteria().andProtocolNameEqualTo(IfaceConfigProtocol.PROTOCOL_NAME_FTP);
		List<IfaceConfigProtocol> result = checkFaceService.selectByExample(example);
		request.setAttribute("cimpFaceId", cimpFaceId);
		request.setAttribute("orderId", orderId);
		request.setAttribute("protocolList", result);
		return new ActionForward("/jsp/faceSupt/checkOutDataAdd.jsp");
	}
	/**
	 * 修改转出信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward toModifyCheckOut(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		if(id==null || "".equals(id)){
			throw new Exception("传入的ID为空!");
		}
		//SuptCheckOut suptCheck = new SuptCheckOut();
		//suptCheck.setSendId(id);
		//suptCheck = (SuptCheckOut)this.checkFaceService.selectByPrimaryKey(suptCheck);
        SuptCheckOutExample ex = new SuptCheckOutExample();
        ex.setBeforeOrSQL(" and sc.send_id ='"+id+"'");
		List<SuptCheckOut> elementList = this.checkFaceService
				.selectCheckOutByExample(ex);
		if(elementList==null || elementList.size()<1){
			throw new Exception("查出的记录为空!");
		}
		SuptCheckOut suptCheckOut = elementList.get(0);
		ObjectUtil.copyObjectToObject(suptCheckOut, form);
		IfaceConfigProtocolExample example = new IfaceConfigProtocolExample();
		example.createCriteria().andProtocolNameEqualTo(IfaceConfigProtocol.PROTOCOL_NAME_FTP);
		List<IfaceConfigProtocol> result = checkFaceService.selectByExample(example);
		//request.setAttribute("cimpFaceId", elementList.get(0).getCimpFaceId());
		request.setAttribute("checkOut", suptCheckOut);
		request.setAttribute("protocolList", result);
		return new ActionForward("/jsp/faceSupt/checkOutDataAdd.jsp");
	}

	/**
	 * 删除转出信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void deleteCheckOut(String ids) throws Exception{
		if(ids==null || "".equals(ids)){
			throw new Exception("传入的ID为空!");
		}
		this.checkFaceService.deleteCheckOut(ids);
	}

	/**
	 * 预览XML信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward getOutXml(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		if(id==null || "".equals(id)){
			throw new Exception("传入的ID为空!");
		}

		String xml = this.checkFaceService.getOutXml(id);
        request.setAttribute("str", xml);
		return new ActionForward("/jsp/faceSupt/showXml.jsp");
	}

	/**
	 * 错误处理方式列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String errfaceDataList(CheckActionForm form)
			throws ServletException, IOException {
		SuptFaceErrTackExample ex = new SuptFaceErrTackExample();
		if(form.getCimpFaceId()!=null && !"".equals(form.getCimpFaceId())){
			ex.createCriteria().andCimpFaceIdEqualTo(form.getCimpFaceId());
		}
		List<SuptFaceErrTack> elementList = this.checkFaceService
				.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("elementList", elementList);
		return wctx.forwardToString("/jsp/faceSupt/errfaceDatatList.jsp");
	}

	/**
	 * 错误处理方式增加
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String addErrFace(String faceid,String errBusiness,String errType)
			throws ServletException, IOException {
		SuptFaceErrTack errTace = new SuptFaceErrTack();
		errTace.setCimpFaceId(faceid);
		errTace.setErrBusiness(errBusiness);
		errTace.setErrType(errType);
		this.checkFaceService.insert(errTace);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		return wctx.forwardToString("/jsp/faceSupt/errfaceDataSrch.jsp");
	}

	/**
	 * 错误处理方式删除
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String delErrFace(String errid)
			throws ServletException, IOException {
		SuptFaceErrTack errTace = new SuptFaceErrTack();
		errTace.setErrId(errid);
		this.checkFaceService.deleteByPrimaryKey(errTace);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		return wctx.forwardToString("/jsp/faceSupt/errfaceDataSrch.jsp");
	}

	/**
	 * 查询表：t_iface_conf_protocol
	 * 取得协议级联操作
	 * @author 李海滨:Oct 16, 2009
	 * @param applicationId
	 * @return
	 */
	public List getProtocolList(String applicationId) {
		List<IfaceConfigProtocol> rtnList;
		if(applicationId!=null && !"".equals(applicationId)) {
			IfaceConfigProtocolExample exp = new IfaceConfigProtocolExample();
			exp.createCriteria().andApplicationIdEqualTo(applicationId);
			List<IfaceConfigProtocol> list = this.checkFaceService.selectByExample(exp);
			if(list!=null && list.size()>0) {
				rtnList = new ArrayList<IfaceConfigProtocol>(list.size());
				IfaceConfigProtocol e = new IfaceConfigProtocol();
				e.setProtocolId("");
				e.setProtocolName("");
				rtnList.add(e);
				for(IfaceConfigProtocol pro : list) {
					rtnList.add(pro);
				}
				return rtnList;
			}
		}
		return null;
	}

	/**
	 * 保存返回值规则界面
	 *
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showReturnValue(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sysid = request.getParameter("id");
		return new ActionForward("/jsp/faceSupt/returnValueDataSrch.jsp?sysid="+sysid);
	}

	/**
	 * 保存返回规则信息列表
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public List<SuptReturnValid> returnValueDataList(CheckActionForm form)
			throws ServletException, Exception {
		SuptReturnValidExample ex = new SuptReturnValidExample();
		if(form.getCimpFaceId()!=null && !"".equals(form.getCimpFaceId())){
			ex.setBeforeOrSQL(" where cimp_face_id ='"+form.getCimpFaceId()+"'");
		}
		return this.checkFaceService.selectByExample(ex);
	}

	/**
	 * 插入返回值信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void insertReturnValue(CheckActionForm form) {
		SuptReturnValid record = new SuptReturnValid();
		ObjectUtil.copyObjectToObject(form, record);
		if(record.getReturnValidId()!=null && !"".equals(record.getReturnValidId())){
			this.checkFaceService.updateByPrimaryKey(record);
		}else{
		   this.checkFaceService.insert(record);
		}
	}

	/**
	 * 修改返回值信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public ActionForward toModifyReturnValue(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		if(id==null || "".equals(id)){
			throw new Exception("传入的ID为空!");
		}
		SuptReturnValidExample ex = new SuptReturnValidExample();
        ex.setBeforeOrSQL(" where return_valid_id ='"+id+"'");
		List<SuptReturnValid> elementList = this.checkFaceService
				.selectByExample(ex);
		if(elementList==null || elementList.size()<1){
			throw new Exception("查出的记录为空!");
		}
		request.setAttribute("reValid", elementList.get(0));
		return new ActionForward("/jsp/faceSupt/returnValueDataAdd.jsp?id="+elementList.get(0).getCimpFaceId());
	}

	/**
	 * 删除转出返回值规则信息
	 *
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public void deleteReturnValue(String ids) throws Exception{
		if(ids==null || "".equals(ids)){
			throw new Exception("传入的ID为空!");
		}
		this.checkFaceService.deleteReturnValue(ids);
	}
	
	public ActionForward mappPattList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException {
		SysDicItemExample example = new SysDicItemExample();
		example.createCriteria().andDictionaryCodeEqualTo("MAPPING_PATTERN");
		List<SysDicItem> sysDicItemList = checkFaceService.selectByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		response.setCharacterEncoding("utf-8");
		//response.setContentType("application/json");
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", sysDicItemList.size());
		jsonGenerator.writeArrayFieldStart("data");
		for (SysDicItem sysDicItem : sysDicItemList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("mappPatt", sysDicItem.getItemCode());
			jsonGenerator.writeStringField("mappPattName", sysDicItem.getItemValue());
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
		return null;
	}
}
