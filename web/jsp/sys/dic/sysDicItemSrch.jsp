<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicItemAction.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicConfigAction.js'></script>
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


	
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="commonQueryForm" id="commonQueryForm">
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
      <td align="right"  bgcolor="#F4F4F4" >
       	数据字典名称：
      </td>
      <td>
		<select size="1" id="dicId" name="dicId"></select>
	  </td>
      <td align="right"  bgcolor="#F4F4F4" >
         字典条目代号：
      </td>
      <td><input type="text" name="itemCode" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >
         字典条目名称：
      </td>
      <td><input type="text" name="itemValue" class="inputtext01" value=""/></td>
      <td>
         <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initqueryResultListItem();" align="right"/>
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
	<span>字典条目列表</span>
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
     <input id="addItem" type="button" class="button" value="新增" onClick="toSysDicItemAdd();"/>
     <input id="deleteItem" type="button" class="button" value="删除" onClick="doDel()"/>
   </td>
  </tr>
</table>
</div>
  </td>
  </tr>
</table>

<script>
	
	if(Prototype.Browser.Opera){
		initqueryResultListItem(); 
			sysDicConfigAction.getSysDicConfigIdAndNameList(callbackInit2);
	}else{
			Event.observe(window, 'load', initqueryResultListItem); 
			sysDicConfigAction.getSysDicConfigIdAndNameList(callbackInit2);
	}
	
	
	
</script>

</body>
</html>