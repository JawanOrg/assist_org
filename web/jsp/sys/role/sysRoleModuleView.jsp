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
    function handler(errors) {
        alert(errors);
        return false;
    }
</script>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body >
	<form name="formView">
		<table border="0" width="100%" cellpadding="0" cellspacing="0">
			<tr>
				<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="120">
							<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif">
							<span>权限组信息</span>
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
															<input type="text" class="inputtext01" name="roleName" maxlength="50" size="40" dataType="Require" msg="权限组名称不能为空" disabled />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     是否有效:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isValid_Y" name="isValid" value="Y" disabled>有效
															<input type="radio" id="isValid_N" name="isValid" value="N" disabled>无效
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     排列次序:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="sortOrder" maxlength="3" size="3" disabled />
														</td>
													</tr>											
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																权限组说明:
															</div>
														</td>
														<td align="left">
															<textarea id="roleDesc" name="roleDesc" rows="2"  style="width: 95%;" class="inputtext01" disabled>
															</textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																权限组成员配置:
															</div>
														</td>
														<td align="left">
															<textarea id="checkNames" name="checkNames" rows="2"  style="width: 95%;" class="inputtext01" disabled>
															</textarea>
														</td>
													</tr>													
													<input type="hidden" id="roleId" name="roleId" value="${sysRole.roleid}"/>
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
			  <tr></tr>
				<td  class="tabpaneleft2"></td>
				<td class="tabpanebg2"   width="120">
					<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
					<span>操作权限配置</span>
				</td>
				<td class="tabpaneright2"></td>	 
		 </table></div>
   <div id="treeboxbox_tree" style=""></div>
  </form>
</body>
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
		document.forms[0].roleName.value ="${sysRole.rolename}";

		if("Y"=="${sysRole.isValid}") {
			$("isValid_Y").checked=true;
		} else {
			$("isValid_N").checked=true;
		}
		
		document.forms[0].sortOrder.value ="${sysRole.sortOrder}";
		document.forms[0].roleDesc.value ="${sysRole.roledesc}";
		document.forms[0].checkNames.value ="${checkNames}";

		trimForm();
	}
	initData();
</script>
</html>