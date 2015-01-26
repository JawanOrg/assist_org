<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/mapOperateAction.js'></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=1.5&ak=esZROYshLrE7kGpuRnNiG4nR"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.js"></script>
<script type='text/javascript' src='/js/json2.js'></script>
<script type="text/javascript" src="/js/ymPrompt.js"></script>
<link rel="stylesheet"
	href="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.css" />
<link rel="stylesheet"
	href="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css" />
<link rel="stylesheet" href="/css/ymPrompt/vista/ymPrompt.css">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap-theme.min.css">
<title></title>
<style type="text/css">
body,html,#allmap {
	width: 100%;
	height: 100%;
	overflow: hidden;
	margin: 0;
}

.titleName {
	white-space: nowrap;
	text-align: center;
	filter: alpha(opacity = 50); /*IE滤镜，透明度50%*/
	-moz-opacity: 0.5; /*Firefox私有，透明度50%*/
	opacity: 0.5; /*其他，透明度50%*/
	color: #B22222;
	font-weight:bold;
	font-style:italic;
}
</style>
<script type="text/javascript">
	var customLayer = null;
	var map = null;
	var allMarkerStr = null;
	var currentZoom = null;
	var overlayRectangle = null;
	var myIcon = new BMap.Icon("/images/homepage/position_red.png",
			new BMap.Size(16, 16));
	function ZoomControl() {
		this.defaultAnchor = BMAP_ANCHOR_TOP_LEFT;
		this.defaultOffset = new BMap.Size(600, 10);
	}
	var webcamFun = function(marker) {
		alert('摄像头接口暂未提供');
	}
	window.onload = function() {
		map = new BMap.Map("allmap");
		var myGeo = new BMap.Geocoder();
		myGeo.getPoint("杭州天目山路138号", function(point) {
			if (point) {
				map.centerAndZoom(point, 12);
				map.addOverlay(new BMap.Marker(point));
			} else {
				map.centerAndZoom("杭州", 12);
			}
		}, "杭州市");

		var myZoomCtrl = new ZoomControl();
		map.addControl(myZoomCtrl);
		map.addEventListener("zoomend", function() {
			currentZoom = this.getZoom();
			showAllMarker(allMarkerStr);
		});

		ZoomControl.prototype = new BMap.Control();
		ZoomControl.prototype.initialize = function(map) {
			var button = document.createElement("button");
			button.style.cursor = "pointer";
			button.className = "btn btn-info";
			button.innerHTML = "施工动态录入 <span class='glyphicon glyphicon-arrow-right' style='cursor:pointer'></span>";
			button.onclick = function(e) {
				jumpToCreate();
			}
			map.getContainer().appendChild(button);
			return button;
		}
		var myZoomCtrl = new ZoomControl();
		map.addControl(myZoomCtrl);

		var drawingManager = new BMapLib.DrawingManager(map, {
			isOpen : false,
			enableDrawingTool : true,
			drawingToolOptions : {
				anchor : BMAP_ANCHOR_TOP_RIGHT,
				offset : new BMap.Size(5, 5),
				scale : 0.8,
				drawingModes : [ BMAP_DRAWING_RECTANGLE ],
				enableCalculate : true
			}
		});
		drawingManager.setDrawingMode(BMAP_DRAWING_RECTANGLE);
		drawingManager.addEventListener('rectanglecomplete', function(overlay) {
			if (overlayRectangle) {
				map.removeOverlay(overlayRectangle);
			}
			var cp = overlay.getBounds();
			var sw = cp.getSouthWest();
			var ne = cp.getNorthEast();
			var bounds = sw.lng + "," + sw.lat + ";" + ne.lng + "," + ne.lat;
			query("地址", bounds);
			//drawingManager.close();
			overlayRectangle = overlay;
		});

		var contextMenu = new BMap.ContextMenu();
		var txtMenuItem = [ {
			text : '放大',
			callback : function() {
				map.zoomIn();
			}
		}, {
			text : '缩小',
			callback : function() {
				map.zoomOut();
			}
		}, {
			text : '放置最大',
			callback : function() {
				map.setZoom(18);
			}
		}, {
			text : '默认大小',
			callback : function() {
				map.setZoom(12);
			}
		}, {
			text : '显示所有施工点',
			callback : function() {
				addCustomLayer(map);
			}
		}, {
			text : '隐藏所有施工点',
			callback : function() {
				if (customLayer) {
					map.removeTileLayer(customLayer);
				}
			}
		} ];
		for (var i = 0; i < txtMenuItem.length; i++) {
			contextMenu.addItem(new BMap.MenuItem(txtMenuItem[i].text,
					txtMenuItem[i].callback, 100));
			if (i == 1 || i == 3) {
				contextMenu.addSeparator();
			}
		}
		map.addContextMenu(contextMenu);
		map.addControl(new BMap.NavigationControl());
		addCustomLayer(map);

		mapOperateAction.queryByPointTypeAndGrade('dynamic', 10, 'doing',
				showAllMarker);
	}

	function addMarker(point, imageType) {
		if (currentZoom <= 12) {
			var marker = new BMap.Marker(point);
			map.addOverlay(marker);
		} else {
			var marker = new BMap.Marker(point, {
				icon : myIcon
			});			
			var label = new BMap.Label("<div class='titleName'>" + '电信'
					+ "</div>", {
				offset : new BMap.Size(-10, -16),position:point
			});
			label.setTitle("提醒");
			marker.setLabel(label);
			map.addOverlay(marker);
			var markerMenu = new BMap.ContextMenu();
			markerMenu.addItem(new BMap.MenuItem('查看', webcamFun.bind(marker)));
			marker.addContextMenu(markerMenu);
			if (imageType == "animation") {
				marker.setAnimation(BMAP_ANIMATION_BOUNCE);
			}
		}
	}
	function showAllMarker(str) {
		if (str != undefined && str != null) {
			allMarkerStr = str;
		}
		map.clearOverlays();
		var myobj = eval(allMarkerStr);
		for (var i = 0; i < myobj.length; i++) {
			var point = new BMap.Point(myobj[i].longitude, myobj[i].latitude);
			addMarker(point, myobj[i].imageType);

			map.addHotspot(new BMap.Hotspot(point, {
				text : myobj[i].address
			}));
		}
	}

	function addCustomLayer(map) {
		/*
		if (customLayer) {
			map.removeTileLayer(customLayer);
		}
		//customLayer = new BMap.CustomLayer({geotableId:'36222'});
		customLayer = new BMap.CustomLayer({
			geotableId : 36222,
			q : '',
			tags : '',
			filter : ''
		});
		map.addTileLayer(customLayer);
		customLayer.addEventListener('hotspotclick', callback);
		 */
	}

	function callback(e)//单击热点图层
	{
		var customPoi = e.customPoi, str = [];
		str.push("address = " + customPoi.address);
		str.push("phoneNumber = " + customPoi.phoneNumber);
		alert(str);
		var content = '<p style="width:280px;margin:0;line-height:20px;">地址：'
				+ customPoi.address + '</p>';
		var searchInfoWindow = new BMapLib.SearchInfoWindow(map, content, {
			title : "testtt", //标题
			width : 290, //宽度
			height : 40, //高度
			panel : "panel", //检索结果面板
			enableAutoPan : true, //自动平移
			enableSendToPhone : true, //是否显示发送到手机按钮
			searchTypes : [ BMAPLIB_TAB_SEARCH, //周边检索
			BMAPLIB_TAB_TO_HERE, //到这里去
			BMAPLIB_TAB_FROM_HERE //从这里出发
			]
		});

		var point = new BMap.Point(customPoi.point.lng, customPoi.point.lat);
		searchInfoWindow.open(point);

	}
	function query(keyword, bounds) {
		mapOperateAction.queryByKeywordInBounds(keyword, bounds, queryData);
	}

	function queryData(str) {
		//alert(str);
		var data = JSON.parse(str);
		var allAddress = "";
		if (data.contents != undefined && data.contents.length > 0) {
			for (var i = 0; i < data.contents.length; i++) {
				allAddress += (i + 1) + "：" + data.contents[i].address + "<br>";
			}
			ymPrompt.alert({
				message : "此区域包含" + data.contents.length + "个施工点<br>"
						+ allAddress,
				title : '',
				width:400,
				height:250,
			});
		}
	}
	function savePoint(address, lng, lat) {
		mapOperateAction.savePoint(address, lng, lat, saveDataBackCall);
	}

	function saveDataBackCall(str) {
		//var data = JSON.parse(str);
		ymPrompt.alert({
			message : str,
			title : ''
		});
	}
	function jumpToCreate() {
		window.location.href = "/jsp/dynamic/create.jsp";
	}
</script>
</head>
<body>
	<div id="panel"></div>
	<div id="allmap"></div>



</body>
</html>
