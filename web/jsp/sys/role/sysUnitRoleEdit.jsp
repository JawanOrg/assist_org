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

<html:html>
<head>
	<title>权限组组织树</title>
	<base target="_self">
	<script language="javascript">
		var isDdialog=1;
		if((window.dialogArguments==null)||(window.dialogArguments=="undefined"))
		{
			isDdialog=0;
		}
	</script>
</head>

<body background="../../affiche/image/bg.jpg" leftmargin="0" topmargin="0">
<form>
<input type="hidden" name="faultCause">
<input type="hidden" name="faultCauseName">
<input type="hidden" name="child">
</form>
<table  border ="0" width="100%"  cellpadding="0" cellspacing="0">
 <tr>
   <table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr>
		<td width="100%"  class="headers" height="24px">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" >
				<tr class="headerfont">
					<td width="3%"></td>
	                         <td width="40%">权限组组织树</td>
	                         <td width="57%"></td>
	                     </tr>
			</table>
		</td>
	</tr>
  </table>
 </tr>	
  <tr>
		<td bgcolor="#FFFFFF">
	     	<TABLE id="querytable" border=1 width=100% class="formbg01" CELLPADDING=0 CELLSPACING=0 BORDERCOLORDARK=#CCCCCC bordercolordark=#FFFFFF 
	     	    bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px" pcolor="#CCCCCC">
	   			<tr>
			   		<td >
				    	<table id="querybar" class="sort-table" id="rsTable" width="100%">
				  			<tr>
				  				<td bgcolor="#FFFFFF"  height="380" >
					        		<div id="show_tree" style="width:100%;height:100%;overflow:hidden;border :1px solid Silver;"></div>
								</td>
							</tr>
			                <tr>
			                  	<td colspan="2" align="center">
				                  <input type="button" class="button" name="unitType" value="确认(S)" onclick="dosubmit()"  accesskey="S">
				                  <input type="button" class="button" name="unitType" value="取消(B)" onclick="docancle()"  accesskey="B">
				                  <input type="hidden" id="roleid" name="roleid" value="${param.roleId}"/>
					            </td>
			                </tr>
				     	</table>
				    </td>
				</tr>
	    	</table>
		</td>
  </tr>
</table>

</body>
<script type="text/javascript">
	//var roleid=$('roleid').value; 
  //var areas=area.split(",");
			
	 /*实列化dhtmlxtree树型对象*/
	var tree = new dhtmlXTreeObject("show_tree", "100%", "100%", 0);
    tree.setImagePath("/js/dhtmlxtree/imgs/");
	tree.enableDragAndDrop(false);
    tree.enableCheckBoxes(1); //添加复选框
    tree.enableThreeStateCheckboxes(true);//级联
 	tree.setOnOpenEndHandler(OnOpenEndHandler);
	tree.setXMLAutoLoading("/sys/sysRoleModuleAction.do?method=showUserUnitTreeWithType&roleId=${param.roleId}");
	tree.loadXML("/sys/sysRoleModuleAction.do?method=showUserUnitTreeWithType&roleId=${param.roleId}&id=0", OnOpenEndHandler);		
	
	function dosubmit(){
	   	var checkids=tree.getAllChecked();
	   	var threeCheckids = tree.getAllCheckedBranches();
	   	var alltextchecked = "";
	   	ids = checkids.split(",");
	   	for (var i=0;i <ids.length; i++) {
			if(ids[i]!="") {
				var nodeName= tree.getItemText(ids[i]);
				if(nodeName!="0") {
					alltextchecked= alltextchecked + "," + tree.getItemText(ids[i]);
				}else {
					alltextchecked= alltextchecked + "." ;
				}
			}
		}
		if(alltextchecked.length>0) {
			if(alltextchecked.substring(0, 1)==",") {
				alltextchecked=alltextchecked.substring(1, alltextchecked.length); 
			}
		}
	   	window.returnValue = checkids+";"+ alltextchecked ;
		window.close();
	}

	
	function docancle(){
		if(isDdialog==0){
			parent.dhxWins._closeWindow(parent.dhxWins.window('dwin'));
			alert("0");
		}else{
			window.close();
		    alert("!0");
		}
	}
	
	function OnCheckHandler(id) {
		if(tree.isItemChecked(id)=='1') {
			areasAdd(id);
			var subItemsId = tree.getAllSubItems(id);
			var subItems = subItemsId.split(",");
			for(var i=0;i<subItems.length;i++) {
				tree.setCheck(subItems[i],false);
				areasRemove(subItems[i]);
			}
		} else {
			areasRemove(id);
		}
		if(tree.getParentId(id).length>0) {
			var id=tree.getParentId(id);
			while(id!="0") {
				tree.setCheck(id,false);
				areasRemove(id);
				id=tree.getParentId(id);
			}
		}
	}
	
	function areasAdd(id)
	{
		var  isHas=0;
		for (var i=0;i <areas.length; i++) { 
			if(areas[i]==id) {
				isHas=1;
			}
		}
		if(isHas==0) {
			areas.push(id);
		}
	}
	
	function areasRemove(id)
	{
		for (var i=0;i <areas.length; i++) { 
			if(areas[i]==id) {
				areas.splice(i,1);
			}
		}
	}
	function OnOpenEndHandler(id) {

		if (!id) id = 0;
			var subItemsId = tree.getAllSubItems(id);
			var subItems = subItemsId.split(",");
			for(var i=0;i<subItems.length;i++) {
			    var ids = subItems[i].split("|");
			    if (ids[1]=='U'){
			        //alert(subItems[i]);
			        tree.disableCheckbox(subItems[i], 1);
			    }
			}
	}
</script>
</html:html>
