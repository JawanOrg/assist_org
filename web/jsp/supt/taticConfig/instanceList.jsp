<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="queryListForm">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	策略实例配置
	</td>
	<td class="tabpaneright2"> </td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;
	   <input type="hidden" name="taticgoupid" value="${taticConfigForm.taticgoupid}">
	   <input type="hidden" name="cimpFaceId" value="${taticConfigForm.cimpFaceId}">
	   <input type="hidden" name="applicationId" value="${taticConfigForm.applicationId}">
	</td>
   </tr>
    </table>
    </td>
  </tr>
 <tr>
 <td bgcolor="#FFFFFF"  width="100%" >
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<td style="word-break: keep-all;">
									${obj.elementname}
								</td>
								</c:forEach>
								<td style="word-break: keep-all;">
									转换/派发对象
								</td>
							</tr>
							<c:forEach items="${requestScope.instanceMap}" var="objMap" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${objMap.key}" />
										<img  alt="查看详情" onclick="getDetail('${objMap.value.rowrecordid}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<c:forEach items="${objMap.value.elementInstanceList}" var="elementObj" varStatus="x">
								    <td  align="center">
								     <c:choose>
									      <c:when test="${elementObj.sourcetype eq 'TEXT'}">
									      <font color="red">
									      <c:if test="${elementObj.matchingRule eq 'equal'}">=</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'notEqual'}">!=</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'like'}">%</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'llike'}">%-</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'rlike'}">-%</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'greater'}">></c:if>
                                          <c:if test="${elementObj.matchingRule eq 'less'}"><</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'greaterAndEqual'}">>=</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'lessAndEqual'}"><=</c:if>

                                          <c:if test="${elementObj.matchingRule eq 'notUse'}">无效</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'null'}">为空</c:if>
                                          <c:if test="${elementObj.matchingRule eq 'notNull'}">不为空</c:if>
									      <c:if test="${elementObj.matchingRule eq 'existValue'}">已存在值</c:if>
									      </font>
									       ${elementObj.elevalue1}
									     </c:when>
									     <c:otherwise>
									        <blocimp:ifaceSelectDesc   iddValue="${elementObj.sqlstr}"  applicationId="${taticConfigForm.applicationId}"  value="${elementObj.elevalue1}"  />
									     </c:otherwise>
									   </c:choose>

								    </td>
								   </c:forEach>
									<td align="center">
									<c:choose>
								      <c:when test="${suptTaticGroup.tatictype eq 'tactic_dispatch'}">
								         <c:forEach items="${requestScope.applicationList}" var="applicationObj" varStatus="x">
										   <c:if test="${fn:contains(objMap.value.dispatchobject,applicationObj.applicationId)}"  >
										     ${applicationObj.applicationName};
										   </c:if>
										</c:forEach>
							  		  </c:when>
									<c:otherwise>
									        ${objMap.value.dispatchobject}
							       </c:otherwise>
							     </c:choose>
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                    <tr>
                      <td colspan="10" height="30">
                        <input type="button" class="button" value="新增" accesskey="Q"  onclick="toAdd('${taticConfigForm.taticgoupid}','${taticConfigForm.cimpFaceId}','${taticConfigForm.applicationId}')" />
                        <input type="button" class="button" value="删除" accesskey="R"  onclick="delInstance()" />
                      </td>
                    </tr>
                  </table>
                  </form>
   </td>
 </tr>
</table>
</body>
</html>