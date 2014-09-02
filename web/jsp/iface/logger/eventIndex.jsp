<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>集团电子运维系统互联接口平台</title>
<link rel="stylesheet" type="text/css" href="/js/ext3/resources/css/ext-all.css" />
<link rel="stylesheet" type="text/css" href="/js/ext3/resources/css/ext-app.css" />
<script type="text/javascript" src="/js/ext3/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="/js/ext3/ext-all-debug.js"></script>
<script type="text/javascript" src="./logger.js"></script>
</head>
<body>
<script type="text/javascript">	
	Ext.onReady(function() {
		Ext.BLANK_IMAGE_URL = "/js/ext3/resources/images/default/s.gif";

		Ext.QuickTips.init(); 

		var record;
		
		var js = new Ext.data.JsonStore({
			autoLoad: false,
			url: "/iface/ifaceLoggerEventAction.do?method=eventList",
			paramNames: { start: "skipResults", limit: "maxResults" },
			//baseParams: Ext.get("form-ct").getForm().getValues(false),
			root: "data",
			totalProperty: "totalRows",
	        fields: [
	           {name: "eventId"},
	           {name: "relateId"},
	           {name: "type"},
	           {name: "description"},
	           {name: "successful"},
	           {name: "created" }
	        ]
	    });
	    
		var viewportCt = new Ext.Viewport({
			layout: {
				type: "vbox",
				align : "stretch",
				padding: "10"
			},
			items: [
				{
					id: "form-ct",
					height: 90,
					region: "north",
					xtype: "form",
					collapsed: true,
					collapsible: true,
					title: "搜索条件",
					iconCls: "fellow",
					frame: true,
					margins: "0 0 10 0",
					labelWidth: 65,
					items: [{
						layout: "column",
						items: [{
							columnWidth: .25,
							layout: "form",
							id: "document",
							items: [{
								xtype: "textfield",
								fieldLabel: "文档内容",
								name: "document",
								anchor: "95%"
							}]
						}, {
							columnWidth: .25,
							layout: "form",
							id: "type",
							items: [{
								xtype: "combo",
								fieldLabel: "事件类型",
								mode: "local",
								readOnly: true,
								triggerAction: "all",
								store: new Ext.data.SimpleStore({
									fields: ["valueText", "displayText"],
									data: [["TRACE", "信息"], ["FAULT", "错误"]]
								}),
								//id: "type",
								hiddenName: "type",
								valueField: "valueText",
								displayField: "displayText",
								anchor: "95%"
							}]
						}, {
							columnWidth: .25,
							layout: "form",
							id: "successful",
							items: [{
								xtype: "combo",
								fieldLabel: "是否成功",
								mode: "local",
								readOnly: true,
								triggerAction: "all",
								store: new Ext.data.SimpleStore({
									fields: ["valueText", "displayText"],
									data: [["Y", "有效"], ["N", "无效"]]
								}),
								hiddenName: "successful",
								valueField: "valueText",
								displayField: "displayText",
								anchor: "95%"
							}]
						}, {
							columnWidth: .25,
							layout: "form",
							id: "historical",
							items: [{
								xtype: "combo",
								fieldLabel: "是否归档",
								mode: "local",
								editable: false,
								triggerAction: "all",
								store: new Ext.data.SimpleStore({
									fields: ["valueText", "displayText"],
									data: [["Y", "是"], ["N", "否"]]
								}),
								value: "N",
								hiddenName: "historical",
								valueField: "valueText",
								displayField: "displayText",
								anchor: "95%"
							}]
						}]
					}],
					buttons: [
						{
							text: "搜索",
							handler: function() {
								var params = Ext.getCmp("form-ct").getForm().getValues();
								for (var param in params) {
									js.setBaseParam(param, params[param]);
								}
								js.load({ params: {skipResults: 0, maxResults: 20}});
							}
						},
						{
							text: "重置",
							handler: function() {
								Ext.getCmp("form-ct").getForm().reset();
							}
						}
					]
				},
				{
					xtype: "grid",
					region: "center",
					id: "panel-ct",
					title: "接口事件列表",
					iconCls: "fellow",
					frame: true,
					border: true,
					store: js,
					loadMask: { msg: "正在加载中，请稍后……" },
					stripeRows: true,
					autoExpandColumn: "description",
					flex: 1,
					viewConfig: { forceFit: true },
					cm: new Ext.grid.ColumnModel([
						new Ext.grid.RowNumberer(),
						{header: "事件类型", width: 100, dataIndex: "type", renderer: function(value) { if (value == "TRACE") { return "信息"; } else if (value == "FAULT") { return "错误"; } else { return "未知"; } } },
						{header: "日志描述", width: 300, dataIndex: "description" },
						{header: "是否成功", width: 100, dataIndex: "successful", renderer: function(value) { if (value == "Y") { return '<span style="color:green;">成功</span>'; } else if (value == "N") { return '<span style="color:red;">失败</span>'; } else { return "未知"; } } },
						{header: "创建日期", width: 120, dataIndex: "created"}
					]),
					tbar: [
						{
							text: "查看入参文档",
							iconCls: "code",
							handler: function() {
								var selected = Ext.getCmp("panel-ct").getSelectionModel().getSelected();
								var win = new Ext.Window({
									layout: "fit",
									width: 700,
									height: 400,
									title: "事件详情",
									closeAction:'hide',
									modal: true,
									border: true,
									html: '<iframe width="100%", height="100%" scrolling="yes" frameborder="no" src="/iface/ifaceLoggerEventAction.do?method=eventArgu&eventId=' + selected.get("eventId") + '"/></iframe>',
									autoScroll: true,
									resizable: false,
									buttons: [
										{ 
											text: "重新执行",
											handler: function() {
												Ext.MessageBox.confirm("请选择", "如果你确定需要重新执行，请点击是。", function(btn) {
													if (btn == "yes") {
														var conn = new Ext.data.Connection({
															autoAbort: false,
															disableCaching: false,
															extraParams: { eventId: selected.get("eventId"), method: "eventImpl" },
															method: "GET",
															timeout: 300,
															url: "/iface/ifaceLoggerEventAction.do"
														});
														conn.request({
															callback: function() {
																Ext.MessageBox.alert("请选择", "后台调用完毕，请点击确认按钮刷新页面查看日志。");
															}
														});
													}
												});
											}
										}
									]
								});
								win.show();
							}
						},
						{
							text: "查看事件描述",
							iconCls: "text",
							handler: function() {
								var selected = Ext.getCmp("panel-ct").getSelectionModel().getSelected();
								var win = new Ext.Window({
									layout: "fit",
									width: 700,
									height: 400,
									title: "描述详情",
									closeAction:'close',
									modal: true,
									border: true,
									html: '<iframe width="100%", height="100%" scrolling="yes" frameborder="no" src="/iface/ifaceLoggerEventAction.do?method=eventDesc&eventId=' + selected.get("eventId") + '"/></iframe>',
									autoScroll: true,
									resizable: false
								});
								win.show();
							}
						},
						{
							text: "打开日志记录",
							iconCls: "note",
							handler: function() {
								var selected = Ext.getCmp("panel-ct").getSelectionModel().getSelected();
								//window.location.href = "/jsp/iface/ifaceLoggerTraceSrch.jsp?relateId=" + selected.get("relateId");
								var gridCt = new Ext.ux.grid.LoggerGrid({baseParams: {relateId: selected.get("relateId")}});
								var win = new Ext.Window({
									layout: "fit",
									width: 770,
									title: "日志记录列表",
									closeAction: "close",
									modal: true,
									border: false,
									items: gridCt,
									autoScroll: true,
									autoHeight: true,
									resizable: false
								});
								win.show();
							}
						}
					],
					bbar: new Ext.PagingToolbar({
	                    pageSize: 20,
	                    store: js,
	                    beforePageText: "第",
	                    afterPageText: "/{0}页",
	                    firstText: "首页",
	                    prevText: "上页",
	                    nextText: "下页",
	                    lastText: "尾页",
	                    refreshText: "刷新",
	                    displayInfo: true,
	                    displayMsg: '当前显示记录从{0} 到 {1} 总共{2}条记录',
	                    emptyMsg: "没有数据"
	                }),
					listeners: {
						rowclick: function(g, i, e) {
							record = js.getAt(i);
						}
					}
				}
			]
		});

		Ext.getCmp("form-ct").addListener("collapse", function(panelCt) {
			viewportCt.doLayout();
		});
		Ext.getCmp("form-ct").addListener("expand", function(panelCt) {
			viewportCt.doLayout();
		});

		js.load({params: {skipResults: 0, maxResults: 20}});
	});
</script>
</body>
</html>