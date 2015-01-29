<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>

<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">序号</td>
			<td style="word-break: keep-all;">地址</td>
			<td style="word-break: keep-all;">描述</td>
			<td style="word-break: keep-all;">创建时间</td>
			<td style="word-break: keep-all;">操作</td>
		</tr>
		<c:forEach items="${requestScope.actualList}" var="obj" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" width="5%">${n.index + 1}</td>
				<td align="center" width="15%">${obj.address}</td>
				<td align="left" width="52%">${fn:length(obj.actualContent)>50?fn:substring(obj.actualContent,0,50):obj.actualContent}</td>
				<td align="center" width="15%"><fmt:formatDate
						value="${obj.createTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td align="center" width="13%"><input type="button"
											class="btn btn-default btn-sm" value="编辑(M)" accesskey="M"
											onclick="modifyActual('${obj.billId}')" /> <input type="button"
											class="btn btn-default btn-sm" value="删除(D)" accesskey="D"
											onclick="deleteActual('${obj.billId}')" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<assist:pageControl formId="queryForm" jsFunction="initQueryResultList"
	declareName="actualList" />
