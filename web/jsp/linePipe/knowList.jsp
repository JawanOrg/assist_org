<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>

<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">���</td>
			<td style="word-break: keep-all;">����</td>
			<td style="word-break: keep-all;">ʶ�𷽷�</td>
			<td style="word-break: keep-all;">����ʱ��</td>
			<td style="word-break: keep-all;">����</td>
		</tr>
		<c:forEach items="${requestScope.linePipeList}" var="obj" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" width="5%">${n.index + 1}</td>
				<td align="center" width="15%">${obj.theTitle}</td>
				<td align="left" width="52%">${obj.knowContent}</td>
				<td align="center" width="15%"><fmt:formatDate
						value="${obj.createTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td align="center" width="13%"><input type="button"
											class="btn btn-default btn-sm" value="�༭(M)" accesskey="M"
											onclick="modifyKnow('${obj.contentId}')" /> <input type="button"
											class="btn btn-default btn-sm" value="ɾ��(D)" accesskey="D"
											onclick="deleteKnow('${obj.contentId}')" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<assist:pageControl formId="queryForm" jsFunction="initQueryResultList"
	declareName="linePipeList" />
