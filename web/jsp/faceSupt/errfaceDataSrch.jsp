<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>OSS接口平台</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<script type="text/javascript" src="/js/prototype.js"></script>
<script type="text/javascript" src="/dwr/engine.js"></script>
<script type="text/javascript" src="/dwr/util.js"></script>
<script type="text/javascript" src="/dwr/interface/checkAction.js"></script>
</head>
<script type="text/javascript">
    var pwin = window.dialogArguments;
    var methodId = "${param.id}";
    
    	 //增加错误处理方式
	function addErrFace(){	   	
		var errBusiness = $('errBusiness').value;	
		var errType = $('errType').value;	
		if(errBusiness=="" || errType==""){
		   alert("增加信息不能为空，请确认!");
		   return;
		}
	    checkAction.addErrFace(methodId,errBusiness,errType,initQueryResultList);
	  }
	   
    
	  	//删除
	function delErrFace() {
	    if (countCheck() < 1) {
			alert("请选择记录");
			return false;
		  }	
		if (countCheck() > 1) {
			alert("只能选择一条记录进行删除!");
			return false;
		  }	
		var errid = getSelectCheckboxValue("allForm", "checkid", ",");	   
		checkAction.delErrFace(errid,initQueryResultList);    
	  }
function closeHandler() {
	window.close();
}
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
	<tr>
		<td valign="top">
			<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<tr>
					<td>
						<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
							<tr>
								<td class="tabpaneleft2"></td>
								<td class="tabpanebg2" width="120">
									<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
									新增
									<img src="<%=request.getContextPath()%>/images/main/button_bug2.gif" width="19" height="17">
								</td>
								<td class="tabpaneright2"> </td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<table class="table" style="FONT-SIZE: 13px" cellspacing=0 cellpadding=1 width=100% border="1">
							<tr style="display:display">
								<td align="right"  bgcolor="#F4F4F4" >
								错误类型：
								</td>
								<td>
									<blocimp:sysDicDis iddValue="RETURN_CODE" value="errorCode"  hasNull="false"></blocimp:sysDicDis>
								</td>
								<td></td>
							</tr>
							<tr>
								<td align="right"  bgcolor="#F4F4F4" >
									 错误处理方式 ：
								</td>
								<td>
									<blocimp:sysDicDis iddValue="TRIGGER_NAME" value="triggerName"  hasNull="false"></blocimp:sysDicDis>
								</td>
								<td>
									<input type="button" class="button" value="增加"  onclick="addErrFace()" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<tr>
					<td>
						<table border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
							<tr>
								<td  class="tabpaneleft2"></td>
								<td class="tabpanebg2"   width="120">
								<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
								信息列表
								</td>
								<td class="tabpaneright2">
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<table class="table" style="FONT-SIZE: 13px" cellspacing="0" cellpadding="1" width="100%" border="1">
							<tr>
								<td>
									<div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
									<input id="delFace" type="button" class="button" value="删除" onClick="delErrFace()" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<script type="text/javascript">
	initQueryResultList();	
	function initQueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj={};		
		formObj['methodId'] = methodId;
		checkAction.errfaceDataList(formObj,showResultList);
	}
	function showResultList(str){
		$('queryResultList').innerHTML = str;
	}

</script>
</body>
</html>