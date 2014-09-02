<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<%
	String chartStr = (String)request.getAttribute("chartStr");
	out.print(chartStr);
%>