<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ include file='/jsp/taglib.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/homepage.css" type="text/css">
<title>管线协作管理系统</title>

</head>

<body style="width:100%;heigth:1350px;over-flow:auto;">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="80" class="gx-top-bg">
				<table width="1000" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td width="320"><img src="/images/homepage/logo.png"
							width="320" height="75"></td>
						<td><div class="gx-top-link">
								<a href="#" target="_blank">论坛</a> | <a
									href="/jsp/common/home.jsp" target="_self">数据维护</a>
							</div></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="gx-focus-wrap">
				<table width="1000" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td><img src="/images/homepage/focus-01.png" width="1000"
							height="232"></td>
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
					<span class="titleName">施工动态</span> <span class="gx-more"><a
						href="#">更多 》</a></span>
				</div> 
				<c:forEach items="${requestScope.trendsList}" var="objData"
					varStatus="n">
					<div class="gx-list1-wrap">
						<div class="titleName">
							<div class="titleleft">
								<a href="#">${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a>
							</div>
							<div class="titleright">
								<span>${objData.city}-${objData.community}-${objData.road}</span>
							</div>
						</div>
						<div class="des">${fn:length(objData.repairContent)>70?fn:substring(objData.repairContent,0,70):objData.repairContent}</div>
					</div>
				</c:forEach>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box-top">
					<span class="titleName">新闻动态</span> <span class="gx-more"><a
						href="#">更多 》</a></span>
				</div>
				<ul class="gx-list2-wrap">
				<c:forEach items="${requestScope.newsList}" var="objData"
					varStatus="n">
						<li><a href="#">${fn:length(objData.newsContent)>50?fn:substring(objData.newsContent,0,50):objData.newsContent}</a><span><fmt:formatDate value="${objData.createTime }" pattern="yyyy-MM-dd"/> </span></li>
					</c:forEach>
				</ul>

				<div class="gx-interlayer-top"></div>
				<div class="gx-box-top">
					<span class="titleName">最新帖子</span> <span class="gx-more"><a
						href="#">更多 》</a></span>
				</div>
				<table class="gx-bbs-wrap" width="100%" border="0" cellspacing="0"
					cellpadding="5">
					<tr>
						<td width="20">&nbsp;</td>
						<td>主题</td>
						<td width="100">作者</td>
						<td width="80">回复/查看</td>
						<td width="100">最后发表</td>
					</tr>
					<tr>
						<td width="20"><img src="/images/homepage/folder_new.gif"
							width="17" height="17"></td>
						<td><a href="#">5小时的UPS为什么只能管50分钟？</a></td>
						<td width="100">纳粹<br> <span class="span">2010-7-2</span></td>
						<td>91<br> <span class="span">11100</span></td>
						<td width="100">泥巴团子<br> <span class="span">2014-9-3
								10:45</span></td>
					</tr>
					<tr>
						<td width="20"><img src="/images/homepage/folder_new.gif"
							width="17" height="17"></td>
						<td><a href="#">5小时的UPS为什么只能管50分钟？</a></td>
						<td width="100">纳粹<br> <span class="span">2010-7-2</span></td>
						<td>91<br> <span class="span">11100</span></td>
						<td width="100">泥巴团子<br> <span class="span">2014-9-3
								10:45</span></td>
					</tr>
					<tr>
						<td width="20"><img src="/images/homepage/folder_new.gif"
							width="17" height="17"></td>
						<td><a href="#">5小时的UPS为什么只能管50分钟？</a></td>
						<td width="100">纳粹<br> <span class="span">2010-7-2</span></td>
						<td>91<br> <span class="span">11100</span></td>
						<td width="100">泥巴团子<br> <span class="span">2014-9-3
								10:45</span></td>
					</tr>
					<tr>
						<td width="20"><img src="/images/homepage/folder_new.gif"
							width="17" height="17"></td>
						<td><a href="#">5小时的UPS为什么只能管50分钟？</a></td>
						<td width="100">纳粹<br> <span class="span">2010-7-2</span></td>
						<td>91<br> <span class="span">11100</span></td>
						<td width="100">泥巴团子<br> <span class="span">2014-9-3
								10:45</span></td>
					</tr>
					<tr>
						<td width="20"><img src="/images/homepage/folder_new.gif"
							width="17" height="17"></td>
						<td><a href="#">5小时的UPS为什么只能管50分钟？</a></td>
						<td width="100">纳粹<br> <span class="span">2010-7-2</span></td>
						<td>91<br> <span class="span">11100</span></td>
						<td width="100">泥巴团子<br> <span class="span">2014-9-3
								10:45</span></td>
					</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			<td width="280" valign="top">
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线常识</span>
						<span class="gx-more"><a href="#">更多 》</a></span>
					</div>

					<ul class="gx-list3-wrap">
					<c:forEach items="${requestScope.knowledgeList}" var="objData"
					varStatus="n">
							<li><a href="#">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
					</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线识别</span>
						<span class="gx-more"><a href="#">更多 》</a></span>
					</div>

					<ul class="gx-list3-wrap">
					<c:forEach items="${requestScope.knowList}" var="objData"
					varStatus="n">
						<li><a href="#">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
					</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线法规</span>
						<span class="gx-more"><a href="#">更多 》</a></span>
					</div>

					<ul class="gx-list3-wrap">
					<c:forEach items="${requestScope.ruleList}" var="objData"
					varStatus="n">
						<li><a href="#">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
					</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><img src="/images/homepage/gg01.jpg" width="280"
							height="145"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

	<div class="gx-interlayer-top"></div>
	<table width="1000" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td class="gx-foot-wrap">©Copyright 2007-2014 GGGC All Rights
				Reserved. <br> 版权所有：广州燃气集团有限公司 粤ICP备06007156
			</td>
		</tr>
	</table>
</body>
</html>