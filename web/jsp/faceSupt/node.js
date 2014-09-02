
Ext.ns("Ext.ux.grid");

Ext.ux.grid.NodeGrid = Ext.extend(Ext.grid.GridPanel, {
	documentId: "",
	initComponent: function() {
		var groupCts = {
				"upload": ["serverId", "pathIndicator", "attachHome", "fileNameNode"],
				"static": ["depenKey", "declareSn", "mappingSn", "isSimpsys"],
				"append": [],
				"changer": ["mappForData", "mappForFormat", "mappAftData", "mappAftFormat"],
				"cycleToPatch": ["joinName", "joinEnable"]
		};
		var store = new Ext.data.JsonStore({
			fields: [
						{name: "sendId"},
						{name: "cimpFaceId"},
						{name: "outNode"},
						{name: "outIschidNode"},
						{name: "outParentNode"},
						{name: "outChidnodeOver"},
						{name: "inNode"},
						{name: "mappPatt"},
						{name: "mappForData"},
						{name: "mappForFormat"},
						{name: "mappAftData"},
						{name: "mappAftFormat"},
						{name: "orderId", type: "float"},
						{name: "joinName"},
						{name: "joinEnable"},
						{name: "depenNode"},
						{name: "depenKey"},
						{name: "isSimpsys"},
						{name: "declareSn"},
						{name: "isDoubuxml"},
						{name: "doubuNum"},
						{name: "doubuPar"},
						{name: "doubuChi"},
						{name: "mappingSn"},
						{name: "appendChars"},
						{name: "appendNodes"},
						{name: "ignoreAbsent"},
						{name: "serverId"},
						{name: "pathIndicator"},
						{name: "attachHome"},
						{name: "fileNameNode"},
						{name: "available"},
						{name: "isAnnotate"},
						{name: "successValue"}
					]
		});
		this.autoScroll = true;
		//this.title = "转出规则(" + faceRecord.get("methodName") + ")",
		this.closable = true;
		this.store = store;
		this.stripeRows = true;
		this.border = false;
		this.frame = false;
		this.iconCls = "tabs";
		this.autoExpandColumn = "inNode";
		this.viewConfig = { forceFit: true };
		this.cm = new Ext.grid.ColumnModel([
			new Ext.grid.RowNumberer(),
			new Ext.grid.CheckboxSelectionModel(),
			//{header: "id", dataIndex: "sendId"},
			{header: "编号", width: 50, dataIndex: "orderId"},
			{header: "节点名称", width: 160, dataIndex: "outNode", renderer: function(value) { if (value == "Y") { return '<span style="color:green;">成功</span>'; } else if (value == "N") { return '<span style="color:red;">失败</span>'; } else { return value; } } },
			{header: "是否叶子", width: 80, renderer: function(value) { if (value == "Y") { return "是"; } else { return "否"; } }, dataIndex: "outIschidNode"},
			{header: "是否结束", width: 80, renderer: function(value) { if (value == "Y") { return "是"; } else { return "否"; } }, dataIndex: "outChidnodeOver"},
			{header: "入参节点", width: 320, dataIndex: "inNode"},
			{header: "映射方式", width: 100, renderer: this.mappingName, dataIndex: "mappPatt"}
		]);
		this.bbar = [
			{ text: "新增规则", iconCls: "plus", handler: function() {
				var nextId = 1;
				if (store.getCount() > 0) {
					var lastRecord = store.getAt(store.getCount() - 1);
					nextId = lastRecord.get("orderId") + 1;
				}
				var url = "/supt/checkAction.do?method=addCheckOut&cimpFaceId=" + this.documentId + "&applicationId=" + faceRecord.get("applicationId") + "&orderId=" + nextId;
				var returnValue = window.showModalDialog(url, window, 'dialogHeight:700px;dialogWidth:500px;status=no;resizable:no');
				if(returnValue == "T"){
					checkAction.checkOutDataList({ cimpFaceId: this.documentId}, function (data) {
						store.loadData(data);
					});
				}
			}.createDelegate(this)},
			{ text: "修改规则", iconCls: "edit", handler: function() {
				if (!this.getSelectionModel().hasSelection()) {
					Ext.MessageBox.alert("警告", "请你选择一个节点进行修改！");
					return;
				}
				var url = "/supt/checkAction.do?method=toModifyCheckOut&id="+this.getSelectionModel().getSelected().get("sendId");
				var returnValue = window.showModalDialog(url, window, 'dialogHeight:700px;dialogWidth:500px;status=no;resizable:no');
				if(returnValue == "T"){
					checkAction.checkOutDataList({ cimpFaceId: this.documentId}, function (data) {
						store.loadData(data);
					});
				}
			}.createDelegate(this)},
			{ text: "删除规则", iconCls: "minus", handler: function() {
				if (!this.getSelectionModel().hasSelection()) {
					Ext.MessageBox.alert("警告", "请你选择一个节点进行修改！");
					return;
				}
				if (!window.confirm("您选择的记录将删除,是否继续？")) {
					return;
				}
				var record = this.getSelectionModel().getSelected();
			 	var id = record.get("sendId");	
				checkAction.deleteCheckOut(id, function() {
					store.remove(record);
				});
			}.createDelegate(this)},
			{ text: "临时模块", handler: function() {
				if (!this.getSelectionModel().hasSelection()) {
					Ext.MessageBox.alert("警告", "请你选择一个节点进行修改！");
					return;
				}
				var formCt = new Ext.form.FormPanel({
					labelWidth: 160,
					border: false,
					frame: false,
					hideBorders: true,
					defaultType: "textfield",
					bodyStyle: "padding: 10px 10px 0 10px",
					labelAlign: "right",
					layout: "form",
					layoutConfig: { trackLabels: true },
					items: [{
						fieldLabel: "出参xml节点",
						id: "outNode",
						name: "outNode",
						allowBlank: false,
						anchor: "80%"
					}, {
						xtype: "radiogroup",
						id: "outIschidNode",
						fieldLabel: "出参是否叶子节点",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "outIschidNode", inputValue: "Y"
						}, {
							boxLabel: "否", name: "outIschidNode", inputValue: "N", checked: true
						}],
						allowBlank: false,
						listeners: {
							"change": function(radioGroup, radio) {
								if (formCt.getComponent("outIschidNode").getValue().getRawValue() == "Y") {
									Ext.getCmp("outChidnodeOver").disable();
									Ext.getCmp("mappPatt").show();
								} else {
									Ext.getCmp("outChidnodeOver").enable();
								}
							}
						}
					}, {
						xtype: "radiogroup",
						id: "outChidnodeOver",
						fieldLabel: "出参子节点是否结束",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "outChidnodeOver", inputValue: "Y"
						}, {
							boxLabel: "否", name: "outChidnodeOver", inputValue: "N", checked: true
						}],
						allowBlank: false
					}, {
						xtype: "radiogroup",
						fieldLabel: "入参不存在时不输出节点",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "ignoreAbsent", inputValue: "Y"
						}, {
							boxLabel: "否", name: "ignoreAbsent", inputValue: "N", checked: true
						}]
					}, {
						fieldLabel: "入参xml节点",
						name: "inNode",
						anchor: "100%"
					}, {
						xtype: "combo",
						fieldLabel: "映射方式",
						id: "mappPatt",
						//name: "mappPatt",
						//hiddenName: "mappPatt",
						triggerAction: "all",
						allowBlank: false,
						editable: false,
						hidden: true,
						//anchor: "90%",
						mode: "remote",
						emptyText: "请选择一种映射方式",
						store: new Ext.data.JsonStore({
							autoLoad: true,
							url: "/supt/checkAction.do?method=mappPattList",
							root: "data",
							fields: [ { name: "mappPatt" }, { name: "mappPattName" } ]
							/*data: [
								["direct", "直接转换"],
								["static", "静态数据"],
								["systime", "系统时间"],
								["timeReplace", "时间替换"],
								["final", "固定值"],
								["changer", "类型转换"],
								["tactic", "策略"],
								["UUID", "UUID"],
								["upload", "附件上传"],
								["returnID", "返回ID"],
								["cycleToPatch", "循环转拼接"],
								["patchToCycle", "拼接转循环"],
								["append", ""]
							]*/
						}),
						displayField: "mappPattName",
						valueField: "mappPatt",
						listeners: {
							"beforeselect": function(comboCt, record, index) {
								var mappPatt = record.get("mappPatt");
								for( var groupCt in groupCts) {
									Ext.each(groupCts[groupCt], function(fieldCt, index, fieldCts) {
										Ext.getCmp(fieldCt).hide();
									});
								}
							},
							"select": function(comboCt, record, index) {
								var mappPatt = record.get("mappPatt");
								if (groupCts[mappPatt]) {
									Ext.each(groupCts[mappPatt], function(fieldCt, index, fieldCts) {
										Ext.getCmp(fieldCt).show();
									});
								}
							}
						}
					}, {
						fieldLabel: "静态依赖节点",
						id: "depenNode",
						name: "depenNode",
						hidden: true,
						anchor: "80%"
					}, {
						fieldLabel: "乙端系统的静态数据编码",
						id: "depenKey",
						name: "depenKey",
						hidden: true,
						anchor: "80%"
					}, {
						fieldLabel: "甲端系统的静态数据类型",
						id: "declareSn",
						name: "declareSn",
						hidden: true,
						anchor: "80%"
					}, {
						fieldLabel: "乙端系统的静态数据类型",
						id: "mappingSn",
						name: "mappingSn",
						hidden: true,
						anchor: "80%"
					}, {
						xtype: "combo",
						fieldLabel: "静态数据类型转换类型",
						id: "isSimpsys",
						hiddenName: "isSimpsys",
						triggerAction: "all",
						allowBlank: false,
						readOnly: true,
						hidden: true,
						anchor: "90%",
						mode: "local",
						emptyText: "请选择一种转换方式",
						store: new Ext.data.SimpleStore({
							fields: ["isSimpsys", "changeName"],
							data: [
								["1C2E", "甲端系统静态数据-名称转编码"],
								["1E2C", "甲端系统静态数据-编码转名称"],
								["3C2E", "乙端系统静态数据-名称转编码"],
								["3E2C", "乙端系统静态数据-编码转名称"],
								["2E2E", "甲乙系统静态数据-编码转编码"],
								["2E2C", "甲乙系统静态数据-编码转中文(开发中)"],
								["2C2E", "甲乙系统静态数据-中文转编码(开发中)"],
								["2C2C", "甲乙系统静态数据-中文转中文(开发中)"]
							]
						}),
						valueField: "isSimpsys",
						displayField: "changeName"
					}, {
						fieldLabel: "映射前数据类型",
						id: "mappForData",
						name: "mappForData",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "映射前格式",
						id: "mappForFormat",
						name: "mappForFormat",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "映射后数据类型",
						id: "mappAftData",
						name: "mappAftData",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "映射后格式",
						id: "mappAftFormat",
						name: "mappAftFormat",
						hidden: true,
						anchor: "100%"
					}, {
						xtype: "combo",
						fieldLabel: "选择存放的服务器",
						id: "serverId",
						//name: "serverId",
						hiddenName: "protocolId",
						triggerAction: "all",
						allowBlank: false,
						readOnly: true,
						hidden: true,
						anchor: "90%",
						mode: "remote",
						emptyText: "请选择一种转换方式",
						store: new Ext.data.JsonStore({
							autoLoad: true,
							url: "/iface/ifaceConfigProtocolAction.do?method=getAttachProtocolList",
							root: "data",
							fields: [
								{name: "protocolId"},
								{name: "applicationName"}
							]
						}),
						displayField: "applicationName",
						valueField: "protocolId"
					}, {
						fieldLabel: "路径表示类型",
						id: "pathIndicator",
						name: "pathIndicator",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "附件存放目录",
						id: "attachHome",
						name: "attachHome",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "文件名称节点",
						id: "fileNameNode",
						name: "fileNameNode",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "字段拼接名字",
						id: "joinName",
						name: "joinName",
						hidden: true,
						anchor: "100%"
					}, {
						fieldLabel: "是否拼接",
						id: "joinEnable",
						hidden: true,
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "joinEnable", inputValue: "Y"
						}, {
							boxLabel: "否", name: "joinEnable", inputValue: "N", checked: true
						}]
					}, {
						xtype: "radiogroup",
						fieldLabel: "是否有同样XML体",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "isDoubuxml", inputValue: "Y"
						}, {
							boxLabel: "否", name: "isDoubuxml", inputValue: "N", checked: true
						}]
					}, {
						fieldLabel: "相同XML体节点路径",
						id: "doubuPar",
						name: "doubuPar",
						allowBlank: false,
						anchor: "100%"
					}, {
						fieldLabel: "相同XML体内部节点",
						id: "doubuChi",
						name: "doubuChi",
						allowBlank: false,
						anchor: "80%"
					}, {
						fieldLabel: "顺序编号",
						name: "orderId",
						allowBlank: false,
						width: 120
					}, {
						xtype: "radiogroup",
						fieldLabel: "配置是否生效",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "available", inputValue: "Y", checked: true
						}, {
							boxLabel: "否", name: "available", inputValue: "N"
						}]
					}, {
						xtype: "radiogroup",
						fieldLabel: "使用CDATA处理特殊字符",
						columns: [50, 50],
						items: [{
							boxLabel: "是", name: "isAnnotate", inputValue: "Y"
						}, {
							boxLabel: "否", name: "isAnnotate", inputValue: "N", checked: true
						}]
					}],
					listeners: {
						"afterrender": function(ct) {
							Ext.getCmp("outChidnodeOver").disable();
							Ext.getCmp("doubuPar").disable();
							Ext.getCmp("doubuChi").disable();
						}
					}
				});
				var win = new Ext.Window({
					layout: "fit",
					width: 600,
					height: 450,
					title: "新增/修改转出规则",
					closeAction: "close",
					modal: true,
					border: true,
					resizable: false,
					items: formCt,
					buttonAlign: "center",
					buttons: [{
						text: "提交",
						handler: function() {
							alert(Ext.encode(formCt.getForm().getValues()));
						}
					}, {
						text: "取消"
					}]
				});
				var record = this.getSelectionModel().getSelected();
				formCt.getForm().loadRecord(record);
				win.show("panel-ct", function() {
					if (record.get("outIschidNode") == "Y") {
						//Ext.getCmp("outChidnodeOver").disable();
						formCt.getComponent("mappPatt").show();
					}
					var mappPatt = record.get("mappPatt");
					if (groupCts[mappPatt]) {
						Ext.each(groupCts[mappPatt], function(fieldCt, index, fieldCts) {
							Ext.getCmp(fieldCt).show();
						});
					}
				});
			}.createDelegate(this)},
			{ text: "复制规则", iconCls: "copy", handler: function() {
				Ext.MessageBox.show({
					title: "错误",
					msg: "正在开发中...",
					buttons: Ext.MessageBox.OK,
					minWidth: 250,
					icon: Ext.MessageBox.WARNING
				});
				return;
				var selected = Ext.get("queryForm").select("input:checked");
				if (selected.getCount() > 1) {
					Ext.MessageBox.alert("错误", "你选择了多条记录。");
					return;
				}
				var win = new Ext.Window({
					layout: 'fit',
					width: 400,
					height: 200,
					title: "复制转出规则",
					closeAction:'hide',
					plain: true,
					modal: true,
					items: {
						xtype: "form",
						items: [{
							xtype: "textfield",
							fieldLabel: "复制到：",
							name: "toId",
							anchor: "90%"
						}]
					},
					bbar: [
						{ text: "复制" },
						{ text: "取消" }
					]
				});
				win.show();
			}}
		];
		this.sm = new Ext.grid.CheckboxSelectionModel({singleSelect:true});
		//autoLoad: "/checkAction.do?method=showCheckOut&faceId=" + faceRecord.get("cimpFaceId")

		DWRUtil.useLoadingMessage('数据读取中...');
		checkAction.checkOutDataList({ cimpFaceId: this.documentId}, function (data) {
			store.loadData(data);
		});
		Ext.ux.grid.NodeGrid.superclass.initComponent.call(this, arguments);
	},
	mappingName: function mappingName(value) {
		if (value =="direct") {
			return "直接映射";
		} else if (value == "static") {
			return "静态数据";
		} else if (value =="systime") {
			return "系统时间";
		} else if (value == "timeReplace") {
			return "时间替换";
		} else if (value == "final") {
			return "固定值";
		} else if (value == "changer") {
			return "类型转换";
		} else if (value == "tactic") {
			return "策略";
		} else if (value == "source") {
			return "源数据";
		} else if (value == "UUID") {
			return "UUID";
		} else if (value == "upload") {
			return "附件";
		} else if (value == "returnID") {
			return "返回ID";
		} else if (value == "cycleToPatch") {
			return "循环转拼接";
		} else if (value == "patchToCycle") {
			return "拼接转循环";
		} else if (value == "append") {
			return "追加信息";
		} else if (value == "copyAllSonInfo") {
			return "拷贝所有子节点";
		} else {
			return "";
		}
	}
});