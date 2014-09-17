<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<%@ include file='/jsp/common/calendar.jsp'%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/newsAction.js'></script>
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
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
<link rel="stylesheet" href="/css/ymPrompt/vista/ymPrompt.css">
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
<title>协作管理系统</title>
</head>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
	function handler(errors) {
		alert(errors);
		enableForm();
		return false;
	}
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0" onload="setTimeValue()">
	<form id="inputForm" name="inputForm">
		<input type="hidden" id="billId" name="billId"
			value="${requestScope.billId}">
		<table border="0" style="FONT-SIZE: 13px" cellpadding="5"
			cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
			<tr>
				<td valign="top">
					<div id="tabView1">
						<DIV id="tabView1tab_tabPane">
							<DIV id=tabTabtabView1_0>
								<table border="0" style="FONT-SIZE: 13px" cellspacing="0"
									cellpadding="0" height="10px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120"><img
											src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
											width="18" height="15"> <span>&nbsp;新闻录入</span></td>
										<td class="tabpaneright2"></td>
									</tr>
								</table>

							</DIV>
						</DIV>

						<div class="tab_aTab">
							<div id="create_content" style="PADDING-RIGHT:0px;">
								<table border="0" style="FONT-SIZE: 13px" cellpadding="0"
									cellspacing="0" bgcolor="#FFFFFF" height="100%" width="100%">
									<tr>
										<td valign="top" width="78%">
											<div id="inputText"
												style="width: 100%; height: 100%; overflow: hidden; border: 0px solid Silver;">
												<table width="100%" border="0" cellspacing="0"
													cellpadding="0" class="table">
													<tr>
														<td align="right" bgcolor="#f2f2f2" class="left_txt2">新闻标题：<span
															style="color:Red">*</span></td>
														<td bgcolor="#f2f2f2" colspan="3"><input
															name="theTitle" type="text" id="theTitle"
															class="form-control" oninput="querySimilarly()"
															dataType="Require" msg="'标题'必填" /></td>
														<td bgcolor="#f2f2f2" colspan="2"></td>
													</tr>
													<tr>
														<td align="right" bgcolor="#f2f2f2" class="left_txt2">新闻内容：</td>
														<td bgcolor="#f2f2f2" colspan="3"><textarea rows="3"
																cols="83" class="form-control" name="newsContent"></textarea></td>
														<td bgcolor="#f2f2f2" colspan="2"></td>
													</tr>
													<tr>
														<td colspan="6" align="center"> <input name="btnFile"
															type="button" class="btn btn-default" id="btnFile"
															value="附  件" onclick="uploadFile()"> <input
															name="btnSubmit" type="button" class="btn btn-default"
															id="btnSubmit" value="提  交" onclick="submitContent(this)">
															<input name="cs" type="button" class="btn btn-default"
															id="cs" value="取 消" onClick="refreshWindow('ok')"></td>
													</tr>

												</table>
											</div>
										</td>
										<td>&nbsp;</td>
										<td width="22%" valign="top"><div id="list_page"
												name="list_page"
												style="width:100%;height:100%;overflow:hidden;border :0px solid Silver;"
												src=""></div></td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function setTimeValue() {
			$('repairTime').value = getNowDate();
			//setTimeout('setTimeValue()',1000);
		}
		function callback(str) {
			if (str == "success") {
				ymPrompt.alert({
					message : '操作成功！',
					title : '',
					handler : refreshWindow
				});
			} else {
				handler(str);
			}
		}
		function refreshWindow(returnStr) {
			if (returnStr == "ok" || returnStr == "close") {
				window.location.href="/business/newsAction.do?method=init";
			}
		}
		function submitContent() {
			if (!validateForm(inputForm, 3)) {
				return false;
			}
			var formObj = $('inputForm').serialize(true);
			newsAction.accept(formObj, callback);
		}
		function querySimilarly() {
			if ($('theTitle').value == ''){
				return;
			}else if($('theTitle').value != undefined && $('theTitle').value.length < 2){
				return
			}
			var formObj = $('inputForm').serialize(true);
			newsAction.querySimilarly(formObj, refreshListPage);
		}
		function refreshListPage(str) {
			$('list_page').innerHTML = str;
		}

		initTabs('tabView1', Array('新闻录入'), 0, '100%', '95%');
		function getDetail(billId, theTitle) {
			createNewTab(
					'tabView1',
					'[' + theTitle + ']&nbsp;',
					'',
					'/business/newsAction.do?method=detail&billId=' + billId,
					true);
		}
		function uploadFile(){
			ymPrompt.win({message:'/jsp/common/uploadFile.jsp?shareTypeWrite=private&billId='+$('billId').value+'&businessType=trends',width:500,height:350,title:'',minBtn:false,maxBtn:false,useSlide:true,showShadow:true,handler:changeBtnName,iframe:{id:'myId'}});
		}
		function changeBtnName(returnStr) {
			if (returnStr == "ok" || returnStr == "close") {
				$('btnFile').value = '附  件 *';
			}
		}

	</script>
</body>
</html>
