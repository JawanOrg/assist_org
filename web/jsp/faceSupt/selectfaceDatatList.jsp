<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="allForm" id="allForm">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
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
									接口编码
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
										<input type="checkbox" name="checkid" value="${obj.cimpFaceId}|${obj.cimpName}"/>
									</td>
									<td align="center">
										${obj.applicationName}
									</td>
									<td align="center">
										${obj.cimpName}
									</td>
									<td align="center">
										${obj.methodName}
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
               </form>
</body>
</html>