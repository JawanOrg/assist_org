<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUserAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
        return false;
    }
</script>
<body>
	<form id="formEdit" name="formEdit">			
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">修改用户</td>
				                            <td width="57%"></td>
				                        </tr>
									</table>
								</td>
							</tr>
						</table>
					</tr>
						<tr>
							<td class="bg_01">
								<table width="100% border=" 0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top" align="center">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       登录帐号:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="" name="loginName" maxlength="32" dataType="Require" msg="登录帐号不能为空" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       登录密码:
															</div>
														</td>
														<td align="left">
															<input type="password" class="inputpassword01" value="" name="loginPassword" maxlength="64" dataType="Require" msg="登录密码不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       再次输入密码:
															</div>
														</td>
														<td align="left">
															<input type="password" class="inputpassword01" value="" name="loginPassword_confirm" maxlength="64" dataType="Require" msg="再次输入密码不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       用户姓名:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="" name="userName" maxlength="64" dataType="Require" msg="用户姓名不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       手机:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="" name="mobilePhone" maxlength="32" dataType="Char" msg="手机号码输入错误" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       备注:
															</div>
														</td>
														<td align="left">
															<textarea id="remark" name="remark" rows="3"  style="width: 95%;" class="inputtext01">
															</textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     是否有效:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isValid_Y" name="isValid" value="Y" >有效
															<input type="radio" id="isValid_N" name="isValid" value="N" >无效
														</td>
													</tr>																										
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="SysUserEditDoSave ();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="SysUserEditDoClose ();" value="取消">
														</td>
													</tr>
												</tbody>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<input type="hidden" value="${param.userId}" id="userId" name="userId" />
	</form>
</body>
<script type="text/javascript">
    
</script>
</html>