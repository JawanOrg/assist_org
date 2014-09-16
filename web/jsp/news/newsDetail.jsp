<%@ page contentType="text/html;charset=GBK" pageEncoding="GBK"
	language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/newsAction.js'></script>
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<link href="/css/time.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box {
	width: 600px;
	height: auto;
	margin: 20px auto;
	float: left;
	margin-left: 300px;
}

.box label {
	font-size: 14px;
	float: left;
	line-height: 33px;
	color: #434343;
}

.timeDateTwo {
	width: 500px;
	float: left;
}

.timeDateOne {
	width: 600px;
	float: left;
	display: inline;
	margin-top: 30px;
}
</style>
<html>
<head>
<title>Э������ϵͳ</title>
</head>

<script type="text/javascript">
	//var $ = jQuery.noConflict();
	DWREngine.setErrorHandler(handler);
	function handler(errors) {
		alert(errors);
		enableForm();
		return false;
	}
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0">
	<form id="inputForm" name="inputForm">
		<input type="hidden" name="billId"
			value="${requestScope.trends.billId}">
		<table border="0" style="FONT-SIZE: 13px" cellpadding="5"
			cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
			<tr>
				<td valign="top">
					<table border="0" style="FONT-SIZE: 13px" cellpadding="0"
						cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
						<tr>
							<td width="78%" valign="top">
								<div id="details"
									style="width: 100%; height: 100%; overflow: hidden; border: 0px solid Silver;">
									<table width="100%" border="0" cellspacing="0" cellpadding="0"
										class="table">
										<tr>
											<td height="30" align="right" class="left_txt2">��ţ�</td>
											<td height="30">${requestScope.trends.billSn}</td>
											<td height="30" align="right" class="left_txt2">�����ˣ�</td>
											<td height="30"><assist:sysOrganization
													objectId='${requestScope.trends.creator}' /></td>
											<td height="30" align="right" class="left_txt2">����ʱ�䣺</td>
											<td height="30"><fmt:formatDate
													value="${requestScope.trends.createTime}" type="both"
													pattern="yyyy-MM-dd HH:mm:ss" /></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">���⣺</td>
											<td height="30" bgcolor="#f2f2f2" colspan="3">${requestScope.trends.theTitle}</td>
											<td height="30" bgcolor="#f2f2f2" colspan="2"></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">������</td>
											<td height="30"><assist:sysDicDisName
													itemCodeIn="${requestScope.trends.city}"
													dictionaryCodeIn="release_city" /></td>
											<td height="30" align="right" class="left_txt2">������</td>
											<td height="30"><assist:sysDicDisName
													itemCodeIn="${requestScope.trends.community}"
													dictionaryCodeIn="release_community" /></td>
											<td height="30" align="right" class="left_txt2">��·��</td>
											<td height="30">${requestScope.trends.road}</td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">���ƣ�</td>
											<td height="30" bgcolor="#f2f2f2">
												${requestScope.trends.numberPlate}</td>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">ʩ��ʱ�䣺</td>
											<td height="30" bgcolor="#f2f2f2"><fmt:formatDate
													value="${requestScope.trends.repairTime}" type="both"
													pattern="yyyy-MM-dd HH:mm:ss" /></td>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2"></td>
											<td height="30" bgcolor="#f2f2f2"></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">�ֳ���ϵ�ˣ�</td>
											<td height="30">${requestScope.trends.scenePersonName}</td>
											<td height="30" align="right" class="left_txt2">�ֳ���ϵ�˵绰��</td>
											<td height="30">${requestScope.trends.scenePersonPhone}
											</td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">���Լƻ�˵����</td>
											<td height="30" bgcolor="#f2f2f2" colspan="3">${requestScope.trends.testPlanRemark}
											</td>
											<td height="30" bgcolor="#f2f2f2" colspan="2"></td>
										</tr>
										<tr>
											<td height="30" align="right" class="left_txt2">ʩ�����</td>
											<td height="30"><assist:sysDicDisName
													itemCodeIn="${requestScope.trends.repairType}"
													dictionaryCodeIn="release_repair_type" /></td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
											<td height="30" align="right" class="left_txt2"></td>
											<td height="30"></td>
										</tr>
										<tr>
											<td height="30" align="right" bgcolor="#f2f2f2"
												class="left_txt2">ʩ�����ݣ�</td>
											<td height="30" bgcolor="#f2f2f2" colspan="3">
												${requestScope.trends.repairContent}</td>
											<td height="30" bgcolor="#f2f2f2" colspan="2"></td>
										</tr>
									</table>

									<table width="100%" border="0" cellspacing="0" cellpadding="0"
										class="table">
										<c:forEach items="${requestScope.taskList}" var="task"
											varStatus="m">
											<tr>
												<td height="30" align="right" class="left_txt2">��̬��չ��</td>
												<td height="30"><assist:sysDicDisName
														itemCodeIn="${task.taskStatus}"
														dictionaryCodeIn="release_status" /></td>
												<td height="30" align="right" class="left_txt2">��ǰ�����ˣ�</td>
												<td height="30"><assist:sysOrganization
														objectId='${task.dealObjectId}' /></td>
												<td height="30" align="right" class="left_txt2">��������ʱ�䣺</td>
												<td height="30"><fmt:formatDate
														value="${task.createTime}" type="both"
														pattern="yyyy-MM-dd HH:mm:ss" /></td>
											</tr>
											<tr>
												<td height="30" bgcolor="#f2f2f2" colspan="6" align="right"><c:if
														test="${task.taskStatus=='audit'}">
														<input name="btnSubmit" type="button"
															class="btn btn-default btn-sm" id="auditBtn" value="���"
															onclick="audit('${task.billId}','${task.taskId}','${requestScope.trends.billSn}')">
													</c:if> <c:if test="${task.taskStatus=='release'}">
														<input name="btnSubmit" type="button"
															class="btn btn-default btn-sm" id="auditBtn" value="����"
															onclick="release('${task.billId}','${task.taskId}','${requestScope.trends.billSn}')">
													</c:if> <c:if test="${task.taskStatus=='work'}">
														<input name="btnSubmit" type="button"
															class="btn btn-default btn-sm" id="auditBtn" value="��д���"
															onclick="writeSuggestion('${task.billId}','${task.taskId}','${requestScope.trends.billSn}')">
														<input name="btnSubmit" type="button"
															class="btn btn-default btn-sm" id="auditBtn" value="���ʩ��"
															onclick="finishWork('${task.billId}','${task.taskId}','${requestScope.trends.billSn}')">
													</c:if> <input name="btnProgress" type="button"
													class="btn btn-default btn-sm" id="btnProgress" value="����"
													onclick="showChart('${task.billId}')">&nbsp;<input
													name="btnAttach" type="button"
													class="btn btn-default btn-sm" id="btnAttach" value="����"
													onclick="uploadFile('${task.billId}')">&nbsp;<input
													name="btnRefreshDetail" type="button"
													class="btn btn-default btn-sm" id="btnRefreshDetail"
													value="ˢ��"
													onclick="refreshDetail('${task.billId}','${requestScope.trends.billSn}')"></td>
											</tr>
										</c:forEach>
									</table>

									<table width="100%" border="0" cellspacing="0" cellpadding="0"
										class="table">
										<c:forEach items="${requestScope.attachList}" var="attach">
											<tr>
												<td height="30" align="right" class="left_txt2">�������ƣ�</td>
												<td height="30"><a
													href="/FileDownloadServlet?attachId=${attach.attachId}"><span
														style="color:blue;">${attach.fileName}</span></a></td>
												<td height="30" align="right" class="left_txt2">�ϴ��ˣ�</td>
												<td height="30"><assist:sysOrganization
														objectId='${attach.creator}' /></td>
												<td height="30" align="right" class="left_txt2">�ϴ�ʱ�䣺</td>
												<td height="30"><fmt:formatDate
														value="${attach.createTime}" type="both"
														pattern="yyyy-MM-dd HH:mm:ss" /></td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</td>
							<td>&nbsp;</td>
							<td width="22%" valign="top">
								<div id="list_page" name="list_page"
									style="width:100%;height:100%;overflow:hidden;border :0px solid Silver;"
									src="">
									<table class="table" id="powergrid" style="FONT-SIZE: 13px"
										cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
										bordercolorlight=#D7D7D7 border=0 frame=box pcolor="#BCC8F5">
										<tr class="titletr" height="15">
											<td style="word-break: keep-all;FONT-SIZE: 12px" width="40%">����ʱ��</td>
											<td style="word-break: keep-all;FONT-SIZE: 12px" width="10%">������</td>
											<td style="word-break: keep-all;FONT-SIZE: 12px" width="50%">��������</td>
										</tr>
										<c:forEach items="${requestScope.actionList}" var="obj"
											varStatus="n">
											<tr align="center" bgcolor="" style="cursor: 'hand'">
												<td align="center"><fmt:formatDate
														value="${obj.operateTime}" type="both"
														pattern="MM-dd HH:mm:ss" /></td>
												<td align="center"><assist:sysOrganization
														objectId='${obj.operator}' /></td>
												<td align="left"><assist:sysDicDisName
														itemCodeIn="${obj.actionType}"
														dictionaryCodeIn="release_op" /> <c:if
														test="${not empty obj.remark && obj.remark ne ''}">��${obj.remark}</c:if></td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

	</form>
	<script type="text/javascript">
		function querySimilarly() {
			var formObj = $('inputForm').serialize(true);
			newsAction.querySimilarly(formObj, refreshListPage);
		}
		function refreshListPage(str) {
			$('list_page').innerHTML = str;
		}
	</script>
</body>
</html>
