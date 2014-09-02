<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/checkAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body>
	<form name="CheckActionForm">
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">新增/修改返回值规则</td>
				                            <td width="57%"></td>
				                        </tr>
									</table>
								</td>
							</tr>
						</table>
					</tr>
						<tr>
							<td class="bg_01">
								<table width="100% border=" 0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
												  <input type="hidden"  value="${param.id}" name="cimpFaceId"  />
												  <input type="hidden" value="${requestScope.reValid.returnValidId}" name="returnValidId"/>

													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       动作名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.reValid.operName}" name="operName"  />
														 </td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																动作路径:
															</div>
														</td>
														<td align="left">															
														   <input type="text" class="inputtext01" value="${requestScope.reValid.opernamePath}" name="opernamePath"  />
														 </td>
													</tr>													
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     动作路径上下行:
															</div>
														</td>
														<td align="left">
															
															<input type="radio" value="up"  name="operpathFrom" <c:if test="${'up' eq requestScope.reValid.operpathFrom}">checked='checked'</c:if>>
																上行
															<input type="radio" value="down" name="operpathFrom"  <c:if test="${'down' eq requestScope.reValid.operpathFrom}">checked='checked'</c:if>>
																下行
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      更改字段名:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.reValid.fieldName}" name="fieldName" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      字段名路径:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.reValid.fieldPath}" name="fieldPath" />
														</td>
													</tr>
													
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      字段名上下行:
															</div>
														</td>
														<td align="left">
														   <input type="radio" value="up"  name="fieldpathFrom" <c:if test="${'up' eq requestScope.reValid.fieldpathFrom}">checked='checked'</c:if>>
																上行
															<input type="radio" value="down" name="fieldpathFrom"  <c:if test="${'down' eq requestScope.reValid.fieldpathFrom}">checked='checked'</c:if>>
																下行
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     主键名字:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.reValid.prikeyName}" name="prikeyName" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      主键名路径:
															</div>
														</td>
														<td align="left">
														   <input type="text" class="inputtext01" value="${requestScope.reValid.prikeyPath}" name="prikeyPath" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     主键上下行:
															</div>
														</td>
														<td align="left">
															<input type="radio" value="up"  name="prikeyFrom" <c:if test="${'up' eq requestScope.reValid.prikeyFrom}">checked='checked'</c:if>>
																上行
															<input type="radio" value="down" name="prikeyFrom"  <c:if test="${'down' eq requestScope.reValid.prikeyFrom}">checked='checked'</c:if>>
																下行
														</td>
													</tr>												
													
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="ifaceApplicationDoSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="ifaceApplicationDoClose();" value="取消">
														</td>
													</tr>
												</tbody>
											</table>
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
<script type="text/javascript">

    function ifaceApplicationDoClose() {
    	window.close();
    }

    function ifaceApplicationDoSave() {
    	
		var formObj = $('CheckActionForm').serialize(true);
		//alert(Object.toJSON(formObj));
    	checkAction.insertReturnValue(formObj,callBackDoSave);
    }

    function callBackDoSave() {
    	alert("操作成功");
    	window.returnValue='T';
    	window.close();
    }

   
</script>
</html>