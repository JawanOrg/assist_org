<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysTaskAction.js'></script>
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

	function addsystask(){
		var formObj = $('form1').serialize(true); 
		sysTaskAction.newSysTask(formObj,callbackFun1);
	}
	function callbackFun1(obj) {
		if(obj!="") {
			alert("您提交的服务类型已经存在!");
			return false;
		} else {
			alert("提交成功!");
			return false;
		}
	}
	function reLoadAllSysTask(){
		sysTaskAction.reLoadAllSysTask();
	}
	function stopAllSysTask(){
		sysTaskAction.stopAllSysTask();
	}

</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="form1">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	创建后台进程
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
            cellspacing=0 bordercolordark="#FFFFFF" cellpadding=1 width=100% height="95%" bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList" style="PADDING-RIGHT:0px;">
    
    		<html>
			<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
			<table class=table id=powergrid style="FONT-SIZE: 13px"
			            cellspacing=0 bordercolordark="#FFFFFF" cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
			            pcolor="#BCC8F5">
			          <tr>
							<td bgcolor="#FFFFFF" height="1">
								服务名称
							</td>
							<td bgcolor="#FFFFFF" height="1">
								<input name="serviceName" value="">
							</td>
							<td bgcolor="#FFFFFF" height="1">
								类
							</td>
							<td bgcolor="#FFFFFF" height="1">
								<input name="serviceClass" value="">
							</td>
							<td bgcolor="#FFFFFF" height="1">
								运行间隔
							</td>
							<td bgcolor="#FFFFFF" height="1">
								<input name="runInterval" value="">
								分
							</td>
							<td bgcolor="#FFFFFF" height="1">
								随机启动
							</td>
							<td bgcolor="#FFFFFF" height="1">
								<select name="startDefault">
									<option value="Y">
										是
									</option>
									<option value="N">
										否
									</option>
								</select>
							</td>
						</tr>
						<tr>
						<td align="center" colspan="21">
							<button  onclick="addsystask()">提交</button>
							<button  onclick="reLoadAllSysTask()">重新加载所有后台服务</button>
							<button  onclick="stopAllSysTask()">停止所有后台服务</button>
						</td>
					</tr>         
			</table>
			</body>
			</html>
    
           </div>
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
  </td>
  </tr>
</form>
</table>
</body>
</html>