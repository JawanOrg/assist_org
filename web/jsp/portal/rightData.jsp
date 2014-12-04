<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ include file='/jsp/taglib.jsp'%>
<%@ page contentType="text/html; charset=utf-8"%>
<td width="280" valign="top">
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
				href="/homepage/homePageAction.do?method=queryMorePipeKnowledge">更多
					》</a></span>
		</div>

		<ul class="gx-list3-wrap">
			<c:forEach items="${requestScope.knowList}" var="objData"
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
			<apsn class="titleName">管线法规</span> <span class="gx-more"><a
				href="/homepage/homePageAction.do?method=queryMorePipeKnowledge">更多
					》</a></span>
		</div>

		<ul class="gx-list3-wrap">
			<c:forEach items="${requestScope.ruleList}" var="objData"
				varStatus="n">
				<li><a
					href="/homepage/homePageAction.do?method=queryDetailPipeKnowledge&billId=${objData.contentId}">
						${fn:length(objData.theTitle)>50?fn:substring(objData.theTitle,0,50):objData.theTitle}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="gx-interlayer-top"></div>
</td>