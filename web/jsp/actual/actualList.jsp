<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>

<table class=table id=powergrid style="FONT-SIZE: 13px" cellspacing=0
	bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">发/收</td>
			<td style="word-break: keep-all;">地址</td>
			<td style="word-break: keep-all;">描述及通知内容</td>
			<td style="word-break: keep-all;">创建单位<img src="/images/normal/arrowheadRight.png" width='16' length='16'>被通知线路单位</td>
			<td style="word-break: keep-all;">创建时间</td>
			<td style="word-break: keep-all;">操作</td>
		</tr>
		<c:forEach items="${requestScope.actualList}" var="obj" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center" width="5%">
					<c:if test="${requestScope.currentUnitId==obj.createDept}">
						<img src="/images/normal/messageOut.png" width='30' length='30'>
					</c:if>
					<c:if test="${fn:indexOf(obj.noticeObjectNames, requestScope.currentUnitName)!=-1}">
						<img src="/images/normal/messageIn.jpg" width='30' length='30'>
					</c:if>
				</td>
				<td align="center" width="15%">${obj.address}</td>
				<td align="left" width="32%" title="${obj.actualContent}">${fn:length(obj.actualContent)>50?fn:substring(obj.actualContent,0,50):obj.actualContent}</td>
				<td align="left" width="30%" title="${obj.noticeObjectNames}"><assist:sysOrganization objectType='U' objectId='${obj.createDept}' /><img src="/images/normal/arrowheadRight.png" width='20' length='16'>${fn:length(obj.noticeObjectNames)>50?fn:substring(obj.noticeObjectNames,0,50):obj.noticeObjectNames}</td>
				<td align="center" width="15%"><fmt:formatDate
						value="${obj.createTime}" type="both"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td align="center" width="8%"><!--input type="button"
											class="btn btn-default btn-sm" value="编辑(M)" accesskey="M"
											onclick="modifyActual('${obj.billId}')" /--> <input type="button"
											class="btn btn-default btn-sm" value="删除(D)" accesskey="D"
											onclick="deleteActual('${obj.billId}')" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<assist:pageControl formId="queryForm" jsFunction="initQueryResultList"
	declareName="actualList" />
