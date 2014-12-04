<!doctype html>
<%@ include file='/jsp/common/allTag.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta charset="utf-8">
<title>管线协作管理系统</title>
<link rel="stylesheet" type="text/css" href="/css/homepage.css">
</head>

<body>

	<jsp:include page="/jsp/portal/top.jsp"></jsp:include>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="gx-focus-wrap">
				<table width="1000" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td><img src="/images/homepage/focus-02.png" width="1000"
							height="150"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<div class="gx-interlayer-top"></div>
	<table width="1000" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="690" valign="top">
				<div class="gx-box-top">
					<span class="titleName">管线常识</span>
				</div>
				<ul class="gx-list2-wrap">
					<c:forEach items="${requestScope.knowledgeList}" var="objData"
						varStatus="n">
						<li><a
							href="/homepage/homePageAction.do?method=queryDetailPipeKnowledge&billId=${objData.contentId}">&#8226;
								${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a><span><fmt:formatDate
									value="${objData.createTime}" pattern="yyyy-MM-dd" /> </span></li>
					</c:forEach>
				</ul>

				<div class="gx-interlayer-top"></div>
				<table width="100%" border="0" cellspacing="10" cellpadding="0">
					<tr class="gx-list-page">
						<td>共<span>0</span>条<span>1</span>页 <span>15</span>条/页 第<span>1</span>页
						</td>
						<td width="350"><a href="#">首页</a> <a href="#">前一页</a> <a
							href="#">下一页</a> <a href="#">末页</a> 转到 <input name="" type="text">页
							<a href="#">GO</a></td>
					</tr>
				</table>
			</td>
			<td>&nbsp;</td>

			<jsp:include page="/jsp/portal/rightData.jsp"></jsp:include>
		</tr>
	</table>

	<div class="gx-interlayer-top"></div>
	<jsp:include page="/jsp/portal/bottom.jsp"></jsp:include>


</body>
</html>