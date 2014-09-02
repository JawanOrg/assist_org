<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
	cellspacing="0" bordercolordark=#ffffff cellpadding="3" width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									系统名称
								</td>
								<td style="word-break: keep-all;">
									接口名称
								</td>
								<td style="word-break: keep-all;">
									转入接口编码
								</td>
								<td style="word-break: keep-all;">
									转出接口编码
								</td>
								<td style="word-break: keep-all;">
									请求参数
								</td>
								<td style="word-break: keep-all;">
									是否有效
								</td>
								<td style="word-break: keep-all;">
									出入参
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.cimpFaceId}"/>
									</td>
									<td align="left">
										${obj.applicationName}
									</td>
									<td align="left">
										${obj.cimpName}
									</td>
									<td align="center">
										${obj.methodName}
									</td>
									<td align="center">
										${obj.exetMethodname}
									</td>
									<td align="center">
										${obj.paramater}
									</td>
									<td align="center">
									  <c:if test="${'Y' eq obj.isValid}">
										是
									  </c:if>
									   <c:if test="${'N' eq obj.isValid}">
										否
									  </c:if>
									</td>
									<td align="center">
									  <c:if test="${'IN' eq obj.returnAppid}">
										入参
									  </c:if>
									   <c:if test="${'OUT' eq obj.returnAppid}">
										出参
									  </c:if>
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>