<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>

<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">编号</td>
			<td style="word-break: keep-all;">状态</td>
			<td style="word-break: keep-all;">标题</td>
			<td style="word-break: keep-all;">城区</td>
			<td style="word-break: keep-all;">社区</td>
			<td style="word-break: keep-all;">道路</td>
			<td style="word-break: keep-all;">现场联系人</td>
			<td style="word-break: keep-all;">现场联系人电话</td>
			<td style="word-break: keep-all;">创建时间</td>
		</tr>
		<c:forEach items="${requestScope.trendsList}" var="obj" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" width="6%"><a href="#"
					onclick="getDetail('${obj.billId}','${obj.billSn}','${sessionScope.currentUser.userId}')"><span
						style="color:blue;">${obj.billSn}</span></a></td>
				<td align="center" width="4%"><assist:sysDicDisName
						itemCodeIn="${obj.billStatus}" dictionaryCodeIn="release_status" /></td>
				<td align="center" width="15%">${obj.theTitle}</td>
				<td align="center" width="10%">${obj.city}</td>
				<td align="center" width="10%">${obj.community}</td>
				<td align="center" width="10%">${obj.road}</td>
				<td align="center" width="8%">${obj.scenePersonName}</td>
				<td align="center" width="8%">${obj.scenePersonPhone}</td>
				<td align="center" width="14%"><fmt:formatDate
						value="${obj.createTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<assist:pageControl formId="queryForm" jsFunction="initQueryResultList"
	declareName="trendsList" />
