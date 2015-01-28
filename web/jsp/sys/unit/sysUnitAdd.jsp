<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUnitAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="/css/cb2.css" type="text/css">
<link rel="stylesheet" href="/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>

<link rel="STYLESHEET" type="text/css" href="/js/dhtmlxtree/dhtmlxtree.css">
<script src="/js/dhtmlxtree/dhtmlxcommon.js"></script>
<script src="/js/dhtmlxtree/dhtmlxtree.js"></script>

<html>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
    	enableForm();
    	$('parentName').disabled=true;
        return false;
    }
	function load()
	{
		parent.enabledToSave();
	}
	
	function addTabViewDoSave ()
	{	
		trimForm();
		if (!validateForm(document.forms[0], 1)) {
            return false;
        }
		if(commonGetLength(document.forms[0].remark.value) > 250) {
		  alert("����ı�ע���Ȳ��ܳ���250���ַ�!");
		  return false;
		}		
		var formObj =  $('formAdd').serialize(true);
		sysUnitAction.addDataSysUnit(formObj,callback);
		disableForm();
	}
	
	
	
	function callback (error) {
		if(error!="") {
			return handler(error);
		} else {
			alert("�����ɹ�");
		}
		if(document.forms[0].parentUnitid.value=="0") {
			parent.sysUnitCancel(2);
		} else {
			parent.sysUnitCancel(0);
		}
    }
    
    function setAsNewRoot()
    {
    	document.forms[0].parentName.value ="----";
		document.forms[0].parentUnitid.value ="0";
		document.forms[0].unitName.value ="";
		$("unitType_G").checked=true;
		document.forms[0].unitDes.value ="";
		document.forms[0].phone.value ="";
		
		$("isValid_Y").checked=true;
		document.forms[0].sortOrder.value ="";
		document.forms[0].remark.value ="";
    }
</script>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body onload="load();">
	<form name="formAdd" id="formAdd">
		<table border="0" width="100%" cellpadding="0" cellspacing="0">
			<tr>
				<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="120">
							<img src="/images/main_01/ico_fellow.gif" width="18" height="15">
							<span>��֯����</span>
						</td>
						<td class="tabpaneright2"></td>
				    </tr>
			    </table>
			</tr>
			<tr>
				<td>
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table">
						<tr>
							<td class="bg_01">
								<table width="100% border="0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     �ϼ���֯:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="parentName" disabled >
															<c:if test="${requestScope.parentUnitid!='0'}">
																<input type="button" class="button" value="����Ϊһ����֯" id="btnSetAsRoot" name="btnSetAsRoot" onclick="setAsNewRoot ()" >
															</c:if>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      ��֯����:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="unitName" maxlength="50" size="40" dataType="Require" msg="��֯���Ʋ���Ϊ��" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																��֯����:
															</div>
														</td>
														<td align="left">
															<input type="radio" id="unitType_P" name="unitType" value="P" checked>����
															<input type="radio" id="unitType_U" name="unitType" value="U">��λ
															<input type="radio" id="unitType_S" name="unitType" value="S">����
															<input type="radio" id="unitType_N" name="unitType" value="N">����
															<input type="radio" id="unitType_G" name="unitType" value="G">Э����
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     �绰:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="phone"  maxlength="16"  size="18"  dataType="Require" msg="�绰����Ϊ��" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																����Ա:
															</div>
														</td>
														<td align="left">
															<input type="text" readOnly class="inputtext01" id="unitDesName" name="unitDesName" maxlength="100" size="50" onclick="return showDialogSelectPostUser();"/>
															<input type="hidden" id="unitDes" name="unitDes"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     �Ƿ���Ч:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isValid_Y" name="isValid" value="Y" checked>��Ч
															<input type="radio" id="isValid_N" name="isValid" value="N">��Ч
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     ����:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="sortOrder" maxlength="8" size="8" value="0"  msg="�������Ϊ����"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																��ע:
															</div>
														</td>
														<td align="left">
															<textarea id="remark" name="remark" rows="3"  style="width: 95%;" class="inputtext01">
															</textarea>
														</td>
													</tr>
													<input type="hidden" id="parentUnitid" name="parentUnitid" value="${requestScope.parentUnitid}"/>
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
	function initData()
	{
		document.forms[0].parentName.value ="${requestScope.parentName}";
		document.forms[0].unitName.value ="${requestScope.unitName}";
		$("unitType_P").checked=true;
		document.forms[0].unitDes.value ="${requestScope.unitDes}";
		document.forms[0].phone.value ="${requestScope.phone}";
		$("isValid_Y").checked=true;
		document.forms[0].sortOrder.value ="${requestScope.sortOrder}";
		document.forms[0].remark.value ="${requestScope.remark}";
		trimForm();
	}
	initData();
	    
    function showDialogSelectPostUser() {
		var roleId='';//$('roleid').value;
	   	var returnValue= window.showModalDialog("/jsp/sys/role/sysUnitRoleEdit.jsp?roleId="+roleId,"scroll:yes;status:no;help:0;resizable:0;dialogWidth:500px;dialogHeight:500px");
	   	if(returnValue!=null){
 		    var postIdStr="";
 		    var userIdStr="";
 		    var str = "";
 		    userNum = returnValue.split(",");
 		    if(userNum.length>=2) {
 		    	alert("ֻ��ѡ��һλ��Ա��");
 		    }else if(userNum.length==1){
 	 		    checkeds = returnValue.split(";");
 		        $('unitDesName').value = checkeds[1];
 		        $('unitDes').value = checkeds[0].split("|")[0];
 		    }
			ResultOfshowModalDialog = "confirm";                        // ����ҳ��sysUnitRoleEdit.jspͨ��"ȷ��"��ť���ش�ҳ��
 		}

    }    
</script>
</html>