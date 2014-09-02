<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/jsp/taglib.jsp"%>
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
    <td> <div id="queryResultList3" style="PADDING-RIGHT:0px;">
           </div>        
        <input id="addCheckOut" type="button" class="button" value="新增" onClick="addReturnValue()"/>
        <input id="modifyCheckOut" type="button" class="button" value="修改" onClick="modifyReturnValue()"/>
        <input id="deleteCheckOut" type="button" class="button" value="删除" onClick="deleteReturnValue()"/>
        
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
	initQueryResultList3();
	function initQueryResultList3(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj=$('queryForm').serialize(true);			
		formObj['cimpFaceId'] = sysid;
		checkAction.returnValueDataList(formObj,showResultList3);
	}

	function showResultList3(str){
		$('queryResultList3').innerHTML = str;
	}

</script>
