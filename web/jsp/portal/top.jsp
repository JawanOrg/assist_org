<%@ page contentType="text/html; charset=utf-8"%>
<script type="text/javascript">
<!--
	var str0 = false;
	function showCloseDiv() {
		if (!str0) {
			var example2d = document.getElementById("example2d");
			document.getElementById("img0").style.display = "";
			document.getElementById("img0").style.left = (example2d.offsetLeft + 475)
					+ "px";
			document.getElementById("img0").style.top = (example2d.offsetTop + 28)
					+ "px";
			str0 = true;
		} else {
			document.getElementById("img0").style.display = "none";
			str0 = false;
		}
	}
//-->
</script>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td height="80" class="gx-top-bg">
			<table width="1000" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="320"><img src="/images/homepage/logo.png"
						width="320" height="75"></td>
					<td><div class="gx-top-link">
							<a href="/homepage/homePageAction.do?method=queryAllPortalData"
								target="_self">首页</a> | <a href="/jforum" target="_self">论坛</a>
							| <a href="/jsp/common/home.jsp" target="_self">数据维护</a> | <a
								href="/sys/loginAction.do?method=logout" target="_self">注销</a> |
							<img id="example2d" name="example2d" src="/images/normal/2d.png"
								width="14" height="14"> <a href="#"
								onclick="javascript:showCloseDiv();"> <font face="楷体"
								size="2" color="#ffffff">扫描二维码下载移动Android版 </font></a>
							<div id="img0" style="position: fixed;float:left;display: none;">
								<div></div>
								<ul>
									<li style="margin-left: -5px;"><img
										src="/images/homepage/androidApp2d.png" /></li>
									<li><font face="楷体" size="2" color="#FF0000">扫描二维码下载移动Android版 </font></li>
								</ul>
							</div>

						</div></td>
				</tr>
			</table>
		</td>
	</tr>
</table>