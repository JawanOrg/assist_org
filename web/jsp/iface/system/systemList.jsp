<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@ include file='/jsp/taglib.jsp'%>
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
				系统名称
			</td>
			<td style="word-break: keep-all;">
				系统编码
			</td>
		</tr>
		<c:forEach items="${requestScope.ifaceConfigSystemList}" var="objData" varStatus="n">
		<tr align="center" bgcolor="" style="cursor: 'hand'">
			<td align="center" style="width:3%">
				<input type="radio" name="checkid" value="${objData.applicationId}">
			</td>
			<td align="center" style="width:3%">
				<img  alt="查看详情" onclick="editIfaceConfigSystem('${objData.applicationId}','${objData.applicationName}','${objData.applicationSn}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
			</td>
			<td align="center">
				${objData.applicationName}
			</td>
			<td align="center">
				${objData.applicationSn}
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>