<html>
<%@ page contentType="text/html; charset=utf-8"%>
<%
    response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Expires", "0");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>平台</title>
<script type="text/javascript" src="/js/prototype.js"></script>
<script type="text/javascript" src="/dwr/engine.js"></script>
<script type="text/javascript" src="/dwr/interface/loginAction.js"></script>
<script type="text/javascript">
Event.observe(window, "load", function() {
	Event.observe("loginName", "keypress", function(event) {
		if (event.keyCode == Event.KEY_RETURN) {
			event.stop();
			if (!$("loginName").present()) {
				alert("请输入用户名");
			} else {
				$("loginPassword").select();
			}
		}
	});

	Event.observe("loginPassword", "keypress", function(event) {
		if (event.keyCode == Event.KEY_RETURN) {
			event.stop();
			if ($F("loginName").blank()) {
				alert("请输入用户名");
				$("loginName").focus();
			} else if ($F("loginPassword").blank()) {
				alert("请输入密码");
				("loginPassword").focus();
			} else {
				submitHandler();
			}
		}
	});
	
	Event.observe("validatecode", "keypress", function(event) {
		if (event.keyCode == Event.KEY_RETURN) {
			event.stop();
			if ($F("loginName").blank()) {
				alert("请输入用户名");
				$("loginName").focus();
			} else if ($F("loginPassword").blank()) {
				alert("请输入密码");
				("loginPassword").focus();
			} else if ($F("validatecode").blank()) {
				alert("请输入验证码");
				("validatecode").focus();
			} else {
				submitHandler();
			}
		}
	});

	Event.observe("btnSubmit", "click", submitHandler);

	$("loginName").focus();
});

function submitHandler() {
	if ($F("loginName").blank()) {
		alert("请输入用户名");
		$("loginName").focus();
		return false;
	}
	if ($F("loginPassword").blank()) {
		alert("请输入密码");
		$("loginPassword").focus();
		return false;
	}
	if ($F("validatecode").blank()) {
		alert("请输入验证码");
		$("validatecode").focus();
		return false;
	}
	loginAction.checkin($("loginForm").serialize(true), function(result){
		if(result.blank()) {
			window.location.href="<%=request.getContextPath()%>/sys/loginAction.do?method=checkLogin";
							} else {
								alert(result);
								$("loginPassword").select();
							}
						});
	}
</script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #1D3647;
}
-->
</style>
<script type="text/javascript">
	function refresh(obj) {
		obj.src = "/LoginImageServlet?" + Math.random();
	}
</script>
<link href="/images/normal/skin.css" rel="stylesheet" type="text/css">
</head>
<body onload="correctPNG()">
	<form name="loginForm" id="loginForm">
		<input type="hidden" name="method" value="checkLogin" />
		<table width="100%" height="166" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="42" valign="top"><table width="100%" height="42"
						border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
						<tr>
							<td width="1%" height="21">&nbsp;</td>
							<td height="42">&nbsp;</td>
							<td width="17%">&nbsp;</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td valign="top"><table width="100%" height="532" border="0"
						cellpadding="0" cellspacing="0" class="login_bg">
						<tr>
							<td width="49%" align="right"><table width="91%"
									height="532" border="0" cellpadding="0" cellspacing="0"
									class="login_bg2">
									<tr>
										<td height="138" valign="top"><table width="89%"
												height="427" border="0" cellpadding="0" cellspacing="0">
												<tr>
													<td height="149">&nbsp;</td>
												</tr>
												<tr>
													<td height="80" align="right" valign="top"><img
														src="/images/normal/logo.png--" width="279" height="68"></td>
												</tr>
												<tr>
													<td height="198" align="right" valign="top"><table
															width="100%" border="0" cellpadding="0" cellspacing="0">
															<tr>
																<td width="35%">&nbsp;</td>
																<td height="25" colspan="2" class="left_txt"><p>1-
																		政府：方便城市管线管理、科学决策、基础设施建设...</p></td>
															</tr>
															<tr>
																<td>&nbsp;</td>
																<td height="25" colspan="2" class="left_txt"><p>2-
																		单位：将管线铺设等信息共享，对突发事件提供支撑...</p></td>
															</tr>
															<tr>
																<td>&nbsp;</td>
																<td height="25" colspan="2" class="left_txt"><p>3-
																		市民：提前知晓管线施工引起的断网、断水、断电等...</p></td>
															</tr>
															<tr>
																<td>&nbsp;</td>
																<td width="30%" height="40"><img
																	src="/images/normal/icon-demo.gif" width="16"
																	height="16"><a href="http://" target="_blank"
																	class="left_txt3"> 使用说明</a></td>
																<td width="35%" title="18022885588"><img
																	src="/images/normal/icon-login-seaver.gif" width="16"
																	height="16"><a href="#" class="left_txt3">
																		客服热线</a></td>
															</tr>
														</table></td>
												</tr>
											</table></td>
									</tr>

								</table></td>
							<td width="1%">&nbsp;</td>
							<td width="50%" valign="bottom"><table width="100%"
									height="59" border="0" align="center" cellpadding="0"
									cellspacing="0">
									<tr>
										<td width="4%">&nbsp;</td>
										<td width="96%" height="38"><span class="login_txt_bt">登陆协作管理系统</span></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td height="21"><table cellSpacing="0" cellPadding="0"
												width="100%" border="0" id="table211" height="328">
												<tr>
													<td height="164" colspan="2" align="middle"><form
															name="myform" action="index.html" method="post">
															<table cellSpacing="0" cellPadding="0" width="100%"
																border="0" height="143" id="table212">
																<tr>
																	<td width="13%" height="38" class="top_hui_text"><span
																		class="login_txt">用户名：&nbsp;&nbsp; </span></td>
																	<td height="38" colspan="2" class="top_hui_text"><input
																		id="loginName" name="loginName" class="editbox4"
																		value="" size="20"></td>
																</tr>
																<tr>
																	<td width="13%" height="35" class="top_hui_text"><span
																		class="login_txt"> 密&nbsp;&nbsp;&nbsp;&nbsp;码：
																			&nbsp;&nbsp; </span></td>
																	<td height="35" colspan="2" class="top_hui_text"><input
																		id="loginPassword" name="loginPassword"
																		class="editbox4" type="password" size="21"> <img
																		src="/images/normal/luck.gif" width="19" height="18">
																	</td>
																</tr>
																<tr>
																	<td width="13%" height="35"><span
																		class="login_txt">验证码：</span></td>
																	<td height="35" colspan="2" class="top_hui_text"><input
																		class=wenbenkuang name="validatecode"
																		id="validatecode" type=text value="" maxLength=4
																		size=10><img height="21" title="看不清楚,换一张？"
																		style="cursor: pointer;" align="bottom"
																		onclick="javascript:refresh(this);" src="/LoginImageServlet">
																	</td>
																</tr>
																<tr>
																	<td height="35">&nbsp;</td>
																	<td width="13%" height="35"><input name="button"
																		type="button" class="button" id="btnSubmit"
																		value="登 陆"></td>
																	<td width="74%" class="top_hui_text"><input
																		name="cs" type="button" class="button" id="cs"
																		value="取 消" onClick="showConfirmMsg1()"></td>
																</tr>
															</table>
															<br>
														</form></td>
												</tr>
												<tr>
													<td width="433" height="164" align="right" valign="bottom"><img
														src="/images/normal/login-wel.gif" width="242"
														height="138"></td>
													<td width="57" align="right" valign="bottom">&nbsp;</td>
												</tr>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td height="20"><table width="100%" border="0" cellspacing="0"
						cellpadding="0" class="login-buttom-bg">
						<tr>
							<td align="center"><span class="login-buttom-txt">Copyright
									&copy; 2003-2014 中国电信</span></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>


