<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysServiceConfig.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<html>
<head>
<title>协作管理系统</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }

	function doDel() {
		var ids = getSelectCheckboxValue("queryResultList","checkid",",");
		if(ids!=""){
			if(confirm("确定删除?"))
			{
				sysServiceConfig.removeSysTaskBuCheckbox(ids,delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}
	
	function delCallback(){
		alert("操作成功");
		enableForm();
		showAllData();
	}
	
	function showAllData() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('commonQueryForm').serialize(true); 
		sysServiceConfig.getSysTaskList(formObj,queryResultList);
		disableForm();
	}
	
	function queryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	function addSysTaskDetail() {
		enableForm();
		var returnVal = window.showModalDialog("/jsp/systask/addSysServiceConfig.jsp",null,"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no");
		if(returnVal == 1) {
			showAllData(); 
		}
	}
	
	function updateSysServiceConfigDetail(serviceId) {
		if(serviceId!=null && serviceId!="") {
			sysServiceConfig.getSysServiceConfigByServiceId(serviceId,callbackServiceConf);
			disableForm();
		}
	}
	
	function callbackServiceConf(objData) {
		enableForm();
		var returnVal = window.showModalDialog("/jsp/systask/sysServiceConfigEdit.jsp",objData,"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no");
		if(returnVal == '1') {
			showAllData(); 
		}
	} 
	
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="commonQueryForm">
<input type="hidden" id="orderByClause" name="orderByClause" value="" />
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
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="17" onClick="ev_hiddenQueryTable();">
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
    <div id="queryCondicationArea">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr style="display:display">
      <td align="right"  bgcolor="#F4F4F4" width="130">后台服务名称：</td>
      <td><input type="text" name="serviceName" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >后台服务CLASS：</td>
      <td><input type="text" name="serviceClass" class="inputtext01" value=""/></td>
  	</tr>
  <tr>
  		<td colspan=3></td>
	   <td align="left">
	   	    <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
       		<input type="button" class="button" value="重置(R)" accesskey="R"  onclick="reset();" align="right"/>
       		<input type="hidden" name="pageNumber" value="1" />
       		<input type="hidden" name="maxResults" value="15" />
	   </td>
  </tr>
</table>
</div>
      </td>
  </tr>
</table>
</form>
<br>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	后台服务列表
	</td>
	<td class="tabpaneright2">
   </td>
    </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList" style="PADDING-RIGHT:0px;">
           </div>
        <input type="button" class="button" value="新增" onClick="addSysTaskDetail();"/>
        <input type="button" class="button" value="删除" onClick="doDel()"/>
        
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
	if(Prototype.Browser.Opera){
			initqueryResultList(); 
	}else{
			Event.observe(window, 'load', initqueryResultList); 
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		sysServiceConfig.getSysTaskList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
</script>

</body>
</html>