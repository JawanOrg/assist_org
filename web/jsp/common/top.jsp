<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css"
	type="text/css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css" />
<title>管理页面</title>
<script language=JavaScript>
	function logout() {
		if (confirm("您确定要退出控制面板吗？"))
			top.location = "/index.jsp";
		return false;
	}
</script>
<script language=JavaScript1.2>
	
	
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}


</script>
<meta http-equiv=Content-Type content=text/html;charset=gb2312>
<meta http-equiv="refresh" content="60">
<script language=JavaScript1.2>
	
	
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}


</script>
<base target="main">
<link href="/images/normal/skin.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0">
	<table width="100%" height="64" border="0" cellpadding="0"
		cellspacing="0" class="admin_topbg">
		<tr>
			<td width="61%" height="64"><img src="/images/normal/logotop.png--"
				width="262" height="38"></td>
			<td width="39%" valign="top"><table width="100%" border="0"
					cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<table width="100%" border="0" cellspacing="1" cellpadding="3">
								<tr align="left" width="100%">
									<td align="right" style="font-size: 13px"><img
										src="<%=request.getContextPath()%>/images/main/ico_fellow.gif"
										width="18" height="14"> <a href="#"><font face="楷体"
											size="2" color="#ffffff">当前处理人：</font><font face="楷体"
											size="3" color="#ffffff">${sessionScope.currentUser.userName}</font></a>
										<img
										src="<%=request.getContextPath()%>/images/main/ico_cipher.gif"
										width="13" height="15" border="0"><a
										href="/jsp/common/chgPassword.jsp" target="workarea"><font
											face="楷体" size="2" color="#ffffff">密码修改</font></a> <img
										src="<%=request.getContextPath()%>/images/main/ico_fellow02.gif"
										width="13" height="14" border="0"> <a
										href="<%=request.getContextPath()%>/index.jsp" target="_blank"
										class="admin_txt"
										onclick="if (confirm('是否要注销当前登录用户？') == false) return false; window.top.opener = 'anyone'; window.top.close();" />
										<font face="楷体" size="2" color="#ffffff">注销</font></a></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="19" colspan="3" class="left_txt" align="right">最新消息：.....</td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
