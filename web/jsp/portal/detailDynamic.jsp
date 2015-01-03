<!doctype html>
<%@ include file='/jsp/common/allTag.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta charset="utf-8">
<title>管线协作管理系统</title>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="/css/homepage.css">
<script type="text/javascript">
function showMap(lng,lat){
	ymPrompt.win({message:'/jsp/map/getPosition.jsp?longitude='+lng+'&latitude='+lat,width:800,height:600,title:'施工动态地点查看',minBtn:true,maxBtn:true,closeBtn:true,showShadow:true,iframe:{id:'myIds'}});

}
</script>
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
						<td class="gx-show-path">首页 》<strong>新闻动态</strong></td>
					</tr>
					<tr>
						<td valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="10">
								<tr>
									<td class="gx-show-titleName">${requestScope.trends.theTitle}<img title="点击查看施工地点"
															src="/images/normal/position.png" style="cursor:pointer"
															onclick="showMap('${requestScope.trends.longitude}','${requestScope.trends.latitude}')"/></td>
								</tr>
								<tr>
									<td class="gx-show-info">来自： &nbsp;&nbsp;作者：<assist:sysOrganization
											objectId="${requestScope.trends.creator}"></assist:sysOrganization>&nbsp;&nbsp;时间：<fmt:formatDate
											value="${requestScope.trends.createTime}"
											pattern="yyyy-MM-dd hh:mm:ss" /></td>
								</tr>
								<tr>
									<td class="gx-show-content">${requestScope.trends.repairContent}
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
