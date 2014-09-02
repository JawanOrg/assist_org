<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@ include file="/jsp/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>协作管理系统</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<script type="text/javascript" src="/js/prototype.js"></script>
<script type="text/javascript" src="/js/commonjs.js"></script>
<script type="text/javascript" src="/js/validator.js"></script>
<script type="text/javascript" src="/js/mydiv.js"></script>
</head>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="queryForm">
     <input type="hidden" id="orderByClause" name="orderByClause" value="" />
	 <input type="hidden" id="applicationId" name="applicationId" value="" />
	 <input type="hidden" name="pageNumber" value="1" />
     <input type="hidden" name="maxResults" value="15" /></form>
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">

<br>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList2" style="PADDING-RIGHT:0px;">
           </div>   
        <input id="addConfig" type="button" class="button" value="新增" onClick="addIfaceConfigProtocol();"/>
     <input id="deleteConfig" type="button" class="button" value="删除" onClick="doDel();"/>
       </td>
  </tr>
</table>
      </td>
  </tr>
</table>
  </td>
  </tr>
</table>
<script>
    var paramObj = "${param.applicationId}";
	
	initqueryProtocolResultList();
	
	function initqueryProtocolResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		$('applicationId').value = paramObj;
		var formObj = $('queryForm').serialize(true); 
		ifaceConfigProtocolAction.getIfaceConfigProtocolList(formObj,showTablequeryProtocolResultList);
	}
	
	function showTablequeryProtocolResultList(str){
		enableForm();
		$('queryResultList2').innerHTML = str;
	}
	
	function addIfaceConfigProtocol() {
		var obj = window.showModalDialog("/jsp/iface/protocol/protocolAdd.jsp",paramObj,"dialogWidth=750px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(obj!=-1) {
    		showProtocolAllData();
    	}
	}
	
	function openIfaceConfigProtocolEdit(protocolId) {
		var obj = window.showModalDialog("/jsp/iface/protocol/protocolEdit.jsp",protocolId,"dialogWidth=750px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(obj!=-1) {
    		showProtocolAllData();
    	}
	}
	
	function showProtocolAllData() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('queryForm').serialize(true); 
		ifaceConfigProtocolAction.getIfaceConfigProtocolList(formObj,showTablequeryProtocolResultList);
		disableForm();
	}
	
	function doDel() {
		var ids = getSelectCheckboxValue("queryResultList2","checkid",":");
		if(ids!=""){
			if(confirm("确定删除?"))
			{
				ifaceConfigProtocolAction.deleteIfaceConfigProtocolData(ids,callbackDeleteProtocol);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}
	
	function callbackDeleteProtocol() {
		alert("删除成功!");
		showProtocolAllData();
	}

</script>

</body>
</html>