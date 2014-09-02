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
<head>
	<title>协作管理系统</title>
</head>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
        enableForm();
        setUI();
        return false;
    }
    
	function setUI()
	{
		var id=tree.getSelectedItemId();
		$('btnAdd').disabled=false;
		if(id!="")
		{
			$('btnEdit').disabled=false;
		  	$('btnDel').disabled=false
		} else
		{
			$('btnEdit').disabled=true;
			$('btnDel').disabled=true;
		}	    
		$('btnSave').disabled=true;
		$('btnCancel').disabled=true;
		
		document.forms[0].action = "/sys/sysRoleModuleAction.do?method=toSysRoleModuleView";
	    document.forms[0].target = "list_page";
	    document.forms[0].submit();
	}
	
	function enabledToSave()
	{
		$('btnAdd').disabled=true;
		$('btnEdit').disabled=true;
		$('btnDel').disabled=true;
		$('btnSave').disabled=false;
		$('btnCancel').disabled=false;
	}
	
	function sysRoleAdd ()
	{
		var id=tree.getSelectedItemId();
		if(id=="")
		{
			document.forms[0].roleId.value="-1";
		} else {
			document.forms[0].roleId.value=id;
			var parentId=tree.getParentId(id);
		}
		document.forms[0].action = "/sys/sysRoleAction.do?method=toSysRoleAdd";
	    document.forms[0].target = "list_page";
	    document.forms[0].submit();
	}
	function sysRoleEdit()
	{
		var id=tree.getSelectedItemId();
		if(id!="")
		{

			document.forms[0].roleId.value=id;
			document.forms[0].action = "/sys/sysRoleModuleAction.do?method=toSysRoleModuleEdit";
		    document.forms[0].target = "list_page";
		    document.forms[0].submit();

		}else
		{
			alert("请选择节点！");
			return false;
		}
	}
	
	function sysRoleDel()
	{
		var id=tree.getSelectedItemId();
		if(id!="")
		{
			if(confirm("此操作可能会影响"+ getSubName(id) +"相关用户和组织的权限，确定删除节点"+ getSubName(id) +"?"))
			{
				document.forms[0].roleId.value=id;
				sysRoleModuleAction.deleteDataSysRoleModule($('roleId').value,delCallback);
				disableForm();
			}
		} else {
			alert("请选择节点！");
			return false;
		}
	}
	
	function delCallback(error){
		if(error!="") {
			return handler(error);
		} else {
			alert("操作成功");
		}
	    enableForm();
	   	var id=tree.getSelectedItemId();
	   	if(id!="")
	   	{
	   		var parentId=tree.getParentId(id)
			tree.refreshItem(parentId);
		}
		setUI();
	}
	
	function sysRoleSave()
	{
		list_page.window.addTabViewDoSave();
		tree.refreshItem("0");
	}
	
	function sysRoleModuleCancel ()
	{

		var id=tree.getSelectedItemId();
		if(id=="")
		{
			tree.refreshItem("0");
			document.forms[0].roleId.value="-1";
		}else {
			tree.refreshItem("id");	
		}
		setUI();
	}
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<table border="0" style="FONT-SIZE: 13px" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%" > 
	<tr>
		<td width="29.5%">
        	<div id="show_tree" style="width:100%;height:100%;overflow:hidden;border :1px solid Silver;"></div>
        </td>
		<td width="70.5%">
            <iframe name="list_page" height="410" width="100%"  frameborder="0" MARGINWIDTH="0" MARGINHEIGHT="0" src="">
            </iframe>
        </td>
	</tr>
	<tr>
		<td width="100%" colspan="2" align="left">
			<form id="queryForm" method="post">
	        	<input type="button" class="button" value="添加" id="btnAdd" name="btnAdd" onclick="sysRoleAdd ()" >
				<input type="button" class="button" value="修改" id="btnEdit" disabled name="btnEdit" onclick="sysRoleEdit ()" >
				<input type="button" class="button" value="删除" id="btnDel" disabled name="btnDelave" onclick="sysRoleDel ()" >
				<input type="button" class="button" value="保存" id="btnSave" disabled name="btnSave" onclick="sysRoleSave ()" >
				<input type="button" class="button" value="取消" id="btnCancel" disabled name="btnCancel" onclick="sysRoleModuleCancel ()" >
				 
				<input type="hidden" id="roleId" name="roleId">
			</form>
        </td>
	</tr>
</table>
</body>

<script>
    /*实列化dhtmlxtree树型对象*/
    var tree = new dhtmlXTreeObject("show_tree", "100%", "100%", 0);
    tree.setImagePath("/js/dhtmlxtree/imgs/");
    tree.enableCheckBoxes(0);
    tree.enableDragAndDrop(false);
    tree.setOnClickHandler(clickable);
    tree.setXMLAutoLoading("/sys/sysRoleModuleAction.do?method=showTreeWithType");
    tree.loadXML("/sys/sysRoleModuleAction.do?method=showTreeWithType&id=0");

	function getSubName (id) {
		var name=tree.getItemText(id);
		return name;
	}
	
	function clickable (id) {
        document.forms[0].roleId.value=id;
		setUI();
	}
</script>
</html>