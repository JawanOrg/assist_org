<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<c:forEach items="${requestScope.districtList}" var="obj" varStatus="n">
	<div class="item" id="${obj.unitId}">
		<label title="${obj.unitName}" class="titem"><input type="checkbox"
			value="${obj.unitId}" title="${obj.unitName}" class="b" />${obj.unitName}</label>
		<div class="sitem"></div>
	</div>
</c:forEach>