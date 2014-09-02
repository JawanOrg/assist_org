package com.free.assist.web.iface;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryHis;
import com.free.assist.domain.IfaceLogRepositoryHisExample;
import com.free.assist.domain.IfaceLogRepositoryHisKey;
import com.free.assist.domain.IfaceLogRepositoryExample.Criteria;
import com.free.assist.service.iface.IfaceLogFacade;
import com.free.assist.util.DateUtil;
import com.free.assist.util.Pager;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceLoggerTraceAction")
public class IfaceLoggerTraceAction extends BaseAction {
	
	@Resource private IfaceLogFacade ifaceLogFacade;
	
	/**
	 * 数据查询模块：
	 * 接口列表信息数据查询初始化操作
	 * 如果日志内容与工单内容过长，启用(XXX...)打点来粗略显示
	 * @author gms:Sep 29, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceLogRepositoryDataList(IfaceLoggerTraceActionForm form) throws ServletException, IOException {
		
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		
		if("0".equals(form.getIsArchived())) {
			IfaceLogRepositoryExample example = new IfaceLogRepositoryExample();
			Criteria criteria = example.createCriteria();
			if(form!=null) {
				//接口名称
				if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
					criteria.andApplicationIdEqualTo(form.getApplicationName().trim());
				}
				//日志类型
				if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
					criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
				}
				//开始日期
				if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
					criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
				}
				//结束日期
				if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
					criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
				}
				//方法名称
				if(form.getMethodName()!=null && !"".equals(form.getMethodName())) {
					criteria.andMethodNameEqualTo(form.getMethodName().trim());
				}
				//日志内容
				if(form.getTraceText()!=null && !"".equals(form.getTraceText())) {
					criteria.andTraceTextLike("%" + form.getTraceText().trim() + "%");
				}
				//工单内容
				if(form.getXmlDocument()!=null && !"".equals(form.getXmlDocument())) {
					criteria.andXmlDocumentLike("%" + form.getXmlDocument().trim() + "%");
				}
				if (StringUtils.isNotBlank(form.getRelateId())) {
					criteria.andRelateIdEqualTo(form.getRelateId());
				}
			}
			example.setSkipResults(form.getSkipResults());
			example.setMaxResults(form.getMaxResults());
			example.setOrderByClause("RELATE_ID DESC,SEQUENCE_ID");
			
			Pager<IfaceLogRepository> ifaceLogRepositoryMixedWithBLOBsList = this.ifaceLogFacade.selectPageByExample(example);
			
			//如果数据查询模块初始化操作存在记录时，如果日志内容与工单内容过长，部分显示并打三点
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				for(IfaceLogRepository ifaceLogRepositoryMixedWithBLOBs : ifaceLogRepositoryMixedWithBLOBsList) {
					//日志内容
					if(ifaceLogRepositoryMixedWithBLOBs.getTraceText()!=null && !"".equals(ifaceLogRepositoryMixedWithBLOBs.getTraceText())) {
						if(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().length()>20) {
							ifaceLogRepositoryMixedWithBLOBs.setTraceText(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().substring(0, 21)+"...");
						} 
					}
				}
			}
			
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				request.setAttribute("ifaceLogRepositoryMixedWithBLOBsList", ifaceLogRepositoryMixedWithBLOBsList);
			}
			
		} else if("1".equals(form.getIsArchived())) {
			IfaceLogRepositoryHisExample hisExample = new IfaceLogRepositoryHisExample();
			com.free.assist.domain.IfaceLogRepositoryHisExample.Criteria criteria = hisExample.createCriteria();
			if(form!=null) {
				//接口名称
				if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
					criteria.andApplicationIdEqualTo(form.getApplicationName().trim());
				}
				//日志类型
				if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
					criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
				}
				//开始日期
				if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
					criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
				}
				//结束日期
				if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
					criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
				}
				//方法名称
				if(form.getMethodName()!=null && !"".equals(form.getMethodName())) {
					criteria.andMethodNameEqualTo(form.getMethodName().trim());
				}
				//日志内容
				if(form.getTraceText()!=null && !"".equals(form.getTraceText())) {
					criteria.andTraceTextLike("%" + form.getTraceText().trim() + "%");
				}
				//工单内容
				if(form.getXmlDocument()!=null && !"".equals(form.getXmlDocument())) {
					criteria.andXmlDocumentLike("%" + form.getXmlDocument().trim() + "%");
				}
				if (StringUtils.isNotBlank(form.getRelateId())) {
					criteria.andRelateIdEqualTo(form.getRelateId());
				}
			}
			hisExample.setSkipResults(form.getSkipResults());
			hisExample.setMaxResults(form.getMaxResults());
			hisExample.setOrderByClause("RELATE_ID DESC,SEQUENCE_ID");
			
			Pager<IfaceLogRepositoryHis> ifaceLogRepositoryMixedWithBLOBsList = this.ifaceLogFacade.selectPageByExample(hisExample);
			
			//如果数据查询模块初始化操作存在记录时，如果日志内容与工单内容过长，部分显示并打三点
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				for(IfaceLogRepositoryHis ifaceLogRepositoryMixedWithBLOBs : ifaceLogRepositoryMixedWithBLOBsList) {
					//日志内容
					if(ifaceLogRepositoryMixedWithBLOBs.getTraceText()!=null && !"".equals(ifaceLogRepositoryMixedWithBLOBs.getTraceText())) {
						if(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().length()>20) {
							ifaceLogRepositoryMixedWithBLOBs.setTraceText(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().substring(0, 21)+"...");
						} 
					}
				}
			}
			
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				request.setAttribute("ifaceLogRepositoryMixedWithBLOBsList", ifaceLogRepositoryMixedWithBLOBsList);
			}
		}
		
		
		return wctx.forwardToString("/jsp/iface/ifaceLoggerTraceList.jsp");
	}
	
	/**
	 * 接口日志模块(缺少工单内容显示)：
	 * 接口日志模块与数据查询模块的区别：一个注重工单内容，一个注重日志内容
	 * 接口列表信息数据查询初始化操作
	 * 如果日志内容与工单内容过长，启用(XXX...)打点来粗略显示
	 * @author gms:Sep 29, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceLogRepositoryDataListNoXmlDocument(IfaceLoggerTraceActionForm form) throws ServletException, IOException {
		IfaceLogRepositoryExample example = new IfaceLogRepositoryExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			//接口名称
			if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
				criteria.andApplicationNameEqualTo(form.getApplicationName().trim());
			}
			//日志类型
			if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
				criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
			}
			//开始日期
			if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
				criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
			}
			//结束日期
			if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
				criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
			}
			//关键字
			if(form.getKeySearch()!=null && !"".equals(form.getKeySearch())) {
				criteria.andTraceTextLike("%"+form.getKeySearch().trim()+"%");
			}
			//方法名称
			if(form.getMethodName()!=null && !"".equals(form.getMethodName())) {
				criteria.andMethodNameEqualTo(form.getMethodName().trim());
			}
			if (StringUtils.isNotBlank(form.getRelateId())) {
				criteria.andRelateIdEqualTo(form.getRelateId());
			}
		}
		example.setSkipResults(form.getSkipResults());
		example.setMaxResults(form.getMaxResults());
		example.setOrderByClause("RELATE_ID,SEQUENCE_ID");
		
		Pager<IfaceLogRepository> ifaceLogReMixedWithBLOBsListNoXml = this.ifaceLogFacade.selectPageByExample(example);
		
		//如果数据查询模块初始化操作存在记录时，如果日志内容与工单内容过长，部分显示并打三点
		if(ifaceLogReMixedWithBLOBsListNoXml!=null && ifaceLogReMixedWithBLOBsListNoXml.size()>0) {
			for(IfaceLogRepository ifaceLogRepositoryMixedWithBLOBs : ifaceLogReMixedWithBLOBsListNoXml) {
				//日志内容
				if(ifaceLogRepositoryMixedWithBLOBs.getTraceText()!=null && !"".equals(ifaceLogRepositoryMixedWithBLOBs.getTraceText())) {
					if(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().length()>20) {
						ifaceLogRepositoryMixedWithBLOBs.setTraceText(ifaceLogRepositoryMixedWithBLOBs.getTraceText().trim().substring(0, 21)+"...");
					} 
				}
			}
		}
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		if(ifaceLogReMixedWithBLOBsListNoXml!=null && ifaceLogReMixedWithBLOBsListNoXml.size()>0) {
			request.setAttribute("ifaceLogReMixedWithBLOBsListNoXml", ifaceLogReMixedWithBLOBsListNoXml);
		}
		
		return wctx.forwardToString("/jsp/iface/ifaceLoggerTraceList.jsp");
	}
	
	/**
	 * 数据查询模块与接口日志模块共用：
	 * 根据查询条件应用程序标识和日志标识，取得数据查询列表中记录的详细情况
	 * @author gms:Sep 29, 2009
	 * @param applicationId
	 * @param repositoryId
	 * @return
	 */
	public ActionForward getIfaceLogRepositoryDataSrchDetail(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		IfaceLoggerTraceActionForm f = (IfaceLoggerTraceActionForm) form;
		if(StringUtils.isBlank(f.getRepositoryId())) {
			throw new IllegalArgumentException("parameter repositoryId must not be null or empty");
		}
		
		StringWriter stringWriter = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setIndent(true);
		format.setIndentSize(4);
		XMLWriter xmlWriter = new XMLWriter(stringWriter, format);
		SAXReader saxReader = new SAXReader();
		
		if(!StringUtils.isBlank(f.getRepositoryId()) && f.getRepositoryId().indexOf("*")!=-1) {
			IfaceLogRepositoryHisKey hisKey = new IfaceLogRepositoryHisKey();
			hisKey.setRepositoryId(f.getRepositoryId());
			IfaceLogRepositoryHis ifaceLogRepositoryHis = this.ifaceLogFacade.getRepositoryHis(hisKey);
			try{
				Document document = saxReader.read(new StringReader(StringUtils.trim(ifaceLogRepositoryHis.getXmlDocument())));
				xmlWriter.write(document);
				ifaceLogRepositoryHis.setXmlDocument(HtmlUtils.htmlEscape(stringWriter.toString()));
				//request.setAttribute("brush", "xml");
			} catch (Exception e) {
				logger.warn("日志的xml格式不对。");
				//request.setAttribute("brush", "plain");
			} finally {
				stringWriter.close();
			}
			request.setAttribute("ifaceLogRepository", ifaceLogRepositoryHis);
		} else {
			IfaceLogRepository ifaceLogRepository = new IfaceLogRepository();
			ifaceLogRepository.setRepositoryId(f.getRepositoryId());
			ifaceLogRepository = this.ifaceLogFacade.getRepository(ifaceLogRepository);
			try{
				Document document = saxReader.read(new StringReader(StringUtils.trim(ifaceLogRepository.getXmlDocument())));
				xmlWriter.write(document);
				ifaceLogRepository.setXmlDocument(HtmlUtils.htmlEscape(stringWriter.toString()));
				//request.setAttribute("brush", "xml");
			} catch (Exception e) {
				logger.warn("日志的xml格式不对。");
				//request.setAttribute("brush", "plain");
			} finally {
				stringWriter.close();
			}
			request.setAttribute("ifaceLogRepository", ifaceLogRepository);
		}
		
		return new ActionForward("/jsp/iface/ifaceLoggerTraceDetail.jsp");
	}
	
	/**
	 * 数据查询模块：
	 * 接口名称集合数据取得操作
	 * @author gms:Sep 29, 2009
	 * @return
	 */
	public List<IfaceConfigSystem> getIfaceApplicationNameList() {
		String strs[];
		//String rntStrs[];
		IfaceConfigSystemExample ex = new IfaceConfigSystemExample();
		ex.createCriteria().andAvailableEqualTo("Y");
		//调用findApplication方法需要用到忽略记录行数和一页最大记录行数，建议重构一个重名方法
		ex.setSkipResults(0);
		ex.setMaxResults(100);
		List<IfaceConfigSystem> list = new ArrayList<IfaceConfigSystem>();
		IfaceConfigSystem firstObj = new IfaceConfigSystem();
		firstObj.setApplicationId("");
		firstObj.setApplicationName("");
		list.add(firstObj);
		List<IfaceConfigSystem> ifaceApplicationList = ifaceLogFacade.selectByExample(ex);
		if(ifaceApplicationList!=null && ifaceApplicationList.size()>0) {
			for(IfaceConfigSystem obj : ifaceApplicationList) {
				list.add(obj);
			}
		}
		return list;
	}

}
