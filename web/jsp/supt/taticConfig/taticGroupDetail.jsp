<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="detailForm">
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr >
      <td align="right"  bgcolor="#F4F4F4" >
         策略组名称：
      </td>
      <td>
         <input type="hidden" name="taticgoupid" value="${suptTaticGroup.taticgoupid}">
         <input type="text" name="taticgoupname" value="${suptTaticGroup.taticgoupname}"  dataType="Require" msg="策略组名称不能为空" >
         <font color="red">*</font>
      </td>

      <td align="right"  bgcolor="#F4F4F4"  >
         策略类型：
      </td>
      <td>
      <blocimp:sysDicDis iddValue="SUPT_TACTIC_TYPE"    value="tatictype" dicItemIn="${suptTaticGroup.tatictype}" />
         <font color="red">*</font>
      </td>
      </tr>
   <tr>
      <td align="right"  bgcolor="#F4F4F4" >
         所包含元素：
      </td>
      <td colspan="3">
        <c:forEach items="${requestScope.taticElementList}" var="obj" varStatus="n">
           <input type="checkbox" name="elementCheckid" checked value="${obj.elementid}">${obj.elementname};
        </c:forEach>
        <span id="elementSpan"></span>
        &nbsp;
        <input type="button" class="button" value="添加元素" accesskey="Q"  onclick="selectElement()" />
      </td>
  </tr>
    <tr>
      <td align="right"  bgcolor="#F4F4F4" >
         备注：
      </td>
      <td colspan="3">
        <textarea   name="remark"  cols="70"  rows="5"  >${suptTaticGroup.remark}</textarea>
      </td>
  </tr>
  <tr>
    <td colspan="4" align="center" height="40">
       <input type="button" class="button" value="保存" accesskey="Q"  onclick="saveGroup()" />
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
</td>
</tr>
</table>
</form>
</body>
</html>