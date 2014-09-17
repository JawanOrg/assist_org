<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/newsAction.js'></script>
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
		enableForm("auditForm");
		return false;
	}
	function closeWindow() {
		parent.ymPrompt.doHandler('close');
		parent.refreshDetail($('billId').value,$('billSn').value);
	}

	function release() {
		if (!validateForm(auditForm, 1)) {
			return false;
		}
		var formObj = $('auditForm').serialize(true);
		newsAction.release(formObj, releaseBack);
	}

	function releaseBack(str) {
		if (str == "success") {
			parent.ymPrompt.alert({message:'�����ɹ���',title:''});
			closeWindow();
		} else {
			handler(str);
		}

	}
</script>
<body>
	<form id="auditForm" name="auditForm">
		<input type="hidden" id="billId" name="billId" value="${requestScope.billId}">
		<input type="hidden" id="taskId" name="taskId" value="${requestScope.taskId}">
		<input type="hidden" id="billSn" name="billSn" value="${requestScope.billSn}">
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
									<td></td>
									<td class="radio"><label> <input type="radio"
											name="auditResult" id="optionsRadios1" value="Y" checked>
											ͬ��
									</label></td>
									<td class="radio"><label> <input type="radio"
											name="auditResult" id="optionsRadios2" value="N"> �ܾ�
									</label></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td noWrap>
										<div align="right">���������</div>
									</td>
									<td align="left" colspan="2"><textarea
											name="auditSuggestion" class="form-control" rows="3"></textarea></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td colspan="3" align="center"><input name="auditBtn"
										type="button" class="btn btn-default btn-sm" id="auditBtn"
										value="����" onclick="release(this)"> &nbsp;&nbsp; <input
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