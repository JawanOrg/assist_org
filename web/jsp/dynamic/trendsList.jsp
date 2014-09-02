<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<table class="table" id="powergrid" style="FONT-SIZE: 13px"
	cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=0 frame=box pcolor="#BCC8F5">
	<tr class="titletr" height="15">
		<td style="word-break: keep-all;FONT-SIZE: 12px" width="30%">标题</td>
		<td style="word-break: keep-all;FONT-SIZE: 12px" width="70%">城区/社区/道路/门牌（施工时间）</td>
	</tr>
	<c:forEach items="${requestScope.trendsList}" var="obj" varStatus="n">
		<tr bgcolor="" style="cursor: 'hand'">
			<td align="left" title="动态编号：${obj.billSn}"><a herf="#"
				onclick="getDetail('${obj.billId}','${obj.theTitle}')">${obj.theTitle}</a></td>
			<td align="left"><assist:sysDicDisName
					itemCodeIn="${obj.city}" dictionaryCodeIn="release_city" />/<assist:sysDicDisName
					itemCodeIn="${obj.community}" dictionaryCodeIn="release_community" />/${obj.road}/${obj.numberPlate}（<fmt:formatDate
					value="${obj.repairTime}" type="both" pattern="MM.dd HH" />h)</td>
		</tr>
	</c:forEach>
</table>