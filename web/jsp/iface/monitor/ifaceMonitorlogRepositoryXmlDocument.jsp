<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>OSS接口平台</title>
	<link rel="stylesheet" type="text/css" href="/css/main_02.css" />
	<link rel="stylesheet" type="text/css" href="/css/imgurl.css" />
	<link rel="stylesheet" type="text/css" href="/js/sh/shCore.css" />
	<link rel="stylesheet" type="text/css" href="/js/sh/shThemeDefault.css" />
	<script type="text/javascript" src="/js/sh/shCore.js"></script>
	<script type="text/javascript" src="/js/sh/shBrushXml.js"></script>
</head>
<body>
<table height="100%" width=100% border="0" cellpadding="2" cellspacing="0" bgcolor="#FFFFFF">
	<tbody>
		<tr>
			<td bgcolor="#F4F4F4">
				日志内容:
			</td>
		</tr>
		<tr>
			<td align="left">
				${ifaceLogRepository.traceText}
			</td>
		</tr>
		<tr>
			<td bgcolor="#F4F4F4">
				 工单内容:
			</td>
		</tr>
		<tr>
			<td align="left">
				<pre class="brush: xml; wrap-lines: true;">${ifaceLogRepository.xmlDocument}</pre>
			</td>														
		</tr>
		<tr>
			<td align="center">
				<input type="button" class="button" name="btnClose" id="btnClose" onclick="window.close()" value=" 关闭 ">
			</td>
		</tr>
	</tbody>
</table>
<script type="text/javascript">
SyntaxHighlighter.config.clipboardSwf = "/js/sh/clipboard.swf";
SyntaxHighlighter.all();
</script>
</body>
</html>