<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/css/ymPrompt/vista/ymPrompt.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>协作管理系统</title>
</head>
<script>
	var returnMessage = '${requestScope.returnMessage}';
	if (returnMessage == "success") {
		ymPrompt.alert({
			message : '文件上传成功！',
			title : '',
			handler : closeWindowDelay
		});
	} else if (returnMessage != "") {
		ymPrompt.errorInfo({
			message : '文件上传失败：' + returnMessage,
			title : '',
			handler : closeWindowDelay
		});
	}
	function closeWindowDelay(returnStr) {
		if (returnStr == "ok" || returnStr == "close") {
			parent.ymPrompt.doHandler('close');
		}
	}
	function closeWindow() {
		parent.ymPrompt.doHandler('close');
		parent.refreshDetail($('billId').value, $('billSn').value);
	}
	function addRow() {
		var length = filesTable.rows.length;
		var newTr = filesTable.insertRow();
		var newTd0 = newTr.insertCell();
		var newTd1 = newTr.insertCell();
		var newTd2 = newTr.insertCell();
		newTd0.innerHTML = '<td align="right" class="left_txt2">附件名称：</td>';
		newTd1.innerHTML = '<td><input class="form-control" type="file" id=attachFile+length name="attachFile"+length /></td>';
		newTd2.innerHTML = '<td>&nbsp;<span class="glyphicon glyphicon-trash" style="cursor:pointer" onclick="delRow()"></span> &nbsp;&nbsp;<span class="glyphicon glyphicon-plus" style="cursor:pointer" onclick="addRow()"></span></td>';

	}
	function delRow() {
		filesTable
				.deleteRow(window.event.srcElement.parentElement.parentElement.rowIndex);
	}
</script>
<body>
	<form id="uploadForm" name="uploadForm" method="post"
		action='/FileUploadServlet' ENCTYPE="multipart/form-data"
		target="_self">
		<input type="hidden" name="billId" value="${param.billId}"> <input
			type="hidden" name="businessType" value="${param.businessType}">
		<input type="hidden" name="actionId" value="${param.actionId}">
		<input type="hidden" name="shareTypeWrite"
			value="${param.shareTypeWrite}">
		<div class="panel panel-default">
			<div class="panel-heading">附件上传</div>
			<div class="panel-body">
				<table width="100%" border="0" ellpadding="2" cellspacing="1">
					<tr>
						<td valign="top">
							<table height="100%" width=90% border=0 cellpadding=2
								cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF
								bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
								pcolor="#CCCCCC">
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td class="radio" colspan="2"><div id="shareTypeViewDiv1">
											<label> <input type="radio" name="shareTypeView"
												id="optionsRadios1" value="all">所有人可见
											</label>
										</div></td>
									<td class="radio"><div id="shareTypeViewDiv2">
											<label> <input type="radio" name="shareTypeView"
												id="optionsRadios2" value="unit" checked>本单位共享
											</label>
										</div></td>
									<td class="radio"><div id="shareTypeViewDiv3">
											<label> <input type="radio" name="shareTypeView"
												id="optionsRadios3" value="private">本人私有
											</label>
										</div></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td colspan="6">
										<table id="filesTable" height="100%" width="100%" border=0
											cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC
											bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box
											id=powergrid style="FONT-SIZE: 13px" pcolor="#CCCCCC">
											<tr>
												<td align="right" class="left_txt2">附件名称：</td>
												<td><input class="form-control" type="file"
													id="attachFile" name="attachFile" /></td>
												<td>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;<span
													class="glyphicon glyphicon-plus" style="cursor:pointer"
													onclick="addRow()"></span></td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td colspan="6" align="center"><input name="submit"
										type="submit" class="btn btn-default btn-sm" id="submit"
										value="上传"> &nbsp;&nbsp; <input type="button"
										class="btn btn-default btn-sm" onClick="closeWindow()"
										value="取消"></td>
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