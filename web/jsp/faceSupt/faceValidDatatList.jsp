<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="allForm1" id="allForm1">
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
									出入参
								</td>
								<td style="word-break: keep-all;">
									XML节点名
								</td>
								<td style="word-break: keep-all;">
									是否可为空
								</td>
								<td style="word-break: keep-all;">
									数据类型
								</td>
								<td style="word-break: keep-all;">
									数据长度
								</td>
								<td style="word-break: keep-all;">
									格式
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="validid" value="${obj.checkId}"/>
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
										<c:if test="${'IN' eq obj.returnAppid}">
										入参
									  </c:if>
									   <c:if test="${'OUT' eq obj.returnAppid}">
										出参
									  </c:if>
									</td>
									<td align="center">
										${obj.fieldName}
									</td>
									<td align="center">
									    <c:if test="${'Y' eq obj.isNull}">
										是
									  </c:if>
									   <c:if test="${'N' eq obj.isNull}">
										否
									  </c:if>										
									</td>
									<td align="center">
									  <c:if test="${'static' eq obj.dataType}">
										静态数据
									  </c:if>
									   <c:if test="${'int' eq obj.dataType}">
										整型
									  </c:if>										
									</td>
									<td align="center">
									    ${obj.fieldLegth}
									</td>
									<td align="center">
									    ${obj.format}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
               </form>
</body>
</html>