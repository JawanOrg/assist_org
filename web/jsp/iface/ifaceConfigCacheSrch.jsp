<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigCacheAction.js'></script>
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

	/*
	 *  异常处理
	 */
	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }
	
	/*
	 *  insert operation
	 */
	function insertOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackInsertOperation);
			disableForm();
		}
	}
	
	function callbackInsertOperation(instanceAndRootId) {
		enableForm();
		var pos = instanceAndRootId.indexOf(':');
		if(pos == 0) {
			ifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);
			disableForm();
		} else {
			if(confirm("已经存在静态数据实例记录，还继续插入？")) {
				ifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);
				disableForm();
			}
		}
	}
	
	function callbackInsertOperation2() {
		enableForm();
		alert('操作成功!');
		showAllData();
	}
	
	/*
	 *  remove operation
	 */
	function removeOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackRemoveOperation);
			disableForm();
		}
	}
	
	function callbackRemoveOperation(instanceAndRootId) {
		enableForm();
		var pos = instanceAndRootId.indexOf(':');
		if(pos != 0) {
			if(confirm("确定删除？")) {
			
				ifaceConfigCacheAction.findMapping(instanceAndRootId,callbackRemoveFun);
				disableForm();
			}
		} else {
			alert('不存在对应的静态实例记录!');
			return false;
		}
	}
	
	function callbackRemoveFun(info) {
		enableForm();
		if(info=='cannotDelete') {
			if(confirm('要删除静态实例数据，请先删除相关静态配置数据！是否跳转到静态配置界面？')){
				//document.form1.action = "/sys/sysDicConfigAction.do?method=toSysDicConfigSrch";
				//document.form1.submit();
				window.location.href = "/jsp/iface/ifaceConfigMapping2.jsp";
			}
		} else {
			alert("删除成功!");
			showAllData();
		}
	}
	
	/*
	 *  update operation
	 */
	function updateOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackUpdateOperation);
			disableForm();
		}
	}
	
	function callbackUpdateOperation(instanceAndRootId) {
		enableForm();
		if(instanceAndRootId!=null && instanceAndRootId!=''){
			var pos = instanceAndRootId.indexOf(':');
			if(pos != 0) {
				if(confirm('确定更改已配置实例名称?')) {
					ifaceConfigCacheAction.updateInstanceByInstanceAndRootId(instanceAndRootId,callbackUpdateFun);
					disableForm();
				}
			} else {
				alert('静态实例表中不存在这条记录，无法更新操作!');
				return false;
			}
		}
	}
	
	function callbackUpdateFun() {
		enableForm();
		alert("删除成功!");
		showAllData();
	}
	
	/*
	 *  查询按钮，根据限定条件，重新刷新界面
	 */
	function showAllData() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('commonQueryForm').serialize(true); 
		ifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function queryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="form1" method="post" action=""></form>
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
      <td align="right"  bgcolor="#F4F4F4" width="130">响应类型：</td>
      <td>
      	<select size="1" id="responseCode" name="responseCode">
	        <option value=""></option>
			<option value="0">成功</option>
			<option value="-1">失败</option>
		  </select>
      </td>
      <td align="right"  bgcolor="#F4F4F4" >静态数据编码：</td>
      <td><input type="text" name="sysCode" class="inputtext01" value=""/></td>
  	  <td align="right"  bgcolor="#F4F4F4" >实例编码：</td>
      <td><input type="text" name="itemId" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >操作类型：</td>
      <td>
      	<select size="1" id="changetype" name="changetype">
	        <option value=""></option>
			<option value="update">更新</option>
			<option value="insert">新增</option>
			<option value="delete">删除</option>
		  </select>
      </td>
  </tr>
  <tr>
  		<td colspan=7></td>
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
	系统配置列表
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
		ifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
</script>

</body>
</html>