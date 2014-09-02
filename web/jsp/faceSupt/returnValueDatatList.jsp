<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/jsp/taglib.jsp"%>
<form name="allForm4" id="allForm4">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
                     <tr class="titletr">
								<td style="word-break: keep-all;">

								</td>
								<td style="word-break: keep-all;">
									动作名称
								</td>
								<td style="word-break: keep-all;">
									动作路径
								</td>
								<td style="word-break: keep-all;">
									动作取值上下行
								</td>								
								<td style="word-break: keep-all;">
									更改字段名
								</td>
								<td style="word-break: keep-all;">
									字段路径
								</td>
								<td style="word-break: keep-all;">
									字段取值上下行
								</td>								
								<td style="word-break: keep-all;">
									主键名
								</td>
								<td style="word-break: keep-all;">
									主键路径
								</td>
								<td style="word-break: keep-all;">
									主键取值上下行
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="returnValidId" value="${obj.returnValidId}"/>
									</td>									
									<td align="center" >
										${obj.operName}
									</td>
									<td align="center">
									   ${obj.opernamePath}
									</td>									
									<td align="center">
									   <c:if test="${'up' eq obj.operpathFrom}">
										上行
									  </c:if>
									   <c:if test="${'down' eq obj.operpathFrom}">
										下行
									  </c:if>									    
									</td>
									<td align="center">
									    ${obj.fieldName}
									</td>
									<td align="center">
									    ${obj.fieldPath}
									</td>
									<td align="center">
									   <c:if test="${'up' eq obj.fieldpathFrom}">
										上行
									  </c:if>
									   <c:if test="${'down' eq obj.fieldpathFrom}">
										下行
									  </c:if>
									   
									</td>
									<td align="center">
									    ${obj.prikeyName}
									</td>
									<td align="center">
									    ${obj.prikeyPath}
									</td>
									<td align="center">
									<c:if test="${'up' eq obj.prikeyFrom}">
										上行
									  </c:if>
									   <c:if test="${'down' eq obj.prikeyFrom}">
										下行
									  </c:if>
									   
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
               </form>