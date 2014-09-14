<%@ page contentType="text/html;charset=GBK" pageEncoding="GBK"
	language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/dynamicAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/css/ymPrompt/vista/ymPrompt.css">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
<html>
<head>
<title>协作管理系统</title>
</head>
<script>
	DWREngine.setErrorHandler(handler);
	function handler(errors) {
		alert(errors);
		return false;
	}
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0">
	<form name="queryForm" id="queryForm">
		<table width="100%" border="0" cellpadding="5" cellspacing="0"
			bgcolor="#FFFFFF" height="100%">
			<tr>
				<td valign="top">
					<table width="100%" border="0" cellpadding="0" cellspacing="0"
						bgcolor="#FFFFFF">
						<tr>
							<td>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size:13px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120"><img
											src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
											width="18" height="15"> 查询条件&nbsp;<span
											id="conditionHandStautsSpan" value="up"
											class="glyphicon glyphicon-hand-up" style="cursor:pointer"
											onclick="hiddenConditionTable()"></td>
										<td class="tabpaneright2"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF">
								<table class=table id="conditionTable" style="FONT-SIZE: 13px"
									cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
									bordercolorlight=#D7D7D7 border=0 frame=box pcolor="#BCC8F5">
									<tr style="display:display">
										<td align="right">标题：</td>
										<td><input type="text" name="theTitle"
											class="form-control"></td>
										<td align="right">编号：</td>
										<td><input type="text" name="billSn"
											class="form-control"></td>
										<td align="right">状态：</td>
										<td><assist:sysDicDis iddValue="release_status"
												value="billStatus" stylename="form-control" dicItemIn=""
												hasNull="true"></assist:sysDicDis></td>
										<td colspan="2" align="right"></td>
									</tr>
									<tr style="display:display">
										<td align="right">城区：</td>
										<td><assist:sysDicDis iddValue="release_city"
												value="city" stylename="form-control" dicItemIn=""
												hasNull="true"></assist:sysDicDis></td>
										<td align="right">社区：</td>
										<td><assist:sysDicDis iddValue="release_community"
												value="community" stylename="form-control" dicItemIn=""
												hasNull="true"></assist:sysDicDis></td>
										<td align="right">道路：</td>
										<td><input type="text" name="road" class="form-control"></td>
										<td colspan="2" align="right"><input type="button"
											class="btn btn-default" value="查询(Q)" accesskey="Q"
											onclick="initQueryResultList()" /> <input type="button"
											class="btn btn-default" value="重置(R)" accesskey="R"
											onclick="cancelAllText()" /></td>
									</tr>
								</table>
						</td>
						</tr>
					</table>
					<div id="tabView1">
						<DIV id="tabView1tab_tabPane">
							<DIV id=tabTabtabView1_0>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size:13px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120"><img
											src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
											width="18" height="15"> <span>&nbsp;动态列表</span></td>
										<td class="tabpaneright2"></td>
									</tr>
								</table>
							</DIV>
						</DIV>
						<div class="tab_aTab">
							<input type="hidden" name="skipResults" value="0" />
							<input type="hidden" name="maxResults" value="<%=com.free.assist.util.Constant.PAGE_SIZE%>" />
							<div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</form>
	<script>
		initTabs('tabView1', Array('动态列表'), 0, '100%', '90%');
		function getDetail(billId, billSn) {
			createNewTab(
					'tabView1',
					'[' + billSn + ']&nbsp;',
					'',
					'/business/dynamicAction.do?method=detail&billId=' + billId,
					true);
		}

		initQueryResultList();
		function initQueryResultList() {
			DWRUtil.useLoadingMessage('数据读取中...');
			var formObj = $('queryForm').serialize(true);
			dynamicAction.queryComprehensive(formObj, showResultList);
		}

		function showResultList(str) {
			$('queryResultList').innerHTML = str;
		}

		function goBack(s) {
			if (s == "") {
				alert("操作成功！");
				initQueryResultList();
			} else {
				alert(s);
			}
		}
		function audit(billId, taskId, billSn) {
			ymPrompt.win({
				message : '/business/dynamicAction.do?method=auditInit&billId='
						+ billId + '&taskId=' + taskId + '&billSn=' + billSn,
				width : 500,
				height : 300,
				title : '',
				minBtn : false,
				maxBtn : false,
				useSlide : true,
				showShadow : true,
				iframe : {
					id : 'myId'
				}
			});
		}
		function release(billId, taskId, billSn) {
			ymPrompt
					.win({
						message : '/business/dynamicAction.do?method=releaseInit&billId='
								+ billId
								+ '&taskId='
								+ taskId
								+ '&billSn='
								+ billSn,
						width : 500,
						height : 300,
						title : '',
						minBtn : false,
						maxBtn : false,
						useSlide : true,
						showShadow : true,
						iframe : {
							id : 'myId'
						}
					});
		}
		function writeSuggestion(billId, taskId, billSn) {
			ymPrompt
					.win({
						message : '/business/dynamicAction.do?method=writeSuggestionInit&billId='
								+ billId
								+ '&taskId='
								+ taskId
								+ '&billSn='
								+ billSn,
						width : 500,
						height : 300,
						title : '',
						minBtn : false,
						maxBtn : false,
						useSlide : true,
						showShadow : true,
						iframe : {
							id : 'myId'
						}
					});
		}
		function finishWork(billId, taskId, billSn) {
			ymPrompt
					.win({
						message : '/business/dynamicAction.do?method=finishWorkInit&billId='
								+ billId
								+ '&taskId='
								+ taskId
								+ '&billSn='
								+ billSn,
						width : 500,
						height : 300,
						title : '',
						minBtn : false,
						maxBtn : false,
						useSlide : true,
						showShadow : true,
						iframe : {
							id : 'myId'
						}
					});
		}
		function showChart(billId) {
			ymPrompt.win({
				message : '/business/dynamicAction.do?method=showChart&billId='
						+ billId,
				width : 700,
				height : 500,
				title : '',
				minBtn : false,
				maxBtn : false,
				useSlide : true,
				slideCfg : {
					increment : 0.2,
					interval : 100
				},
				minBtn : true,
				maxBtn : true,
				showShadow : true,
				iframe : {
					id : 'myId'
				}
			});
		}
		function refreshDetail(billId, billSn) {
			getDetail(billId, billSn);
		}
		function uploadFile(billId) {
			ymPrompt
					.win({
						message : '/jsp/common/uploadFile.jsp?shareTypeWrite=private&billId='
								+ billId + '&businessType=trends',
						width : 500,
						height : 350,
						title : '',
						minBtn : false,
						maxBtn : false,
						useSlide : true,
						showShadow : true,
						handler : refreshDetailPage,
						iframe : {
							id : 'myId'
						}
					});
		}
		function refreshDetailPage() {
			$('btnRefreshDetail').onclick();
		}
		function hiddenConditionTable() {
			if ($('conditionHandStautsSpan').className == "glyphicon glyphicon-hand-up") {
				$('conditionTable').style.display = "none";
				$('conditionHandStautsSpan').className = "glyphicon glyphicon-hand-down";
			} else if ($('conditionHandStautsSpan').className == "glyphicon glyphicon-hand-down") {
				$('conditionTable').style.display = "block";
				$('conditionHandStautsSpan').className = "glyphicon glyphicon-hand-up";
			}
		}
		function jumpTo(formId, pageNo) {
			var formEl = document.getElementById(formId);
			if (!formEl) {
				alert("不存在" + formId + "表单");
				return;
			}
			formEl["skipResults"].value = (pageNo - 1) * formEl["maxResults"].value;
			initQueryResultList();
		}
	</script>
</body>
</html>