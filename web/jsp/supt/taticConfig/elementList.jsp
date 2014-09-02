<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="queryListForm">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									元素名称
								</td>
								<td style="word-break: keep-all;">
									元素编码
								</td>
								<td style="word-break: keep-all;">
									来源类型
								</td>
								<td style="word-break: keep-all;">
									对应静态数据编码
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.elementid}" id="${obj.elementname}"/>
										<img  alt="查看详情" onclick="getDetail('${obj.elementid}','${obj.elementname}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${obj.elementname}
									</td>
									<td align="center">
										${obj.elementcode}
									</td>
									<td align="center">
										<c:if test="${'TEXT' eq obj.sourcetype}">普通文本</c:if>
										<c:if test="${'SELECT' eq obj.sourcetype}">下拉</c:if>
										<c:if test="${'TREE' eq obj.sourcetype}">树形</c:if>
									</td>
									<td align="center">
										${obj.sqlstr}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
 </form>
</body>
</html>