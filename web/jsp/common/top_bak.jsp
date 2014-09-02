<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page contentType="text/html; charset=utf-8"%>
<head>
<title>OSS接口平台</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css" />
</head>

<body class="top_body">

<div class="top_bg">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="88">
				<table width="165" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td class="logo" width="165" height="81" valign="top"></td>
					</tr>
				</table>
			</td>
			<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="5%">
							<table width="199" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="199" class="top_banner" height="52"></td>
								</tr>
							</table>
						</td>
						<td width="95%">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
									<table width="100%" border="0" cellspacing="1" cellpadding="3">
										<tr align="right" width="100%">
											<td align="right" style="font-size: 13px"><img
												src="<%=request.getContextPath()%>/images/main/ico_fellow.gif"
												width="18" height="14"><font id="currentuser"
												color="#333333">当前处理人：${sessionScope.currentUser.userName}</font>
											<img
												src="<%=request.getContextPath()%>/images/main/ico_cipher.gif"
												width="13" height="15" border="0"><a
												href="/jsp/common/chgPassword.jsp" class="font" target="workarea">密码修改</a>
											<img
												src="<%=request.getContextPath()%>/images/main/ico_fellow02.gif"
												width="13" height="14" border="0"> <a
												href="<%=request.getContextPath()%>/index.jsp"
												target="_blank" class="font"
												onclick="if (confirm('是否要注销当前登录用户？') == false) return false; window.top.opener = 'anyone'; window.top.close();" />
											注销</a></td>
										</tr>
										<tr>
											<td style="font-size: 13px">&nbsp;</td>
										</tr>
									</table>
									</td>
									<td width="7%">
									<table width="82" border="0" cellspacing="0" cellpadding="0"
										align="right">
										<tr>
											<td width="82" height="52" class="top_arrow02"></td>
										</tr>
									</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td colspan="2">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="1%">
								<table width="15" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="15" valign="top" height="28" class="menu_arrow01"></td>
									</tr>
								</table>
								</td>
								<td align="right" style="font-size: 13px"><a href="#"
									class="little3"></a> <a
									href="<%=request.getContextPath()%>/sys/alarmAction.do?method=init"
									class="little3" target="workarea">&nbsp;告警提示</a></td>
								<td width="2%"><a href="#"><img
									name="Image2" border="0"
									src="<%=request.getContextPath()%>/images/main/menu_arrow_01.gif"
									width="13" height="29"></a></td>
								<td width="2%">
								<div align="right"><a href="#"><img
									name="Image1" border="0"
									src="<%=request.getContextPath()%>/images/main/menu_top_01.gif"
									width="25" height="29"></a></div>
								</td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
			</td>
			<td align="right" width="12" class="top_arrow06"></td>
		</tr>
		<tr>
			<td valign="top" class="left_menu" height="25" width="165"></td>
			<td class="top_bg02">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="25" class="top_arrow04" height="25">&nbsp;</td>
						<td width="244" height="25" align="left" class="top_td">&nbsp;当前位置&nbsp;&#58;&nbsp;<span id="location">首页</span></td>
						<td width="80" class="top_td">
							<div align="center"><font color="#333333">最新信息 |</font></div>
						</td>
						<td class="top_td" align="right">&nbsp;</td>
					</tr>
				</table>
			</td>
			<td class="top_arrow05"></td>
		</tr>
	</table>
</div>
</body>
</html>