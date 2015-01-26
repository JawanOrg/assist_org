<%@ page contentType="text/html; charset=utf-8"%>
<script type="text/javascript">
<!--
	var str0 = false;
	function showCloseDiv() {
		if (!str0) {
			var example2d = document.getElementById("example2d");
			document.getElementById("img0").style.display = "";
			document.getElementById("img0").style.left = (example2d.offsetParent.offsetLeft + 500)
					+ "px";
			document.getElementById("img0").style.top = (example2d.offsetParent.offsetTop + 48)
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
					<td width="320"><img src="/images/homepage/logo.png"></td>
					<td>
						<div class="topNav">
							<dl class="tnRight">
								<dd class="welcome">
									<strong>${sessionScope.currentUser.userName}</strong>，欢迎您
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<a
											href="/homepage/homePageAction.do?method=queryAllPortalData"
											target="_self">首页</a>
									</h3>
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<a target="_blank" href="#">浙江省<i></i></a>
									</h3>
									<div>
										<a target="_blank" href="#">杭州市</a> 
										<a target="_blank" href="#">宁波市</a>
										<a target="_blank" href="#">温州市</a>
										<a target="_blank" href="#">绍兴市</a>
										<a target="_blank" href="#">湖州市</a>
										<a target="_blank" href="#">嘉兴市</a>
										<a target="_blank" href="#">金华市</a>
										<a target="_blank" href="#">衢州市</a>
										<a target="_blank" href="#">舟山市</a>
										<a target="_blank" href="#">台州市</a>
										<a target="_blank" href="#">丽水市</a>
									</div>
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<a href="/jforum" target="_self">论坛</a>
									</h3>
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<a href="/jsp/common/home.jsp" target="_self">数据维护</a>
									</h3>
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<a href="/sys/loginAction.do?method=logout" target="_self">注销</a>
									</h3>
								</dd>
								<dd>
									<span>|</span>
								</dd>
								<dd>
									<h3>
										<img id="example2d" name="example2d"
											src="/images/normal/2d.png" width="14" height="14"> <a
											href="#" onclick="javascript:showCloseDiv();">扫描二维码下载移动Android版</a>
									</h3>
								</dd>
							</dl>
						</div>
						<div id="img0" style="position: fixed;float:left;display: none;">
							<div></div>
							<ul>
								<li style="margin-left: -5px;"><img
									src="/images/homepage/androidApp2d.png" /></li>
								<li><font face="楷体" size="2" color="#FF0000">扫描二维码下载移动Android版
								</font></li>
							</ul>
						</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<script type="text/javascript">
	jQuery(".topNav").slide({
		type : "menu", //效果类型
		titCell : "dd", // 鼠标触发对象
		targetCell : "div", // 效果对象，必须被titCell包含
		delayTime : 0, // 效果时间
		defaultPlay : false, //默认不执行
		returnDefault : true
	// 返回默认
	});
</script>