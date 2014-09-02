<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicConfigAction.js'></script>
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
        enableForm("editSysDicConfigForm");
        return false;
    }
    
</script>
<body>
	<form name="editSysDicConfigForm">
			<input type="hidden" id="dictionaryId" name="dictionaryId" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
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
															<input type="text" class="inputtext01" name="dictionaryName" maxlength="64" style="width:85%" style="border:0 0 0 0" readOnly />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       数据字典代号:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="dictionaryCode" maxlength="64" style="width:85%" style="border:0 0 0 0" readOnly />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       备注:
															</div>
														</td>
														<td align="left">
															<textarea name="remark" type="text" rows="8"  style="width:85%" class="inputtext01" >
															</textarea>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="editAndSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="editAndCancel();" value="取消">
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

	var objData = window.dialogArguments;
	
	if(objData!=null){
		if(objData.dictionaryName!=null && objData.dictionaryName!=""){
			$('dictionaryName').value = objData.dictionaryName;
		}
		if(objData.dictionaryCode!=null && objData.dictionaryCode!=""){
			$('dictionaryCode').value = objData.dictionaryCode;
		}
		if(objData.remark!=null && objData.remark!=""){
			$('remark').value = objData.remark;
		}
		if(objData.dictionaryId!=null && objData.dictionaryId!=""){
			$('dictionaryId').value = objData.dictionaryId;
		}
	}
	
	initSysDicConfigData();
	
	function initSysDicConfigData() {
		trimForm();
	}
    
    function editAndCancel() {
    	window.close();
    }
    
    function editAndSave() {
    	if (!validateForm(editSysDicConfigForm, 1)) {
            return false;
        }
		var formObj = $('editSysDicConfigForm').serialize(true); 
    	sysDicConfigAction.updateDataSysDicConfig(formObj,callBackDoSave);
    }
    
    function callBackDoSave(str) {
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