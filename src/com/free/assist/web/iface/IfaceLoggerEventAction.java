/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.web.iface;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventHis;
import com.free.assist.domain.IfaceLogEventHisExample;
import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryHis;
import com.free.assist.domain.IfaceLogRepositoryHisExample;
import com.free.assist.service.iface.IfaceLogEventService;
import com.free.assist.util.Pager;
import com.free.assist.web.BaseAction;

/**
 * @author 李猛
 * @version 1
 * @date 2009-12-8 上午09:05:37
 */
@Controller("/iface/ifaceLoggerEventAction")
public class IfaceLoggerEventAction extends BaseAction {

	public ActionForward eventList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException {
		IfaceLoggerEventActionForm af = (IfaceLoggerEventActionForm) form;
		if (StringUtils.equals(af.getHistorical(), "Y")) {
			doEventListHis(response, af);
		} else {
			doEventList(response, af);
		}
		return null;
	}

	private void doEventList(HttpServletResponse response, IfaceLoggerEventActionForm f) throws IOException, JsonGenerationException {
		IfaceLogEventExample example = new IfaceLogEventExample();
		example.setOrderByClause("RELATE_ID DESC, CREATED DESC");
		IfaceLogEventExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(f.getDocument())) {
			criteria.andDocumentLike("%" + f.getDocument() + "%");
		}
		if (StringUtils.isNotBlank(f.getType())) {
			criteria.andTypeEqualTo(f.getType());
		}
		if (StringUtils.isNotBlank(f.getSuccessful())) {
			criteria.andSuccessfulEqualTo(f.getSuccessful());
		}
		example.setSkipResults(f.getSkipResults()).setMaxResults(f.getMaxResults());
		Pager<IfaceLogEvent> ifaceLogEventList = ifaceLogEventService.selectPageByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", ifaceLogEventList.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceLogEvent ifaceLogEvent : ifaceLogEventList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("eventId", ifaceLogEvent.getEventId());
			jsonGenerator.writeStringField("type", ifaceLogEvent.getType());
			jsonGenerator.writeStringField("relateId", ifaceLogEvent.getRelateId());
			jsonGenerator.writeStringField("description", ifaceLogEvent.getDescription());
			//jsonGenerator.writeStringField("document", ifaceLogEvent.getDocument());
			jsonGenerator.writeStringField("successful", StringUtils.defaultIfEmpty(ifaceLogEvent.getSuccessful(), ""));
			jsonGenerator.writeStringField("created", DateFormatUtils.format(ifaceLogEvent.getCreated(), "yyyy-MM-dd HH:mm:ss"));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
	}
	
	private void doEventListHis(HttpServletResponse response, IfaceLoggerEventActionForm f) throws IOException, JsonGenerationException {
		IfaceLogEventHisExample example = new IfaceLogEventHisExample();
		example.setOrderByClause("RELATE_ID DESC, CREATED DESC");
		IfaceLogEventHisExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(f.getDocument())) {
			criteria.andDocumentLike("%" + f.getDocument() + "%");
		}
		if (StringUtils.isNotBlank(f.getType())) {
			criteria.andTypeEqualTo(f.getType());
		}
		if (StringUtils.isNotBlank(f.getSuccessful())) {
			criteria.andSuccessfulEqualTo(f.getSuccessful());
		}
		example.setSkipResults(f.getSkipResults()).setMaxResults(f.getMaxResults());
		Pager<IfaceLogEventHis> ifaceLogEventList = ifaceLogEventService.selectPageByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", ifaceLogEventList.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceLogEventHis ifaceLogEventHis : ifaceLogEventList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("eventId", ifaceLogEventHis.getEventId());
			jsonGenerator.writeStringField("type", ifaceLogEventHis.getType());
			jsonGenerator.writeStringField("relateId", ifaceLogEventHis.getRelateId());
			jsonGenerator.writeStringField("description", ifaceLogEventHis.getDescription());
			//jsonGenerator.writeStringField("document", ifaceLogEvent.getDocument());
			jsonGenerator.writeStringField("successful", StringUtils.defaultIfEmpty(ifaceLogEventHis.getSuccessful(), ""));
			jsonGenerator.writeStringField("created", DateFormatUtils.format(ifaceLogEventHis.getCreated(), "yyyy-MM-dd HH:mm:ss"));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
	}
	
	public ActionForward recordList(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		IfaceLoggerEventActionForm af = (IfaceLoggerEventActionForm) form;
		if (StringUtils.startsWith(af.getRelateId(), "w")) {
			doRecordHisList(response, af);
		} else {
			doRecordList(response, af);
		}
		return null;
	}

	private void doRecordList(HttpServletResponse response, IfaceLoggerEventActionForm af) throws IOException, JsonGenerationException {
		IfaceLogRepositoryExample example = new IfaceLogRepositoryExample();
		example.createCriteria().andRelateIdEqualTo(af.getRelateId());
		example.setSkipResults(af.getSkipResults()).setMaxResults(af.getMaxResults());
		Pager<IfaceLogRepository> ifaceLogRecordList = ifaceLogEventService.selectPageByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", ifaceLogRecordList.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceLogRepository ifaceLogRecord : ifaceLogRecordList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("repositoryId", ifaceLogRecord.getRepositoryId());
			jsonGenerator.writeStringField("applicationName", ifaceLogRecord.getApplicationName());
			jsonGenerator.writeStringField("methodName", ifaceLogRecord.getMethodName());
			jsonGenerator.writeStringField("traceLevel", ifaceLogRecord.getTraceLevel());
			jsonGenerator.writeStringField("traceText", ifaceLogRecord.getTraceText());
			//jsonGenerator.writeStringField("document", ifaceLogEvent.getDocument());
			jsonGenerator.writeStringField("createDate", DateFormatUtils.format(ifaceLogRecord.getCreateDate(), "yyyy-MM-dd HH:mm:ss"));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
	}
	
	private void doRecordHisList(HttpServletResponse response, IfaceLoggerEventActionForm af) throws IOException, JsonGenerationException {
		IfaceLogRepositoryHisExample example = new IfaceLogRepositoryHisExample();
		example.createCriteria().andRelateIdEqualTo(af.getRelateId());
		example.setSkipResults(af.getSkipResults()).setMaxResults(af.getMaxResults());
		Pager<IfaceLogRepositoryHis> ifaceLogRecordList = ifaceLogEventService.selectPageByExample(example);
		JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("totalRows", ifaceLogRecordList.getTotalRecords());
		jsonGenerator.writeArrayFieldStart("data");
		for (IfaceLogRepositoryHis ifaceLogRecordHis : ifaceLogRecordList) {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("repositoryId", ifaceLogRecordHis.getRepositoryId());
			jsonGenerator.writeStringField("applicationName", StringUtils.defaultIfEmpty(ifaceLogRecordHis.getApplicationName(), ""));
			jsonGenerator.writeStringField("methodName", ifaceLogRecordHis.getMethodName());
			jsonGenerator.writeStringField("traceLevel", ifaceLogRecordHis.getTraceLevel());
			jsonGenerator.writeStringField("traceText", ifaceLogRecordHis.getTraceText());
			jsonGenerator.writeStringField("createDate", DateFormatUtils.format(ifaceLogRecordHis.getCreateDate(), "yyyy-MM-dd HH:mm:ss"));
			jsonGenerator.writeEndObject();
		}
		jsonGenerator.writeEndArray();
		jsonGenerator.writeEndObject();
		jsonGenerator.flush();
	}
	
	public ActionForward eventArgu(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		IfaceLoggerEventActionForm f = (IfaceLoggerEventActionForm) form;
		IfaceLogEvent ifaceLogEvent = new IfaceLogEvent();
		ifaceLogEvent.setEventId(f.getEventId());
		ifaceLogEvent = (IfaceLogEvent) ifaceLogEventService.selectByPrimaryKey(ifaceLogEvent);
		
		StringWriter stringWriter = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setIndent(true);
		format.setIndentSize(4);
		XMLWriter xmlWriter = new XMLWriter(stringWriter, format);
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new StringReader(ifaceLogEvent.getDocument()));
		xmlWriter.write(document);
		xmlWriter.close();
		
		request.setAttribute("argument", HtmlUtils.htmlEscape(stringWriter.toString()));
		return new ActionForward("/jsp/iface/logger/eventArgu.jsp");
	}
	
	public ActionForward eventDesc(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		IfaceLoggerEventActionForm f = (IfaceLoggerEventActionForm) form;
		IfaceLogEvent ifaceLogEvent = new IfaceLogEvent();
		ifaceLogEvent.setEventId(f.getEventId());
		ifaceLogEvent = (IfaceLogEvent) ifaceLogEventService.selectByPrimaryKey(ifaceLogEvent);
		String description = ifaceLogEvent.getDescription();
		/*StringBuilder stringBuilder = new StringBuilder();
		if (StringUtils.isNotBlank(description)) {
			BufferedReader bufferedReader = new BufferedReader(new StringReader(description));
			String stringLine = null;
			while ((stringLine = bufferedReader.readLine()) != null) {
				if (StringUtils.isNotBlank(stringLine)) {
					stringBuilder.append("<p>").append(stringLine).append("</p>\n");
				}
			}
		}*/
		request.setAttribute("description", description);
		return new ActionForward("/jsp/iface/logger/eventDesc.jsp");
	}
	
	/**
	 * <p>手工干预重新执行</p>
	 */
	public ActionForward eventImpl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			IfaceLoggerEventActionForm f = (IfaceLoggerEventActionForm) form;
			IfaceLogEvent ifaceLogEvent = new IfaceLogEvent();
			ifaceLogEvent.setEventId(f.getEventId());
			ifaceLogEvent = (IfaceLogEvent) ifaceLogEventService.selectByPrimaryKey(ifaceLogEvent);
			//externalInterfaceWebservice.executeXML(ifaceLogEvent.getDocument());
		} catch (Throwable e) {
		} finally {
			response.setStatus(HttpServletResponse.SC_OK);
		}
		return null;
	}
	
	@Resource private IfaceLogEventService ifaceLogEventService;
	
	//@Resource private ExternalInterfaceService externalInterfaceWebservice;
}
