<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/linePipeAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>Э������ϵͳ</title>
</head>
<script>
	DWREngine.setErrorHandler(handler);

	function handler(errors) {
		alert(errors);
		enableForm("addForm");
		return false;
	}
	function closeWindow() {
		parent.ymPrompt.doHandler('close');
		parent.initQueryResultList();
	}

	function addRule() {
		if (!validateForm(addForm, 1)) {
			return false;
		}
		var formObj = $('addForm').serialize(true);
		linePipeAction.addRule(formObj, addBack);
	}

	function addBack(str) {
		if (str == "success") {
			parent.ymPrompt.alert({message:'�����ɹ���',title:''});
			closeWindow();
		} else {
			handler(str);
		}

	}
</script>
<body>
	<form id="addForm" name="addForm">
		<div class="panel panel-default">
			<div class="panel-heading">����</div>
			<div class="panel-body">
				<table width="100%" border="0" ellpadding="2" cellspacing="1">
					<tr>
						<td valign="top">
							<table height="100%" width=90% border=0 cellpadding=2
								cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF
								bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
								pcolor="#CCCCCC">
								<tr>
									<td noWrap>
										<div align="right">����<span style="color:Red">*</span>��</div>
									</td>
									<td align="left" colspan="2"><input
															name="theTitle" type="text" id="theTitle"
															class="form-control"
															dataType="Require" msg="'����'����" /></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td noWrap>
										<div align="right">���߷���<span style="color:Red">*</span>��</div>
									</td>
									<td align="left" colspan="2"><textarea
											name="linePipeContent" class="form-control" rows="3" dataType="Require" msg="'���߷���'����" ></textarea></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td colspan="3" align="center"><input name="auditBtn"
										type="button" class="btn btn-default btn-sm" id="auditBtn"
										value="ȷ��" onclick="addRule(this)"> &nbsp;&nbsp; <input
										type="button" class="btn btn-default btn-sm"
										onClick="closeWindow()" value="ȡ��"></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</form>
</body>
</html>