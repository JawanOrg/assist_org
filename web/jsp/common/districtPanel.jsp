<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<link href="/css/districtPanel.css" rel="stylesheet" type="text/css" />
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/dynamicAction.js'></script>
<script type='text/javascript' src="/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	var jq = jQuery.noConflict();
</script>
<script type='text/javascript' src="/js/districtPanel.js"></script>
<script type="text/javascript"> 
jq(document).ready(function(){
	var QS_city=new Array();
	OpenCategoryLayer(
		"#noticeObjects_cn",
		"#sel_district",
		"#noticeObjects_cn",
		"#noticeObjects",
		QS_city,
	100);
	dynamicAction.queryDistrictList(refreshListPage);
});

function refreshListPage(str) {
	 document.getElementById('list_page').innerHTML = str;
}
</script>

</head>
<body>

<div style="width:260px;margin:20px auto;">

	
	<div style="display:none" id="sel_district">
		<div class="OpenFloatBoxBg"></div>
		<div class="OpenFloatBox">
			<div class="title">
				<h4>请选择相关线路单位</h4>
				<div class="DialogClose" title="关闭"></div>
			</div>
			<div class="tip">可多选</div>
			<div class="content">
				<div class="txt" id="list_page" name="list_page">
					<div class="clear"></div>
				</div>
				<div class="txt">
					<div class="selecteditem"></div>
				</div>
				<div class="txt">
					<div align="center"><input type="button"  class="but80 Set" value="确定" /></div>
				</div>
			</div>
		</div>
	</div>
	
</div>
<div style=" width:600px;margin:0 auto; text-align:center; font-size:12px;"

<p></p>
</div>
</body>
</html>
