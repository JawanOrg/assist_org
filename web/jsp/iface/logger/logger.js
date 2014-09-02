Ext.ns("Ext.ux.grid");

Ext.ux.grid.LoggerGrid = Ext.extend(Ext.grid.GridPanel, {
	baseParams : {},
	initComponent: function() {
		this.autoHeight = true;
		this.stripeRows = false;
		this.frame = true;
		this.viewConfig = { forceFit: true };
		
		this.cm = new Ext.grid.ColumnModel([
			//new Ext.grid.RowNumberer(),
			{header: "查看详情", width: 70, dataIndex: "repositoryId", renderer: function(value) {return '<a href="###" onclick="window.showModalDialog(\'/iface/ifaceLoggerTraceAction.do?method=getIfaceLogRepositoryDataSrchDetail&repositoryId=' + value + '\', null, \'dialogWidth:800px;dialogHeight:650px;center:yes;status:no;\');return false;">点击查看</a>';}},
			{header: "系统名称", width: 180, dataIndex: "applicationName"},
			{header: "日志类型", width: 80, dataIndex: "traceLevel", renderer: function(value) { if (value == "ERROR") { return '<span style="color:#FF0000;">错误</span>'; } else { return "正常"; } } },
			{header: "接口编码", width: 150, dataIndex: "methodName" },
			{header: "日志内容", width: 170, dataIndex: "traceText"},
			{header: "创建日期", width: 120, dataIndex: "createDate"}
		]);

		this.store = new Ext.data.JsonStore({
			autoLoad: false,
			url: "/iface/ifaceLoggerEventAction.do?method=recordList",
			paramNames: { start: "skipResults", limit: "maxResults" },
			baseParams: this.baseParams,
			root: "data",
			totalProperty: "totalRows",
	        fields: [
	           {name: "repositoryId"},
	           {name: "applicationName"},
	           {name: "methodName"},
	           {name: "traceLevel"},
	           {name: "traceText"},
	           {name: "createDate" }
	        ]
	    });
	    
	    this.store.load({params: {skipResults: 0, maxResults: 20}});
		
		Ext.ux.grid.LoggerGrid.superclass.initComponent.call(this);
	}
});