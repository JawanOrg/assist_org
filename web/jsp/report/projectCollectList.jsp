<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>

<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">���</td>
			<td style="word-break: keep-all;">ʩ����λ</td>
			<td style="word-break: keep-all;">ʩ�����</td>
			<td style="word-break: keep-all;">״̬</td>
			<td style="word-break: keep-all;">����</td>
			<td style="word-break: keep-all;">����</td>
			<td style="word-break: keep-all;">����</td>
			<td style="word-break: keep-all;">��·</td>
			<td style="word-break: keep-all;">�ƻ�����ʱ��</td>
			<td style="word-break: keep-all;">�ƻ��깤ʱ��</td>
		</tr>
		<c:forEach items="${requestScope.trendsList}" var="obj" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" width="8%"><a href="#"
					onclick="getDetail('${obj.billId}','${obj.billSn}','${sessionScope.currentUser.userId}')"><span
						style="color:blue;">${obj.billSn}</span></a></td>
				<td align="center" width="8%">
					<assist:sysOrganization objectId='${obj.createDept}' objectType='U'/>
				</td>
				<td align="center" width="8%">
					<assist:sysDicDisName itemCodeIn="${obj.repairType}" dictionaryCodeIn="release_repair_type" /></td>
				<td align="center" width="8%"><assist:sysDicDisName
						itemCodeIn="${obj.billStatus}" dictionaryCodeIn="release_status" /></td>
				<td align="center" width="15%">${obj.theTitle}</td>
				<td align="center" width="8%">${obj.city}</td>
				<td align="center" width="8%">${obj.community}</td>
				<td align="center" width="10%">${obj.road}</td>
				<td align="center" width="14%"><fmt:formatDate
						value="${obj.repairTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td align="center" width="14%"><fmt:formatDate
						value="${obj.repairEndTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<assist:pageControl formId="queryForm" jsFunction="initQueryResultList"
	declareName="trendsList" />
