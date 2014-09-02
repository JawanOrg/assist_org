<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>集团电子运维系统互联接口平台</title>
<link rel="stylesheet" type="text/css" href="/js/ext3/resources/css/ext-all.css" />
<link rel="stylesheet" type="text/css" href="/js/ext3/resources/css/ext-app.css" />
<script type="text/javascript" src="/js/ext3/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="/js/ext3/ext-all.js"></script>
<script type="text/javascript" src="./node.js"></script>
<script type="text/javascript" src="/dwr/engine.js"></script>
<script type="text/javascript" src="/dwr/util.js"></script>
<script type="text/javascript" src="/dwr/interface/checkAction.js"></script>
<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
        return false;
    }
</script>
</head>
<body>
<script type="text/javascript">
	var faceRecord, ruleRecord, saveRecord;
	
	Ext.onReady(function() {
		Ext.BLANK_IMAGE_URL = "/js/ext3/resources/images/default/s.gif";
		//Ext.layout.FormLayout.prototype.trackLabels = false;
		Ext.QuickTips.init(); 

		var faceStore = new Ext.data.JsonStore({
			autoLoad: false,
			url: "/supt/checkAction.do?method=faceDataList",
			paramNames: { start: "skipResults", limit: "maxResults" },
			root: "data",
			totalProperty: "totalRows",
	        fields: [
	           {name: "cimpFaceId"},
	           {name: "applicationName"},
	           {name: "cimpName"},
	           {name: "methodName"},
	           {name: "exetMethodname"},
	           {name: "paramater"},
	           {name: "isValid"},
	           {name: "returnAppid"},
	        ]
	    });

		var saveStore = new Ext.data.JsonStore({
			fields: [
				{name: "returnValidId"},
				{name: "operName"},
				{name: "opernamePath"},
				{name: "operpathFrom"},
				{name: "fieldName"},
				{name: "fieldPath"},
				{name: "fieldpathFrom"},
				{name: "prikeyName"},
				{name: "prikeyPath"},
				{name: "prikeyFrom"}
			]
		});

		var sm = new Ext.grid.CheckboxSelectionModel({singleSelect:true});

		var formCt = new Ext.form.FormPanel({
				id: "form-ct",
				collapsed: true,
				collapsible: true,
				title: "搜索条件",
				iconCls: "fellow",
				margins: "0 0 10 0",
				labelWidth: 60,
				height: "auto",
				labelAlign: "right",
				frame: true,
				items: [{
					layout: "column",
					items: [{
						columnWidth: .35,
						layout: "form",
						items: [{
							xtype: "textfield",
							fieldLabel: "接口名称",
							name: "cimpName",
							anchor: "90%"
						}]
					}, {
						columnWidth: .35,
						layout: "form",
						items: [{
							xtype: "textfield",
							fieldLabel: "接口编码",
							name: "methodName",
							anchor: "90%"
						}]
					}, {
						columnWidth: .3,
						layout: "form",
						items: [{
							xtype: "combo",
							frame: true,
							editable: false,
							fieldLabel: "是否有效",
							mode: "local",
							triggerAction: "all",
							store: new Ext.data.SimpleStore({
								fields: ["valueText", "displayText"],
								data: [["Y", "有效"], ["N", "无效"]]
							}),
							hiddenName: "isValid",
							valueField: "valueText",
							displayField: "displayText",
							forceSelection: true,
							value: "Y",
							anchor: "90%"
						}]
					}]
				}],
				buttons: [
					{
						text: "搜索",
						margins: "0",
						handler: initQueryResultList
					},
					{
						text: "重置",
						margins: "0",
						handler: function() {
							Ext.getCmp("form-ct").getForm().reset();
						}
					}
				]
			});

		var tabCt = new Ext.TabPanel({
				xtype: "tabpanel",
				id: "panel-ct",
				activeTab: 0,
				plain: false,
				flex: 1,
				items: [
					{
						xtype: "grid",
						title: "接口方法列表",
						iconCls: "fellow",
						frame: false,
						border: false,
						store: faceStore,
						stripeRows: true,
						loadMask: { msg: "正在加载中，请稍后……" },
						autoExpandColumn: "cimpName",
						viewConfig: { forceFit: true },
						cm: new Ext.grid.ColumnModel([
							new Ext.grid.RowNumberer(),
						  	sm,
							{header: "系统名称", width: 100, dataIndex: "applicationName"},
							{header: "接口名称", width: 300, dataIndex: "cimpName"},
							{header: "转入接口编码", width: 190, dataIndex: "methodName"},
							{header: "转出接口编码", width: 170, dataIndex: "exetMethodname"},
							{header: "请求参数", width: 120, dataIndex: "paramater"},
							{header: "是否有效", width: 80, renderer: function(value) { if (value == "Y") { return "有效"; } else if (value == "N") { return "无效"; } else { return "未知"; } }, dataIndex: "isValid"},
							{header: "出入参数", width: 80, renderer: function(value) { if (value == "IN") { return "入参"; } else if (value == "OUT") { return "出参"; } else { return "未知"; } }, dataIndex: "returnAppid"}
						]),
						sm: sm,
						tbar: [
							{
								text: "新增接口",
								iconCls: "plus",
								handler: addFace
							},
							{
								text: "修改接口",
								iconCls: "edit",
								handler: modifyFace
							},
							{
								text: "错误处理方式",
								iconCls: "insect",
								handler: errFace
							},
							{
								text: "转出规则",
								iconCls: "merge",
								handler: checkOutFace
							},
							{
								text: "返回值规则",
								iconCls: "store",
								handler: returnSave
							},
							{
								text: "预览文档",
								iconCls: "find",
								handler: getOutXml
							}
						],
						bbar: new Ext.PagingToolbar({
		                    pageSize: 20,
		                    store: faceStore,
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
								faceRecord = faceStore.getAt(i);
							}
						}
					}
				]
			});

		var viewportCt = new Ext.Viewport({
			layout: {
				type: "vbox",
				align : "stretch",
				padding: "10"
			},
			items: [ formCt, tabCt]
		});

		viewportCt.render(document.body);

		formCt.addListener("collapse", function(panelCt) {
			viewportCt.doLayout();
		});
		formCt.addListener("expand", function(panelCt) {
			viewportCt.doLayout();
		});

		faceStore.load({params: Ext.apply({skipResults: 0, maxResults: 20}, Ext.getCmp("form-ct").getForm().getValues())});

		function initQueryResultList(){
			DWRUtil.useLoadingMessage('数据读取中...');
			faceStore.load({params: Ext.apply({skipResults: 0, maxResults: 20}, Ext.getCmp("form-ct").getForm().getValues())});
		}

		function initQueryResultList3() {
			DWRUtil.useLoadingMessage('数据读取中...');
			checkAction.returnValueDataList({ cimpFaceId: faceRecord.get("cimpFaceId") }, function (data) {
				saveStore.loadData(data);
			});
		}
		
		//新增
		function addFace() {
			var url = "/supt/checkAction.do?method=toModifyFace&id=111";
			var returnValue = window.showModalDialog(url, window, 'dialogHeight:750px;dialogWidth:550px;status=no;resizable:no');
			if(returnValue == "T"){
				initQueryResultList();
			}
		}

		//修改
		function modifyFace() {
			if (!!faceRecord) {
				var url = "/supt/checkAction.do?method=toModifyFace&id=" + faceRecord.get("cimpFaceId");
				var returnValue = window.showModalDialog(url, window, 'dialogHeight:750px;dialogWidth:550px;status=no;resizable:no');
		    	if(returnValue == "T"){
					initQueryResultList();
		    	}
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//错误处理方式
		function errFace(){
			if (!!faceRecord) {
				//var url = "/jsp/faceSupt/errfaceDataSrch.jsp?id=" + faceRecord.get("cimpFaceId");
				var url ="/supt/triggerAction.do?method=getTriggerList&portId=" + faceRecord.get("cimpFaceId");
				window.showModalDialog(url, window, 'dialogHeight:550px;dialogWidth:550px;status=no;resizable:no');
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//打开转出规则  
		function checkOutFace() {
			if (!!faceRecord) {
				var tabCt = new Ext.ux.grid.NodeGrid({ documentId: faceRecord.get("cimpFaceId"), title: "转出规则(" + faceRecord.get("methodName") + ")"});
				Ext.getCmp("panel-ct").add(tabCt).show();
				//initQueryResultList2();
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//打开返回值保存规则  
		function returnSave(){
			if (!!faceRecord) {
				Ext.getCmp("panel-ct").add({
					xtype: "grid",
					title: "保存规则(" + faceRecord.get("methodName") + ")",
					closable: true,
					store: saveStore,
					stripeRows: true,
					border: false,
					frame: false,
					viewConfig: { forceFit: true },
					cm: new Ext.grid.ColumnModel([
						{header: "动作名称", dataIndex: "operName"},
						{header: "动作路径", dataIndex: "opernamePath"},
						{header: "动作取值上下行", dataIndex: "operpathFrom"},
						{header: "更改字段名", dataIndex: "fieldName"},
						{header: "字段路径", dataIndex: "fieldPath"},
						{header: "字段取值上下行", dataIndex: "fieldpathFrom"},
						{header: "主键名", dataIndex: "prikeyName"},
						{header: "主键路径", dataIndex: "prikeyPath"},
						{header: "主键取值上下行", dataIndex: "prikeyFrom"}
					]),
					sm: new Ext.grid.CheckboxSelectionModel({singleSelect:true}),
					//autoLoad: "/checkAction.do?method=showReturnValue&id=" + faceRecord.get("cimpFaceId")
					bbar: [
						{ text: "新增", handler: addReturnValue },
				        { text: "修改", handler: modifyReturnValue },
				        { text: "删除", handler: deleteReturnValue }
					],
					listeners: {
						rowclick: function(g, i, e) {
							saveRecord = saveStore.getAt(i);
						}
					}
				}).show();
				initQueryResultList3();
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}
		
		//新增返回值规则
		function addReturnValue() {
			if (!!faceRecord) {
				var url = "/jsp/faceSupt/returnValueDataAdd.jsp?id=" + faceRecord.get("cimpFaceId");
				var returnValue = window.showModalDialog(url, window, 'dialogHeight:500px;dialogWidth:500px;status=no;resizable:no');
				if(returnValue == "T"){
					initQueryResultList3();
				}
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//修改 返回值规则
		function modifyReturnValue() {
			if (!!saveRecord) {
			    var url = "/supt/checkAction.do?method=toModifyReturnValue&id=" + saveRecord.get("returnValidId");
				var returnValue = window.showModalDialog(url, window, 'dialogHeight:500px;dialogWidth:500px;status=no;resizable:no');
			    if(returnValue == "T"){
					initQueryResultList3();
				}
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//删除  返回值规则
		function deleteReturnValue() {
			if (!!saveRecord) {
				if (!window.confirm("您选择的记录将删除,是否继续？")) {
					return;
				}
				checkAction.deleteReturnValue(saveRecord.get("returnValidId"), initQueryResultList3);
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//验证规则 
		function validFace(){
			if (!!faceRecord) {
				Ext.getCmp("panel-ct").add({
					title: "验证规则",
					closable: true,
					autoLoad: "/supt/checkAction.do?method=showSuptCheck&id=" + faceRecord.get("cimpFaceId")
				}).show();
				//createNewTab('tabView1','验证规则','','/checkAction.do?method=showSuptCheck&id=' + faceRecord.get("cimpFaceId"),true);
			} else {
				Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
			}
		}

		//预览xml
		function getOutXml() {
		    if (!!faceRecord) {
				var url = "/supt/checkAction.do?method=getOutXml&id=" + faceRecord.get("cimpFaceId");
			    var win = new Ext.Window({
		            layout:'fit',
		            width:600,
		            height:450,
		            title: "预览" + faceRecord.get("cimpName"),
		            closeAction:'hide',
		            plain: true,
		            modal: true,
		            border: false,
		            items: new Ext.Panel({
						autoLoad: url,
						autoScroll: true
		            })
		        });
		        win.show();
		    } else {
		    	Ext.MessageBox.show({
					title: "错误",
					msg: "请选择记录",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
		    }  
		}
	});
</script>
</body>
</html>