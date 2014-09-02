<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigSystemAction.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigProtocolAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<head>
<title>协作管理系统</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script><!--

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }

	//use
	function doConfigSystemDel() {
		var list = Form.getInputs("queryResultList", "radio", "checkid");
		var radioarray = $A(list);
		var resultArray = new Array();
		var flag = false;
		var appId = '';
		radioarray.each(function (radiobox) {
			if (radiobox.checked) {
				flag = true;
				appId = radiobox.value;
			}
		});
		if(flag) {
			if(confirm('确定删除?')) {
				ifaceConfigSystemAction.deleteLogicByPrimaryKey(appId,delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}
	
	function delCallback(str){
		enableForm();
		if(str == ''){
			alert("操作成功");
			showAllData();
		} else {
			handler(str);
		}
	}
	
	//use
	function addIfaceConfigSystem() {
    	var obj = window.showModalDialog("/jsp/iface/system/systemAdd.jsp",null,"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no");
    	if(obj!=-1) {
    		showAllData();
    	}
	}
	
	//use
	function editIfaceConfigSystem(appid,appname,appsn) {
		var obj = new Object();
		obj.applicationId = appid;
		obj.applicationName = appname;
		obj.applicationSn = appsn;
		var rtnObj = window.showModalDialog("/jsp/iface/system/systemEdit.jsp",obj,"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no");
    	if(rtnObj!=-1) {
    		showAllData();
    	}
	}
	
	//use
	function toIfaceConfigProtocal() {
		var list = Form.getInputs("queryResultList", "radio", "checkid");
		var radioarray = $A(list);
		var resultArray = new Array();
		var flag = false;
		var appId = '';
		radioarray.each(function (radiobox) {
			if (radiobox.checked) {
				flag = true;
				appId = radiobox.value;
			}
		});
		if(flag) {
			createNewTab('tabView1','接口协议配置列表','','/iface/ifaceConfigProtocolAction.do?method=ifaceConfigProtocolInit&applicationId='+appId,true);
		} else {
			alert('请选择记录!');
			return false;
		}
	}
	
	//use
	function showAllData(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('commonQueryForm').serialize(true);
		formObj.dictionaryName = '';
		formObj.dictionaryCode = '';
		ifaceConfigSystemAction.getIfaceConfigSystemList(formObj,showTableAfterDel);
		disableForm();
	}
	
	function showTableAfterDel(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	
   </script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="commonQueryForm" >
<input type="hidden" id="orderByClause" name="orderByClause" value="" />
<%@ include file='/jsp/widget/wztool.jsp'%>
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	查询条件
	<img src="<%=request.getContextPath()%>/images/main/button_bug2.gif"   width="19" height="17">
	</td>
	<td class="tabpaneright2"> </td>
   </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr style="display:display">
      <td align="right"  bgcolor="#F4F4F4" width="130">系统名称：</td>
      <td><input type="text" name="applicationName" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >系统编码：</td>
      <td><input type="text" name="applicationSn" class="inputtext01" value=""/></td>
  </tr>
    <tr style="display:display">
      <td colspan=3></td>
      <td>
         <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
    	 <input type="button" class="button" value="重置(R)" accesskey="R"  onclick="reset();" align="right"/>
    	 <input type="hidden" name="pageNumber" value="1" />
    	 <input type="hidden" name="maxResults" value="15" />
      </td>
  </tr>

 </form>
</table>
      </td>
  </tr>
</table>
<br>
<div id="tabView1">
			<DIV id="tabView1tab_tabPane">
				<DIV id=tabTabtabView1_0>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	<span>接口系统列表</span>
	</td>
	<td class="tabpaneright2">
   </td>
    </tr>
    </table>
 </DIV>
</DIV>
<div class="tab_aTab">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td>
      <div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
    </td>    
  </tr>
  <tr>
   <td>
     <input id="addConfig" type="button" class="button" value="新增" onClick="addIfaceConfigSystem();"/>
     <input id="deleteConfig" type="button" class="button" value="删除" onClick="doConfigSystemDel()"/>
     <input id="editConfig" type="button" class="button" value="接口协议配置" onClick="toIfaceConfigProtocal();"/>
   </td>
  </tr>
</table>
</div>
  </td>
  </tr>
</table>

<script>

	initTabs('tabView1',Array('系统配置列表'),0,'100%','100%');
	
	if(Prototype.Browser.Opera){
			initqueryResultList(); 
	}else{
			Event.observe(window, 'load', initqueryResultList); 
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		ifaceConfigSystemAction.getIfaceConfigSystemList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
</script>

</body>
</html>