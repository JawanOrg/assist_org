<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>集团电子运维系统互联接口平台</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css" />
<script type="text/javascript" src="/js/prototype.js"></script>
</head>
<script type="text/javascript">
    //增加错误处理方式
	function addTrigger() {
		if (!$("returnCode").present()) {
			alert("请输入返回编码！");
			return;
		}
		new Ajax.Request("/supt/triggerAction.do?" + $("formAdd").serialize(), {
			method: "post",
			onCreate: function() {
				$("formAdd").disable();
			},
			onSuccess: function(transport) {
				alert("成功");
				self.close();
			}
		});
	}

	//删除
	function delTrigger() {
		var selected = $("formMgr").getInputs("radio", "triggerId").find(function (element, index) {
			return element.checked;
		});
		if (selected) {
			new Ajax.Request("/supt/triggerAction.do?" + $("formMgr").serialize(), {
				method: "post",
				onSuccess: function(transport) {
					alert("成功");
					self.close();
				}
			});
		} else {
			alert("请选择记录！");
		}
	}
	function closeHandler() {
		window.close();
	}
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF" height="100%">
	<tr>
		<td valign="top">
			<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<tr>
					<td>
						<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
							<tr>
								<td class="tabpaneleft2"></td>
								<td class="tabpanebg2" width="120">
									<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
									新增
									<img src="<%=request.getContextPath()%>/images/main/button_bug2.gif" width="19" height="17">
								</td>
								<td class="tabpaneright2"> </td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<html:form action="/supt/triggerAction" styleId="formAdd" style="padding: 0; margin: 0;">
							<table class="table" style="FONT-SIZE: 13px" cellspacing=0 cellpadding=1 width=100% border="1">
								<tr style="display:display">
									<td align="right"  bgcolor="#F4F4F4" >
										返回代码：
									</td>
									<td>
										<html:text property="returnCode" />
									</td>
									<td align="right"  bgcolor="#F4F4F4" >
										 处理方式 ：
									</td>
									<td>
										<blocimp:sysDicDis iddValue="TRIGGER_NAME" value="triggerName" hasNull="false"></blocimp:sysDicDis>
									</td>
									<td>
										<input type="button" class="button" value="增加" onclick="addTrigger()" />
									</td>
								</tr>
							</table>
							<html:hidden property="portId" />
							<html:hidden property="method" value="addTrigger" />
						</html:form>
					</td>
				</tr>
			</table>
			<br />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<tr>
					<td>
						<table border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
							<tr>
								<td  class="tabpaneleft2"></td>
								<td class="tabpanebg2"   width="120">
								<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
								信息列表
								</td>
								<td class="tabpaneright2">
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<table class="table" style="FONT-SIZE: 13px" cellspacing="0" cellpadding="1" width="100%" border="1">
							<tr>
								<td>
									<form action="/supt/triggerAction.do" id="formMgr">
										<table width="100%" border="1" class="table" cellpadding="2" cellspacing="0">
											<tr class="titletr">
												<td>
													选择
												</td>
												<td>
													返回代码
												</td>
												<td>
													处理方式
												</td>
											</tr>
											<c:forEach items="${requestScope.triggerList}" var="obj" varStatus="n">
												<tr align="center">
													<td align="center">
														<input type="radio" name="triggerId" value="${obj.triggerId}"/>
													</td>
													<td align="center">
													  ${obj.returnCode}									
													</td>
													<td align="center">									   
													  <blocimp:sysDicDisName itemCodeIn="${obj.triggerName}" dictionaryCodeIn="TRIGGER_NAME" />	
													</td>																		
												</tr>
											</c:forEach>
										</table>
										<input type="hidden" name="method" value="delTrigger" />
										<input id="delFace" type="button" class="button" value="删除" onclick="delTrigger()" />
									</form>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>