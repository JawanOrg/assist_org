<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysModuleAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>

<link rel="STYLESHEET" type="text/css" href="/js/dhtmlxtree/dhtmlxtree.css">
<script src="<%=request.getContextPath()%>/js/dhtmlxtree/dhtmlxcommon.js"></script>
<script src="<%=request.getContextPath()%>/js/dhtmlxtree/dhtmlxtree.js"></script>

<html>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
    	enableForm();
    	$('parentModuleid').disabled=true;
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
		if(commonGetLength(document.forms[0].moduleDesc.value) > 250) {
		  alert("输入的菜单描述长度不能超过250个字符!");
		  return false;
		}
		var formObj =  $('formAdd').serialize(true);
		sysModuleAction.addDataSysModule(formObj,callback);
		disableForm();
	}
	function callback (error) {
		if(error!="") {
			return handler(error);
		} else {
			alert("操作成功");
		}
		if(document.forms[0].parentModuleid.value=="0") {
			parent.sysModuleCancel(1);
		} else {
			parent.sysModuleCancel(0);
		}
    }
    
    function setAsNewRoot()
    {
    	//document.forms[0].parentName.value ="----";
		document.forms[0].parentModuleid.value ="0";
		document.forms[0].moduleName.value ="";
		document.forms[0].moduleDes.value ="";
		
		$("isValid_Y").checked=true;
		$("isLeaf_Y").checked=true;
		document.forms[0].sortOrder.value ="";
		document.forms[0].moduleUrl.value ="";
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
							<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
							<span>模块新增</span>
						</td>
						<td class="tabpaneright2"></td>
				    </tr>
			    </table>
			</tr>
			<tr>
				<td>
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
						<tr>
							<td class="bg_01">
								<table width="100% border=" 0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     上级模块:
															</div>
														</td>
														<td align="left">
															<select name="parentModuleid" class="inputtext01" style="width:100" >											               
											                  <c:forEach items="${list}" var="sysModule">
											                    <option value="${sysModule.moduleId}"<c:if test="${sysModule.moduleId eq parentModuleid}">selected</c:if> >${sysModule.moduleName}</option>
											                  </c:forEach>
											                    <option value="0"<c:if test="${'0' eq parentModuleid}">selected</c:if> >----</option>
											               </select>	
															<c:if test="${parentModuleid!='0'}">
																<input type="button" class="button" value="新增为一级模块" id="btnSetAsRoot" name="btnSetAsRoot" onclick="setAsNewRoot ()" >
															</c:if>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      模块名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="moduleName" maxlength="50" size="40" dataType="Require" msg="组织名称不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     是否有效:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isValid_Y" name="isValid" value="Y" checked>有效
															<input type="radio" id="isValid_N" name="isValid" value="N">无效
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     是否叶子菜单:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isLeaf_Y" name="isLeaf" value="Y" checked>是
															<input type="radio" id="isLeaf_N" name="isLeaf" value="N">否
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     排列次序:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="sortOrder" maxlength="3" size="3" value="0"  msg="排序必须为数字"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																模块视图链接:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="moduleUrl" maxlength="130" size="70" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																模块描述:
															</div>
														</td>
														<td align="left">
															<textarea id="moduleDesc" name="moduleDesc" rows="3"  style="width: 95%;" class="inputtext01" >
															</textarea>
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
	function initData()
	{
		//document.forms[0].parentName.value ="${parentName}";
		document.forms[0].parentModuleid.value ="${parentModuleid}";
		trimForm();
	}
	initData();
</script>
