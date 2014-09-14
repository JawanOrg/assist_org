package com.free.assist.util;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.service.sys.ISysLoginService;

public class ChartHelper {

	public static String buildXml(BusReleaseTrends project, List<SuptTask> itemList) {
		StringBuilder sb = new StringBuilder(256);
		try {
			ISysLoginService sysLoginService = SpringContextUtil.getBean("sysLoginService", ISysLoginService.class);
			SysUserExample ex = new SysUserExample();
			ex.createCriteria().andUserIdEqualTo(project.getCreator());
			List<?> list = sysLoginService.selectByExample(ex);
			SysUser userVO = null;
			if (list != null && list.size() != 0) {
				userVO = (SysUser) list.get(0);
			}
			sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?> <chart><basicInfo><frameWidth>14</frameWidth><frameHeight>4</frameHeight><topSpace>4</topSpace><leftSpace>20</leftSpace></basicInfo><start><id>");
			sb.append("n0");
			sb.append("</id><title>");
			sb.append(project.getTheTitle());
			sb.append("</title><user_name>");
			sb.append(project.getScenePersonName());
			sb.append("</user_name><user_phone>");
			sb.append(project.getScenePersonPhone());
			sb.append("</user_phone><creator>");
			sb.append(userVO != null ? userVO.getUserName() : "");
			sb.append("</creator><create_time>");
			sb.append(DateUtil.format(project.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			sb.append("</create_time><creator_phone>");
			sb.append(userVO.getMobilePhone());
			sb.append("</creator_phone><onclick>showDetail('").append(project.getBillId()).append("','").append(translateItemCodeToCh("release_status", project.getBillStatus())).append("')</onclick><tips></tips></start>");
			for (SuptTask item : itemList) {
				ex = new SysUserExample();
				ex.createCriteria().andUserIdEqualTo(item.getDealObjectId());
				list = sysLoginService.selectByExample(ex);
				if (list != null && list.size() != 0) {
					userVO = (SysUser) list.get(0);
				}
				sb.append("<node><node_id>n").append(item.getTaskId()).append("</node_id><operator>").append(userVO != null ? userVO.getUserName() : "").append("</operator><status>").append(translateItemCodeToCh("release_status", item.getTaskStatus())).append("</status><phone>").append("</phone><create_time>").append(DateUtil.format(item.getCreateTime(), "yyyy-MM-dd HH:mm:ss")).append("</create_time><end_time></end_time><remaining_time>").append("")
						.append("</remaining_time><overtime></overtime><parent_id>n").append(item.getTaskIdParent()).append("</parent_id><onclick>showOtherInfo('").append(item.getTaskId()).append("','").append(project.getBillId()).append("')</onclick><tips></tips></node>");
			}
			sb.append("</chart>");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String html = buildPageCode("<?xml version=\"1.0\" encoding=\"GBK\"?> <chart>     <basicInfo>         <frameWidth>14</frameWidth>         <frameHeight>4</frameHeight>        <topSpace>4</topSpace>      <leftSpace>35</leftSpace>   </basicInfo>    <start>         <id>startid</id>        <title>项目开始节点</title>       <user_name>用户名</user_name>      <user_phone>18022885588</user_phone>        <creator>创建人</creator>      <create_time>2013-05-02 14:06</create_time>         <creator_phone>18822885588</creator_phone>      <onclick>showDetail()</onclick>         <tips></tips>   </start>    <node>      <node_id>node1</node_id>        <operator>张三</operator>         <status>待派单</status>        <phone>18022885599</phone>      <create_time>2013-05-02 14:14</create_time>         <end_time></end_time>       <remaining_time>1小时20分</remaining_time>         <overtime></overtime>       <parent_id>startid</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node2</node_id>        <operator>李四</operator>         <status>已派单</status>        <phone>18022885500</phone>      <create_time>2013-05-02 14:14</create_time>         <end_time>2013-05-02 14:18</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>startid</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node3</node_id>        <operator>王五</operator>         <status>处理中</status>        <phone>18022885511</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time></end_time>       <remaining_time>1小时10分</remaining_time>         <overtime></overtime>       <parent_id>node2</parent_id>        <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node4</node_id>        <operator>六二</operator>         <status>已完成</status>        <phone>18022885522</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node2</parent_id>        <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node5</node_id>        <operator>麻子</operator>         <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node4</parent_id>        <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node6</node_id>        <operator>你</operator>      <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>startid</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node7</node_id>        <operator>我</operator>      <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>startid</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node8</node_id>        <operator>他</operator>      <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node2</parent_id>        <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node9</node_id>        <operator>她</operator>      <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node8</parent_id>        <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node10</node_id>       <operator>它</operator>      <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node7,node9</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node>     <node>      <node_id>node11</node_id>       <operator>归档</operator>         <status>已完成</status>        <phone>18022885533</phone>      <create_time>2013-05-02 14:18</create_time>         <end_time>2013-05-02 14:50</end_time>       <remaining_time></remaining_time>       <overtime></overtime>       <parent_id>node10,node3,node5,node6,</parent_id>      <onclick>showOtherInfo()</onclick>         <tips></tips>   </node> </chart>");
		System.out.println(html);
	}

	public static String buildPageCode(String xmlStr) {
		if (xmlStr == null || xmlStr.trim().length() == 0) {
			return null;
		}
		SAXReader saxReader = new SAXReader();
		Document xmlDocument = null;
		try {
			xmlDocument = saxReader.read(new CharArrayReader(xmlStr.toCharArray()));
		} catch (DocumentException e) {
			System.out.println(e);
			return null;
		}
		Node startNode = xmlDocument.selectSingleNode("chart/start");
		String startId = getNodeText(startNode, "id");
		@SuppressWarnings("unchecked")
		List<Node> nodeList = xmlDocument.selectNodes("chart/node");
		StringBuilder sb = new StringBuilder(256);
		sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html><head><script type=\"text/javascript\" src=\"/js/jquery-1.10.2.min.js\"></script><script type=\"text/javascript\" src=\"/js/chart.js\"></script>");
		sb.append("<script type=\"text/javascript\">chart.bind(\"ready\", function() {              chart.importDefaults({            connector: [\"Flowchart\", { stub: 100}],           Anchors : [ \"BottomCenter\", \"TopCenter\"],             DragOptions: { cursor: 'pointer', zIndex: 2000 },             EndpointStyles: [{ fillStyle: '#225588' }, { fillStyle: '#558822'}],             EndpointOverlays : [{ fillStyle: 'red' }, { fillStyle: '#558822'}],             Endpoints: [[\"Dot\", { radius: 5}], [\"Dot\", { radius: 5}]],             ConnectionOverlays: [                     [\"Arrow\", { location: 0.8}],                     [\"Label\", {                      label:\".\",                         location: 0.5,                         id: \"label\",                         cssClass: \"aLabel\"                     }]                 ]         });");
		sb.append("var connectorPaintStyle = {                lineWidth: 5,               strokeStyle: \"#deea18\",               joinstyle: \"round\"            },          connectorHoverStyle = {                 lineWidth: 5,                 strokeStyle: \"blue\"             };");
		sb.append(buildConnectCode(startNode, nodeList));
		sb.append("});");
		sb.append(buildDragCode(startNode, nodeList));
		sb.append(
				"</script><style>body {  background-color: white;    font-size: 90%; }  .code {  background-color: #e4eeee;  border: 1px solid black;    margin: 1em;    padding: 0.5em;     font-family: courier; }  .section {     border-bottom: 1px dotted black;    padding: 1em;   font-family: helvetica;     background-color: white;    color: #333; }  .menu {     position: fixed;    right: 10em;    top: 1em;   background-color: white;    padding: 0.3em;     opacity: 0.8;   filter: alpha(opacity = 80);    box-shadow: 2px 2px 19px #aaa;  -o-box-shadow: 2px 2px 19px #aaa;   -webkit-box-shadow: 2px 2px 19px #aaa;  -moz-box-shadow: 2px 2px 19px #aaa; }  a {  text-decoration: none;  color: #05f;    font-weight: bold;  font-family: helvetica; }  a:hover {    text-decoration: underline; }  .window {    border: 1px solid #afd0e6;  box-shadow: 2px 2px 19px #aaa;  -o-box-shadow: 2px 2px 19px #aaa;   -webkit-box-shadow: 2px 2px 19px #aaa;  -moz-box-shadow: 2px 2px 19px #aaa;     -moz-border-radius: 0.5em;  border-radius: 0.5em;   opacity: 0.8;   filter: alpha(opacity = 80);    width: ")
				.append(getNodeText(xmlDocument.selectSingleNode("chart/basicInfo"), "frameWidth"))
				.append("em;    height: ")
				.append(getNodeText(xmlDocument.selectSingleNode("chart/basicInfo"), "frameHeight"))
				.append("em;    text-align: center;     z-index: 20;    position: absolute;     background-color: #eeeeef;  color: #050536;     font-family: helvetica;     padding: 0.5em;     font-size: 0.9em;   text-align:left; }  .window:hover {     border: 1px solid #123456;  box-shadow: 2px 2px 19px #444;  -o-box-shadow: 2px 2px 19px #444;   -webkit-box-shadow: 2px 2px 19px #444;  -moz-box-shadow: 2px 2px 19px #444;     opacity: 0.6;   filter: alpha(opacity = 60); }  ._chart_connector {   z-index: 4;     cursor: pointer; }  ._chart_endpoint {    z-index: 21;    cursor: pointer; }  .hl {   border: 3px solid red; } .td_title{ height:10px; font-weight:bold;color:#800080;text-shadow: 1px 1px 1px #999;} .td_status{ height:10px; font-weight:bold;color:#800080;text-shadow: 1px 1px 1px #999;font-style:italic;} .phone{font-size:11px;} .name{font-weight:bold} .time {font-size: 10px;}");
		sb.append(buildPosition(startNode, nodeList, xmlDocument));
		sb.append("</style></head><body><div id=\"chart\">");
		sb.append("<div id=\"").append(startId).append("\" class=\"window\" ondblclick=\"").append(getNodeText(xmlDocument.selectSingleNode("chart/start"), "onclick")).append("\"><table><tr><td class=\"td_title\">").append(getNodeText(startNode, "title")).append("</td></tr><tr><td>").append(getNodeText(startNode, "user_name")).append("</td></tr><tr><td><font class=\"time\">").append(getNodeText(startNode, "creator")).append("(").append(getNodeText(startNode, "create_time"))
				.append(")</font></td></tr></table></div>");
		for (Node node : nodeList) {
			sb.append("<div id=\"").append(getNodeText(node, "node_id")).append("\" class=\"window\" ondblclick=\"").append(getNodeText(node, "onclick")).append("\"><table><tr><td><font class=\"name\">").append(getNodeText(node, "operator")).append("</font>").append(getNodeText(node, "phone").length() > 0 ? ("（<font class=\"phone\">" + getNodeText(node, "phone") + "</font>）") : "").append("</td></tr><tr><td class=\"td_status\">").append(getNodeText(node, "status"))
					.append("</td></tr><tr><td><font class=\"time\">").append(getNodeText(node, "create_time"));
			if (getNodeText(node, "end_time") != null && getNodeText(node, "end_time").length() > 0) {
				sb.append("至").append(getNodeText(node, "end_time"));
			} else if (getNodeText(node, "remaining_time") != null && getNodeText(node, "remaining_time").length() > 0) {
				sb.append("(剩").append(getNodeText(node, "remaining_time")).append(")");
			}
			sb.append("</font></td></tr></table></div>");
		}

		sb.append("</div></body></html>");
		return sb.toString();
	}

	private static String buildPosition(Node startNode, List<Node> nodeList, Document xmlDocument) {
		StringBuilder sb = new StringBuilder(256);
		Map<String, Node> nodeMap = new HashMap<String, Node>();
		String startId = getNodeText(startNode, "id");
		nodeMap.put("01_" + startId, startNode);
		String keyNumId = null;
		Map<String, Node> tempNodeMap = null;
		for (Node node : nodeList) {
			if (("," + getNodeText(node, "parent_id") + ",").indexOf("," + startId + ",") != -1) {
				nodeMap.put("02_" + getNodeText(node, "node_id"), node);
			}
			for (Node sonNode : nodeList) {
				if (("," + getNodeText(sonNode, "parent_id") + ",").indexOf("," + getNodeText(node, "node_id") + ",") != -1) {
					tempNodeMap = new HashMap<String, Node>();
					for (Entry<String, Node> entry : nodeMap.entrySet()) {
						tempNodeMap.put(entry.getKey(), entry.getValue());
					}
					for (Entry<String, Node> entry : tempNodeMap.entrySet()) {
						keyNumId = entry.getKey();
						if (keyNumId != null && ("," + getNodeText(sonNode, "parent_id") + ",").indexOf("," + keyNumId.substring(keyNumId.indexOf("_") + 1) + ",") != -1) {
							int currentLevel = Integer.parseInt(keyNumId.substring(0, keyNumId.indexOf("_")));
							nodeMap.put(((currentLevel + 1) < 10 ? ("0" + (currentLevel + 1)) : (currentLevel + 1)) + "_" + getNodeText(sonNode, "node_id"), sonNode);
						}
					}
				}
			}
		}
		int basicTop = Integer.parseInt(getNodeText(xmlDocument.selectSingleNode("chart/basicInfo"), "topSpace")), basicLeft = Integer.parseInt(getNodeText(xmlDocument.selectSingleNode("chart/basicInfo"), "leftSpace"));
		int level = 1;
		tempNodeMap = new HashMap<String, Node>();
		for (Entry<String, Node> entry : nodeMap.entrySet()) {
			tempNodeMap.put(entry.getKey(), entry.getValue());
		}
		for (Entry<String, Node> entry : tempNodeMap.entrySet()) {
			keyNumId = entry.getKey();
			int currentLevel = Integer.parseInt(keyNumId.substring(0, keyNumId.indexOf("_")));
			String nodeId = keyNumId.substring(keyNumId.indexOf("_") + 1);
			for (int i = 1; i < currentLevel; i++) {
				nodeMap.keySet().remove(i + "_" + nodeId);
			}
		}
		List<String[]> nodePositionList = new ArrayList<String[]>();
		TreeMap<String, Node> treemap = new TreeMap<String, Node>(nodeMap);
		String nodeKey = null;
		int left = 0;
		String[] nodePosition = null;
		for (Iterator<String> iter = treemap.keySet().iterator(); iter.hasNext();) {
			nodeKey = iter.next();
			if (nodeKey != null && nodeKey.indexOf("_") != -1 && nodeKey.length() > 3) {
				level = Integer.parseInt(nodeKey.substring(0, nodeKey.indexOf("_")));
				if (level == 1) {
					left = basicLeft;
				} else {
					for (int i = 0; i < nodePositionList.size(); i++) {
						if (treemap.get(nodeKey) != null && ("," + getNodeText(treemap.get(nodeKey), "parent_id") + ",").indexOf("," + nodePositionList.get(i)[0] + ",") != -1) {
							nodePositionList.get(i)[3] = (Integer.parseInt(nodePositionList.get(i)[3]) + 1) + "";
						}
					}
				}
				nodePosition = new String[] { nodeKey.substring(nodeKey.substring(0, nodeKey.indexOf("_")).length() + 1), (basicTop + ((level - 1) * basicTop * 2)) + "", left + "", 0 + "" };
				nodePositionList.add(nodePosition);
			}
		}
		StringBuilder allNodePositionSb = new StringBuilder(128);
		List<Integer> postitionList = new ArrayList<Integer>();
		int lastLevel = 0;
		for (Iterator<String> iter = treemap.keySet().iterator(); iter.hasNext();) {
			nodeKey = iter.next();
			if (nodeKey != null && nodeKey.indexOf("_") != -1 && nodeKey.length() > 3) {
				level = Integer.parseInt(nodeKey.substring(0, nodeKey.indexOf("_")));
				if (level != lastLevel) {
					postitionList = new ArrayList<Integer>();
					allNodePositionSb = new StringBuilder(128);
				}
				lastLevel = level;
				if (level != 1) {
					for (int i = 0; i < nodePositionList.size(); i++) {
						if (treemap.get(nodeKey) != null && ("," + getNodeText(treemap.get(nodeKey), "parent_id") + ",").indexOf("," + nodePositionList.get(i)[0] + ",") != -1) {
							if (Integer.parseInt(nodePositionList.get(i)[3]) == 1) {
								for (int j = 0; j < nodePositionList.size(); j++) {
									if (nodeKey.substring(nodeKey.substring(0, nodeKey.indexOf("_")).length()).equals(nodePositionList.get(j)[0])) {
										nodePositionList.get(j)[2] = nodePositionList.get(i)[2];
										allNodePositionSb.append(",").append(nodePositionList.get(j)[1]).append("_").append(nodePositionList.get(j)[2]).append(",");
										break;
									}
								}
							} else if (Integer.parseInt(nodePositionList.get(i)[3]) > 1) {
								for (int j = 0; j < nodePositionList.size(); j++) {
									if (nodeKey.substring(nodeKey.indexOf("_") + 1).equals(nodePositionList.get(j)[0])) {
										if (allNodePositionSb.length() > 0) {
											String temp = allNodePositionSb.toString();
											while (temp.indexOf("," + nodePositionList.get(j)[1] + "_") != -1) {
												temp = temp.substring(temp.indexOf("," + nodePositionList.get(j)[1] + "_") + ("," + nodePositionList.get(j)[1] + "_").length());
												postitionList.add(Integer.parseInt(temp.substring(0, temp.indexOf(","))));
											}
										}
										int maxPosition = postitionList.size() != 0 ? Collections.max(postitionList) : 0;
										if (maxPosition == 0) {
											nodePositionList.get(j)[2] = (Integer.parseInt(nodePositionList.get(i)[2]) - basicLeft / 2) + "";
										} else {
											if (Integer.parseInt(nodePositionList.get(i)[3]) == 2) {
												nodePositionList.get(j)[2] = (Integer.parseInt(nodePositionList.get(i)[2]) + basicLeft / 2) + "";
											} else {
												nodePositionList.get(j)[2] = maxPosition + basicLeft / 2 + "";
											}
										}
										allNodePositionSb.append(",").append(nodePositionList.get(j)[1]).append("_").append(nodePositionList.get(j)[2]).append(",");
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < nodePositionList.size(); i++) {
			sb.append("#").append(nodePositionList.get(i)[0]).append("{top: " + nodePositionList.get(i)[1] + "em; left: " + nodePositionList.get(i)[2] + "em;}");
		}
		return sb.toString();
	}

	private static String buildDragCode(Node startNode, List<Node> nodeList) {
		StringBuilder sb = new StringBuilder(256);
		sb.append("$(function(){  var ").append(getNodeText(startNode, "id")).append("_dragging = false;  var ").append(getNodeText(startNode, "id")).append("_iX, ").append(getNodeText(startNode, "id")).append("_iY; ");
		sb.append("$(\"#").append(getNodeText(startNode, "id")).append("\").mousedown(function(e) {").append(getNodeText(startNode, "id")).append("_dragging = true;").append(getNodeText(startNode, "id")).append("_iX = e.clientX - this.offsetLeft;").append(getNodeText(startNode, "id")).append("_iY = e.clientY - this.offsetTop;this.setCapture && this.setCapture();return false;});");
		for (Node node : nodeList) {
			sb.append(" var ").append(getNodeText(node, "node_id")).append("_dragging = false;  var ").append(getNodeText(node, "node_id")).append("_iX, ").append(getNodeText(node, "node_id")).append("_iY; ");
			sb.append("$(\"#").append(getNodeText(node, "node_id")).append("\").mousedown(function(e) {").append(getNodeText(node, "node_id")).append("_dragging = true;").append(getNodeText(node, "node_id")).append("_iX = e.clientX - this.offsetLeft;").append(getNodeText(node, "node_id")).append("_iY = e.clientY - this.offsetTop;this.setCapture && this.setCapture();return false;});");

		}
		sb.append("document.onmousemove = function(e) {if (").append(getNodeText(startNode, "id")).append("_dragging) {var e = e || window.event;var ").append(getNodeText(startNode, "id")).append("_oX = e.clientX - ").append(getNodeText(startNode, "id")).append("_iX;var ").append(getNodeText(startNode, "id")).append("_oY = e.clientY - ").append(getNodeText(startNode, "id")).append("_iY;");
		sb.append("$(\"#").append(getNodeText(startNode, "id")).append("\").css({\"left\":").append(getNodeText(startNode, "id")).append("_oX + \"px\", \"top\":").append(getNodeText(startNode, "id")).append("_oY + \"px\"});return false;};");
		for (Node node : nodeList) {
			sb.append(" if (").append(getNodeText(node, "node_id")).append("_dragging) {var e = e || window.event;var ").append(getNodeText(node, "node_id")).append("_oX = e.clientX - ").append(getNodeText(node, "node_id")).append("_iX;var ").append(getNodeText(node, "node_id")).append("_oY = e.clientY - ").append(getNodeText(node, "node_id")).append("_iY;");
			sb.append("$(\"#").append(getNodeText(node, "node_id")).append("\").css({\"left\":").append(getNodeText(node, "node_id")).append("_oX + \"px\", \"top\":").append(getNodeText(node, "node_id")).append("_oY + \"px\"}); return false;};");
		}
		sb.append("};");
		sb.append("$(document).mouseup(function(e) {").append(getNodeText(startNode, "id")).append("_dragging = false;e.cancelBubble = true;");
		sb.append("$(\"#").append(getNodeText(startNode, "id")).append("\")[0].releaseCapture();chart.repaint(\"").append(getNodeText(startNode, "id")).append("\");");
		for (Node node : nodeList) {
			sb.append(getNodeText(node, "node_id")).append("_dragging = false;");
			sb.append("$(\"#").append(getNodeText(node, "node_id")).append("\")[0].releaseCapture();chart.repaint(\"").append(getNodeText(node, "node_id")).append("\");");
		}
		sb.append("}) })");

		return sb.toString();
	}

	public static String getNodeText(Node node, String name) {
		if (node != null && name != null && node.selectSingleNode(name) != null && node.selectSingleNode(name).getText() != null) {
			return node.selectSingleNode(name).getText();
		} else {
			return "";
		}
	}

	private static String buildConnectCode(Node startNode, List<Node> nodeList) {
		StringBuilder sb = new StringBuilder(256);
		String startId = getNodeText(startNode, "id");
		for (Node node : nodeList) {
			if (("," + getNodeText(node, "parent_id") + ",").indexOf("," + startId + ",") != -1) {
				sb.append("chart.connect({source : \"").append(startId).append("\",target : \"").append(getNodeText(node, "node_id")).append("\",connector:\"Straight\",paintStyle:connectorPaintStyle,hoverPaintStyle:connectorHoverStyle});");
			}
			for (Node sonNode : nodeList) {
				if (("," + getNodeText(sonNode, "parent_id") + ",").indexOf("," + getNodeText(node, "node_id") + ",") != -1) {
					sb.append("chart.connect({source : \"").append(getNodeText(node, "node_id")).append("\",target : \"").append(getNodeText(sonNode, "node_id")).append("\",connector:\"Straight\",paintStyle:connectorPaintStyle,hoverPaintStyle:connectorHoverStyle});");
				}
			}
		}
		return sb.toString();
	}

	private static String translateItemCodeToCh(String dictionaryCode, String itemCode) {
		ISysDicService sysDicService = SpringContextUtil.getBean("sysDicService", ISysDicService.class);
		SysDicConfigExample dicEx = new SysDicConfigExample();
		dicEx.createCriteria().andDictionaryCodeEqualTo(dictionaryCode);
		List<SysDicConfig> dicList = sysDicService.selectByExample(dicEx);
		if (dicList != null && dicList.size() == 1) {
			SysDicItemExample itemEX = new SysDicItemExample();
			itemEX.createCriteria().andDictionaryIdEqualTo(dicList.get(0).getDictionaryId()).andItemCodeEqualTo(itemCode);
			List<SysDicItem> itemList = sysDicService.selectByExample(itemEX);
			if (itemList != null && itemList.size() == 1) {
				return itemList.get(0).getItemValue();
			}
		}
		return "";
	}

}
