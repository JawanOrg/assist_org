<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<span id="sumFault" name="sumFault" style="display: none" value="${requestScope.sumFault}"></span>
<table class=table id=powergrid style="FONT-SIZE: 13px" pcolor="#BCC8F5"
	 cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box>
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">
				系统名称
			</td>
			<td style="word-break: keep-all;">
				接口编码
			</td>
			<td style="word-break: keep-all;">
				接口名称
			</td>
			<td style="word-break: keep-all;">
				数量
			</td>
			<td style="word-break: keep-all;">
				上次调用时间
			</td>
		</tr>
		<c:forEach items="${requestScope.ajaxPage}" var="objData"
			varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center">
					${objData.applicationName}
				</td>
				<td align="center">
					${objData.methodName}
				</td>
				<td align="center">
					${objData.cimpName}
				</td>
				<td align="center">
					<a href="###" style="text-decoration: underline; color: #FF0000">
						<div onclick="showLogEventDetail ('${objData.applicationId}','${objData.methodName}','${requestScope.createdBegin}','${requestScope.createdEnd}');">
							${objData.logEventCount}
						</div> </a>
				</td>
				<td align="center">
					<fmt:formatDate value="${objData.lastCreated}"
						pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<blocimp:pageControl formId="commonQueryForm"
	jsFunction="initqueryResultList" declareName="ajaxPage" />