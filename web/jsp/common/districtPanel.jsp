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
				<h4>��ѡ��������</h4>
				<div class="DialogClose" title="�ر�"></div>
			</div>
			<div class="tip">�ɶ�ѡ�����ѡ��8��</div>
			<div class="content">
				<div class="txt">
					<div class="item" id="593">
						<label title="����" class="titem"><input  type="checkbox" value="593"  title="����" class="b" />����</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="598">
						<label title="����" class="titem"><input  type="checkbox" value="598"  title="����" class="b" />����</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="564">
						<label title="��خ" class="titem"><input  type="checkbox" value="564"  title="��خ" class="b" />��خ</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="589">
						<label title="��ɳ" class="titem"><input  type="checkbox" value="589"  title="��ɳ" class="b" />��ɳ</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="617">
						<label title="�ܸ�" class="titem"><input  type="checkbox" value="617"  title="�ܸ�" class="b" />�ܸ�</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="618">
						<label title="����" class="titem"><input  type="checkbox" value="618"  title="����" class="b" />����</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="599">
						<label title="����" class="titem"><input  type="checkbox" value="599"  title="����" class="b" />����</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="590">
						<label title="�ӻ�" class="titem"><input  type="checkbox" value="590"  title="�ӻ�" class="b" />�ӻ�</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="572">
						<label title="����" class="titem"><input  type="checkbox" value="572"  title="����" class="b" />����</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="575">
						<label title="��������" class="titem"><input  type="checkbox" value="575"  title="��������" class="b" />��������</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="588">
						<label title="��ɽ" class="titem"><input  type="checkbox" value="588"  title="��ɽ" class="b" />��ɽ</label>
						<div class="sitem"></div>
					</div>
					<div class="item" id="587">
						<label title="��ݸ" class="titem"><input  type="checkbox" value="587"  title="��ݸ" class="b" />��ݸ</label>
						<div class="sitem"></div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="txt">
					<div class="selecteditem"></div>
				</div>
				<div class="txt">
					<div align="center"><input type="button"  class="but80 Set" value="ȷ��" /></div>
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
