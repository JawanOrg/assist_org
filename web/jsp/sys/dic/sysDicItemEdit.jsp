<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicConfigAction.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicItemAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>协作管理系统</title>
</head>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("editSysDicItemForm");
        return false;
    }
    
</script>
<body>
	<form name="editSysDicItemForm">
			<input type="hidden" id="dictionaryId" name="dictionaryId" value="" />
			<input type="hidden" id="itemId" name="itemId" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">编辑数据字典条目</td>
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
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="35%">
															<div align="right">
															       数据字典名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name=dictionaryName maxlength="64" readOnly style="width:85%;border:0 0 0 0" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       数据字典条目名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="itemValue" maxlength="64" style="width:85%" dataType="Require" msg="数据字典名称不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       数据字典条目代号:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="itemCode" maxlength="64" style="width:85%" dataType="Require" msg="数据字典代号不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       备注:
															</div>
														</td>
														<td align="left">
															<textarea name="itemDesc" type="text" rows="8"  style="width:85%" class="inputtext01" >
															</textarea>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="sysDicItemSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="sysDicItemCancel();" value="取消">
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
	</form>
</body>
<script type="text/javascript">
    var obj = window.dialogArguments;
    if(obj!=null) {
    	if(obj.itemValue!=null && obj.itemValue!="") {
    		$('itemValue').value = obj.itemValue;
    	}
    	if(obj.itemCode!=null && obj.itemCode!="") {
    		$('itemCode').value = obj.itemCode;
    	}
    	if(obj.itemDesc!=null && obj.itemDesc!="") {
    		$('itemDesc').value = obj.itemDesc;
    	}
    	if(obj.itemDesc!=null && obj.itemDesc!="") {
    		$('itemDesc').value = obj.itemDesc;
    	}
    	if(obj.dictionaryId!=null && obj.dictionaryId!="") {
    		$('dictionaryId').value = obj.dictionaryId;
    	}
    	if(obj.itemId!=null && obj.itemId!="") {
    		$('itemId').value = obj.itemId;
    	}
    }
    
    initSysDicConfigIdAndName();
    
    function initSysDicConfigIdAndName() {
    	if(obj.dictionaryId!=null && obj.dictionaryId!="") {
    		sysDicConfigAction.getDataSysDicConfig(obj.dictionaryId,callbackInit);
    		disableForm();
    	}
	}
	
	function callbackInit(obj) {
		enableForm();
		$('dictionaryName').value = obj.dictionaryName;
		trimForm();
	}
    
    function sysDicItemCancel() {
    	window.close();
    }
    
    function sysDicItemSave() {
    	if (!validateForm(editSysDicItemForm, 1)) {
            return false;
        }
		var formObj = $('editSysDicItemForm').serialize(true); 
    	sysDicItemAction.updateDataSysDicItem(formObj,callBackDoSave);
    	disableForm();
    }
    
    function callBackDoSave(str) {
    	enableForm();
    	if(str == "") {
    		alert("操作成功");
	    	window.returnValue = 1;
	    	window.close();
    	} else {
    		handler(str);
    	}
    }
    
</script>
</html>