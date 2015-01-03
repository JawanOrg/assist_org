<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<%@ include file='/jsp/common/calendar.jsp'%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/dynamicAction.js'></script>
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
<script type='text/javascript' src='/js/json2.js'></script>
<script type="text/javascript" src="/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<link rel="stylesheet" href="/css/cb2.css" type="text/css">
<link rel="stylesheet" href="/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<link href="/css/time.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/css/ymPrompt/vista/ymPrompt.css">
<link rel="stylesheet" href="/css/areaselect.css">
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
			value="${requestScope.billId}"> <input type="hidden"
			id="longitude" name="longitude"> <input type="hidden"
			id="latitude" name="latitude">
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
											src="/images/main_01/ico_fellow.gif" width="18" height="15">
											<span>&nbsp;动态信息录入</span></td>
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
													<tr bgcolor="#f2f2f2">
														<td align="right" class="left_txt2">标题<span
															style="color:Red">*</span></td>
														<td colspan="5"><input name="theTitle" type="text"
															id="theTitle" class="form-control"
															oninput="querySimilarly()" dataType="Require"
															msg="'标题'必填" /></td>
													</tr>
													<tr>
														<td align="right" class="left_txt2">城区<span
															style="color:Red">*</span></td>
														<td><input name="city" type="text" id="city"
															class="form-control" dataType="Require" msg="'城区'必选" /></td>
														<td align="right" class="left_txt2">街道<span
															style="color:Red">*</span></td>
														<td><input type="text" name="street" id="street"
															class="form-control" dataType="Require" msg="'街道'必填" /></td>
														<td align="right" class="left_txt2">社区<span
															style="color:Red">*</span></td>
														<td><input name="community" type="text"
															id="community" class="form-control" dataType="Require"
															msg="'社区'必选" /></td>
													</tr>
													<tr bgcolor="#f2f2f2">
														<td align="right" class="left_txt2">道路<span
															style="color:Red">*</span></td>
														<td><input type="text" name="road" id="road"
															class="form-control" oninput="querySimilarly()"
															dataType="Require" msg="'道路'必填" /></td>
														<td align="right" class="left_txt2">门牌号</td>
														<td><input type="text" name="numberPlate" size="25"
															class="form-control" /></td>
														<td align="right" class="left_txt2">计划开始时间<span
															style="color:Red">*</span></td>
														<td><input id="repairTime" name="repairTime"
															type="text" class="form-control" dataType="Require"
															msg="'计划开始时间'必填"
															onclick="showcalendar(event, this, true);"
															onfocus="showcalendar(event, this, true);if(this.value=='0000-00-00') this.value=''" />
														</td>
													</tr>
													<tr>
														<td align="right" class="left_txt2">详细地址</td>
														<td colspan="3"><input type="text" id="positionAddress"
															name="positionAddress" class="form-control"/><img
															src="/images/normal/position.png" style="cursor:pointer"
															onclick="showMap()" title="在弹出地图中右键可以获取施工点位置" /></td>
														<td align="right" class="left_txt2">计划结束时间<span
															style="color:Red">*</span></td>
														<td><input id="repairEndTime" name="repairEndTime"
															type="text" class="form-control" dataType="Require"
															msg="'计划结束时间'必填"
															onclick="showcalendar(event, this, true);"
															onfocus="showcalendar(event, this, true);if(this.value=='0000-00-00') this.value=''" />
														</td>
													</tr>
													<tr bgcolor="#f2f2f2">
														<td align="right" class="left_txt2">现场联系人<span
															style="color:Red">*</span></td>
														<td><input type="text" name="scenePersonName"
															size="25" class="form-control" dataType="Require"
															msg="'现场联系人'必填" /></td>
														<td align="right" class="left_txt2">联系人电话<span
															style="color:Red">*</span></td>
														<td><input type="text" name="scenePersonPhone"
															size="25" class="form-control" dataType="Require"
															msg="'现场联系人电话'必填" /></td>
														<td align="right" class="left_txt2"></td>
														<td></td>
													</tr>
													<tr>
														<td align="right" class="left_txt2">测试计划说明：</td>
														<td colspan="5"><textarea rows="4" cols="83"
																class="form-control" name="testPlanRemark"></textarea></td>
													</tr>
													<tr bgcolor="#f2f2f2">
														<td align="right" class="left_txt2">施工类别：</td>
														<td><assist:sysDicDis iddValue="release_repair_type"
																value="repairType" stylename="form-control" dicItemIn=""
																hasNull="false" onClick="showIsNeedGovernMent()"></assist:sysDicDis></td>
														<td class="left_txt2">&nbsp;</td>
														<td class="left_txt2"><div id="isNeedGovernmentDiv1">
																<label> <input type="radio"
																	name="isNeedGovernment" id="optionsRadios1" value="Y">需要行政审批
																</label>
															</div></td>
														<td class="left_txt2" colspan="2"><div
																id="isNeedGovernmentDiv2">
																<label> <input type="radio"
																	name="isNeedGovernment" id="optionsRadios2" value="N"
																	checked>不需要行政审批
																</label>
															</div></td>
													</tr>
													<tr>
														<td align="right" class="left_txt2">施工内容：</td>
														<td colspan="5"><textarea rows="3" cols="83"
																class="form-control" name="repairContent"></textarea></td>
													</tr>
													<tr>
														<td colspan="6" align="center"><input name="btnMap"
															type="button" class="btn btn-default" id="btnMap"
															value="地图定位" onclick="showMap()"> <input
															name="btnFile" type="button" class="btn btn-default"
															id="btnFile" value="附  件" onclick="uploadFile()">
															<input name="btnSubmit" type="button"
															class="btn btn-default" id="btnSubmit" value="提  交"
															onclick="submitContent(this)"> <input name="cs"
															type="button" class="btn btn-default" id="cs" value="取 消"
															onClick="refreshWindow('ok')"></td>
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
		$('list_page').innerHTML = "<TABLE align=center border=0><TBODY><TR><TD style=\"FILTER: mask(color=#000000)\" align=middle><FONT style=\"FONT-SIZE: 24pt\" face=隶书 color=#336699><B title='此处会根据您录入的信息智能分析近似或相关的施工清单，点击可查看相应施工详情'>附近施工清单</B></FONT></TD></TR></TBODY></TABLE> ";
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
				window.location.href="/business/dynamicAction.do?method=init";
			}
		}
		function submitContent() {
			if (!validateForm(inputForm, 3)) {
				return false;
			}
			var formObj = $('inputForm').serialize(true);
			var editor_data = CKEDITOR.instances.repairContent.getData();
			formObj.repairContent=editor_data;
			dynamicAction.accept(formObj, callback);
		}
		function querySimilarly() {
			if ($('theTitle').value == '' && $('road').value == ''){
				return;
			}else if($('road').value == '' && $('theTitle').value != undefined && $('theTitle').value.length < 2){
				return
			}
			var formObj = $('inputForm').serialize(true);
			dynamicAction.querySimilarly(formObj, refreshListPage);
		}
		function refreshListPage(str) {
			$('list_page').innerHTML = str;
		}

		initTabs('tabView1', Array('动态信息录入'), 0, '100%', '95%');
		function getDetail(billId, theTitle) {
			createNewTab(
					'tabView1',
					'[' + theTitle + ']&nbsp;',
					'',
					'/business/dynamicAction.do?method=detail&billId=' + billId,
					true);
		}
		function showIsNeedGovernMent() {
			if ($('repairType').value == 'emergency') {
				$('isNeedGovernmentDiv1').style.visibility = "hidden";
				$('isNeedGovernmentDiv2').style.visibility = "hidden";
			} else if ($('repairType').value == 'plan') {
				$('isNeedGovernmentDiv1').style.visibility = "visible";
				$('isNeedGovernmentDiv2').style.visibility = "visible";
			}
		}
		function uploadFile(){
			ymPrompt.win({message:'/jsp/common/uploadFile.jsp?shareTypeWrite=private&billId='+$('billId').value+'&businessType=trends',width:500,height:350,title:'',minBtn:false,maxBtn:false,useSlide:true,showShadow:true,handler:changeBtnName,iframe:{id:'myId'}});
		}
		function changeBtnName(returnStr) {
			if (returnStr == "ok" || returnStr == "close") {
				$('btnFile').value = '附  件 *';
			}
		}
		function showMap(){
			ymPrompt.win({message:'/jsp/map/getPosition.jsp?city='+$('city').value+'&street='+$('street').value+'&road='+$('road').value+'&positionAddress='+$('positionAddress').value+'&longitude='+$('longitude').value+'&latitude='+$('latitude').value,width:500,height:350,title:'',minBtn:true,maxBtn:true,useSlide:true,showShadow:true,handler:getPositionInfo,iframe:{id:'myId'}});
			ymPrompt.max();
		}
		function getPositionInfo(returnStr) {
			if(returnStr!='close'){
				var data = JSON.parse(returnStr);
				$('positionAddress').value=data.address.replace(new RegExp(/(;)/g),"");
				$('longitude').value=data.lng;
				$('latitude').value=data.lat;
			}
		}
		
		window.onload = function()
	   {
	      CKEDITOR.replace( 'repairContent',
  		     {
  		      skin : 'moono',
  		      language : 'zh-cn',
  		      toolbar :
  		        [
					['Preview'],
  		            ['Styles', 'Format'],
  		          	['Cut','Copy','Paste','PasteText','PasteFromWord','-','Scayt'],
  		            ['Image','Flash','Table','HorizontalRule','Smiley','SpecialChar'],
  		            ['Bold', 'Italic', '-', 'NumberedList', 'BulletedList', '-', 'Link']
  		        ]
  	          //uiColor : '#9AB8F3'
  		     });
		}


	</script>

	<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/js/areadata.js"></script>
	<script type="text/javascript" src="/js/areaselect.js"></script>
	<script type="text/javascript">
	var jq = jQuery.noConflict();
	new locationCard({
	    ids: ['city', 'street', 'community']
	}).init();
</script>
</body>
</html>
