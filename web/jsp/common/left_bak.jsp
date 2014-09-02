<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Strict//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>功能模块管理</title>
<link type="text/css" rel="stylesheet" href="/css/flash.css" />
<script type="text/javascript">
function navigate(location) {
	if (top && top.frames.length) {
		var documentEl = top.frames[0].document;
		var locationEl = documentEl.getElementById("location");
		locationEl.removeChild(locationEl.childNodes[0]);
		locationEl.appendChild(documentEl.createTextNode(location));
	}
}
</script>
</head>
<body>
<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
	id="accordion" width="165" height="100%"
	codebase="http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab">
	<param name="movie" value="/swf/LeftNavigator.swf" />
	<param name="quality" value="high" />
	<param name="bgcolor" value="#FFFFFF" />
	<!--param name="wmode" value="Opaque" /-->
	<param name="allowScriptAccess" value="sameDomain" />
	<embed src="/swf/LeftNavigator.swf" quality="high" bgcolor="#FFFFFF"
		width="165" height="100%" align="middle" name="accordion"
		play="true"
		loop="false"
		quality="high"
		allowScriptAccess="sameDomain"
		type="application/x-shockwave-flash"
		pluginspage="http://www.adobe.com/go/getflashplayer">
	</embed>
</object>
</body>
</html>