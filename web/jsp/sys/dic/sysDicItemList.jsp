<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<%@ page import="com.free.assist.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									详情
								</td>
								<td style="word-break: keep-all;">
									数据字典名称
								</td>
								<td style="word-break: keep-all;">
									数据字典条目名称
								</td>
								<td style="word-break: keep-all;">
									数据字典条目代号
								</td>
								<td style="word-break: keep-all;">
									数据字典条目备注
								</td>
							</tr>
							<%
								String dictionaryName = "";
							%>
							<c:forEach items="${requestScope.ajaxPage}" var="objData" varStatus="n">
								<c:set var="dictionaryId" scope="request" value="${objData.dictionaryId}" />
								<% 
									String dictionaryId = (String)(StringUtil.nullObject2String(request.getAttribute("dictionaryId")));
									List list = (List)request.getAttribute("idAndNameList");
									for(int i=0;i<list.size();i++) {
										Map map = (Map)list.get(i);
										if(map.get(dictionaryId)!=null && !"".equals(map.get(dictionaryId))){
											dictionaryName = (String)map.get(dictionaryId);
											break;
										}
									}
								%>
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center" style="width:3%">
										<input type="checkbox" name="checkid" value="${objData.itemId}"/>
									</td>
									<td align="center" style="width:5%">
										<img  alt="查看详情" onclick="toSysDicItemEdit('${objData.itemId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										<%= dictionaryName %>
									</td>
									<td align="center">
										${objData.itemValue}
									</td>
									<td align="center">
										${objData.itemCode}
									</td>
									<td align="center">
										${objData.itemDesc}
									</td>
								</tr>
								<% dictionaryName = ""; %>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ajaxPage" />