<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigSystemAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>协作管理系统</title>
</head>
<body>
	<form name="ifaceConfigSystemForm">
			<input type="hidden" id="applicationId" name="applicationId" value="" />
			<input type="hidden" id="applicationSn" name="applicationSn" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">编辑所选接口系统</td>
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
															      系统名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="applicationName" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       系统编码:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="applicationSnEdit" disabled/>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="ifaceConfigSystemSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="ifaceConfigSystemClose();" value="取消">
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
    var diaObj = window.dialogArguments;
    if(diaObj!=null) {
    	//主键
    	if(diaObj.applicationId!=null && diaObj.applicationId!='') {
    		$('applicationId').value = diaObj.applicationId;
    	}
    	//应用程序名称
    	if(diaObj.applicationName!=null && diaObj.applicationName!='') {
    		$('applicationName').value = diaObj.applicationName;
    	}
    	//应用程序编码(non-view)
    	if(diaObj.applicationSn!=null && diaObj.applicationSn!='') {
    		$('applicationSn').value = diaObj.applicationSn;
    	}
    	//应用程序编码(view)
    	if(diaObj.applicationSn!=null && diaObj.applicationSn!='') {
    		$('applicationSnEdit').value = diaObj.applicationSn;
    	}
    }
    
    function ifaceConfigSystemClose() {
    	window.close();
    }
    
    function ifaceConfigSystemSave() {
    	if (!validateForm(ifaceConfigSystemForm, 1)) {
            return false;
        }
		var formObj = $('ifaceConfigSystemForm').serialize(true);
    	ifaceConfigSystemAction.updateByPrimaryKeySelective(formObj,callBackDoSave);
    }
    
    function callBackDoSave() {
    	alert("操作成功");
    	window.returnValue=1;
    	window.close();
    }
    
</script>
</html>