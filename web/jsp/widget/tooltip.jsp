
<style type="text/css">
<!--
.tooltiptitle {
	COLOR: #0033CC;
	TEXT-DECORATION: none;
	CURSOR: Default;
	font-family: arial;
	font-weight: bold;
	font-size: 8pt
}

.tooltipcontent {
	COLOR: #000000;
	TEXT-DECORATION: none;
	CURSOR: Default;
	font-family: arial;
	font-size: 8pt
}

#ToolTip {
	position: absolute;
	width: 100px;
	top: 0px;
	left: 0px;
	z-index: 4;
	visibility: hidden;
}
-->
</style>
<script language="javascript">
<!--
var tableWidth = 300;
var isTipMove = 1;
var ContentInfo = "";
var topColor = "#DDDDDD";
var subColor = "#FFFF99";
var mouse_X;
var mouse_Y;
var tip_active = 0;
var ie = document.all ? true : false;
if (!ie) {
	document.captureEvents(Event.MOUSEMOVE);
}
document.onmousemove = getMouseXY;
function getMouseXY(e) {
	if (ie) { // grab the x-y pos.s if browser is IE
		mouse_X = event.clientX + document.body.scrollLeft;
		mouse_Y = event.clientY + document.body.scrollTop;
	} else { // grab the x-y pos.s if browser is NS
		mouse_X = e.pageX;
		mouse_Y = e.pageY;
	}
	if (mouse_X < 0) {
		mouse_X = 0;
	}
	if (mouse_Y < 0) {
		mouse_Y = 0;
	}
	if (tip_active) {
		update_tip_pos();
	}
}
function update_tip_pos() {
	if(document.getElementById("ToolTip").style.left!=undefined){
		if (mouse_X > 320) {
			document.getElementById("ToolTip").style.left = mouse_X - tableWidth;
		} else {
			document.getElementById("ToolTip").style.left = mouse_X + 20;
		}
	}
	if(document.getElementById("ToolTip").style.top!=undefined){
		document.getElementById("ToolTip").style.top = mouse_Y;
	}
}
//document.ondblclick = disableTip;
function disableTip(){
	isTipMove = 0;//1 - isTipMove;
}
function EnterContent(TTitle, TContent) {
	ContentInfo = "<table border=\"0\" width=\""+tableWidth+"\" cellspacing=\"0\" cellpadding=\"0\">" + "<tr><td width=\"100%\" bgcolor=\"#C0C0C0\">" + "<table border=\"0\" width=\"100%\" cellspacing=\"1\" cellpadding=\"0\">" + "<tr><td width=\"100%\" bgcolor=" + topColor + ">" + "<table border=\"0\" width=\"90%\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">" + "<tr><td width=\"100%\">" + "<font class=\"tooltiptitle\">&nbsp;" + TTitle + "</font>" + "</td></tr>" + "</table>" + "</td></tr>" + "<tr><td width=\"100%\" bgcolor=" + subColor + ">" + "<table border=\"0\" width=\"90%\" cellpadding=\"0\" cellspacing=\"1\" align=\"center\">" + "<tr><td width=\"100%\">" + "<font class=\"tooltipcontent\">" + TContent + "</font>" + "</td></tr>" + "</table>" + "</td></tr>" + "</table>" + "</td></tr>" + "</table>";
}
function tip_it(TTitle, TContent) {
	update_tip_pos();
	tip_active = 1;
	document.getElementById("ToolTip").style.visibility = "visible";
	EnterContent(TTitle, TContent);
	document.getElementById("ToolTip").innerHTML = ContentInfo;
}
function hiddenTip() {
	tip_active = 0;
	document.getElementById("ToolTip").style.visibility = "hidden";
}
-->
</script>