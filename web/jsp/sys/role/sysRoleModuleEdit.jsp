<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysRoleModuleAction.js'></script>
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
    
    var ResultOfshowModalDialog = "cancel";                           // 定义弹出页面sysUnitRoleEdit.jsp的返回动作，初始化为"cancel"
    function handler(errors) {
        alert(errors);
    	enableForm();
        return false;
    }
	function load()
	{
		parent.enabledToSave();
	}
	function addTabViewDoSave ()
	{	
		var checkids=tree.getAllCheckedBranches();
		trimForm();
		if (!validateForm(document.forms[0], 1)) {
            return false;
        }
		if(commonGetLength(document.forms[0].roledesc.value) > 250) {
		  alert("输入的权限组说明长度不能超过250个字符!");
		  return false;
		}
		var formObj =  $('formEdit').serialize(true);
		formObj.checkids = checkids;

		sysRoleModuleAction.updateDataSysRoleModule(formObj, ResultOfshowModalDialog, callback);
		disableForm();
	}
	function callback (error) {
		if(error!="") {
			return handler(error);
		} else {
			alert("操作成功");
		}
		parent.sysRoleModuleCancel(1);
    }
    
    function showDialogSelectPostUser() {
		var roleId=$('roleid').value;
	   	var returnValue= window.showModalDialog("/jsp/sys/role/sysUnitRoleEdit.jsp?roleId="+roleId,"scroll:yes;status:no;help:0;resizable:0;dialogWidth:500px;dialogHeight:500px");
 		if(returnValue!=null){
 		    var postIdStr="";
 		    var userIdStr="";
 		    var str = "";
 		    checkeds = returnValue.split(";");
 		    if(checkeds.length>=2) {
	 		    returnValue = checkeds[0];                             // 此权限组的岗位ID和人员ID组成的字符串
	 	        $('checkNames').value = checkeds[1];                   // 此权限组的岗位名字和人员名字组成的字符串
	 			returnValues=returnValue.split(",");                   // 通过split取得此权限组的每个岗位ID和人员ID
	 		    for(i=0; i < returnValues.length; i++){
	 		        returnStr = returnValues[i].split("|");
	 		        if(returnStr.length>=2){
	 		           if(returnStr[1] == "P"){                        // 如果是岗位,ID存进字符串“postIdStr”
	 		               postIdStr += returnStr[0];
	 		               postIdStr += ",";
	 		           }
	 		           if(returnStr[1] == "user"){                     // 如果是人员，ID存进字符串“userIdStr”
	 		               userIdStr += returnStr[0];
	 		               userIdStr += ",";
	 		           }
	 		        }
	 		    }
	 		    
	 		    str += postIdStr;
	 		    str += "|";
	 		    str += userIdStr;
	 		    $('postCheckIds').value = postIdStr;
	 		    $('userCheckIds').value = userIdStr;
 		    }else {
 		        $('checkNames').value = "";
 		        $('postCheckIds').value = "";
	 		    $('userCheckIds').value = "";
 		    }
			ResultOfshowModalDialog = "confirm";                        // 弹出页面sysUnitRoleEdit.jsp通过"确认"按钮返回此页面
 		}

    }    
     	
</script>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body onload="load();">
	<form name="formEdit" id="formEdit">
		<table border="0" width="100%" cellpadding="0" cellspacing="0">
			<tr>
				<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="120">
							<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
							<span>权限组信息修改</span>
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
															      权限组名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="rolename" maxlength="50" size="40" dataType="Require" msg="权限组名称不能为空"  />
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
															<input type="radio" id="isValid_Y" name="isValid" value="Y" >有效
															<input type="radio" id="isValid_N" name="isValid" value="N" >无效
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     排列次序:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="sortOrder" maxlength="3" size="3"  msg="排序必须为数字"/>
														</td>
													</tr>	
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																权限组说明:
															</div>
														</td>
														<td align="left">
															<textarea id="roledesc" name="roledesc" rows="2"  style="width: 95%;" class="inputtext01" >
															</textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																权限组组织配置:
															</div>
														</td>
														<td align="left">
															<textarea readOnly onclick="return showDialogSelectPostUser();" id="checkNames" name="checkNames" rows="2"  style="width: 95%;" class="inputtext01" >
															</textarea>
														</td>
													</tr>	
													<input type="hidden" id="roleid" name="roleid" value="${sysRole.roleid}"/>
													<input type="hidden" id="checkids" name="checkids" value="" />
													<input type="hidden" id="postCheckIds" name="postCheckIds" value="${sysRole.postCheckIds}" />
												    <input type="hidden" id="userCheckIds" name="userCheckIds" value="${sysRole.userCheckIds}" />													
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
		<DIV class=tab-pane id=tabPane>
		<DIV class=tab-page id=tabPage>
		<div align=left  class=tab>
				<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="120">
							<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
							<span>操作权限配置</span>
						</td>
						<td class="tabpaneright2"></td>
				 
			    </table></div>
   <div id="treeboxbox_tree" style=""></div>
<script>

    /*实列化dhtmlxtree树型对象*/
    var tree = new dhtmlXTreeObject("treeboxbox_tree", "100%", "100%", 0);
    tree.setImagePath("/js/dhtmlxtree/imgs/");
    tree.enableCheckBoxes(1);
    tree.enableDragAndDrop(false);    
	tree.enableThreeStateCheckboxes(true);
    tree.setOnClickHandler(clickable);
    tree.setXMLAutoLoading("/sys/sysRoleModuleAction.do?method=showModuleTreeWithType&roleId=${sysRole.roleid}");
    tree.loadXML("/sys/sysRoleModuleAction.do?method=showModuleTreeWithType&roleId=${sysRole.roleid}&id=0");
    
    //var moduleList = ${moduleList};
    //for (var i = 0; i<moduleList.length; i++) {
    //	tree.setCheck(moduleList[i],true);
    //}

        
        

	function getSubName (id) {
		var name=tree.getItemText(id);
		var newid=tree.getParentId(id);
		for(var i=1;i<=tree.getLevel(id)-1;i++) {
		   name=tree.getItemText(newid)+"："+name
		   newid=tree.getParentId(newid);
		}
		return name;
	}
	
	function clickable (id) {
        document.forms[0].moduleId.value=id;
	}
</script>  
</DIV>         
</form>
</body>
<script type="text/javascript">
	function initData()
	{
		document.forms[0].rolename.value ="${sysRole.rolename}";

		if("Y"=="${sysRole.isValid}") {
			$("isValid_Y").checked=true;
		} else {
			$("isValid_N").checked=true;
		}
		
		document.forms[0].sortOrder.value ="${sysRole.sortOrder}";
		document.forms[0].roledesc.value ="${sysRole.roledesc}";
		document.forms[0].checkNames.value ="${checkNames}";

		trimForm();
	}
	initData();
</script>
</html>