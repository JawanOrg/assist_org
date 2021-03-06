<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>后台专用树型菜单，可刷新</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<style type="text/css">
<!--
* {
	margin: 0;
	padding: 0;
	border: 0;
}

body {
	font-size: 12px;
}

#nav {
	width: 190px;
	line-height: 18px;
	list-style-type: none;
	text-align: left;
}

#nav a {
	width: 190px;
	display: block;
	padding-left: 20px;
	/*Width(一定要)，否则下面的Li会变形*/
}

#nav li {
	/*background: #666666;/*#bbde79; 一级目录的背景色*/
	float: left;
	BORDER-RIGHT: #8c8c8c 1px solid;
	BORDER-TOP: #dbfe99 1px solid;
	FONT-WEIGHT: bold;
	FONT-SIZE: 11px;
	PADDING-BOTTOM: 2px;
	BORDER-LEFT: #dbfe99 1px solid;
	CURSOR: hand;
	COLOR: black;
	PADDING-TOP: 4px;
	BORDER-BOTTOM: #8c8c8c 0px solid;
	/*background: #BBDE78 url('') no-repeat left center;
	float：left,本不应该设置，但由于在Firefox不能正常显示
 继承Nav的width,限制宽度，li自动向下延伸*/
}

#nav li a:hover {url ('') no-repeat left center;
	/*一级目录onMouseOver显示的背景色*/
	
}

#nav a:link {
	color: #666;
	text-decoration: none;
}

#nav a:visited {
	color: #666;
	text-decoration: none;
}

#nav a:hover {
	color: #FFF;
	text-decoration: none;
	font-weight: bold;
}
/*=======二级目录=========*/
#nav li ul {
	list-style: none;
	text-align: left;
}

#nav li ul li {
	BORDER-RIGHT: #cccccc 1px solid;
	BORDER-TOP: white 1px solid;
	FONT-SIZE: 11px;
	PADDING-BOTTOM: 2px;
	BORDER-LEFT: white 1px solid;
	CURSOR: hand;
	PADDING-TOP: 2px;
	BORDER-BOTTOM: #cccccc 1px solid;
	BACKGROUND-COLOR: #eeeeee; /*二级目录的背景色*/
}

#nav li ul a {
	padding-left: 20px;
	width: 188px;
	/* padding-left二级目录中文字向右移动，但Width必须重新设置=(总宽度-padding-left)*/
}
/*下面是二级目录的链接样式*/
#nav li ul a:link {
	color: #666;
	text-decoration: none;
}

#nav li ul a:visited {
	color: #666;
	text-decoration: none;
}

#nav li ul li a:hover {
	background: #d5d5d5;
	text-decoration: none;
	font-weight: normal;
}

#nav li:hover ul {
	left: auto;
}

#nav li.sfhover ul {
	left: auto;
}

#content {
	clear: left;
}

#nav ul.collapsed {
	display: none;
}

-->
#PARENT {
	width: 300px;
	padding-left: 20px;
}
</style>
<script type=text/javascript>
<!--
	var LastLeftID = "";
	function menuFix() {
		var obj = document.getElementById("Nav").getElementsByTagName("li");

		for ( var i = 0; i < obj.length; i++) {
			obj[i].onmouseover = function() {
				this.className += (this.className.length > 0 ? " " : "")
						+ "sfhover";
			}
			obj[i].onMouseDown = function() {
				this.className += (this.className.length > 0 ? " " : "")
						+ "sfhover";
			}
			obj[i].onMouseUp = function() {
				this.className += (this.className.length > 0 ? " " : "")
						+ "sfhover";
			}
			obj[i].onmouseout = function() {
				this.className = this.className.replace(new RegExp(
						"( ?|^)sfhover\\b"), "");
			}
		}
	}
	function DoMenu(emid) {
		var obj = document.getElementById(emid);
		obj.className = (obj.className.toLowerCase() == "expanded" ? "collapsed"
				: "expanded");
		if ((LastLeftID != "") && (emid != LastLeftID)) //关闭上一个Menu
		{
			document.getElementById(LastLeftID).className = "collapsed";
		}
		LastLeftID = emid;
	}
	function GetMenuID() {
		var MenuID = "";
		var _paramStr = new String(window.location.href);
		var _sharpPos = _paramStr.indexOf("#");

		if (_sharpPos >= 0 && _sharpPos < _paramStr.length - 1) {
			_paramStr = _paramStr.substring(_sharpPos + 1, _paramStr.length);
		} else {
			_paramStr = "";
		}

		if (_paramStr.length > 0) {
			var _paramArr = _paramStr.split("&");
			if (_paramArr.length > 0) {
				var _paramKeyVal = _paramArr[0].split("=");
				if (_paramKeyVal.length > 0) {
					MenuID = _paramKeyVal[1];
				}
			}
		}

		if (MenuID != "") {
			DoMenu(MenuID)
		}
	}
	GetMenuID(); //*function顺序要注意，否则在Firefox里GetMenuID()不起效果。
	menuFix();
	-->
</script>
</head>
<body>
		<ul id="nav">
			<li><a href="#Menu=ChildMenu1" onclick="DoMenu('ChildMenu1')">我的网站</a>
				<ul id="ChildMenu1" class="collapsed">
					<li><a href="#" target="_blank">Menu</a></li>
					<li><a href="#" target="_blank">Menu</a></li>
				</ul></li>
			<li><a href="#Menu=ChildMenu2" onclick="DoMenu('ChildMenu2')">我的帐务</a>
				<ul id="ChildMenu2" class="collapsed">
					<li><a href="#" target="_blank">支付</a></li>
					<li><a href="#">网上支付</a></li>
					<li><a href="#">登记汇款</a></li>
					<li><a href="#">历史帐务</a></li>
				</ul></li>
			<li><a href="#Menu=ChildMenu3" onclick="DoMenu('ChildMenu3')">个人空间</a>
				<ul id="ChildMenu3" class="collapsed">
					<li><a href="#">登录</a></li>
					<li><a href="#">My相册</a></li>
					<li><a href="#">My日志</a></li>
				</ul></li>
			<li><a href="#Menu=ChildMenu4" onclick="DoMenu('ChildMenu4')">系统设置</a>
				<ul id="ChildMenu4" class="collapsed">
					<li><a href="#">密码重置</a></li>
					<li><a href="#" target="_blank">用户管理</a></li>
					<li><a href="#">数据备份</a></li>
				</ul></li>
		</ul>
</body>
</html>