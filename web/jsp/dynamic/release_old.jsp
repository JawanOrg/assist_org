<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<script src="/js/jquery-1.10.2.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"
	charset="UTF-8"></script>
<script type="text/javascript"
	src="/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUserUnitAction.js'></script>
<html>
<head>
<title>协作管理系统</title>
</head>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
	function handler(errors) {
		alert(errors);
		enableForm();
		setUI();
		return false;
	}

	function setUI() {
		var id = tree.getSelectedItemId();
		if (id != "") {
			var ids = id.split("_");
			if (ids.size() >= 2) {
				document.forms[0].unitId.value = ids[0];
				document.forms[0].typeSplit.value = ids[1];
				dateView();
			}
		} else {
			list_page.navigate("/js/dhtmlxtree/imgs/blank.html");
		}
	}
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0">
	<form id="queryForm" method="POST">
		<table border="0" style="FONT-SIZE: 13px" cellpadding="5"
			cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
			<tr>
				<td valign="top">
					<table border="0" style="FONT-SIZE: 13px" cellspacing="0"
						cellpadding="0" height="10px">
						<tr>
							<td class="tabpaneleft2"></td>
							<td class="tabpanebg2" width="120"><img
								src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
								width="18" height="15"> <span>动态信息录入</span></td>
							<td class="tabpaneright2"></td>
						</tr>
					</table>
					<table border="0" style="FONT-SIZE: 13px" cellpadding="2"
						cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
						<tr>
							<td width="78%">
								<div id="inputText"
									style="width: 100%; height: 100%; overflow: hidden; border: 1px solid Silver;">
									<table width="100%" border="0" cellspacing="0" cellpadding="0"
										class="table">
										<tr>
											<td width="10%" height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">标题：</td>
											<td width="90%" height="30" bgcolor="#f2f2f2" colspan="5"><input
												name="title" type="text" id="title"  size="97"/></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">城区：</td>
											<td height="30"><input type="text" name="web" size="25" /></td>
											<td height="30" align="right" class="left_txt2">社区：</td>
											<td height="30"><input type="text" name="web" size="25" /></td>
											<td height="30" align="right" class="left_txt2">道路：</td>
											<td height="30"><input type="text" name="web"
												 /></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">门牌：</td>
											<td height="30" bgcolor="#f2f2f2"><input type="text"
												name="logo" size="25"  /></td>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">施工时间：</td>
											<td height="30" bgcolor="#f2f2f2">
												<input type="text" name="web" size="25" />
											</td>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2"></td>
											<td height="30" bgcolor="#f2f2f2"></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">现场联系人：</td>
											<td height="30"><input type="text" name="web" size="25" /></td>
											<td height="30" align="right" class="left_txt2">现场联系人电话：</td>
											<td height="30"><input type="text" name="web" size="25" /></td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">测试计划说明：</td>
											<td height="30" bgcolor="#f2f2f2" colspan="5"><textarea
													rows="3" cols="100"></textarea></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">施工类别：</td>
											<td height="30"><input type="text" name="web" size="25" /></td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">施工内容：</td>
											<td height="30" bgcolor="#f2f2f2" colspan="5"><textarea
													rows="3" cols="100"></textarea></td>
										</tr>
										<tr>
											<td colspan="6">&nbsp;</td>
										</tr>
										<tr>
											<td colspan="3" align="right"><input name="button"
												type="button" class="button" id="btnSubmit" value="提  交"></td>
											<td colspan="3" class="top_hui_text" align="left"><input
												name="cs" type="button" class="button" id="cs" value="取 消"
												onClick="showConfirmMsg1()"></td>
										</tr>

									</table>
								</div>
							</td>
							<td width="22%"><iframe name="list_page"
									style="width:100%;height:100%;overflow:hidden;border :1px solid Silver;"
									src=""> </iframe></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

	</form>
	<script type="text/javascript">
		$('.form_datetime').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			forceParse : 0,
			showMeridian : 1
		});
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_time').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 1,
			minView : 0,
			maxView : 1,
			forceParse : 0
		});
		$(".form_datetime").datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0,
			format : "yyyy MM dd - hh:ii",
			linkField : "mirror_field",
			linkFormat : "yyyy-mm-dd hh:ii"
		});
	</script>
</body>
</html>
