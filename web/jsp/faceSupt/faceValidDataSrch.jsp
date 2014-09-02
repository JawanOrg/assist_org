<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/checkAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<html>
<head>
<title>协作管理系统</title>
</head>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >

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
    <td> <div id="queryResultList1" style="PADDING-RIGHT:0px;">
           </div>
        <input id="addCheck" type="button" class="button" value="新增" onClick="addCheck()"/>
        <input id="addCheck" type="button" class="button" value="修改" onClick="modifyCheck()"/>
        <input id="deleteFace" type="button" class="button" value="删除" onClick="deleteFace()"/>
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
    var sysid = "${param.sysid}";
	initQueryResultList1();	
	function initQueryResultList1(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj=$('queryForm').serialize(true);			
		formObj['cimpFaceId'] = sysid;
		checkAction.faceValidDataList(formObj,showResultList1);
	}

	function showResultList1(str){
		$('queryResultList1').innerHTML = str;
	}

</script>

</body>
</html>