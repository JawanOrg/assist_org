<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUnitAction.js'></script>
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
			var child=tree.hasChildren(id);
			if(child=="0") {
		  	$('btnDel').disabled=false
			} else {
				$('btnDel').disabled=true
			}
		} else
		{
			$('btnEdit').disabled=true;
			$('btnDel').disabled=true;
		}
		$('btnSave').disabled=true;
		$('btnCancel').disabled=true;
		
		document.forms[0].action = "/sys/sysUnitAction.do?method=toSysUnitView";
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
	
	function sysUnitAdd ()
	{
		var id=tree.getSelectedItemId();
		if(id=="")
		{
			document.forms[0].unitId.value="-1";
		} else {
			var ids=id.split("_");
			if(ids.size()>=2) {
				document.forms[0].unitId.value=ids[0];
				document.forms[0].typeSplit.value=ids[1];
				if("P"==document.forms[0].typeSplit.value) {
					var parentId=tree.getParentId(id);
					if("0"==parentId)
					{
						document.forms[0].unitId.value="-1";
					} else {
						var parentIds=parentId.split("_");
						if(parentIds.size()>=2) {
							document.forms[0].unitId.value=parentIds[0];
							document.forms[0].typeSplit.value=parentIds[1];
						} else {
							alert("节点id格式错误！");
							return false; 
						}
					}
				}
			} else {
				alert("节点id格式错误！");
				return false; 
			}
		}
		document.forms[0].action = "/sys/sysUnitAction.do?method=toSysUnitAdd";
	    document.forms[0].target = "list_page";
	    document.forms[0].submit();
	}
	function sysUnitEdit()
	{
		var id=tree.getSelectedItemId();
		if(id!="")
		{
			var ids=id.split("_");
			if(ids.size()>=2) {
				document.forms[0].unitId.value=ids[0];
				document.forms[0].typeSplit.value=ids[1];
				document.forms[0].action = "/sys/sysUnitAction.do?method=toSysUnitEdit";
			    document.forms[0].target = "list_page";
			    document.forms[0].submit();
			} else {
				alert("节点id格式错误！");
				return false; 
			}
		}else
		{
			alert("请选择节点！");
			return false;
		}
	}
	
	function sysUnitDel()
	{
		var id=tree.getSelectedItemId();
		if(id!="")
		{
			var child=tree.hasChildren(id);
			if(child!=0){
				alert("请选择叶子节点！");
				return false;
			}
			if(confirm("确定删除节点"+ getSubName(id) +"?"))
			{
				var ids=id.split("_");
				if(ids.size()>=2) {
					document.forms[0].unitId.value=ids[0];
					document.forms[0].typeSplit.value=ids[1];
					sysUnitAction.deleteDataSysUnit($('unitId').value,delCallback);
					disableForm();
				} else {
					document.forms[0].unitId.value="-1";
					document.forms[0].typeSplit.value="";
				}
			}
		} else {
			alert("请选择节点！");
			return false;
		}
	}
	
	function delCallback(error){
		if(error!="") {
		enableForm();
	   	var id=tree.getSelectedItemId();
	   	if(id!="")
	   	{
	   		var parentId=tree.getParentId(id)
			tree.refreshItem(parentId);
		}
		setUI();
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
	
	function sysUnitSave()
	{
		list_page.window.addTabViewDoSave();
	}
	
	function sysUnitCancel(updateParent)
	{
		if(updateParent==0)
		{
			var id=tree.getSelectedItemId();
			if(id=="")
			{
				tree.refreshItem(0);
				document.forms[0].unitId.value="-1";
				document.forms[0].typeSplit.value="";
			}else {
				var ids=id.split("_");
				if(ids.size()>=2) {
					var typeSplit=ids[1];
					if("P"==typeSplit) {
						var parentId=tree.getParentId(id);
						tree.refreshItem(parentId);
					} else {
						tree.refreshItem(id);
					}
				}else {
					tree.refreshItem(id);
				}	
			}
		}else if(updateParent==1){
			var id=tree.getParentId(tree.getSelectedItemId());
			if(id=="0")
			{
				tree.refreshItem(0);
				document.forms[0].unitId.value="-1";
				document.forms[0].typeSplit.value="";
			}else {
				tree.refreshItem(id);
			}
		} if(updateParent==2){
			tree.refreshItem(0);
			document.forms[0].unitId.value="-1";
			document.forms[0].typeSplit.value="";
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
            <iframe name="list_page" style="width:100%;height:100%;overflow:hidden;border :1px solid Silver;" src="">
            </iframe>
        </td>
	</tr>
	<tr>
		<td width="20" colspan="2" align="left">
			<form id="queryForm" method="post">
	        	<input type="button" class="button" value="添加" id="btnAdd" name="btnAdd" onclick="sysUnitAdd ()" >
				<input type="button" class="button" value="修改" id="btnEdit" disabled name="btnEdit" onclick="sysUnitEdit ()" >
				<input type="button" class="button" value="删除" id="btnDel" disabled name="btnDelave" onclick="sysUnitDel ()" >
				<input type="button" class="button" value="保存" id="btnSave" disabled name="btnSave" onclick="sysUnitSave ()" >
				<input type="button" class="button" value="取消" id="btnCancel" disabled name="btnCancel" onclick="sysUnitCancel (0)" >
				 
				<input type="hidden" id="instanceId" name="instanceId" value="${param.ensureInstanceId}">
				<input type="hidden" id="unitId" name="unitId">
				<input type="hidden" id="typeSplit" name=""typeSplit">
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
    tree.setXMLAutoLoading("/sys/sysUnitAction.do?method=showTreeWithType");
    tree.loadXML("/sys/sysUnitAction.do?method=showTreeWithType&id=0");

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
		var ids=id.split("_");
		if(ids.size()>=2) {
			document.forms[0].unitId.value=ids[0];
			document.forms[0].typeSplit.value=ids[1];
		} else {
			document.forms[0].unitId.value="";
			document.forms[0].typeSplit.value="";
		}
		setUI();
	}
</script>
</html>