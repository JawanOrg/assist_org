<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript'
	src='/dwr/interface/sysDicConfigAction.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicItemAction.js'></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp'%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<head>
<title>协作管理系统</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script>
	DWREngine.setErrorHandler(handler);

	function handler(errors) {
		alert(errors);
		enableForm("commonQueryForm");
		return false;
	}

	function doDel() {
		var ids = getSelectCheckboxValue("queryResultList", "checkid", "|");
		if (ids != "") {
			if (confirm("确定删除?")) {
				sysDicConfigAction.deleteDataSysDicConfig(ids, delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}

	function delCallback() {
		enableForm();
		alert("操作成功");
		showAllData();
	}

	function toSysDicConfigAdd() {
		var addSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/toSysDicConfigAdd.jsp", null,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (addSysDicConfigObj != -1) {
			showAllData();
		}
	}

	function countValidCheck() {
		var id = document.getElementsByName("checkid");
		//alert(id);
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				count++;
			}
		}
		return count;
	}

	function getValidFirstCheckValue() {
		var id = document.getElementsByName("checkid");
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				return id[i].value;
			}
		}
	}

	function toSysDicConfigEdit() {
		enableForm();
		var count = countValidCheck();
		if (count <= 0) {
			alert("请选择一条记录!");
			return false;
		} else if (count > 1) {
			alert("只能选择一条记录!");
			return false;
		} else if (count == 1) {
			var id = getValidFirstCheckValue();
			sysDicConfigAction.getDataSysDicConfig(id, callbackSysDicConfig);
			disableForm();
		}
	}

	function callbackSysDicConfig(objData) {
		enableForm();
		var editSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/toSysDicConfigEdit.jsp",
						objData,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (editSysDicConfigObj != -1) {
			showAllData();
		}
	}

	function toSysDicItemRelateList(obj) {
		createNewTab('tabView1', '字典条目列表&nbsp;', '',
				'/sys/sysDicConfigAction.do?method=showSysDicItemByDictionaryId&dictionaryId='
						+ obj, true);
	}

	function showAllData() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('commonQueryForm').serialize(true);
		formObj.dictionaryName = '';
		formObj.dictionaryCode = '';
		sysDicConfigAction.getSysDicConfigList(formObj, showTableAfterDel);
		disableForm();
	}

	function showTableAfterDel(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	function initSysDicConfigData() {
		trimForm();
	}

	function doDelItem() {
		var ids = getSelectCheckboxValue("queryResultList", "checkid", "|");
		if (ids != "") {
			if (confirm("确定删除?")) {
				sysDicItemAction.deleteDataSysDicItem(ids, delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}

	function delCallback() {
		alert("操作成功");
		enableForm();
		showAllData();
	}

	function toSysDicItemAdd() {
		enableForm();
		var addSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/sysDicItemAdd.jsp", null,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (addSysDicConfigObj != -1) {
			showAllData();
		}
	}

	function toSysDicItemEdit(itemId) {
		enableForm();
		if (itemId != null) {
			sysDicItemAction.getDataSysDicItem(itemId, callbackSysDicItemEdit);
			disableForm();
		}
	}

	function callbackSysDicItemEdit(objData) {
		enableForm();
		var editSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/sysDicItemEdit.jsp", objData,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (editSysDicConfigObj != -1) {
			showAllData();
		}
	}

	function showAllData() {
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj = $('commonQueryForm').serialize(true);
		sysDicItemAction.getSysDicItemList(formObj, showTablequeryResultList);
		disableForm();
	}

	function queryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}

	function countCheck() {
		var id = document.getElementsByName("checkid");
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				count++;
			}
		}
		return count;
	}

	function initqueryResultListItem() {
		DWRUtil.useLoadingMessage('数据读取中...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true);
		if (DWRUtil.getValue('dicId') != null
				&& DWRUtil.getValue('dicId') != "") {
			formObj.dictionaryId = DWRUtil.getValue('dicId');
		}
		sysDicItemAction.getSysDicItemList(formObj, showTablequeryResultList);
		disableForm();
	}

	function showTablequeryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}

	function callbackInit2(objList) {
		if (objList != null) {
			DWRUtil.removeAllOptions("dicId");
			DWRUtil.addOptions("dicId", objList, "dictionaryId",
					"dictionaryName");
		}
	}

	function initLoad() {
		alert("11");
		var dictionaryId = "${param.dictionaryId}";
		//alert(dictionaryId);
		initQueryResultList2(dictionaryId);
	}
	function initQueryResultList2(dictionaryId) {
		DWRUtil.useLoadingMessage('数据读取中...');
		sysDicItemAction.getDataSysDicItemByDictionaryId(dictionaryId,
				showResultList2);
		disableForm();
	}

	function showResultList2(str) {
		enableForm();
		$('queryResultList2').innerHTML = str;
	}

	function deleteRelateDicItem() {
		var ids = getSelectCheckboxValue("queryResultList2", "checkid1", ":");
		if (ids != "") {
			if (confirm("确定删除?")) {
				sysDicItemAction.deleteDataSysDicItem(ids, delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}

	function delCallback() {
		enableForm();
		alert("删除成功!");
		initQueryResultList2();
	}

	function toSysDicItemAdd() {
		enableForm();
		var addSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/sysDicItemAdd.jsp",
						dictionaryId,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (addSysDicConfigObj != -1) {
			initQueryResultList2();
		}
	}

	function toSysDicItemEdit(itemId) {
		enableForm();
		if (itemId != null) {
			sysDicItemAction.getDataSysDicItem(itemId, callbackSysDicItemEdit);
			disableForm();
		}
	}

	function callbackSysDicItemEdit(objData) {
		enableForm();
		var editSysDicConfigObj = window
				.showModalDialog("/jsp/sys/dic/sysDicItemEdit.jsp", objData,
						"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if (editSysDicConfigObj != -1) {
			initQueryResultList2();
		}
	}
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0">
	<form name="commonQueryForm" id="commonQueryForm">
		<input type="hidden" id="orderByClause" name="orderByClause" value="" />
		<%@ include file='/jsp/widget/wztool.jsp'%>
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
											width="18" height="15"> 查询条件 <img
											src="<%=request.getContextPath()%>/images/main/button_bug2.gif"
											width="19" height="17"></td>
										<td class="tabpaneright2"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF">
								<table class=table id=powergrid style="FONT-SIZE: 13px"
									cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
									bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
									<tr style="display:display">
										<td align="right" bgcolor="#F4F4F4">数据字典名称：</td>
										<td><input type="text" name="dictionaryName"
											class="inputtext01" value="" /></td>
										<td align="right" bgcolor="#F4F4F4">数据字典代号：</td>
										<td><input type="text" name="dictionaryCode"
											class="inputtext01" value="" /></td>
										<td><input type="button" class="button" value="查询(Q)"
											accesskey="Q" onclick="initqueryResultList();" align="right" />
											<input type="button" class="button" value="重置(R)"
											accesskey="R" onclick="reset();" align="right" /> <input
											type="hidden" name="pageNumber" value="1" /> <input
											type="hidden" name="maxResults" value="15" /></td>
									</tr>
								</table>
							</td>
						</tr>
					</table> <br>
					<div id="tabView1">
						<DIV id="tabView1tab_tabPane">
							<DIV id=tabTabtabView1_0>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size:13px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120"><img
											src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
											width="18" height="15"> <span>数据字典列表</span></td>
										<td class="tabpaneright2"></td>
									</tr>
								</table>
							</DIV>
						</DIV>
						<div class="tab_aTab">
							<table class=table id=powergrid style="FONT-SIZE: 13px"
								cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
								bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
								<tr>
									<td>
										<div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
									</td>
								</tr>
								<tr>
									<td><input id="addConfig" type="button" class="button"
										value="新增" onClick="toSysDicConfigAdd();" /> <input
										id="editConfig" type="button" class="button" value="修正"
										onClick="toSysDicConfigEdit();" /> <input id="deleteConfig"
										type="button" class="button" value="删除" onClick="doDel()" /></td>
								</tr>
							</table>
						</div>
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		initTabs('tabView1', Array('数据字典列表'), 0, '100%', '100%');

		if (Prototype.Browser.Opera) {
			initqueryResultList();
		} else {
			Event.observe(window, 'load', initqueryResultList);
		}

		function initqueryResultList() {
			DWRUtil.useLoadingMessage('数据读取中...');
			trimForm();
			var formObj = $('commonQueryForm').serialize(true);
			sysDicConfigAction.getSysDicConfigList(formObj,
					showTablequeryResultList);
			disableForm();
		}

		function showTablequeryResultList(str) {
			enableForm();
			$('queryResultList').innerHTML = str;
		}
	</script>
</body>
</html>