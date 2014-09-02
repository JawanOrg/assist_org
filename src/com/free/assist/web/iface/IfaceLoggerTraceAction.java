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
	 * ���ݲ�ѯģ�飺
	 * �ӿ��б���Ϣ���ݲ�ѯ��ʼ������
	 * �����־�����빤�����ݹ���������(XXX...)�����������ʾ
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
				//�ӿ�����
				if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
					criteria.andApplicationIdEqualTo(form.getApplicationName().trim());
				}
				//��־����
				if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
					criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
				}
				//��ʼ����
				if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
					criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
				}
				//��������
				if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
					criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
				}
				//��������
				if(form.getMethodName()!=null && !"".equals(form.getMethodName())) {
					criteria.andMethodNameEqualTo(form.getMethodName().trim());
				}
				//��־����
				if(form.getTraceText()!=null && !"".equals(form.getTraceText())) {
					criteria.andTraceTextLike("%" + form.getTraceText().trim() + "%");
				}
				//��������
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
			
			//������ݲ�ѯģ���ʼ���������ڼ�¼ʱ�������־�����빤�����ݹ�����������ʾ��������
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				for(IfaceLogRepository ifaceLogRepositoryMixedWithBLOBs : ifaceLogRepositoryMixedWithBLOBsList) {
					//��־����
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
				//�ӿ�����
				if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
					criteria.andApplicationIdEqualTo(form.getApplicationName().trim());
				}
				//��־����
				if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
					criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
				}
				//��ʼ����
				if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
					criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
				}
				//��������
				if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
					criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
				}
				//��������
				if(form.getMethodName()!=null && !"".equals(form.getMethodName())) {
					criteria.andMethodNameEqualTo(form.getMethodName().trim());
				}
				//��־����
				if(form.getTraceText()!=null && !"".equals(form.getTraceText())) {
					criteria.andTraceTextLike("%" + form.getTraceText().trim() + "%");
				}
				//��������
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
			
			//������ݲ�ѯģ���ʼ���������ڼ�¼ʱ�������־�����빤�����ݹ�����������ʾ��������
			if(ifaceLogRepositoryMixedWithBLOBsList!=null && ifaceLogRepositoryMixedWithBLOBsList.size()>0) {
				for(IfaceLogRepositoryHis ifaceLogRepositoryMixedWithBLOBs : ifaceLogRepositoryMixedWithBLOBsList) {
					//��־����
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
	 * �ӿ���־ģ��(ȱ�ٹ���������ʾ)��
	 * �ӿ���־ģ�������ݲ�ѯģ�������һ��ע�ع������ݣ�һ��ע����־����
	 * �ӿ��б���Ϣ���ݲ�ѯ��ʼ������
	 * �����־�����빤�����ݹ���������(XXX...)�����������ʾ
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
			//�ӿ�����
			if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
				criteria.andApplicationNameEqualTo(form.getApplicationName().trim());
			}
			//��־����
			if(form.getTraceLevel()!=null && !"".equals(form.getTraceLevel())) {
				criteria.andTraceLevelEqualTo(form.getTraceLevel().trim());
			}
			//��ʼ����
			if(form.getCreateOnStart()!=null && !"".equals(form.getCreateOnStart())) {
				criteria.andCreateDateGreaterThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnStart().trim(),"yyyy-MM-dd"));
			}
			//��������
			if(form.getCreateOnEnd()!=null && !"".equals(form.getCreateOnEnd())) {
				criteria.andCreateDateLessThanOrEqualTo(DateUtil.toDateByFormat(form.getCreateOnEnd().trim(), "yyyy-MM-dd"));
			}
			//�ؼ���
			if(form.getKeySearch()!=null && !"".equals(form.getKeySearch())) {
				criteria.andTraceTextLike("%"+form.getKeySearch().trim()+"%");
			}
			//��������
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
		
		//������ݲ�ѯģ���ʼ���������ڼ�¼ʱ�������־�����빤�����ݹ�����������ʾ��������
		if(ifaceLogReMixedWithBLOBsListNoXml!=null && ifaceLogReMixedWithBLOBsListNoXml.size()>0) {
			for(IfaceLogRepository ifaceLogRepositoryMixedWithBLOBs : ifaceLogReMixedWithBLOBsListNoXml) {
				//��־����
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
	 * ���ݲ�ѯģ����ӿ���־ģ�鹲�ã�
	 * ���ݲ�ѯ����Ӧ�ó����ʶ����־��ʶ��ȡ�����ݲ�ѯ�б��м�¼����ϸ���
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
				logger.warn("��־��xml��ʽ���ԡ�");
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
				logger.warn("��־��xml��ʽ���ԡ�");
				//request.setAttribute("brush", "plain");
			} finally {
				stringWriter.close();
			}
			request.setAttribute("ifaceLogRepository", ifaceLogRepository);
		}
		
		return new ActionForward("/jsp/iface/ifaceLoggerTraceDetail.jsp");
	}
	
	/**
	 * ���ݲ�ѯģ�飺
	 * �ӿ����Ƽ�������ȡ�ò���
	 * @author gms:Sep 29, 2009
	 * @return
	 */
	public List<IfaceConfigSystem> getIfaceApplicationNameList() {
		String strs[];
		//String rntStrs[];
		IfaceConfigSystemExample ex = new IfaceConfigSystemExample();
		ex.createCriteria().andAvailableEqualTo("Y");
		//����findApplication������Ҫ�õ����Լ�¼������һҳ����¼�����������ع�һ����������
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
