<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<script src="/js/jquery-1.10.2.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"
	charset="UTF-8"></script>
<script type="text/javascript"
	src="/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>

<title>创建项目</title>
<style type="text/css">
</style>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						//将form转换成ajax方式提交
						$("#versionForm")
								.ajaxForm(
										{
											beforeSubmit : function() {
												$("#registerButton").button(
														'loading'); //按钮样式为处理中
											},
											success : function(responseText,
													statusText, xhr, form) {
												$('#registerButton').button(
														'reset'); //恢复按钮样式
												if (responseText.success) {
													$("#versionForm").reset();
													$
															.clearMultiFile('multipartFile'); // 清除附件选择框内容
													window
															.createNoty({
																text : '创建版本操作成功！',
																layout : 'topCenter',
																type : 'success',
																timeout : 800,
																callback : {
																	onClose : function() {
																		parent.document.location.href = "${pageContext.request.contextPath}/ida40/foss/publish/versionListController/mainPage.jhtml";
																	}
																}
															}); //提示成功
												} else {
													window
															.createNoty(
																	responseText.message,
																	'topCenter',
																	'error'); //提示失败
												}
											},
											error : function() {
												$('#registerButton').button(
														'reset'); //恢复按钮样式
												window.createNoty('创建版本操作失败！',
														'topCenter', 'error'); //提示失败
											},
											dataType : "json"
										});

						//ctrl+enter作为提交快捷键
						$("#versionForm").keydown(function(e) {
							if (e.ctrlKey && (e.which == 13 || e.which == 10)) {
								$("#versionForm").submit();
							}
						});

						//第一个选择框获取焦点
						$('[name="upgradeType"]')[0].focus();

						//校验标题唯一性
						$
								.extend(
										$.validationEngine.defaults.allrules,
										{
											"ajaxTitleCheck" : {
												"url" : "${pageContext.request.contextPath}/ida40/foss/publish/createVersionController/titleCheck.jhtml",
												"extraData" : "name=eric",
												"alertTextOk" : "",
												"alertText" : "* 此标题已被占用,请重新输入",
												"alertTextLoad" : "正在检查"
											}
										});

					});

	//是否需要打包时间
	function changPackTimeValid(value) {
		if (value == "Y") {
			$("#requirePackTimeStr").addClass('validate[required]');
			$("#email").attr("style", "");
		} else {
			$("#requirePackTimeStr").removeClass('validate[required]');
			$("#requirePackTimeStr").validationEngine("hide");
			$("#email").attr("style", "display:none;");
		}
	}

	function changVersionTable(value) {
		if (value == "ALL") {
			$("#all").attr("style", "");
			$("#patch").attr("style", "display:none;");
		} else {
			$("#patch").attr("style", "");
			$("#all").attr("style", "display:none;");
		}
	}
</script>
</head>
<body id="versionBody">
	<div class="container pull-left">
		<form id="versionForm" enctype="multipart/form-data"
			name="versionForm"
			action="${pageContext.request.contextPath}/ida40/foss/publish/createVersionController/create.jhtml"
			class="validation ajaxForm" data-scroll="false"
			data-prompt-position="centerRight">
			<h5></h5>
			<div class="panel panel-default col-lg-10">
				<div class="panel-body">
					<h1></h1>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">标题：</label>
						</div>
						<div class="col-lg-10">
							<input type="text" id="title" class="form-control"
								placeholder="请输入标题">
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">城区：</label>
						</div>
						<div class="col-lg-2">
							<select class="form-control"><option></option>
								<option>1</option>
								<option>2</option></select>
						</div>
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">社区：</label>
						</div>
						<div class="col-lg-2">
							<select class="form-control"><option></option>
								<option>1</option>
								<option>2</option></select>
						</div>
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">道路名称：</label>
						</div>
						<div class="col-lg-2">
							<input type="text" value="" name="versionCode" id="versionCode"
								class="form-control" autocomplete="off" />
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">门牌号：</label>
						</div>
						<div class="col-lg-2">
							<input type="text" value="" name="versionCode" id="versionCode"
								class="form-control" autocomplete="off" />
						</div>
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">施工时间：</label>
						</div>
						<div class="col-lg-3">
							<div class="form-group">
								<div class="input-group date form_datetime" data-date=""
									data-link-format="yyyy-mm-dd">
									<input class="form-control" type="text" value=""> <span
										class="input-group-addon"><span
										class="glyphicon glyphicon-remove"></span></span> <span
										class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">现场联系人：</label>
						</div>
						<div class="col-lg-2">
							<input type="text" value="" name="versionCode" id="versionCode"
								class="form-control" autocomplete="off" />
						</div>
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">现场联系人电话：</label>
						</div>
						<div class="col-lg-2">
							<input type="text" value="" name="versionCode" id="versionCode"
								class="form-control" autocomplete="off" />
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">测试计划说明：</label>
						</div>
						<div class="col-lg-10">
							<textarea id="testDesc" name="testDesc" rows="3"
								class="form-control validate[maxSize[1000]]"></textarea>
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">施工类别：</label>
						</div>
						<div class="col-lg-2">
							<select class="form-control"><option></option>
								<option>1</option>
								<option>2</option></select>
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">施工内容：</label>
						</div>
						<div class="col-lg-10">
							<textarea id="testDesc" name="testDesc" rows="3"
								class="form-control validate[maxSize[1000]]"></textarea>
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">施工附件：</label>
						</div>
						<div class="col-lg-10">
							<input type="file" class="multiFile form-control"
								data-accept="xls|xlsx" data-max="1" id="multipartFile" /> (模板：<a
								href="/ida40/foss/publish/versionModal.xls">施工附件模版.xls</a>)
						</div>
					</div>
					<h4></h4>
					<div class="row">
						<div class="text-center">
							<input type="submit" id="registerButton" class="btn btn-primary"
								value="提交" data-loading-text="处理中..." title="Ctrl+Enter" /> <input
								type="reset" class="btn" value="清空" />
						</div>
					</div>
				</div>
			</div>
			<!--div class="col-lg-1">
				
			</div>
			<div class="panel panel-default col-lg-3">
				<div class="panel-body">
					<h1></h1>
					<div class="row">
						<div class="col-lg-2">
							<label for="title" class="control-label pull-right">标题：</label>
						</div>
						<div class="col-lg-10">
							<input type="text" id="title" class="form-control"
								placeholder="请输入标题">
						</div>
					</div>
				</div>
			</div-->
		</form>
	</div>
	<div class="container pull-center">
		<div class="panel panel-default col-lg-2">
			<div class="panel-body">
				<h1></h1>
				<div class="row">
					<div class="col-lg-2">
						<label for="title" class="control-label pull-right">标题：</label>
					</div>
					<div class="col-lg-10">
						<input type="text" id="title" class="form-control"
							placeholder="请输入标题">
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$('.form_datetime').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			forceParse : 0,
			showMeridian : 1
		});
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_time').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 1,
			minView : 0,
			maxView : 1,
			forceParse : 0
		});
		$(".form_datetime").datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0,
			format : "yyyy MM dd - hh:ii",
			linkField : "mirror_field",
			linkFormat : "yyyy-mm-dd hh:ii"
		});
	</script>
</body>
</html>