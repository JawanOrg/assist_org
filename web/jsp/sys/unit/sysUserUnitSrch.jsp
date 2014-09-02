<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUserUnitAction.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUserAction.js'></script>

<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<head>
<title>协作管理系统</title>
</head>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="queryDataForm" id="queryDataForm">
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
	    <tr style="display:">
		      <td align="right"  bgcolor="#F4F4F4" >
		         登陆账号：
		      </td>
		      <td>
		         <input type="text" name="loginName" >
		      </td>
		       <td align="right"  bgcolor="#F4F4F4" >
		         用户名称：
		       </td>
		      <td>
		         <input type="text" name="userName" >
		      </td>
	     </tr>
	     <tr>
		      <td align="center"  colspan="4">
		         <input type="button" class="button" value="查询(Q)" id="btnQuery" name="btnQuery"accesskey="Q"  onclick="initQueryResultList()" />
		         <input type="button" class="button" value="新增" id="btnAdd" name="btnAdd"accesskey="A"  onclick="toAdd()" />
		         <input type="button" class="button" value="删除" id="btnDel" name="btnDel"accesskey="R"  onclick="delElement()" />
		      </td>
	 	 </tr >
	<input type="hidden" value="${param.unitId}" id="unitId" name="unitId" />
 </form>
</table>
      </td>
  </tr>
</table>
<br>
	<div id="tabView1">
		<div id="tabView1tab_tabPane">
			<div id=tabTabtabView1_0>
			    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="150">
						<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
						<span>用户列表</span>
						</td>
						<td class="tabpaneright2">
					  	</td>
				    </tr>
			    </table>
		 	</div>
		</div>
		<div class="tab_aTab">
		    <table class=table id="powergrid" style="FONT-SIZE: 13px"
		            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
		            pcolor="#BCC8F5">
			    <tr>
				    <td>
				      <div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
				    </td>
			  </tr>
			</table>
		</div>
	</div>
  </td>
  </tr>
</table>


<script>

initTabs('tabView1',Array('用户列表'),0,'100%','100%');
function getDetail(id,name){
	createNewTab('tabView1','修改用户&nbsp;','','/sys/sysUserUnitAction.do?method=toSysUserUnitEdit&userId='+id,true);
}

function toAdd(){
    createNewTab('tabView1','新增用户&nbsp;','','/sys/sysUserUnitAction.do?method=toSysUserUnitAdd&unitId=${param.unitId}',true);
}

function delElement(){
  var checkids=getSelectCheckboxValue("queryResultList","checkid","|");
  if(checkids==""){
     alert("请选择记录！");
     return;
  }
  if(confirm("您确认要删除选中记录吗？")){
 
    sysUserUnitAction.deleteDataSysUserUnit('${param.unitId}',checkids,goBack);
  }
}

initQueryResultList();

function initQueryResultList() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj=$('queryDataForm').serialize(true);
		sysUserUnitAction.getSysUserUnitList(formObj,showResultList);
}

function showResultList(str){
	$('queryResultList').innerHTML = str;
}

function goBack(s){
  if(s==""){
     alert("操作成功！");
     initQueryResultList();
  }else{
    alert(s);
    initQueryResultList();
  }
}

function enabledToSave()
{
	$('btnQuery').disabled=false;
	$('btnAdd').disabled=false;
	$('btnDel').disabled=true;
}


function SysUserUnitAddDoClose () {
	closeActiveTab('tabView1',0);
}

function callBackDoSave (error) {
	if(error!="") {
		alert(error);
		return false;
	} else {
		alert("操作成功");
	}
	closeActiveTab('tabView1',0);
	initQueryResultList();
}

function SysUserUnitAddDoSave() {
	if (!validateForm(formAdd, 1)) {
       return false;
   }
  if(formAdd.loginPassword.value!=formAdd.loginPassword_confirm.value)  {
  		alert("输入密码不一致！");
   		return false;
   }
	var formObj = $('formAdd').serialize(true); 
	sysUserUnitAction.addDataSysUserUnit(formObj,callBackDoSave);
}


function SysUserEditDoClose () {
	closeActiveTab('tabView1',0);
}

function callBackEditDoSave (error) {
	if(error!="") {
		alert(error);
		return false;
	} else {
		alert("操作成功");
	}
	closeActiveTab('tabView1',0);
	initQueryResultList();
}

function SysUserEditDoSave () {

   if (!validateForm(formEdit, 1)) {
       return false;
   }
   if(formEdit.loginPassword.value!=formEdit.loginPassword_confirm.value)  {
  		alert("输入密码不一致！");
   		return false;
   }
   var formObj = $('formEdit').serialize(true); 
   sysUserAction.updateDataSysUser(formObj,callBackEditDoSave);
}
var userId =  formEdit.userId.value;

if(userId!=""){
	sysUserAction.getDataSysUser(userId,getDetailcallback);
	disableForm(formEdit);
}
function getDetailcallback(obj){
	if(obj!=null)
	{
		if(obj.loginName!=null)
		{
			formEdit.loginName.value=obj.loginName;
		}
		if(obj.loginPassword!=null)
		{
			formEdit.loginPassword.value=obj.loginPassword;
			formEdit.loginPassword_confirm.value=obj.loginPassword;
		}
		if(obj.userName!=null)
		{
			formEdit.userName.value=obj.userName;
		}
		if(obj.mobilePhone!=null)
		{
			formEdit.mobilePhone.value=obj.mobilePhone;
		}
		if(obj.remark!=null)
		{
			formEdit.remark.value=obj.remark;
		}
		if("Y"==obj.isValid) {
			$("isValid_Y").checked=true;
		} else {
			$("isValid_N").checked=true;
		}
		trimForm(formEdit);
		enableForm(formEdit);
		formEdit.loginName.disabled=true;
	}else {
		alert("找不到此用户!");
	}
}

trimForm(formAdd);
</script>

</body>
</html>