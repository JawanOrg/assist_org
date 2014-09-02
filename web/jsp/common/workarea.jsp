<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集团电子运维系统互联接口平台</title>
</head>
<frameset id ="workframe" border="0" frameborder="no" id="index" framespacing="0" rows="0,*" cols="*">
  <frame name='toolbar'  id="toolbar" src="toolbar.jsp" frameborder="0" noresize="noresize" scrolling="no" />
  <frame name='workarea' id="workarea" src="<%=request.getContextPath()%>/sys/alarmAction.do?method=init" />
</frameset>
</html>