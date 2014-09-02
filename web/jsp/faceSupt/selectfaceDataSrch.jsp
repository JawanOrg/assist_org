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
<script type="text/javascript">
    var pwin = window.dialogArguments;
	  	//确定
	function enter() {
	    if (countCheck() < 1) {
			alert("请选择记录");
			return false;
		  }	
		if (countCheck() > 1) {
			alert("只能选择一条记录进行修改!");
			return false;
		  }	
		var id = getSelectCheckboxValue("allForm", "checkid", ",");	   
		window.returnValue =id;	
			ev_cancel();    
	  }
	  
function ev_cancel() {       
        window.close();
    }
	  
function countCheck() {
		var id = document.getElementsByName("checkid");
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				count++;
			}
		}
		return count;
	}

	function getCheckValue() {
		var id = document.getElementsByName("checkid");
		var value = "";
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				if (value == "") {
					value = id[i].value;
				} else {
					value = value + "," + id[i].value;
				}
			}
		}
		return value;
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
      <td align="right"  bgcolor="#F4F4F4" >
         系统名称：
      </td>
      <td>
         <input type="text" name="elementName" >
      </td>
      <td></td>
     </tr>
     <tr>
      <td align="right"  bgcolor="#F4F4F4" >
         接口名称 ：
      </td style="display:display">
      <td>
         <input type="text" name="methodName" >
      </td>
      <td>
         <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initQueryResultList()" />
         <input type="button" class="button" value="重置(R)" accesskey="R"  onclick="" />
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
<br>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	接口信息列表
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
        <input id="addFace" type="button" class="button" value="确定" onClick="enter()"/>
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
	initQueryResultList();
	function initQueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj={};
		checkAction.selectfaceDataList(formObj,showResultList);
	}

	function showResultList(str){
		$('queryResultList').innerHTML = str;
	}

</script>

</body>
</html>