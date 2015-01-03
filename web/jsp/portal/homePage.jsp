<!DOCTYPE html>
<%@ include file='/jsp/taglib.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="/css/homepage.css" type="text/css">
<link rel="stylesheet" href="/css/map.css" type="text/css">
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="/js/jquery.SuperSlide.2.1.1.source.js"></script>
<title>管线协作管理系统</title>
</head>

<body style="width:100%;heigth:1350px;over-flow:auto;">
	<jsp:include page="/jsp/portal/top.jsp"></jsp:include>

	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="gx-focus-wrap">
				<table width="1000" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td>
							<div class="fullSlide">

								<div class="bd">
									<ul>
										<li
											style="background:url(/images/homepage/focus-01.png) center 0 no-repeat;"></li>
										<li
											style="background:url(/images/homepage/focus-03.png) center 0 no-repeat;"></li>
										<li
											style="background:url(/images/homepage/focus-04.png) center 0 no-repeat;"></li>
									</ul>
								</div>

								<div class="hd">
									<ul></ul>
								</div>
							</div> <script type="text/javascript">
								jQuery(".fullSlide").slide({
									titCell : ".hd ul",
									mainCell : ".bd ul",
									effect : "fold",
									autoPlay : true,
									autoPage : true,
									trigger : "click"
								});
							</script>
						</td>
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
				<div class="slideTxtBox">
					<div class="hd">
						<span class="titleName">施工图式</span>
						<ul>
							<li><i class="statistics_icon01"></i><span>地图模式</span></li>
							<li><i class="statistics_icon02"></i><span>图表模式</span></li>
						</ul>
					</div>
					<div class="bd">
						<div style="height:300px; position:relative;">
							<iframe id="mapiframe" frameborder="no" border="0"
								marginwidth="0" marginheight="0" width="100%" height="100%"
								allowTransparency="true"
								src="/jsp/map/queryPositionHomePage.jsp?homePageStatus=doing"></iframe>
							<div class="map-btn-wrap">
								<div class="map-btn2" id="plan"
									onclick="queryStatusPosition('plan')">
									<i class="map-btnIcon-01"></i>计划中
								</div>
								<div class="map-btn2-on" id="doing"
									onclick="queryStatusPosition('doing')">
									<i class="map-btnIcon-02"></i>施工中
								</div>
								<div class="map-btn2" id="finish"
									onclick="queryStatusPosition('finish')">
									<i class="map-btnIcon-03"></i>已完工
								</div>
							</div>
							地图模式
						</div>
						<div style="height:300px">
							<iframe id="mapiframedd" frameborder="no" border="0"
								marginwidth="0" marginheight="0" width="100%" height="100%"
								allowTransparency="true"
								src="/jsp/map/queryPositionHomePage.jsp"></iframe>
							图表模式
						</div>
					</div>
				</div> <script type="text/javascript">
					jQuery(".slideTxtBox").slide({
						trigger : "click"
					});
				</script>

				<div class="gx-interlayer-top"></div>

				<div class="gx-box-top">
					<span class="titleName">施工清单</span> <span class="gx-more"><a
						href="/homepage/homePageAction.do?method=queryMoreDynamic">更多
							》</a></span>
				</div> <c:forEach items="${requestScope.trendsList}" var="objData"
					varStatus="n">
					<div class="gx-list1-wrap">
						<div class="titleName">
							<div class="titleleft">
								<a
									href="/homepage/homePageAction.do?method=queryDetailDynamic&billId=${objData.billId}">${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a>
							</div>
							<div class="titleright">
								<span>${objData.city}-${objData.community}-${objData.street}</span>
							</div>
						</div>
						<div class="des">${fn:length(objData.repairContent)>70?fn:substring(objData.repairContent,0,70):objData.repairContent}</div>
					</div>
				</c:forEach>

				<div class="gx-interlayer-top"></div>
				<div class="gx-box-top">
					<span class="titleName">最新帖子</span> <span class="gx-more"><a
						href="/jforum" target="_blank">更多 》</a></span>
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
					<c:forEach items="${requestScope.topicList}" var="topic"
						varStatus="n">
						<tr>
							<td width="20"><img src="/images/homepage/folder_new.gif"
								width="17" height="17"></td>
							<td><a
								href="/jforum/posts/list/${topic.topicId}.page#latest">${topic.topicTitle}</a></td>
							<td width="100">${topic.createUserName}<br> <span
								class="span"><fmt:formatDate value="${topic.topicTime}"
										pattern="yyyy-MM-dd HH:mm:ss" /></span></td>
							<td>${topic.topicReplies}<br> <span class="span">${topic.topicViews}</span></td>
							<td width="100">${topic.replyUserName}<br> <span
								class="span"><fmt:formatDate value="${topic.replyTime}"
										pattern="yyyy-MM-dd HH:mm:ss" /></span></td>
						</tr>
					</c:forEach>
				</table>

			</td>
			<td>&nbsp;</td>
			<td width="280" valign="top">
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">新闻动态</span> <span class="gx-more"><a
							href="/homepage/homePageAction.do?method=queryMoreNews">更多 》</a></span>
					</div>

					<ul class="gx-list3-wrap">
						<c:forEach items="${requestScope.newsList}" var="objData"
							varStatus="n">
							<li><a
								href="/homepage/homePageAction.do?method=queryDetailNews&billId=${objData.billId}">${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a><span>
									<fmt:formatDate value="${objData.createTime }"
										pattern="yyyy-MM-dd" />
							</span></li>
						</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线常识</span> <span class="gx-more"><a
							href="/homepage/homePageAction.do?method=queryMorePipeKnowledge">更多
								》</a></span>
					</div>

					<ul class="gx-list3-wrap">
						<c:forEach items="${requestScope.knowledgeList}" var="objData"
							varStatus="n">
							<li><a
								href="/homepage/homePageAction.do?method=queryDetailPipeKnowledge&billId=${objData.contentId}">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
						</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线识别</span> <span class="gx-more"><a
							href="/homepage/homePageAction.do?method=queryMorePipeKnow">更多
								》</a></span>
					</div>

					<ul class="gx-list3-wrap">
						<c:forEach items="${requestScope.knowList}" var="objData"
							varStatus="n">
							<li><a
								href="/homepage/homePageAction.do?method=queryDetailPipeKnow&billId=${objData.contentId}">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
						</c:forEach>
					</ul>
				</div>
				<div class="gx-interlayer-top"></div>
				<div class="gx-box2-wrap">
					<div class="box-top">
						<apsn class="titleName">管线法规</span> <span class="gx-more"><a
							href="/homepage/homePageAction.do?method=queryMorePipeRule">更多
								》</a></span>
					</div>

					<ul class="gx-list3-wrap">
						<c:forEach items="${requestScope.ruleList}" var="objData"
							varStatus="n">
							<li><a
								href="/homepage/homePageAction.do?method=queryDetailPipeRule&billId=${objData.contentId}">${fn:length(objData.theTitle)>25?fn:substring(objData.theTitle,0,25):objData.theTitle}</a></li>
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

	<jsp:include page="/jsp/portal/bottom.jsp"></jsp:include>

</body>
<script type="text/javascript">
	function queryStatusPosition(status) {
		if (status == "plan") {
			document.getElementById("plan").className = "map-btn2-on";
			document.getElementById("doing").className = "map-btn2";
			document.getElementById("finish").className = "map-btn2";
			document.getElementById("mapiframe").src = "/jsp/map/queryPositionHomePage.jsp?homePageStatus=plan";
		} else if (status == "doing") {
			document.getElementById("plan").className = "map-btn2";
			document.getElementById("doing").className = "map-btn2-on";
			document.getElementById("finish").className = "map-btn2";
			document.getElementById("mapiframe").src = "/jsp/map/queryPositionHomePage.jsp?homePageStatus=doing";
		} else if (status == "finish") {
			document.getElementById("plan").className = "map-btn2";
			document.getElementById("doing").className = "map-btn2";
			document.getElementById("finish").className = "map-btn2-on";
			document.getElementById("mapiframe").src = "/jsp/map/queryPositionHomePage.jsp?homePageStatus=finish";
		}
	}
</script>
</html>