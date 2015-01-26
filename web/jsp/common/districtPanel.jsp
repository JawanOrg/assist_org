<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<link href="/css/districtPanel.css" rel="stylesheet" type="text/css" />
<script type='text/javascript' src="/js/jquery-1.10.2.min.js"></script>
<script type='text/javascript' src="/js/districtPanel.js"></script>
<script type="text/javascript"> 
$(document).ready(function(){
	var QS_city=new Array() 
	OpenCategoryLayer(
		"#noticeObjects",
		"#sel_district",
		"#noticeObjects",
		"#citycategory",
		QS_city,
	100);
});
</script>

</head>
<body>

<div style="width:260px;margin:20px auto;">

	<input name="citycategory" id="citycategory" type="hidden" value="" />
	
	<div style="display:none" id="sel_district">
		<div class="OpenFloatBoxBg"></div>
		<div class="OpenFloatBox">
			<div class="title">
				<h4>请选择工作地区</h4>
				<div class="DialogClose" title="关闭"></div>
			</div>
			<div class="tip">可多选，最多选择8项</div>
			<div class="content">
				<div class="txt">
					<div class="item" id="593">
						<label title="新塘" class="titem"><input  type="checkbox" value="593"  title="新塘" class="b" />新塘</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="598">
						<label title="增城" class="titem"><input  type="checkbox" value="598"  title="增城" class="b" />增城</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="564">
						<label title="番禺" class="titem"><input  type="checkbox" value="564"  title="番禺" class="b" />番禺</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="589">
						<label title="南沙" class="titem"><input  type="checkbox" value="589"  title="南沙" class="b" />南沙</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="617">
						<label title="萝岗" class="titem"><input  type="checkbox" value="617"  title="萝岗" class="b" />萝岗</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="618">
						<label title="黄埔" class="titem"><input  type="checkbox" value="618"  title="黄埔" class="b" />黄埔</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="599">
						<label title="花都" class="titem"><input  type="checkbox" value="599"  title="花都" class="b" />花都</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="590">
						<label title="从化" class="titem"><input  type="checkbox" value="590"  title="从化" class="b" />从化</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="572">
						<label title="白云" class="titem"><input  type="checkbox" value="572"  title="白云" class="b" />白云</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="575">
						<label title="广州市区" class="titem"><input  type="checkbox" value="575"  title="广州市区" class="b" />广州市区</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="588">
						<label title="佛山" class="titem"><input  type="checkbox" value="588"  title="佛山" class="b" />佛山</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="587">
						<label title="东莞" class="titem"><input  type="checkbox" value="587"  title="东莞" class="b" />东莞</label>
						<div class="sitem"></div>
					</div>
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
