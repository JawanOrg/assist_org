package com.free.assist.web.sys;

import java.io.IOException;
import java.util.Date;
import java.util.List;

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

import com.free.assist.domain.SysTips;
import com.free.assist.domain.SysTipsExample;
import com.free.assist.domain.SysTipsExample.Criteria;
import com.free.assist.service.sys.ISysTipService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysTipAction")
public class SysTipAction extends BaseAction {
	
	@Autowired private ISysTipService sysTipService;
	
	public ActionForward sysTipInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/sys/tip/sysTipsSrch.jsp");
	}

	/**
	 * Get one record from t_sys_tips table according to labelId and moduleId.
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 */
	public SysTips getSysTipsWithBLOBsByPrimaryKey(SysTipActionForm form) {
		SysTipsExample example = new SysTipsExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			if(form.getTipLabel()!=null && !"".equalsIgnoreCase(form.getTipLabel())) {
				criteria.andTipLabelEqualTo(form.getTipLabel().trim());
			}
			if(form.getTipModuleId()!=null && !"".equalsIgnoreCase(form.getTipModuleId())) {
				criteria.andTipModuleIdEqualTo(form.getTipModuleId().trim());
			}
		}
		List<SysTips> list =  this.sysTipService.selectByExample(example);
		if(list!=null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 查询多条记录，根据提示标签，模块ＩＤ，提示内容，实现了分页的功能
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String selectByExample(SysTipActionForm form) throws ServletException, IOException {
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		SysTipsExample example = new SysTipsExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			if(form.getTipLabel()!=null && !"".equalsIgnoreCase(form.getTipLabel())) {
				criteria.andTipLabelEqualTo(form.getTipLabel().trim());
			}
			if(form.getTipModuleId()!=null && !"".equalsIgnoreCase(form.getTipModuleId())) {
				criteria.andTipModuleIdEqualTo(form.getTipModuleId().trim());
			}
			if(form.getTipContext()!=null && !"".equalsIgnoreCase(form.getTipContext())) {
				criteria.andTipContextLike(form.getTipContext().trim());
			}
		}
		example.setMaxResults(form.getMaxResults());
		example.setSkipResults(form.getSkipResults());
		List<SysTips> list =  this.sysTipService.selectPageListByExample(example);
		if(list!=null && list.size() > 1) {
			request.setAttribute("ajaxPage",list);
			return wctx.forwardToString("/jsp/sys/tip/sysTipsList.jsp");
		}
		return "";
	}
	
	/**
	 * 查询一条记录，根据输入的主键
	 * @author  x :Oct 29, 2009
	 * @param tipId
	 * @return
	 */
	public SysTips selectByPrimaryKey(String tipId) {
		SysTips sysTips = new SysTips();
		sysTips.setTipId(tipId);
		return (SysTips)this.sysTipService.selectByPrimaryKey(sysTips);
	}
	
	/**
	 * 删除多条记录，根据输入的ids
	 * @author  x :Oct 29, 2009
	 * @param ids
	 * @return
	 */
	public String deleteByIds(String ids) {
		int rtn = 0;
		if(ids!=null && !"".equals(ids)) {
			String[] tipIds = ids.split(":");
			for(String tipId : tipIds) {
				SysTips sysTips = new SysTips();
				sysTips.setTipId(tipId);
				this.sysTipService.deleteByPrimaryKey(sysTips);
			}
		}
		return "";
	}
	
	/**
	 * 插入一条新的记录(非可选)
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 */
	public String insertSysTips(SysTipActionForm form) {
		String checkStr = checkByModuleIdAndTipLabel(form);
		if("".equals(checkStr)) {
			SysTips sysTips = new SysTips();
			ObjectUtil.copyObjectToObject(form,sysTips);
			this.sysTipService.insert(sysTips);
			return "";
		} else {
			return checkStr;
		}
	}
	
	/**
	 * 插入一条新的记录(可选)
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 */
	public String insertBySelective(SysTipActionForm form) {
		String checkStr = checkByModuleIdAndTipLabel(form);
		if("".equals(checkStr)) {
			SysTips sysTips = new SysTips();
			ObjectUtil.copyObjectToObject(form,sysTips);
			this.sysTipService.insert(sysTips);
			return "";
		} else {
			return checkStr;
		}
	}
	
	/**
	 * 更新一条记录
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 */
	public String updateByPrimaryKeySelective(SysTipActionForm form) {
		if(form!=null && !"".equals(form)) {
			SysTipsExample exmaple = new SysTipsExample();
			exmaple.createCriteria().andTipModuleIdEqualTo(form.getTipModuleId().trim()).andTipLabelEqualTo(form.getTipLabel().trim());
			List list = this.sysTipService.selectByExample(exmaple);
			if(list!=null && list.size()>=1) {
				return "已存在这个标签!";
			}
			SysTips sysTips = new SysTips();
			ObjectUtil.copyObjectToObject(form,sysTips);
			//this.sysTipService.updateByPrimaryKeySelective(sysTips);
		} 
		return "";
	}
	
	public String updateByTip(SysTipActionForm form) {
		if(form!=null && !"".equals(form)) {
			SysTipsExample exmaple = new SysTipsExample();
			exmaple.createCriteria().andTipModuleIdEqualTo(form.getTipModuleId().trim()).andTipLabelEqualTo(form.getTipLabel().trim());
			List list = this.sysTipService.selectByExample(exmaple);
			if(list!=null && list.size()==1) {
				SysTips sysTip = new SysTips();
				sysTip = (SysTips)list.get(0);
				sysTip.setTipContext(form.getTipContext().trim());
				this.sysTipService.updateByPrimaryKeySelective(sysTip);
				return "";
			} else if(list!=null && list.size()==0){
				if(form.getTipLabel()==null || "".equals(form.getTipLabel())){
					return "没有提供新插入标签名!";
				}
				if(form.getTipModuleId()==null || "".equals(form.getTipModuleId())){
					return "没有提供新插入模块名!";
				}
				SysTips sysTip = new SysTips();
				if(form.getTipContext()!=null && !"".equals(form.getTipContext())) {
					sysTip.setTipContext(form.getTipContext().trim());
				} else {
					sysTip.setTipContext("");
				}
				sysTip.setTipLabel(form.getTipLabel());
				sysTip.setTipModuleId(form.getTipModuleId());
				sysTip.setCreateDate(new Date());
				this.sysTipService.insert(sysTip);
				return "";
			}
		}
		return "error";
	}
	
	/**
	 * 根据模块ＩＤ和标签查询是否已经存在记录
	 * @author  x :Oct 29, 2009
	 * @param form
	 * @return
	 */
	private String checkByModuleIdAndTipLabel(SysTipActionForm form) {
		SysTipsExample example = new SysTipsExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			if(form.getTipLabel()!=null && !"".equalsIgnoreCase(form.getTipLabel())) {
				criteria.andTipLabelEqualTo(form.getTipLabel().trim());
			}
			if(form.getTipModuleId()!=null && !"".equalsIgnoreCase(form.getTipModuleId())) {
				criteria.andTipModuleIdEqualTo(form.getTipModuleId().trim());
			}
		}
		List<SysTips> list =  this.sysTipService.selectByExample(example);
		if(list!=null && list.size()>=1) {
			return "已存在这个标签!";
		}
		return "";
	}
	
}
