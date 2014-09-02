<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
	<script type="text/javascript" src="/js/prototype.js"></script>
	<script type="text/javascript" src="/js/commonjs.js"></script>
	<script type="text/javascript" src="/js/validator.js" charset="GBK"></script>
	<script type="text/javascript" src="/dwr/engine.js"></script>
	<script type="text/javascript" src="/dwr/util.js"></script>
	<script type="text/javascript" src="/dwr/interface/checkAction.js"></script>
</head>
<body>
	<html:form action="/supt/checkAction" styleId="CheckActionForm">
		<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
			<tr>
				<td>
					<table border="0" width="100%" cellpadding="0" cellspacing="0">
						<tr>
							<td width="100%"  class="headers" height="24px">
								<table width="100%" border="0" cellspacing="0" cellpadding="0" >
									<tr class="headerfont">
										<td width="3%"></td>
										<td width="40%">新增/修改转出规则</td>
										<td width="57%"></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td class="bg_01">
					<table width="100% border=" 0"  cellpadding="2" cellspacing="1">
						<tr>
							<td valign="top">
								<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight="#CCCCCC" bordercolordark="#FFFFFF" bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px" pcolor="#CCCCCC">
									<col width="30%" />
									<col width="70%" />
									<tbody>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
											<div align="right">出参xml节点:</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.outNode}" name="outNode" id="outNode" maxlength="100" dataType="Require" msg="应用程序编码不能为空" />
												<img alt="说明" onclick="showTips('method', 'outNode');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr id="outIschidNodeTr">
											<td noWrap bgcolor="#F4F4F4">
											<div align="right">出参是否叶子节点:</div>
											</td>
											<td align="left"><input type="radio" value="Y" name="outIschidNode"
												<c:if test="${'Y' eq requestScope.checkOut.outIschidNode}">checked='checked'</c:if>>
											是 <input type="radio" value="N" name="outIschidNode"
												<c:if test="${'N' eq requestScope.checkOut.outIschidNode}">checked='checked'</c:if>>
											否</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
													出参子节点是否结束:
												</div>
											</td>
											<td align="left">
												<input type="radio" value="Y"  name="outChidnodeOver" <c:if test="${'Y' eq requestScope.checkOut.outChidnodeOver}">checked='checked'</c:if>>
												是
												<input type="radio" value="N" name="outChidnodeOver" <c:if test="${'N' eq requestScope.checkOut.outChidnodeOver}">checked='checked'</c:if>>
												否
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												入参xml节点:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.inNode}" name="inNode" maxlength="4000" style="width: 85%" dataType="Double" msg="联系电话不能为空" />
												<img  alt="说明" onclick="showTips('method','inNode');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												成功时返回值:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.successValue}" name="successValue" maxlength="45" style="width: 55%" />
											</td>
										</tr>
										<tr>
											<td align="right" bgcolor="#F4F4F4">
												入参不存在时不输出节点:
											</td>
											<td align="left">
												<input type="radio" value="Y"  name="ignoreAbsent" <c:if test="${'Y' eq requestScope.checkOut.ignoreAbsent}">checked='checked'</c:if>>
												是
												<input type="radio" value="N" name="ignoreAbsent"  <c:if test="${'N' eq requestScope.checkOut.ignoreAbsent}">checked='checked'</c:if>>
												否
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
													映射方式:
												</div>
											</td>
											<td align="left">
												<select name="mappPatt" id="mappPatt" class="inputtext01" onchange="changeHandler()">
												    <option value=""></option>
													<option value="direct" <c:if test="${'direct' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														直接映射
													</option>
													<option value="static" <c:if test="${'static' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														静态数据
													</option>
													<option value="systime" <c:if test="${'systime' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														系统时间
													</option>
													<option value="timeReplace" <c:if test="${'timeReplace' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														时间替换
													</option>
													<option value="final" <c:if test="${'final' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														固定值
													</option>
													<option value="changer" <c:if test="${'changer' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														类型转换
													</option>
													<option value="source" <c:if test="${'source' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														源数据
													</option>
													<option value="tactic" <c:if test="${'tactic' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														策略
													</option>
													<option value="UUID" <c:if test="${'UUID' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														UUID
													</option>
													<option value="upload" <c:if test="${'upload' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														附件名称
													</option>
													<option value="returnID" <c:if test="${'returnID' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														返回ID
													</option>
													<option value="cycleToPatch" <c:if test="${'cycleToPatch' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														循环转拼接
													</option>
													<option value="patchToCycle" <c:if test="${'patchToCycle' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														拼接转循环
													</option>
													<option value="append" <c:if test="${'append' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														追加信息
													</option>
													<option value="directAndStatic" <c:if test="${'directAndStatic' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														直接映射与静态转换
													</option>
													<option value="copyAllSonInfo" <c:if test="${'copyAllSonInfo' eq requestScope.checkOut.mappPatt}">selected</c:if>>
														拷贝所有子节点
													</option>
												</select>
												<img  alt="说明" onclick="showTips('method','mappPatt');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr id="appendCharsTr" style="display: <c:if test="${'append' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												追加信息分隔符：
											</td>
											<td align="left">
												<input type="text" name="appendChars" id="appendChars" value="${requestScope.checkOut.appendChars}" style="width: 90%" />
											</td>
										</tr>
										<tr id="appendNodesTr" style="display: <c:if test="${'append' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												追加信息节点可行：
											</td>
											<td align="left">
												<input type="text" name="appendNodes" id="appendNodes" value="${requestScope.checkOut.appendNodes}" style="width: 90%" />
											</td>
										</tr>
										<tr id="serverIdTr" style="display: <c:if test="${'upload' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												上传服务器：
											</td>
											<td align="left">
												<html:select property="serverId" styleId="serverId">
													<html:option value="" />
													<html:options collection="protocolList" labelProperty="applicationName" property="protocolId" />
												</html:select>
											</td>
										</tr>
										<tr id="pathIndicatorTr" style="display: <c:if test="${'upload' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												路径表示类型：
											</td>
											<td align="left">
												<input type="radio" value="L"  name="pathIndicator" <c:if test="${'L' eq requestScope.checkOut.pathIndicator}">checked='checked'</c:if>>
													绝对路径
												<input type="radio" value="S" name="pathIndicator"  <c:if test="${'S' eq requestScope.checkOut.pathIndicator}">checked='checked'</c:if>>
													相对路径
											</td>
										</tr>
										<tr id="attachHomeTr" style="display: <c:if test="${'upload' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												附件存放目录：
											</td>
											<td align="left">
												<input id="attachHome" name="attachHome" value="${requestScope.checkOut.attachHome}" style="width: 90%" />
											</td>
										</tr>
										<tr id="fileNameNodeTr" style="display: <c:if test="${'upload' ne requestScope.checkOut.mappPatt}">none</c:if>;">
											<td align="right" nowrap="nowrap" bgcolor="#F4F4F4">
												文件名称节点：
											</td>
											<td align="left">
												<input id="fileNameNode" name="fileNameNode" value="${requestScope.checkOut.fileNameNode}" style="width: 90%" />
											</td>
										</tr>
										<!-- <tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
													出参父节点:
												</div>
											</td>
											<td align="left">
											<input type="text" class="inputtext01" value="${requestScope.checkOut.outParentNode}" name="outParentNode" maxlength="100" dataType="Require" msg="应用程序编码不能为空" />
											</td>
										</tr> -->
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												      映射前数据类型:
												</div>
											</td>
											<td align="left">
											   <select name="mappForData" id="mappForData" class="inputtext01" >
												    <option value="" >

													</option>
													<option value="timeStr" <c:if test="${'timeStr' eq requestScope.checkOut.mappForData}">selected</c:if>>
														时间类型
													</option>
													<option value="intStr" <c:if test="${'intStr' eq requestScope.checkOut.mappForData}">selected</c:if>>
														整型
													</option>
												</select>
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     映射前格式:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.mappForFormat}" name="mappForFormat" id="mappForFormat" maxlength="100" size=20 dataType="Double" msg="联系电话不能为空" />
											    <img  alt="说明" onclick="showTips('method','mappForFormat');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
											<div align="right">映射后数据类型:</div>
											</td>
											<td align="left"><select name="mappAftData" id="mappAftData" class="inputtext01">
												<option value=""></option>
												<option value="timeStr"
													<c:if test="${'timeStr' eq requestScope.checkOut.mappAftData}">selected</c:if>>
												时间类型</option>
												<option value="intStr"
													<c:if test="${'intStr' eq requestScope.checkOut.mappAftData}">selected</c:if>>
												整型</option>
											</select></td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     映射后格式:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.mappAftFormat}" name="mappAftFormat" id="mappAftFormat" maxlength="100" size=20 dataType="Double" msg="联系电话不能为空" />
												<img  alt="说明" onclick="showTips('method','mappAftFormat');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    字段拼接名字:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.joinName}" name="joinName" id="joinName" maxlength="100" size=20 dataType="Double" msg="联系电话不能为空" />
											    <img  alt="说明" onclick="showTips('method','joinName');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    是否拼接:
												</div>
											</td>
											<td align="left">
												<input type="radio" value="N" name="joinEnable" <c:if test="${'N' eq requestScope.checkOut.joinEnable}">checked='checked'</c:if>>
													否
												<input type="radio" value="Y" name="joinEnable"  <c:if test="${'Y' eq requestScope.checkOut.joinEnable}">checked='checked'</c:if>>
													是
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    静态数据依赖输入节点:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.depenNode}" name="depenNode" id="depenNode" maxlength="100" size=20  />
												<img  alt="说明" onclick="showTips('method','depenNode');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    静态数据依赖输出节点:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.depenKey}" name="depenKey" id="depenKey" maxlength="100" size=20  />
											    <img  alt="说明" onclick="showTips('method','depenKey');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    甲端系统的静态数据类型:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.declareSn}" name="declareSn" id="declareSn" maxlength="100" size=20  />
											    <img  alt="说明" onclick="showTips('method','declareSn');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												    乙端系统的静态数据类型:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.mappingSn}" name="mappingSn" id="mappingSn" maxlength="100" size=20  />
											    <img  alt="说明" onclick="showTips('method','mappingSn');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												   静态数据类型转换类型:
												</div>
											</td>
											<td align="left">
												<select id="isSimpsys" name="isSimpsys">
													<option value=""></option>
													<option value="1C2E" <c:if test="${'1C2E' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲端系统静态数据转换(名称转编码)
													</option>
													<option value="1E2C" <c:if test="${'1E2C' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲端系统静态数据转换(编码转名称)
													</option>
													<option value="3C2E" <c:if test="${'3C2E' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													乙端系统静态数据转换(名称转编码)
													</option>
													<option value="3E2C" <c:if test="${'3E2C' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													乙端系统静态数据转换(编码转名称)
													</option>
													<option value="2E2E" <c:if test="${'2E2E' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲乙系统静态数据转换(编码转编码)
													</option>
													<option value="2E2C" <c:if test="${'2E2C' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲乙系统静态数据转换(编码转中文)-开发中
													</option>
													<option value="2C2E" <c:if test="${'2C2E' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲乙系统静态数据转换(中文转编码)-开发中
													</option>
													<option value="2C2C" <c:if test="${'2C2C' eq requestScope.checkOut.isSimpsys}">selected="selected"</c:if>>
													甲乙系统静态数据转换(中文转中文)-开发中
													</option>
												</select>
												<img  alt="说明" onclick="showTips('method','isSimpsys');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												      是否有同样XML体:
												</div>
											</td>
											<td align="left">
											   <input type="radio" value="N"  name="isDoubuxml" <c:if test="${'N' eq requestScope.checkOut.isDoubuxml}">checked='checked'</c:if>>
													否
												<input type="radio" value="Y" name="isDoubuxml"  <c:if test="${'Y' eq requestScope.checkOut.isDoubuxml}">checked='checked'</c:if>>
													是
												<img  alt="说明" onclick="showTips('method','isDoubuxml');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<!--   <tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     相同XML体顺序:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.doubuNum}" name="doubuNum" maxlength="100" size=20  />
											</td>
										</tr>-->
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     相同XML体节点路径:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.doubuPar}" name="doubuPar" id="doubuPar" maxlength="100" size=20  />
											    <img  alt="说明" onclick="showTips('method','doubuPar');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     相同XML体内部节点:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" value="${requestScope.checkOut.doubuChi}" name="doubuChi" id="doubuChi" maxlength="100" size=20  />
											    <img  alt="说明" onclick="showTips('method','doubuChi');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td noWrap bgcolor="#F4F4F4">
												<div align="right">
												     顺序编号:
												</div>
											</td>
											<td align="left">
												<input type="text" class="inputtext01" <c:if test="${requestScope.checkOut.orderId ne null}">value="${requestScope.checkOut.orderId}"</c:if><c:if test="${requestScope.checkOut.orderId eq null}">value="${requestScope.orderId}"</c:if> name="orderId" maxlength="100" size=20 dataType="Double" msg="联系电话不能为空" />
											    <img  alt="说明" onclick="showTips('method','orderId');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</td>
										</tr>
										<tr>
											<td align="right" bgcolor="#F4F4F4">
												配置是否生效
											</td>
											<td align="left">
												<input type="radio" value="Y"  name="available" <c:if test="${'Y' eq requestScope.checkOut.available}">checked='checked'</c:if>>
												是
												<input type="radio" value="N" name="available"  <c:if test="${'N' eq requestScope.checkOut.available}">checked='checked'</c:if>>
												否
												<input type="radio" value="D" name="available"  <c:if test="${'D' eq requestScope.checkOut.available}">checked='checked'</c:if>>
												生效但不输出
											</td>
										</tr>
										<tr>
											<td align="right" bgcolor="#F4F4F4">
												是否注释
											</td>
											<td align="left">
												<input type="radio" value="Y"  name="isAnnotate" <c:if test="${'Y' eq requestScope.checkOut.isAnnotate}">checked='checked'</c:if>>
												是
												<input type="radio" value="N" name="isAnnotate"  <c:if test="${'N' eq requestScope.checkOut.isAnnotate}">checked='checked'</c:if>>
												否
											</td>
										</tr>
										<tr>
											<td colspan="2" align="center">
												<html:hidden property="cimpFaceId" />
												<input type="hidden" value="${requestScope.checkOut.sendId}" name="sendId"/>
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
	</html:form>
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
		//alert(Object.toJSON(formObj));
    	checkAction.insertCheckOut(formObj,callBackDoSave);
    }

    function callBackDoSave() {
    	alert("操作成功");
    	window.returnValue='T';
    	window.close();
    }

    //选择
	function selectFace(){
	    var url = "/jsp/faceSupt/selectfaceDataSrch.jsp";
		var returnValue = "";
		returnValue = window.showModalDialog(url, window, 'dialogHeight:550px;dialogWidth:550px;status=no;resizable:no');
	    if(returnValue != "" && returnValue != null){
	       var stringArr = returnValue.split("|");
	       document.CheckActionForm.cimpFaceId.value=stringArr[0];
	       document.CheckActionForm.cimpName.value=stringArr[1];
	    }
	  }

	function changeHandler() {
		if ($F("mappPatt") == "upload") {
			$("attachHomeTr", "fileNameNodeTr", "serverIdTr", "pathIndicatorTr").invoke("show");
		} else {
			$("attachHomeTr", "fileNameNodeTr", "serverIdTr", "pathIndicatorTr").invoke("hide");
		}
		if ($F("mappPatt") == "append") {
			$("appendCharsTr", "appendNodesTr").invoke("show");
		} else {
			$("appendCharsTr", "appendNodesTr").invoke("hide");
		}
	}
</script>
</html>