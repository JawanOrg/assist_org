/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.web.supt;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.cglib.beans.BeanCopier;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SuptFaceTrigger;
import com.free.assist.domain.SuptFaceTriggerExample;
import com.free.assist.service.BaseService;
import com.free.assist.web.BaseAction;

/**
 * @author 李猛
 * @version 1
 * @date 2009-12-17 13:47:16
 */
@Controller("/supt/triggerAction")
public class TriggerAction extends BaseAction {

	private BeanCopier beanCopier;

	public TriggerAction () {
		beanCopier = BeanCopier.create(TriggerActionForm.class, SuptFaceTrigger.class, false);
	}

	/**
	 * 错误处理方式列表
	 */
	public ActionForward getTriggerList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		TriggerActionForm f = (TriggerActionForm) form;
		SuptFaceTriggerExample ex = new SuptFaceTriggerExample();
		if (StringUtils.isNotBlank(f.getPortId())) {
			ex.createCriteria().andPortIdEqualTo(f.getPortId());
		}
		List<SuptFaceTrigger> triggerList = baseService.selectByExample(ex);
		request.setAttribute("triggerList", triggerList);
		return new ActionForward("/jsp/supt/triggerList.jsp");
	}
	
	/**
	 * 错误处理方式增加
	 */
	public ActionForward addTrigger(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SuptFaceTrigger trigger = new SuptFaceTrigger();
		beanCopier.copy(form, trigger, null);
		trigger.setCreateDate(new java.util.Date());
		baseService.insert(trigger);
		return null;
	}

	/**
	 * 错误处理方式删除
	 */
	public ActionForward delTrigger(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SuptFaceTrigger trigger = new SuptFaceTrigger();
		beanCopier.copy(form, trigger, null);
		baseService.deleteByPrimaryKey(trigger);
		return null;
	}
	
	@Resource private BaseService baseService;
}
