package com.free.assist.service.common;

import java.io.CharArrayReader;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import com.free.assist.domain.BusReleaseTrendsWithBLOBs;
import com.free.assist.domain.BusReleaseTrendsWithBLOBsExample;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.domain.SysUserKey;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.service.sys.ISysLoginService;
import com.free.assist.util.Constant;
import com.free.assist.util.Helper;
import com.free.assist.util.MD5;
import com.free.assist.util.SpringContextUtil;
import com.free.assist.util.StringUtil;

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
		ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(Helper.getNodeText(document, "/esb/msg/pass_word"))).andLoginNameEqualTo(Helper.getNodeText(document, "/esb/msg/login_name"));
		List<SysUser> list = sysLoginService.selectByExample(ex);
		StringBuilder sb = new StringBuilder(256);
		if (list == null || list.size() == 0) {
			sb.append("<is_success>").append(Constant.FLAG_NO).append("</is_success><remark>").append("用户名密码错误，请重新输入！").append("</remark><login_name>").append(Helper.getNodeText(document, "/esb/msg/login_name")).append("</login_name><user_id></user_id><user_name></user_name><unit_name></unit_name>");
			return buildXmlBegin("login") + sb.toString() + buildXmlEnd();
		} else {
			sb.append("<is_success>").append(Constant.FLAG_YES).append("</is_success><remark>").append("登陆成功").append("</remark><login_name>").append(list.get(0).getLoginName()).append("</login_name><user_id>").append(list.get(0).getUserId()).append("</user_id><user_name>").append(list.get(0).getUserName()).append("</user_name><unit_name>").append(list.get(0).getUnitName()).append("</unit_name>");
			return buildXmlBegin("login") + sb.toString() + buildXmlEnd();
		}
	}

	private String dynamicCreate(Document document) {
		DynamicOperateService dynamicOperateService = SpringContextUtil.getBean("dynamicOperateService", DynamicOperateService.class);
		ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
		SysUserKey userKey = new SysUserKey();
		userKey.setUserId(Helper.getNodeText(document, "/esb/msg/creator"));
		SysUser user = (SysUser) sysLoginService.selectByPrimaryKey(userKey);
		BusReleaseTrendsWithBLOBs busRelease = new BusReleaseTrendsWithBLOBs();
		busRelease.setTheTitle(Helper.getNodeText(document, "/esb/msg/theTitle"));
		busRelease.setCity(Helper.getNodeText(document, "/esb/msg/city"));
		busRelease.setStreet(Helper.getNodeText(document, "/esb/msg/street"));
		busRelease.setCommunity(Helper.getNodeText(document, "/esb/msg/community"));
		busRelease.setRoad(Helper.getNodeText(document, "/esb/msg/road"));
		busRelease.setNumberPlate(Helper.getNodeText(document, "/esb/msg/numberPlate"));
		busRelease.setScenePersonName(Helper.getNodeText(document, "/esb/msg/scenePersonName"));
		busRelease.setScenePersonPhone(Helper.getNodeText(document, "/esb/msg/scenePersonPhone"));
		busRelease.setLongitude(Helper.stringToBigDecimal(Helper.getNodeText(document, "/esb/msg/longitude")));
		busRelease.setLatitude(Helper.stringToBigDecimal(Helper.getNodeText(document, "/esb/msg/latitude")));
		busRelease.setPositionAddress(Helper.getNodeText(document, "/esb/msg/position_address"));
		SuptAction action = new SuptAction(user);
		StringBuilder sb = new StringBuilder(256);
		try {
			if (user == null) {
				throw new Exception("动态发布用户不存在");
			}
			busRelease.setRepairTime(dynamicOperateService.getSysDate());
			busRelease.setRepairType(Constant.REPAIR_TYPE_EMERGENCY);
			busRelease.setComeFrom(Constant.COME_FROM_ANDROID);
			dynamicOperateService.create(busRelease, action);
			sb.append("<is_success>").append(Constant.FLAG_YES).append("</is_success><remark>").append("动态登记成功！").append("</remark>");
		} catch (Exception e) {
			sb.append("<is_success>").append(Constant.FLAG_NO).append("</is_success><remark>").append("动态登记失败").append("</remark>");
			logger.error("动态登记失败:\n" + e);
		}
		return buildXmlBegin("dynamic_create") + sb.toString() + buildXmlEnd();
	}

	private String dynamicList(Document document) {
		CommonOperateService commonOperateService = SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
		BusReleaseTrendsWithBLOBsExample ex = new BusReleaseTrendsWithBLOBsExample();
		com.free.assist.domain.BusReleaseTrendsWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/theTitle"))) {
			cr.andTheTitleLike("%" + Helper.getNodeText(document, "/esb/msg/theTitle") + "%");
		}
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/city"))) {
			cr.andCityEqualTo(Helper.getNodeText(document, "/esb/msg/city"));
		}
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/street"))) {
			cr.andStreetEqualTo(Helper.getNodeText(document, "/esb/msg/street"));
		}
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/community"))) {
			cr.andCommunityEqualTo(Helper.getNodeText(document, "/esb/msg/community"));
		}
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/road"))) {
			cr.andRoadLike("%" + Helper.getNodeText(document, "/esb/msg/road") + "%");
		}
		StringBuilder sb = new StringBuilder(256);
		try {
			List<BusReleaseTrendsWithBLOBs> trendsList = commonOperateService.selectByExampleWithBLOBs(ex);
			sb.append("<list>");
			for (BusReleaseTrendsWithBLOBs trends : trendsList) {
				sb.append("<dynamic>");
				sb.append("<billSn>").append(trends.getBillSn()).append("</billSn>");
				sb.append("<theTitle>").append(trends.getTheTitle()).append("</theTitle>");
				sb.append("<city>").append(StringUtil.nullToEmptyOfStr(trends.getCity())).append("</city>");
				sb.append("<street>").append(StringUtil.nullToEmptyOfStr(trends.getStreet())).append("</street>");
				sb.append("<community>").append(StringUtil.nullToEmptyOfStr(trends.getCommunity())).append("</community>");
				sb.append("<road>").append(StringUtil.nullToEmptyOfStr(trends.getRoad())).append("</road>");
				sb.append("<numberPlate>").append(StringUtil.nullToEmptyOfStr(trends.getNumberPlate())).append("</numberPlate>");
				sb.append("<scenePersonName>").append(StringUtil.nullToEmptyOfStr(trends.getScenePersonName())).append("</scenePersonName>");
				sb.append("<scenePersonPhone>").append(StringUtil.nullToEmptyOfStr(trends.getScenePersonPhone())).append("</scenePersonPhone>");
				sb.append("<creator>").append(commonOperateService.queryUserName(trends.getCreator())).append("</creator>");
				sb.append("<longitude>").append(StringUtil.nullToEmptyOfObject(trends.getLongitude())).append("</longitude>");
				sb.append("<latitude>").append(StringUtil.nullToEmptyOfObject(trends.getLatitude())).append("</latitude>");
				sb.append("<repairTime>").append(Helper.formateDate(trends.getRepairTime(), "yyyy-MM-dd")).append("</repairTime>");
				sb.append("<createTime>").append(Helper.formateDate(trends.getCreateTime(), "yyyy-MM-dd")).append("</createTime>");
				String positionAddress = trends.getPositionAddress();
				if (positionAddress == null || positionAddress.trim().length() == 0) {
					positionAddress = StringUtil.nullToEmptyOfStr(trends.getCity()) + StringUtil.nullToEmptyOfStr(trends.getStreet()) + StringUtil.nullToEmptyOfStr(trends.getCommunity()) + StringUtil.nullToEmptyOfStr(trends.getRoad());
				}
				sb.append("<position_address>").append(positionAddress).append("</position_address>");
				sb.append("<repair_type>").append(Constant.REPAIR_TYPE_PLAN.equals(trends.getRepairType()) ? "计划施工" : "应急抢修").append("</repair_type>");
				sb.append("</dynamic>");
			}
			sb.append("</list>");
		} catch (Exception e) {
			logger.error("动态清单查询失败:\n" + e);
		}
		return buildXmlBegin("dynamic_list") + sb.toString() + buildXmlEnd();
	}

	private String dynamicDetail(Document document) {
		CommonOperateService commonOperateService = SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
		BusReleaseTrendsWithBLOBsExample ex = new BusReleaseTrendsWithBLOBsExample();
		com.free.assist.domain.BusReleaseTrendsWithBLOBsExample.Criteria cr = ex.createCriteria();
		StringBuilder sb = new StringBuilder(256);
		if (StringUtils.isNotBlank(Helper.getNodeText(document, "/esb/msg/billSn"))) {
			cr.andBillSnEqualTo(Helper.getNodeText(document, "/esb/msg/billSn"));
			try {
				List<BusReleaseTrendsWithBLOBs> trendsList = commonOperateService.selectByExampleWithBLOBs(ex);
				for (BusReleaseTrendsWithBLOBs trends : trendsList) {
					sb.append("<dynamic>");
					sb.append("<billSn>").append(trends.getBillSn()).append("</billSn>");
					sb.append("<theTitle>").append(trends.getTheTitle()).append("</theTitle>");
					sb.append("<city>").append(StringUtil.nullToEmptyOfStr(trends.getCity())).append("</city>");
					sb.append("<street>").append(StringUtil.nullToEmptyOfStr(trends.getStreet())).append("</street>");
					sb.append("<community>").append(StringUtil.nullToEmptyOfStr(trends.getCommunity())).append("</community>");
					sb.append("<road>").append(StringUtil.nullToEmptyOfStr(trends.getRoad())).append("</road>");
					sb.append("<numberPlate>").append(StringUtil.nullToEmptyOfStr(trends.getNumberPlate())).append("</numberPlate>");
					sb.append("<scenePersonName>").append(StringUtil.nullToEmptyOfStr(trends.getScenePersonName())).append("</scenePersonName>");
					sb.append("<scenePersonPhone>").append(StringUtil.nullToEmptyOfStr(trends.getScenePersonPhone())).append("</scenePersonPhone>");
					sb.append("<creator>").append(commonOperateService.queryUserName(trends.getCreator())).append("</creator>");
					sb.append("<longitude>").append(StringUtil.nullToEmptyOfObject(trends.getLongitude())).append("</longitude>");
					sb.append("<latitude>").append(StringUtil.nullToEmptyOfObject(trends.getLatitude())).append("</latitude>");
					sb.append("<repairTime>").append(Helper.formateDate(trends.getRepairTime(), "yyyy-MM-dd")).append("</repairTime>");
					sb.append("<createTime>").append(Helper.formateDate(trends.getCreateTime(), "yyyy-MM-dd")).append("</createTime>");
					String positionAddress = trends.getPositionAddress();
					if (positionAddress == null || positionAddress.trim().length() == 0) {
						positionAddress = StringUtil.nullToEmptyOfStr(trends.getCity()) + StringUtil.nullToEmptyOfStr(trends.getStreet()) + StringUtil.nullToEmptyOfStr(trends.getCommunity()) + StringUtil.nullToEmptyOfStr(trends.getRoad());
					}
					sb.append("<position_address>").append(positionAddress).append("</position_address>");
					sb.append("<repair_type>").append(Constant.REPAIR_TYPE_PLAN.equals(trends.getRepairType()) ? "计划施工" : "应急抢修").append("</repair_type>");
					sb.append("</dynamic>");
				}
			} catch (Exception e) {
				logger.error("动态清单查询失败:\n" + e);
			}
		}
		return buildXmlBegin("dynamic_detail") + sb.toString() + buildXmlEnd();
	}

	private String buildXmlBegin(String methodName) {
		StringBuilder sb = new StringBuilder(256);
		sb.append("<?xml version=\"1.0\" encoding=\"GB2312\"?><esb><route><sender>server</sender><receiver>app</receiver><time>").append(Helper.getCurrentDateAndTime()).append("</time><service_name>").append(methodName).append("</service_name><msg_type>response</msg_type><msg_id>").append(Helper.getCurrentTime()).append("</msg_id></route><msg>");
		return sb.toString();
	}

	private String buildXmlEnd() {
		return "</msg></esb>";
	}
}