<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/taticConfigAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>

<link rel="STYLESHEET" type="text/css" href="/js/dhtmlxtree/dhtmlxtree.css">
<script src="<%=request.getContextPath()%>/js/dhtmlxtree/dhtmlxcommon.js"></script>
<script src="<%=request.getContextPath()%>/js/dhtmlxtree/dhtmlxtree.js"></script>
<html>
<head>
<title>协作管理系统</title>
</head>
<script>

</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >

<table width="100%" border="1"   style="FONT-SIZE: 13px;table-layout:fixed" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="98%">
  <tr>
  <td width="25%" >
  <span><font color="red" >(系统->接口->策略组)结构树</font></span>
   <div id="show_tree" style="width:100%;height:99%;overflow:hidden;border :0px solid Silver;"></div>
  </td>
    <td valign="top" width="75%" >
     <div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
     <br>
      <font color="red">温馨提示：1.单击左边树上的接口名，进行接口与策略组关系设置；2.单击左边叶子节点策略组名称，进行策略实例配置；</font>
  </td>
  </tr>
</table>
<script>
  /*实列化dhtmlxtree树型对象*/
    var tree = new dhtmlXTreeObject("show_tree", "100%", "100%", 0);
    tree.setImagePath("/js/dhtmlxtree/imgs/");
    tree.enableCheckBoxes(0);
    //tree.setOnDblClickHandler(queryList);
    tree.setOnClickHandler(queryList);
    tree.setXMLAutoLoading("/supt/taticConfigAction.do?method=showIfaceTree");
    tree.loadXML("/supt/taticConfigAction.do?method=showIfaceTree&id=0");
    //tree.setImageArrays("plus", "plus2.gif", "plus3.gif", "plus4.gif", "plus.gif", "plus5.gif");
    //tree.setImageArrays("minus", "minus2.gif", "minus3.gif", "minus4.gif", "minus.gif", "minus5.gif");
    //tree.setStdImages("book.gif", "books_open.gif", "books_close.gif");
function queryList(id){
    var type=splitType(id);
    if(type=="taticgroup"){//表示是策略组配置实例
       var cimpFaceId=splitValue(tree.getParentId(id));
       var taticgoupid=splitValue(id);
        var applicationId=splitValue(tree.getParentId(tree.getParentId(id)));
       initQueryResultList(cimpFaceId,taticgoupid,applicationId);
    }else if(type=="iface"){//表示是接口
        var cimpFaceId=splitValue(id);
        var applicationId=splitValue(tree.getParentId(id));
        initIfaceGroupResultList(cimpFaceId,applicationId);
    }
}

function initQueryResultList(cimpFaceId,taticgoupid,applicationId){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj={};
		formObj.cimpFaceId=cimpFaceId;
		formObj.taticgoupid=taticgoupid;
		formObj.applicationId=applicationId;
		taticConfigAction.getInstanceList(formObj,showResultList);
}

function initIfaceGroupResultList(cimpFaceId,applicationId){
        DWRUtil.useLoadingMessage('数据读取中...');
		var formObj={};
		formObj.cimpFaceId=cimpFaceId;
		formObj.applicationId=applicationId;
		taticConfigAction.getIfaceGroupList(formObj,showResultList);
}

function showResultList(str){
		$('queryResultList').innerHTML = str;
}
function splitValue(id){
  var ids=id.split("|");
  var idvalue="";
  if(ids.length>=2){
     idvalue=ids[0];
  }else {
     idvalue=id;
  }
  return idvalue;
}
function splitType(id){
  var ids=id.split("|");
  var idvalue="";
  if(ids.length>=2){
     idvalue=ids[1];
  }
  return idvalue;
}

function toAdd(taticgoupid,cimpFaceId,applicationId){
  var  returnval=window.showModalDialog("/supt/taticConfigAction.do?method=toAddInstance&taticgoupid="+taticgoupid+"&cimpFaceId="+cimpFaceId+"&applicationId="+applicationId+"&d="+new Date(),window,"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px");
  if(returnval=="true"){
      initQueryResultList(cimpFaceId,taticgoupid,applicationId);
  }
}

function delInstance(){
  if(!confirm("您确认要删除选中的记录吗？")){
        return false;
   }
  var ids=getSelectCheckboxValue("queryListForm","checkid","|");
  taticConfigAction.delTaticInstance(ids,goBack);
}
function goBack(s){
  if(s==""){
     alert("删除操作成功！");
   var taticgoupid=queryListForm.taticgoupid.value;
   var cimpFaceId=queryListForm.cimpFaceId.value;
   var applicationId=queryListForm.applicationId.value;
   initQueryResultList(cimpFaceId,taticgoupid,applicationId);
  }else{
	    alert(s);
	  }
}

function getDetail(rowrecordid){
   var taticgoupid=queryListForm.taticgoupid.value;
   var cimpFaceId=queryListForm.cimpFaceId.value;
   var applicationId=queryListForm.applicationId.value;
    var  returnval=window.showModalDialog("/supt/taticConfigAction.do?method=toAddInstance&taticgoupid="+taticgoupid+"&cimpFaceId="+cimpFaceId+"&applicationId="+applicationId+"&rowrecordid="+rowrecordid+"&d="+new Date(),window,"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px");
  if(returnval=="true"){
      initQueryResultList(cimpFaceId,taticgoupid,applicationId);
  }
}

function toAddIfaceGroup(cimpFaceId){
    var  returnval=window.showModalDialog("/supt/taticConfigAction.do?method=selectTaticGroupInit&cimpFaceId="+cimpFaceId+"&d="+new Date(),window,"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px");
    if(returnval=="true"){
      initIfaceGroupResultList(cimpFaceId,"");
      tree.refreshItem(cimpFaceId+"|iface");
    }
}

function delIfaceGroup(cimpFaceId){
   if(!confirm("您确认要删除选中的记录吗？")){
        return false;
   }
   var ids=getSelectCheckboxValue("queryListForm","checkid","|");
   taticConfigAction.delIfaceGroup(ids,function(s){
       if(s==""){
         alert("删除操作成功！");
         tree.refreshItem(cimpFaceId+"|iface");
         initIfaceGroupResultList(cimpFaceId,"");
      }else{
	    alert(s);
	  }
   });
}

function updateIfaceGroup(cimpFaceId){
   var ifaceGroupIds=queryListForm.ifaceGroupId;
   var prioritys=queryListForm.priority;
   var ifaceGroupId="";
   var priority="";
   for(var i=0;i<ifaceGroupIds.length;i++){
      if(prioritys[i].value==""){
        alert("优先级不能为空");
        return;
      }
      if(ifaceGroupId==""){
        ifaceGroupId=ifaceGroupIds[i].value;
        priority=prioritys[i].value;
      }else{
        ifaceGroupId=ifaceGroupId+"|"+ifaceGroupIds[i].value;
        priority=priority+"|"+prioritys[i].value;
      }
   }
   var formObj={};
	formObj.ifaceGroupId=ifaceGroupId;
	formObj.priority=priority;
	taticConfigAction.updateIfaceGroup(formObj,function(s){
	  if(s==""){
	    alert("修改操作成功");
	    tree.refreshItem(cimpFaceId+"|iface");
	  }else{
	    alert(s);
	  }
	});

}
</script>

</body>
</html>