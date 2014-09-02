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
				                            <td width="40%">新增/修改接口数据</td>
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
												<input type="hidden" value="${requestScope.face.cimpFaceId}" name="cimpFaceId"/>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="35%">
															<div align="right">
															      源系统名称:
															</div>
														</td>
														<td align="left">
														   <select name="applicationId" class="inputtext01" >
														   <option value=""></option>
														   <c:forEach items="${requestScope.list}" var="obj" varStatus="n">
															 <option value="${obj.applicationId}" <c:if test="${obj.applicationId eq requestScope.face.applicationId}">selected</c:if>>${obj.applicationName}</option>
														   </c:forEach>
														   </select>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="35%">
															<div align="right">
															      目的系统协议类型:
															</div>
														</td>
														<td align="left">
														   <blocimp:sysDicDis iddValue="PROTOCOL_TYPE" value="protocolType" dicItemIn="${requestScope.face.protocolType}" hasNull="true"></blocimp:sysDicDis>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       接口名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.cimpName}" name="cimpName" maxlength="100"  />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																接口编码:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.methodName}" name="methodName"  />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																转出接口编码:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.exetMethodname}" name="exetMethodname"  />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																请求参数:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.paramater}" name="paramater"  />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																是否有效:
															</div>
														</td>
														<td align="left">
														   <select name="isValid" class="inputtext01" >
																<option value="Y" <c:if test="${'Y' eq requestScope.face.isValid}">selected</c:if>>
																	是
																</option>
																<option value="N" <c:if test="${'N' eq requestScope.face.isValid}">selected</c:if>>
																	否
																</option>
															</select>
														</td>
													</tr>
													<!-- <tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																是否返回ID:
															</div>
														</td>
														<td align="left">
														   <select name="isReturnid" class="inputtext01" >
																<option value="N" <c:if test="${'N' eq requestScope.face.isReturnid}">selected</c:if>>
																	否
																</option>
																<option value="Y" <c:if test="${'Y' eq requestScope.face.isReturnid}">selected</c:if>>
																	是
																</option>
															</select>
															<img  alt="说明" onclick="showTips('method','isReturnid');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr> -->
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																出入参:
															</div>
														</td>
														<td align="left">
														   <select name="returnAppid" class="inputtext01" >
																<option value="IN" <c:if test="${'IN' eq requestScope.face.returnAppid}">selected</c:if>>
																	入参
																</option>
																<option value="OUT" <c:if test="${'OUT' eq requestScope.face.returnAppid}">selected</c:if>>
																	出参
																</option>
															</select>
															<img  alt="说明" onclick="showTips('method','returnAppid');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																判断工单所在系统:
															</div>
														</td>
														<td align="left">
														   <select name="isjudgebillsystem" class="inputtext01" >
																<option value="N" <c:if test="${'N' eq requestScope.face.isjudgebillsystem}">selected</c:if>>
																	否
																</option>
																<option value="Y" <c:if test="${'Y' eq requestScope.face.isjudgebillsystem}">selected</c:if>>
																	是
																</option>
															</select>
															<img  alt="说明" onclick="showTips('method','isjudgebillsystem');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																工单所在系统:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.billOfSystems}" name="billOfSystems"  />
															<img  alt="说明" onclick="showTips('method','billOfSystems');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																子单节点路径:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.returnCodePath}" name="returnCodePath"  />
															<img  alt="说明" onclick="showTips('method','returnCodePath');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																主键路径:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.keyPaths}" name="keyPaths"  />
															<img  alt="说明" onclick="showTips('method','keyPaths');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																重复数据判断节点:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.needdealaction}" name="needdealaction"  />
															<img  alt="说明" onclick="showTips('method','needdealaction');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																不需要处理动作:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.notneeddealaction}" name="notneeddealaction"  />
															<img  alt="说明" onclick="showTips('method','notneeddealaction');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																动作节点路径:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.actionpath}" name="actionpath"  />
															<img  alt="说明" onclick="showTips('method','actionpath');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																是否保存返回字段:
															</div>
														</td>
														<td align="left">
														   <select name="isReturnvalue" class="inputtext01" >
																<option value="N" <c:if test="${'N' eq requestScope.face.isReturnvalue}">selected</c:if>>
																	否
																</option>
																<option value="Y" <c:if test="${'Y' eq requestScope.face.isReturnvalue}">selected</c:if>>
																	是
																</option>
															</select>
															<img  alt="说明" onclick="showTips('method','isReturnvalue');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																是否需要回调:
															</div>
														</td>
														<td align="left">
														   <select name="isSend" class="inputtext01" >
																<option value="N" <c:if test="${'N' eq requestScope.face.isSend}">selected</c:if>>
																	否
																</option>
																<option value="Y" <c:if test="${'Y' eq requestScope.face.isSend}">selected</c:if>>
																	是
																</option>
															</select>
															<img  alt="说明" onclick="showTips('method','isSend');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																回调XML:
															</div>
														</td>
														<td align="left">
														    <textarea name="xmlstr" class="inputtext01" cols="36" rows="3">${requestScope.face.xmlstr}</textarea>
														   	<img  alt="说明" onclick="showTips('method','xmlstr');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																替换XML节点:
															</div>
														</td>
														<td align="left">
														   	<textarea name="xmlNode" class="inputtext01" cols="36" rows="2">${requestScope.face.xmlNode}</textarea>
														   	<img  alt="说明" onclick="showTips('method','xmlNode');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
														</td>
													</tr>
													<tr>
													<td noWrap bgcolor="#F4F4F4">
														<div align="right">
															重调相隔时间:
														</div>
													</td>
													<td align="left">
														<input type="text" class="inputtext01" value="${requestScope.face.backLimite}" name="backLimite"  />
													</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																出参xml头:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.outXml}" name="outXml" value="" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																判断返回xml成功失败的节点路径:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.indicantNode}" name="indicantNode" value="" maxlength="200" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																成功的节点值为:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.face.successValue}" name="successValue" value="" maxlength="200" />
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
    	//if (!validateForm(CheckActionForm, 1)) {
        //    return false;
        //}
		var formObj = $('CheckActionForm').serialize(true);
    	checkAction.insertFace(formObj,callBackDoSave);
    }

    function callBackDoSave() {
    	alert("操作成功");
    	window.returnValue='T';
    	window.close();
    }

    	//----------------------------------级联---------------------------------
	function queryXyList() {
	 	var applicationId = DWRUtil.getValue('applicationId');
	 	if(applicationId == "") {
	 		DWRUtil.removeAllOptions("applicationId");
	 		DWRUtil.removeAllOptions("protocolType");
	 	}
	 	checkAction.getProtocolList(applicationId,callBackXyList);
	}

	function callBackXyList(objList) {
	 	DWRUtil.removeAllOptions("protocolType");
	 	if(objList!=null && objList!=undefined) {
	 		DWRUtil.addOptions("protocolType", objList,"protocolType","protocolName");
	 	}
	}

</script>
</html>