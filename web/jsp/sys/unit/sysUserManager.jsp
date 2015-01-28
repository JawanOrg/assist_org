<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUserUnitAction.js'></script>
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
		if(id!="")
		{
			var ids=id.split("_");
			if(ids.size()>=2) {
				document.forms[0].unitId.value=ids[0];
				document.forms[0].typeSplit.value=ids[1];
				dateView();
			}
		} else {
			list_page.navigate("/js/dhtmlxtree/imgs/blank.html");
		}
	}

	function dateView()
	{
		document.forms[0].action = "/sys/sysUserUnitAction.do?method=toSysUserUnitSrch";
	    document.forms[0].target = "list_page";
	    document.forms[0].submit();
	}

</script>

<body onload="DWRUtil.useLoadingMessage('数据操作中')" bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0">
	<iframe id="exportFrame" name="exportFrame" style="display: none"></iframe>
	<form id="queryForm" method="POST">
		<input type="hidden" id="unitId" name="unitId">
		<input type="hidden" id="typeSplit" name="typeSplit">
		<table border="0" style="FONT-SIZE: 13px" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
			<tr>
				<td width="29.5%" >
					<div id="show_tree" style="width: 100%; height: 100%; overflow: hidden; border: 1px solid Silver;"></div>
				</td>
				<td width="70.5%">
					<iframe name="list_page"  style="width:100%;height:100%;overflow:hidden;border :1px solid Silver;" src="">
					</iframe>
				</td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
    /*实列化dhtmlxtree树型对象*/
    var tree = new dhtmlXTreeObject("show_tree", "100%", "100%", "${requestScope.rootId}");
    tree.setImagePath("/js/dhtmlxtree/imgs/");
    tree.enableCheckBoxes(0);
    tree.setOnClickHandler(clickable);
    tree.enableDragAndDrop(false);
    tree.setXMLAutoLoading("/sys/sysUnitAction.do?method=showTreeWithType");
	tree.loadXML("/sys/sysUnitAction.do?method=showTreeWithRootId&id=${requestScope.id}");	    
  
	function getSubName (id) {
		var name=tree.getItemText(id);
		var newid=tree.getParentId(id);
		for(var i=1;i<=tree.getLevel(id)-1;i++) {
		   name=tree.getItemText(newid)+"："+name;
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
		if(document.forms[0].typeSplit.value!="") {
			setUI();
		} else {
			list_page.navigate("/js/dhtmlxtree/imgs/blank.html");
		}
	}
</script>
</html>
