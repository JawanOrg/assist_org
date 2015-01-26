<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ include file='/jsp/taglib.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<td width="280" valign="top">
	<div class="gx-interlayer-top"></div>
	<div class="gx-box2-wrap">
		<div class="box-top">
			<span class="titleName">新闻动态</span> <span class="gx-more"><a
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
					href="/homepage/homePageAction.do?method=queryDetailPipeKnowledge&billId=${objData.contentId}">
						${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="gx-interlayer-top"></div>
	<div class="gx-box2-wrap">
		<div class="box-top">
			<apsn class="titleName">管线识别</span> <span class="gx-more"><a
				href="/homepage/homePageAction.do?method=queryMorePipeKnow">更多 》</a></span>
		</div>

		<ul class="gx-list3-wrap">
			<c:forEach items="${requestScope.knowList}" var="objData"
				varStatus="n">
				<li><a
					href="/homepage/homePageAction.do?method=queryDetailPipeKnow&billId=${objData.contentId}">
						${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="gx-interlayer-top"></div>
	<div class="gx-box2-wrap">
		<div class="box-top">
			<apsn class="titleName">管线法规</span> <span class="gx-more"><a
				href="/homepage/homePageAction.do?method=queryMorePipeRule">更多 》</a></span>
		</div>

		<ul class="gx-list3-wrap">
			<c:forEach items="${requestScope.ruleList}" var="objData"
				varStatus="n">
				<li><a
					href="/homepage/homePageAction.do?method=queryDetailPipeRule&billId=${objData.contentId}">
						${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="gx-interlayer-top"></div>
	<div class="gx-box2-wrap">
		<div class="box-top">
			<apsn class="titleName">相关网站</span>
		</div>
		<div class="gx-webSite-wrap">
			<a href="#"><i></i>广州燃气集团</a> <a href="#"><i></i>广州燃气集团燃气</a> <a
				href="#"><i></i>广州燃气集团</a> <a href="#"><i></i>广州燃气集团</a> <a href="#"><i></i>广州燃气集团燃气</a>
			<a href="#"><i></i>广州燃气集团</a>
		</div>
	</div>
	<div class="gx-interlayer-top"></div>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td><img src="/images/homepage/gg01.jpg" width="280"
				height="145"></td>
		</tr>
	</table>
</td>