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
				<table class="gx-show-wrap" width="100%" border="0" cellspacing="0"
					cellpadding="0">
					<tr>
						<td class="gx-show-path">首页 》<strong>管线法规</strong></td>
					</tr>
					<tr>
						<td valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="10">
								<tr>
									<td class="gx-show-titleName">${requestScope.pipeRule.theTitle}</td>
								</tr>
								<tr>
									<td class="gx-show-info">来自： &nbsp;&nbsp;作者：<assist:sysOrganization
											objectId="${requestScope.pipeRule.creator}"></assist:sysOrganization>&nbsp;&nbsp;时间：<fmt:formatDate
											value="${requestScope.pipeRule.createTime}"
											pattern="yyyy-MM-dd hh:mm:ss" /></td>
								</tr>
								<tr>
									<td class="gx-show-content">${requestScope.pipeRule.roleContent}
									</td>
								</tr>
							</table>
						</td>
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
