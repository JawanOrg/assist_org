<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/jsp/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>集团电子运维系统互联接口平台</title>
<link rel="stylesheet" type="text/css" href="/js/sh/shCore.css" />
<link rel="stylesheet" type="text/css" href="/js/sh/shThemeDefault.css" />
<script type="text/javascript" src="/js/sh/shCore.js"></script>
<script type="text/javascript" src="/js/sh/shBrushPlain.js"></script>
<style type="text/css">
body {
	padding: 0;
	margin: 0;
	font-size: 12px;
}
</style>
</head>
<body>
<pre class="brush: plain; wrap-lines: true">
<c:out value="${requestScope.description}" escapeXml="true" />
</pre>
<script type="text/javascript">
	SyntaxHighlighter.config.clipboardSwf = "/js/sh/clipboard.swf";
	SyntaxHighlighter.all();
</script>
</body>
</html>