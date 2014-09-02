<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/taticConfigAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4"  bgcolor="#FFFFFF">
<form name="mainForm">
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="150">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	策略实例维护
	</td>
	<td class="tabpaneright2"> </td>
	<td></td>
   </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
     <input type="hidden" name="taticgoupid"  value="${param.taticgoupid}"/>
     <input type="hidden" name="interfacecode"  value="${param.cimpFaceId}"/>
     <input type="hidden" name="applicationId"  value="${param.applicationId}"/>
     <input type="hidden" name="rowrecordid"  value="${param.rowrecordid}"/>
                         	<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr >
								<td align="right"  bgcolor="#F4F4F4" width="10%" nowrap>
									${obj.elementname}：
								</td>
								<td  width="20%">
								    <input type="hidden" name="elementid" value="${obj.elementid}">
									<c:choose>
									<c:when test="${not empty requestScope.instanceList}">
									<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									    <c:if test="${instanceObj.elementid eq obj.elementid}">
									        <c:choose>
									      <c:when test="${obj.sourcetype eq 'TEXT'}">
									         <input type="text" name="elevalue1" value="${instanceObj.elevalue1}"  size="15">
									        <input type="hidden" name="elevalue2" value="${instanceObj.elevalue2}">
									     </c:when>
									     <c:otherwise>
                                             <blocimp:ifaceSelectTag iddValue="${obj.sqlstr}"  applicationId="${param.applicationId}"  value="elevalue1"  selectValue="${instanceObj.elevalue1}"  style="width:100" hasNull="true" />
									         <input type="hidden" name="elevalue2" >
									     </c:otherwise>
									   </c:choose>
									    </c:if>
									</c:forEach>
									</c:when>
									<c:otherwise>
									    <c:choose>
									      <c:when test="${obj.sourcetype eq 'TEXT'}">
									        <input type="text" name="elevalue1"  size="15">
									        <input type="hidden" name="elevalue2" >
									     </c:when>
									     <c:otherwise>
                                             <blocimp:ifaceSelectTag   iddValue="${obj.sqlstr}"  applicationId="${param.applicationId}"  value="elevalue1"  style="width:100"  hasNull="true"/>
									         <input type="hidden" name="elevalue2" >
									     </c:otherwise>
									   </c:choose>
									</c:otherwise>
									</c:choose>
								</td>
								<td align="right"  bgcolor="#F4F4F4"  width="10%" nowrap>
									匹配规则：
								</td>
								<td  width="15%">
								 <c:choose>
									<c:when test="${not empty requestScope.instanceList}">
								<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									<c:if test="${instanceObj.elementid eq obj.elementid}">
									<select name="matchingRule">
									   <option value="equal" <c:if test="${instanceObj.matchingRule eq 'equal'}">selected</c:if>>等于</option>
									   <option value="notEqual" <c:if test="${instanceObj.matchingRule eq 'notEqual'}">selected</c:if>>不等于</option>
									   <option value="like" <c:if test="${instanceObj.matchingRule eq 'like'}">selected</c:if>>模糊</option>
									   <option value="llike" <c:if test="${instanceObj.matchingRule eq 'llike'}">selected</c:if>>左模糊</option>
									   <option value="rlike" <c:if test="${instanceObj.matchingRule eq 'rlike'}">selected</c:if>>右模糊</option>
									   <option value="greater" <c:if test="${instanceObj.matchingRule eq 'greater'}">selected</c:if>>大于</option>
									   <option value="less" <c:if test="${instanceObj.matchingRule eq 'less'}">selected</c:if>>小于</option>
									   <option value="greaterAndEqual" <c:if test="${instanceObj.matchingRule eq 'greaterAndEqual'}">selected</c:if>>大于等于</option>
									   <option value="lessAndEqual" <c:if test="${instanceObj.matchingRule eq 'lessAndEqual'}">selected</c:if>>小于等于</option>
									   <option value="notUse" <c:if test="${instanceObj.matchingRule eq 'notUse'}">selected</c:if>>无效</option>
									   <option value="null" <c:if test="${instanceObj.matchingRule eq 'null'}">selected</c:if>>为空</option>
									   <option value="notNull" <c:if test="${instanceObj.matchingRule eq 'notNull'}">selected</c:if>>不为空</option>
									   <option value="existValue" <c:if test="${instanceObj.matchingRule eq 'existValue'}">selected</c:if>>已存在值</option>
									</select>
									</c:if>
								</c:forEach>
								</c:when>
									<c:otherwise>
									  <select name="matchingRule">
									   <option value="equal">等于</option>
									   <option value="notEqual">不等于</option>
									   <option value="like" >模糊</option>
									   <option value="llike" >左模糊</option>
									   <option value="rlike" >右模糊</option>
									   <option value="greater">大于</option>
									   <option value="less">小于</option>
									   <option value="greaterAndEqual" >大于等于</option>
									   <option value="lessAndEqual" >小于等于</option>
									   <option value="notUse">无效</option>
									   <option value="null">为空</option>
									   <option value="notNull">不为空</option>
									   <option value="existValue">已存在值</option>
									</select>
									</c:otherwise>
								</c:choose>
								</td>
								<td align="right"  bgcolor="#F4F4F4" width="10%" nowrap>
									xml节点路径：
								</td>
								<td  width="35%" >
								   <c:choose>
									<c:when test="${not empty requestScope.instanceList}">
									<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									    <c:if test="${instanceObj.elementid eq obj.elementid}">
									        <input type="text" name="xmlNodename" title="${instanceObj.xmlNodename}" value="${instanceObj.xmlNodename}" size="35">
									         </c:if>
									</c:forEach>
									</c:when>
									<c:otherwise>
									   <input type="text" name="xmlNodename"  size="35">
									</c:otherwise>
									</c:choose>
								</td>
								</tr>
								</c:forEach>
								<c:choose>
								  <c:when test="${suptTaticGroup.tatictype eq 'tactic_dispatch'}">
								    <tr>
								<td align="right"  bgcolor="#F4F4F4">
									派发对象:
								</td>
								<td colspan="5">
								  	<c:forEach items="${requestScope.applicationList}" var="applicationObj" varStatus="n">
								     <input type="checkbox" name="applicationCheckid"  value="${applicationObj.applicationId}" <c:if test="${fn:contains(instanceModel.dispatchobject,applicationObj.applicationId)}">checked</c:if>>
								  	  ${applicationObj.applicationName}&nbsp;
								  	</c:forEach>
									<input type="hidden" name="dispatchobject">
									</td>
							  </tr>
							 </c:when>
							<c:otherwise>
							 <tr>
								<td align="right"  bgcolor="#F4F4F4">
								    转换元素名:
								</td>
								<td colspan="3">
								  	<input type="text" name="changeElement" value="${instanceModel.changeElement}" size="30">
								</td>
								<td align="right"  bgcolor="#F4F4F4">
								    结果类型:
								</td>
								<td>
								  	<select name="resulttype">
									   <option value="result" <c:if test="${instanceModel.resulttype eq 'result'}">selected</c:if>>结果值</option>
									   <option value="xmlNode" <c:if test="${instanceModel.resulttype eq 'xmlNode'}">selected</c:if>>xml节点路径</option>
									</select>
								</td>
							  </tr>
								  <tr>
								<td align="right"  bgcolor="#F4F4F4">
								    转换结果:
								</td>
								<td colspan="5">
								  	<input type="text" name="dispatchobject" value="${instanceModel.dispatchobject}" size="90">
								    <img  alt="说明" onclick="showTips('tactic','dispatchobject');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
								</td>
							  </tr>
							 </c:otherwise>
							</c:choose>
 <tr>
    <td colspan="6" align="center" height="40">
       <input type="button" class="button" value="保存" accesskey="Q"  onclick="save()" />
       <input type="button" class="button" value="取消" accesskey="Q"  onclick="window.close()" />
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
</td></tr></table>
  </form>
   </td>
 </tr>
</table>
</body>
<script>
function SuptTaticInstance(elementid,elevalue1,elevalue2,matchingRule,xmlNodename){
	this.elementid= elementid;
	this.elevalue1= elevalue1;
	this.elevalue2= elevalue2;
	this.matchingRule=matchingRule;
	this.xmlNodename=xmlNodename;
}
function getInstanceArrs(){
   var elementids =document.getElementsByName("elementid");
   var elevalue1s=document.getElementsByName("elevalue1");
   var elevalue2s=document.getElementsByName("elevalue2");
   var matchingRules=document.getElementsByName("matchingRule");
   var xmlNodenames=document.getElementsByName("xmlNodename");
    var instanceArrs = new Array();
    for (var i = 0; i < elementids.length; i++) {
        var elementid = elementids[i].value;
        var elevalue1=elevalue1s[i].value;
        var elevalue2=elevalue2s[i].value;
        var matchingRule=matchingRules[i].value;
        var xmlNodename=xmlNodenames[i].value;
		instanceArrs[instanceArrs.length] = new SuptTaticInstance(elementid,elevalue1,elevalue2,matchingRule,xmlNodename);
        }
   return  instanceArrs;
}
function save(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var tatictype="${suptTaticGroup.tatictype}";
		if(tatictype=="tactic_dispatch"){
		  var ids=getSelectCheckboxValue("mainForm","applicationCheckid","|");
		  $("dispatchobject").value=ids;
		}
		var formObj=$('mainForm').serialize(true);
		var instanceArrs=getInstanceArrs();
		taticConfigAction.saveInstance(formObj,instanceArrs,goBack);
}
function goBack(s){
 if(s==""){
  alert("操作成功！");
  window.returnValue="true";
  window.close();
  }
}
</script>
</html>