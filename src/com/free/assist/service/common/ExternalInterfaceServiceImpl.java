package com.free.assist.service.common;

import java.io.CharArrayReader;
import java.util.List;

import javax.jws.WebService;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.sys.ISysLoginService;
import com.free.assist.util.Helper;
import com.free.assist.util.MD5;
import com.free.assist.util.SpringContextUtil;

/**
 * 通用外部webservice接口
 * 
 * @author Jawan
 * 
 */

@WebService
public class ExternalInterfaceServiceImpl extends BaseServiceImpl implements ExternalInterfaceService {
	private static String billMessageFlag = "";

	public String executeXML(String xmlStr) {
		String returnXml = "";
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(new CharArrayReader(xmlStr.toCharArray()));
			String methodName = Helper.getNodeText(document, "/esb/route/service_name");
			if ("login".equals(methodName)) {
				return this.login(document);
			} else if ("dynamic_create".equals(methodName)) {
				return this.dynamicCreate(document);
			} else if ("dynamic_list".equals(methodName)) {
				return this.dynamicList(document);
			} else if ("dynamic_detail".equals(methodName)) {
				return this.dynamicDetail(document);
			}
		} catch (Exception e) {

		}
		return returnXml;

	}

	private String login(Document document) {
		ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
		SysUserExample ex = new SysUserExample();
		ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(Helper.getNodeText(document, "/esb/msg/password"))).andLoginNameEqualTo(Helper.getNodeText(document, "/esb/msg/login_name"));
		List list = sysLoginService.selectByExample(ex);
		if (list == null || list.size() == 0) {
			return "用户名密码错误，请重新输入！";
		} else {
			SysUser user = (SysUser) list.get(0);

		}
		return null;
	}

	private String dynamicCreate(Document document) {
		ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
		SysUserExample ex = new SysUserExample();
		ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(Helper.getNodeText(document, "/esb/msg/password"))).andLoginNameEqualTo(Helper.getNodeText(document, "/esb/msg/login_name"));
		List list = sysLoginService.selectByExample(ex);
		if (list == null || list.size() == 0) {
			return "用户名密码错误，请重新输入！";
		} else {
			SysUser user = (SysUser) list.get(0);

		}
		return null;
	}

	private String dynamicList(Document document) {
		ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
		SysUserExample ex = new SysUserExample();
		ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(Helper.getNodeText(document, "/esb/msg/password"))).andLoginNameEqualTo(Helper.getNodeText(document, "/esb/msg/login_name"));
		List list = sysLoginService.selectByExample(ex);
		if (list == null || list.size() == 0) {
			return "用户名密码错误，请重新输入！";
		} else {
			SysUser user = (SysUser) list.get(0);

		}
		return null;
	}

	private String dynamicDetail(Document document) {
		ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
		SysUserExample ex = new SysUserExample();
		ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(Helper.getNodeText(document, "/esb/msg/password"))).andLoginNameEqualTo(Helper.getNodeText(document, "/esb/msg/login_name"));
		List list = sysLoginService.selectByExample(ex);
		if (list == null || list.size() == 0) {
			return "用户名密码错误，请重新输入！";
		} else {
			SysUser user = (SysUser) list.get(0);

		}
		return null;
	}
	
	private String returnXml(){
		StringBuilder sb = new StringBuilder(256);
		sb.append("<?xml version=\"1.0\" encoding=\"GB2312\"?><esb><route><sender>server</sender><receiver>app</receiver><time>2014-11-20 12:50:43</time><service_name>login</service_name><msg_type>response</msg_type><msg_id>1</msg_id></route><msg><is_success>Y</is_success><remark></remark></msg></esb>");
		return sb.toString();
	}
}