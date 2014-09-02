<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="elementForm">
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
         元素名称：
      </td>
      <td>
         <input type="hidden" name="elementid" value="${suptTaticElement.elementid}">
         <input type="text" name="elementname" value="${suptTaticElement.elementname}"  dataType="Require" msg="元素名称不能为空" >
         <font color="red">*</font>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4"  >
         元素编码：
      </td>
      <td>
         <input type="text" name="elementcode"  value="${suptTaticElement.elementcode}"  dataType="Require" msg="元素编码不能为空" >
         <font color="red">*</font>
      </td>
  </tr>
   <tr >
      <td align="right"  bgcolor="#F4F4F4" >
         来源类型：
      </td>
      <td>
        <select name="sourcetype"   value="${suptTaticElement.sourcetype}" >
          <option value="TEXT" <c:if test="${'TEXT' eq suptTaticElement.sourcetype}">selected</c:if>>普通文本</option>
          <option value="SELECT" <c:if test="${'SELECT' eq suptTaticElement.sourcetype}">selected</c:if>>下拉数据</option>
          <option value="TREE" <c:if test="${'TREE' eq suptTaticElement.sourcetype}">selected</c:if>>树形</option>
        </select>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4" >
         对应静态数据编码：
      </td>
      <td>
         <input type="text" name="sqlstr"  value="${suptTaticElement.sqlstr}">
      </td>
  </tr>
  <tr>
  <td></td>
    <td>
      <input type="button" class="button" value="保存" accesskey="Q"  onclick="saveElement()" />
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