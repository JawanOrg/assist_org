<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/dwr/interface/sysParameterConfAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="parameterAddForm" id="parameterAddForm">
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
         参数名称：
      </td>
      <td>
         <input type="text" name="parName"  >
         <font color="red">*</font>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4"  >
         参数值：
      </td>
      <td>
         <input type="text" name="parValue" >
      </td>
  </tr>
  <tr>
	 <td noWrap bgcolor="#F4F4F4">
		<div align="right">
		     是否有效:
		</div>
	</td>
	<td align="left" >
		<input type="radio" id="isValid_Y" name="isValid" value="Y" checked>有效  
		<input type="radio" id="isValid_N" name="isValid" value="N" >无效
	</td>
  </tr>  
  <tr>
	<td noWrap bgcolor="#F4F4F4">
		<div align="right">
				参数说明:
		</div>
	</td>
		 <td align="left">
		 <textarea id="remark" name="parDesc" rows="3"  style="width: 95%;" class="inputtext01" >
		 </textarea>
	</td>
  </tr>
  <tr>
  <td></td>
    <td>
      <input type="button" class="button" value="保存" accesskey="Q"  onclick="addParameter()" />
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