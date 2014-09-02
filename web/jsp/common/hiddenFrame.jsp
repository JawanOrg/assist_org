<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<html>
	<head>
		<script type="text/javascript" src="/js/prototype.js"></script>
		<script type="text/javascript" src="/js/commonjs.js"></script>
		<script type="text/javascript" src="/js/validator.js" charset="GBK"></script>
		<script type="text/javascript" src="/dwr/engine.js"></script>
		<script type="text/javascript" src="/dwr/util.js"></script>
		<script type="text/javascript" src="/dwr/interface/ifaceMonitorAction.js"></script>

		<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
		<title>”Ô“Ù</title>
	</head>
	<body class="body" >
		<input type="hidden" id="strLastTime" name="strLastTime" value=""/>
		<input type="hidden" id="strNowTime" name="strNowTime" value=""/>

		<script type="text/javascript">
			function openCheckLoop () {
				//setInterval("checkIfaceLogEvent()",60000);
			}
			function checkIfaceLogEvent () {
				//Ω”ø⁄º‡øÿºÏ≤‚∫Ø ˝
				$("strLastTime").value=$("strNowTime").value;
				ifaceMonitorAction.checkIfaceLogEventCheck($("strNowTime").value,checkIfaceLogEvent_callBack);
			}
			function checkIfaceLogEvent_callBack(obj) {
				if(obj!=null&&obj!="undefined") {
					if(obj.logEventCount>0) {
						frames["player"].setSoundPlayer ("start","receive.wav","once");
					} else {
						frames["player"].setSoundPlayer ("stop","","");
					}
					if(obj.strNowTime!=null&&obj.strNowTime!="undefined") {
						$("strNowTime").value=obj.strNowTime;
					}
				}
			}
		</script>
		<iframe name="player" src="/jsp/common/player.jsp" ></iframe>
	</body>
</html>