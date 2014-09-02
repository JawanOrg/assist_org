package com.free.assist.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.FloatConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.struts.actions.DispatchAction;
import org.directwebremoting.WebContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseAction extends DispatchAction{
protected Logger logger = LoggerFactory.getLogger(this.getClass());

	public String SESSION_USER_KEY = "CurrentUser";

	static {
		registConverter();
	}

	public static void registConverter() {
		ConvertUtils.register(new BigDecimalConverter(null), java.math.BigDecimal.class);
		ConvertUtils.register(new IntegerConverter(null), Integer.class);
		ConvertUtils.register(new FloatConverter(null), Float.class);
		ConvertUtils.register(new DoubleConverter(null), Double.class);
		ConvertUtils.register(new DateConverter(), Date.class);
	}
	protected HttpServletRequest getRequestByDWR() {
		return WebContextFactory.get().getHttpServletRequest();
	}

	protected HttpSession getSessionByDWR() {
		return getSessionByDWR(true);
	}

	protected HttpSession getSessionByDWR(Boolean bl) {
		return WebContextFactory.get().getSession(bl);
	}

	protected void setRequestObj(HttpServletRequest request, String name, Object obj) {
		request.setAttribute(name, obj);
	}

	protected void writeAutoCompleteString(HttpServletResponse response, String xmlString) throws IOException {
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();

		out.write(xmlString);
		out.close();
	}

	protected void writeAutoCompleteStringUTF8(HttpServletResponse response, String xmlString) throws IOException {
		response.setCharacterEncoding("UTF-8"); // 先指定输出流的编码
		PrintWriter out = response.getWriter();
		response.setContentType("text/xml; charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		// xmlString = new String(xmlString.getBytes("utf-8"),"gbk");
		// xmlString = TranCharset.XmlFormalize(xmlString);
		// ConverFromGBKToUTF8 convert = new ConverFromGBKToUTF8();
		// byte [] fullByte = convert.gbk2utf8(xmlString);
		// String fullStr = new String(fullByte, "GBK");
		// xmlString = new String(xmlString.getBytes("gbk"),"utf-8");
		out.write(xmlString);
		out.close();
	}

}
