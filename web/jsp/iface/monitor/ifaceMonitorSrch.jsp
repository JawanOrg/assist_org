<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file="/jsp/taglib.jsp"%>
<%@ include file='/jsp/common/allTag.jsp'%>
<%@ include file='/jsp/widget/calendar.jsp'%>
<html>
	<head>
		<script type='text/javascript' src='/js/prototype.js'></script>
		<script type='text/javascript' src='/js/commonjs.js'></script>
		<script type='text/javascript' src='/js/validator.js'></script>
		<script type='text/javascript' src='/dwr/engine.js'></script>
		<script type='text/javascript' src='/dwr/util.js'></script>
		<script type='text/javascript' src='/dwr/interface/ifaceMonitorAction.js'></script>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
		<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
		<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
		<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
		<title>接口监控</title>
	</head>
	<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0">
		<script type='text/javascript'>
			DWREngine.setErrorHandler(handler);
			function handler(errors) {
		        alert(errors);
		        enableForm("commonQueryForm");
		        return false;
		    }
		    //判断是否将查询块收起
			function ev_hiddenQueryTable(){
				if ($('queryCondicationArea').style.display == "none") {
					$('queryCondicationArea').show();
				} else {
					$('queryCondicationArea').hide();
				}
			 }
			 function selectRange () {
			 	if($("minuteRange").value!="") {
			 		$("createdBegin").value="";
			 	}
			 }
		</script>
		<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF" height="100%">
			<tr>
				<td valign="top">
					<html:form action="/iface/ifaceMonitorAction" styleId="commonQueryForm">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
						<tr>
							<td>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size: 13px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120">
											<img
												src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
												width="18" height="15">
											查询条件
											<img
												src="<%=request.getContextPath()%>/images/main/button_bug2.gif"
												width="19" height="17">
										</td>
										<td class="tabpaneright2">
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF">
								<table class=table id=powergrid style="FONT-SIZE: 13px"
									cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
									bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
									<tr style="display: ">
										<td align="right" bgcolor="#F4F4F4">
											调用时间：
										</td>
										<td>
											按开始时间
											<input name="createdBegin" class="inputtext01" size="16"
												readonly maxlength="10" dataType="Date" msg="开始日期输入错误"
												onclick="document.getElementById('minuteRange').selectedIndex=0;return showCalendar('createdBegin','%Y-%m-%d %H:%M', '24', false);"
												value="${requestScope.createdBegin}" />
											<br>
											按范围&nbsp;&nbsp;&nbsp;&nbsp;
											<html:select property="minuteRange" styleId="minuteRange"
												onchange="return selectRange();">
												<html:option value="">&nbsp;</html:option>
												<html:option value="n5">五分钟</html:option>
												<html:option value="n10">十分钟</html:option>
												<html:option value="n20">二十分钟</html:option>
												<html:option value="n30">三十分钟</html:option>
												<html:option value="h1">一小时</html:option>
												<html:option value="h2">二小时</html:option>
												<html:option value="h4">四小时</html:option>
												<html:option value="h6">六小时</html:option>
												<html:option value="h8">八小时</html:option>
												<html:option value="h12">十二小时</html:option>
												<html:option value="d1">一天</html:option>
												<html:option value="d2">二天</html:option>
												<html:option value="d4">四天</html:option>
												<html:option value="w1">一周</html:option>
											</html:select>
										</td>
										<td align="right" bgcolor="#F4F4F4" width="130">
											是否成功：
										</td>
										<td>
											<html:select property="successful" styleId="successful">
												<html:option value="">&nbsp;</html:option>
												<html:option value="Y">成功</html:option>
												<html:option value="N">失败</html:option>
												<html:option value="NULL">未知</html:option>
											</html:select>
										</td>
									</tr>
									<tr>
										<td colspan=4 align="right">
											<input type="button" class="button" value="查询(Q)"
												accesskey="Q" onclick="initqueryResultList();"
												align="right" />
											&nbsp;&nbsp;
											<input type="button" class="button" name="saveItemValue"
												value="保存条件" onclick="saveQueryItemValue ()">
											&nbsp;&nbsp;
											<input type="button" class="button" value="重置(R)"
												accesskey="R" onclick="reset();" align="right" />
											&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="hidden" name="pageNumber" value="1" />
											<input type="hidden" name="maxResults" value="15" />
											<input type="hidden" id="orderByClause" name="orderByClause"
												value="" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</html:form>
					<div align="center" width="100%">
						<strong> 
							<marquee direction="left" behavior="scroll" scrollamount="10" scrolldelay="200">
								<span id="marqueemsg"></span>
							</marquee> 
							<!--div id="marqueeBox" style="overflow:hidden;width:100px;height:20px;align=center"></div-->
						</strong>
					</div>
					<br>
					<div id="tabView1">
						<DIV id="tabView1tab_tabPane">
							<DIV id=tabTabtabView1_0>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size: 13px">
									<tr>
										<td class="tabpaneleft2"></td>
										<td class="tabpanebg2" width="120">
											<img
												src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
												width="18" height="15">
											<span>监控信息列表</span>
										</td>
										<td class="tabpaneright2">
										</td>
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
										<div id="queryResultList" style="PADDING-RIGHT: 0px;"></div>
									</td>
								</tr>
							</table>
						</div>
					</div>
				</td>
			</tr>
		</table>

		<script type='text/javascript'>
			initTabs('tabView1',Array('监控信息列表'),0,'100%','100%');
		
			if(Prototype.Browser.Opera){
				initqueryResultList(); 
			}else{
				Event.observe(window, 'load', initqueryResultList); 
			}
			
			function initqueryResultList(){
				DWRUtil.useLoadingMessage('数据读取中...');
				trimForm();
				var formObj = $('commonQueryForm').serialize(true);
				ifaceMonitorAction.getIfaceMonitorList(formObj,showTablequeryResultList);
				disableForm();
			}
			
			function showTablequeryResultList(str){
				enableForm();
				$('queryResultList').innerHTML = str;
				
				$("marqueeMsg").innerHTML="失败总数"+ +$("sumFault").value;
			}
			
			//query item default input value begin
			function saveQueryItemValue()
			{
				var url="/iface/ifaceMonitorAction.do";
				var myAjax = new Ajax.Request( url, {method: 'post', parameters : Object.extend($('commonQueryForm').serialize(true), {"method": "saveQueryItemValue"}), onComplete: saveQueryItemValueCallback});
				disableForm();
			}
			function saveQueryItemValueCallback () {
				alert("保存条件成功");
				enableForm();
			}
			
			setInterval("initqueryResultList()",600000);  //一分钟刷新一次
			
			/*
			//跑马灯 begin
			var strAlarmMsg="";
			strAlarmMsg="失败总数"+ +$("sumFault").value;
			setInterval("startMarquee()",3500);
			var pIntervalId;
			function startMarquee() {
				var nextLine=document.createElement('font');
				var br=document.createElement('br');
				nextLine.innerHTML=strAlarmMsg;
				nextLine.size=4;
				document.getElementById("marqueeBox").appendChild(nextLine);
				document.getElementById("marqueeBox").appendChild(br);
				if(pIntervalId!=null)  {
					clearInterval(pIntervalId);
				}
				pIntervalId=setInterval("scrollMarquee()",20);
			}
			var marqueeHeight=document.getElementById("marqueeBox").height;
			function scrollMarquee() {
				document.getElementById("marqueeBox").scrollTop++;
				if(document.getElementById("marqueeBox").scrollTop%marqueeHeight==(marqueeHeight-1)){
					clearInterval(pIntervalId);
				}
			}
			//跑马灯 end */
			
			function showLogEventDetail (applicationId,methodName,createdBegin,createdEnd)  {
				var url='/iface/ifaceMonitorAction.do?method=toIfaceMonitorLogEventList&'+ 
					'applicationId='+applicationId+'&methodName='+methodName
					+'&createdBegin='+createdBegin+'&createdEnd='+createdEnd
					+'&successful='+$("successful").value;
				createNewTab('tabView1','接口事件列表&nbsp;','',url,true);
			}
			function openIfaceLogRepositoryDetail (relateId)  {
				var url='/iface/ifaceMonitorAction.do?method=toIfaceLogRepositoryList&relateId='+relateId;
				createNewTab('tabView1','日志数据列表&nbsp;','',url,true);
			}
			function openIfaceLogRepositoryXmlDocument (repositoryId) {
				var url="/iface/ifaceLoggerTraceAction.do?method=getIfaceLogRepositoryDataSrchDetail&repositoryId=" + repositoryId + "&dc=" + new Date();
				window.showModalDialog(url, null, "dialogWidth:800px;dialogHeight:650px;center:yes;status:no;");
			}
			function openIfaceLogEventArgu (eventId) {
				var url="/iface/ifaceLoggerEventAction.do?method=eventArgu&eventId=" + eventId + "&dc=" + new Date();
				window.showModalDialog(url, null, "dialogWidth:800px;dialogHeight:640px;center:yes;status:no;");
			}
			function openIfaceLogEventDesc (eventId) {
				var url="/iface/ifaceLoggerEventAction.do?method=eventDesc&eventId=" + eventId + "&dc=" + new Date();
				window.showModalDialog(url, null, "dialogWidth:800px;dialogHeight:480px;center:yes;status:no;");
			}
		</script>
	</body>
</html>