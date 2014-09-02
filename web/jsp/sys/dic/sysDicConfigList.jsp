<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">选择</td>
			<td style="word-break: keep-all;">字典条目</td>
			<td style="word-break: keep-all;">数据字典名称</td>
			<td style="word-break: keep-all;">数据字典代号</td>
			<td style="word-break: keep-all;">备注</td>
		</tr>
		<c:forEach items="${requestScope.ajaxPage}" var="objData"
			varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" style="width:3%"><input type="checkbox"
					name="checkid" value="${objData.dictionaryId}" /></td>
				<td align="center" style="width:5%"><img alt="查看详情"
					onclick="toSysDicItemRelateList('${objData.dictionaryId}');"
					src="/images/main/icon_search01.gif" border=0
					style="cursor: pointer"></td>
				<td align="center">${objData.dictionaryName}</td>
				<td align="center">${objData.dictionaryCode}</td>
				<td align="center">${objData.remark}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
