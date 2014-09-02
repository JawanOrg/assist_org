package com.free.assist.web.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.domain.SysDicItemKey;
import com.free.assist.domain.SysDicItemExample.Criteria;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysDicItemAction")
public class SysDicItemAction extends BaseAction {
	@Autowired private ISysDicService sysDicService;
	
	public void setSysDicService(ISysDicService sysDicService) {
		this.sysDicService = sysDicService;
	}

	
	/**
	 * 跳转到表的主页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicItemManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/dic/sysDicItemManager.jsp");
	}
	
	/**
	 * 跳转到查询页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicItemSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/dic/sysDicItemSrch.jsp");
	}
	
	
	/**
	 * 跳转到新增输入页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicItemAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String ItemId=StringUtil.nullToEmptyOfObject(request.getParameter("ItemId"));

		return new ActionForward("/jsp/sys/dic/sysDicItemAdd.jsp");
	}
	
	/**
	 * 跳转到查看页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicItemView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String ItemId=StringUtil.nullToEmptyOfObject(request.getParameter("ItemId"));

		SysDicItem hma = new SysDicItem();
		
		return new ActionForward("/jsp/sys/dic/sysDicItemView.jsp");
	}
	
	
	/**
	 * 跳转到修改页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicItemEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String ItemId=StringUtil.nullToEmptyOfObject(request.getParameter("ItemId"));

		SysDicItem hma = new SysDicItem();
		
		return new ActionForward("/jsp/sys/dic/sysDicItemEdit.jsp");
	}
	
	/**
	 *  DWR函数--新增一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysDicItem(SysDicItemActionForm form) throws Exception {
		SysDicItem xi = new SysDicItem();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysDicService.addDataSysDicItem(xi);
	}
	
	/**
	 * DWR函数--保存一条记录,首先判断这条记录是不是已经存在
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysDicItem(SysDicItemActionForm form) throws Exception {
		SysDicItem xi = new SysDicItem();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysDicService.updateDataSysDicItem(xi);
	}
	
	/**
	 *  DWR函数--删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysDicItem(String ids) throws Exception {
		return this.sysDicService.deleteDataSysDicItem(ids);
	}
	
	/**
	 * DWR函数--逻辑删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return　错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysDicItemLogic(String ids) throws Exception {
		String strRet = "";
		String[] ides = ids.split(":");
		for(String itemId : ides){
			SysDicItem key = new SysDicItem();
			key.setItemId(itemId);
			SysDicItem item = (SysDicItem)this.sysDicService.selectByPrimaryKey(key);
			if(item!=null){
				item.setDictionaryId("");
				strRet = this.sysDicService.updateDataSysDicItem(item);
			}
		}
		return strRet;
	}
	
	/**
	 *  DWR函数--获取表一行记录的对象
	 * @param id--记录主键
	 * @return 
	 * @throws Exception
	 */
	public SysDicItem getDataSysDicItem(String id) throws Exception {
		SysDicItem xi = new SysDicItem();
		xi.setItemId(id);
		xi = (SysDicItem) this.sysDicService.selectByPrimaryKey(xi);
		return xi;
	}
	
	/**
	 * DWR函数--返回列表页面的字符串
	 * @param form
	 * @return　实现了分页的功能
	 * @throws Exception
	 */
	public String getSysDicItemList(SysDicItemActionForm form) throws Exception {
		SysDicItemExample ex=new SysDicItemExample();
		Criteria criteria = ex.createCriteria();
		if(form!=null) {
			if(form.getDictionaryId()!=null && !"".equals(form.getDictionaryId())) {
				criteria.andDictionaryIdEqualTo(form.getDictionaryId().trim());
			}
			if(form.getItemCode()!=null && !"".equals(form.getItemCode())) {
				criteria.andItemCodeEqualTo(form.getItemCode().trim());
			}
			if(form.getItemValue()!=null && !"".equals(form.getItemValue())) {
				criteria.andItemValueEqualTo(form.getItemValue().trim());
			}
		}
		ex.setMaxResults(form.getMaxResults());
		ex.setSkipResults(form.getSkipResults());
		List list=this.sysDicService.selectByExampleForDicItem(ex,ex.getSkipResults(),ex.getMaxResults());
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		
		List idAndNameList = this.getSysDicConfigIdAndName();
		request.setAttribute("idAndNameList", idAndNameList);
		
		return wctx.forwardToString("/jsp/sys/dic/sysDicItemList.jsp");
	}
	
	/**
	 * DWR函数--返回数据字典主键和主键名
	 * @return 返回数据字典主键和主键名
	 */
	public List getSysDicConfigIdAndName() {
		List<Map> listRtn = new ArrayList<Map>();
		SysDicConfigExample example=new SysDicConfigExample();
		List<SysDicConfig> list = this.sysDicService.selectByExample(example);
		if(list!=null && list.size()>0) {
			for(SysDicConfig sdc : list){
				Map map = new HashMap();
				map.put(sdc.getDictionaryId(), sdc.getDictionaryName());
				listRtn.add(map);
			}
			return listRtn;
		}
		return null;
	}
	
	/**
	 * DWR函数--返回一条记录，根据主键
	 * @param dictionaryId
	 * @return
	 * @throws Exception
	 */
	public String getDataSysDicItemByDictionaryId(String dictionaryId) throws Exception {
		SysDicItemExample example = new SysDicItemExample();
		if(dictionaryId!=null && !"".equals(dictionaryId)) {
			example.createCriteria().andDictionaryIdEqualTo(dictionaryId.trim());
			List<SysDicItem> list = this.sysDicService.selectByExample(example);
			WebContext wctx = WebContextFactory.get();
			HttpServletRequest request = wctx.getHttpServletRequest();
			request.setAttribute("sysDicItemForDicIdList", list);
			return wctx.forwardToString("/jsp/sys/dic/sysDicItemForDicIdList.jsp");
		}
		return null;
	}

}
