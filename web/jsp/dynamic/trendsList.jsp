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
		<td bgcolor="#f2f2f2" style="FONT-SIZE: 13px" width="50%" >标题</td>
		<td bgcolor="#f2f2f2" style="FONT-SIZE: 13px"  width="50%">城区/街道/社区</td>
	</tr>
	<c:forEach items="${requestScope.trendsList}" var="obj" varStatus="n">
		<tr bgcolor="" style="cursor: 'hand'">
			<td align="left" title="${obj.theTitle}"><a herf="#"
				onclick="getDetail('${obj.billId}','${obj.theTitle}')">${fn:length(obj.theTitle)>10?fn:substring(obj.theTitle,0,10):obj.theTitle}${fn:length(obj.theTitle)>10?"...":""}</a><br><fmt:formatDate
					value="${obj.repairTime}" type="both" pattern="MM月dd日" /></td>
			<td align="left">${obj.city}/${obj.street}/${obj.community}</td>
		</tr>
	</c:forEach>
</table>