<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ page import="com.free.assist.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									详情
								</td>
								<td style="word-break: keep-all;">
									系统名称
								</td>
								<td style="word-break: keep-all;">
									日志类型
								</td>
								<td style="word-break: keep-all;">
									接口编码
								</td>
								<td style="word-break: keep-all;">
									日志内容
								</td>
								<!-- 
								<td style="word-break: keep-all;">
									工单内容
								</td>
								 -->
								<td style="word-break: keep-all;">
									创建日期
								</td>
							</tr>
							<%
							   		String color = "";
							   		String relateId_out = "";
							   		List list = new ArrayList();
							   		List<Map> mapList = new ArrayList<Map>();
							   		int i=0;
		                       %>
		                       <c:forEach items="${requestScope.ifaceLogRepositoryMixedWithBLOBsList}" var="objData" varStatus="n">
									<c:set var="relateId_test" scope="request" value="${objData.relateId}" />
									<%
										String relateId_test = (String)(StringUtil.nullObject2String(request.getAttribute("relateId_test")));
										if(i==0) {
											relateId_out = relateId_test;
											list.add(relateId_test);
											i++;
										}
										if(!relateId_out.equals(relateId_test)) {
											list.add(relateId_test);
											relateId_out = relateId_test;
										}
									%>
							   </c:forEach>
							   <%
							   		if(list!=null && list.size()>0) {
							   			for(int j=0;j<list.size();j++){
							   				Map map = new HashMap();
							   				int a = (j+1)%2;
							   				if(a == 1){
							   					map.put(list.get(j),"#FFFFFF");
							   					mapList.add(map);
							   				} else {
							   					map.put(list.get(j),"#FFEEDD");
							   					mapList.add(map);
							   				}
							   			}
							   		}
							   %>
							<c:forEach items="${requestScope.ifaceLogRepositoryMixedWithBLOBsList}" var="objData" varStatus="n">
									<c:set var="relateId" scope="request" value="${objData.relateId}" />
									<%
										String relateId = (String)(StringUtil.nullObject2String(request.getAttribute("relateId")));
										if(mapList!=null && mapList.size()>0) {
											for(int k=0;k<mapList.size();k++) {
												if(mapList.get(k).containsKey(relateId)) {
													color = (String)mapList.get(k).get(relateId);
													break;
												}
											}
										}
									%>
									<tr align="center" style="cursor: 'hand'">
										<td align="center">
											<img  alt="查看详情" onclick="openIfaceLogRepositoryMWBDetail('${objData.applicationId}','${objData.repositoryId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
										</td>
										<td align="center" bgcolor="<%=color%>">
											${objData.applicationName}
										</td>
										<td align="center" bgcolor="<%=color%>">
											<c:if test="${objData.traceLevel=='TRACE'}">
												正常
											</c:if>
											<c:if test="${objData.traceLevel=='ERROR'}">
												异常
											</c:if>
										</td>
										<td align="center" bgcolor="<%=color%>">
											<blocimp:showMethod methodId="${objData.methodName}"/>
										</td>
										<td align="center" bgcolor="<%=color%>">
											${objData.traceText}
										</td>
										<!-- 注解掉的原因是数据量太大，造成内存溢出
										<td align="center" bgcolor="<%=color%>">
											<c:out value="${objData.xmlDocument}" escapeXml="true"></c:out>
										</td>
										 -->
										<td align="center" bgcolor="<%=color%>">
											<fmt:formatDate type="both" value="${objData.createDate}" />
										</td>
									</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ifaceLogRepositoryMixedWithBLOBsList" />