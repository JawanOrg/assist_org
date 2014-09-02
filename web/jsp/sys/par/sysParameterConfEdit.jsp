<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysParameterConfAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="parameterForm">
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
         <input type="text" name="parName" value="${sysParameterConf.parName}" >
         <font color="red">*</font>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4"  >
         参数值：
      </td>
      <td>
         <input type="text" name="parValue" value="${sysParameterConf.parValue}">
      </td>
  </tr>
  <tr>
	 <td noWrap bgcolor="#F4F4F4">
		<div align="right">
		     是否有效:
		</div>
	</td>
	<td align="left" >
		<input type="radio" id="isValid_Y" name="isValid" value="Y" <c:if test="${'Y' eq sysParameterConf.isValid}">checked</c:if>>有效
		<input type="radio" id="isValid_N" name="isValid" value="N" <c:if test="${'N' eq sysParameterConf.isValid}">checked</c:if>>无效
	</td>
  </tr>  
  <tr>
	<td noWrap bgcolor="#F4F4F4">
		<div align="right">
				参数说明:
		</div>
	</td>
		 <td align="left">
		 <textarea id="parDesc" name="parDesc" crows="3"  style="width: 95%;" class="inputtext01" >${sysParameterConf.parDesc}
		 </textarea>
	</td>
  </tr>
  <input type="hidden" id="parId" name="parId" value="${sysParameterConf.parId}"/>
  <tr>
  <td></td>
    <td>
      <input type="button" class="button" value="保存" accesskey="Q"  onclick="saveParameter()" />
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