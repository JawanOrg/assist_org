<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ page import="java.util.Collection,java.util.Iterator" %>
<%@ page import="com.free.assist.domain.SysServiceConfig" %>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysTaskAction.js'></script>
<%
   response.setHeader("Cache-Control","no-store"); //HTTP 1.1
   response.setHeader("Pragma","no-cache");        //HTTP 1.0
   response.setDateHeader ("Expires", 0);          //防止被proxy server cache

   Collection runningTaskCol = (Collection) request.getAttribute("runningTaskList");
   Collection stopTaskCol = (Collection) request.getAttribute("stopTaskList");
   
   String tabIndex = (String)request.getAttribute("tabIndex");
   if (tabIndex==null || tabIndex.length()==0)
      tabIndex = "0";
%>

<html>
<head>
<title>后台服务管理</title>
<script src="/js/frameservice.js"></script>
<script src="/js/tab/tabpane.js" type=text/javascript></script> 
<link rel="stylesheet" href="/css/main.css" type="text/css"> 
<link id=webfx-tab-style-sheet href="/js/tab/webfx.css" type=text/css rel=stylesheet>
<style>
.dyntable{
	font-size: 9pt;
	word-break:break-all;
	cursor: default;
	BORDER: black 1px solid;
	background-color:#FFFFFF;
	border-collapse:collapse;
	border-Color:#999999;
	align:center;
	width:90%;
	border:0
}
.dyntitle{
   background-color:#C4FF9B;
   color:#3300FF;

}
.inputtext{
    border-color: #99AFEC; 
	 border-width: 1;     
	 border-style: inset;
} 

</style>
<script language="javascript">
   
</script>
</head>

<body bgcolor="#f0f0f0" text="#000000" leftmargin="0" style="overflow:auto" topmargin="0">
<br>
<form name="form1" method="post" action="">
<input type="hidden" name="serviceId" value="">
  <table width="98%" border="0" align="center" cellspacing="0" cellpadding="0">
    <tr>
      <td>
      	
        <div class="tab_aTab" id="tabPane1" marginwidth="0" marginheight="0">
		<script type="text/javascript">
		   tp1 = new WebFXTabPane( document.getElementById( "tabPane1" ) );
		   function stopService(serviceId) {
		   		sysTaskAction.stopTask(serviceId,callbackStopService);
		   }
		   function callbackStopService(serviceId) {
		   		document.form1.serviceId.value=serviceId;
		   		document.form1.action="/sys/sysTaskAction.do?method=initRunningAndStopTaskIndex";
		   		document.form1.submit();
		   }
		</script>
      <div class="tab_aTab" id="tabPage1" marginwidth="0" marginheight="0" topmargin="0">
        <div align=left  class=tab><table align=left cellpadding=0 cellspacing=0 ><tr><td class="tabpaneleft2" ></td><td class="tabpanebg2" width="120"><img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18">已启动</td><td class="tabpaneright2"></td></tr></table></div>
	    <script type="text/javascript">
	    	tp1.addTabPage( document.getElementById( "tabPage1" ) );
	    	function callbackStopTask(obj) {
	    		obj.disabled = true;
	    	}
	    </script>
	    
          <table class="table" style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
            <TR class="titletr">
              <TD height="23" align="cneter" width="10%" nowrap>序号</TD>
              <TD height="23" align="cneter" width="25%" nowrap>已启动服务名称</TD>  
              <TD height="23" align="cneter" width="50%" nowrap>已启动服务CLASS</TD>
              <TD height="23" align="cneter" width="5%" nowrap>默认启动</TD>
              <TD height="23" align="cneter" width="5%" nowrap>只启动一次</TD>
              <TD height="23" align="cneter" width="5%" nowrap>操作</TD>
            </TR>
<%
   if (runningTaskCol!=null && runningTaskCol.size()>0)
   {
      int startCounter = 0;
      Iterator startIter = runningTaskCol.iterator();      
      while (startIter.hasNext())
      {         
    	 SysServiceConfig vo = (SysServiceConfig)startIter.next();
    	 String serviceId = vo.getServiceId();
         String serviceName = vo.getServiceName();
         String serviceClass = vo.getServiceClass();
         String startDefault = vo.getStartDefault();
         String startRunonce = vo.getStartRunonce();
         startCounter++;
%>      
            <TR>
              <TD class="data_Td_char" align="center" height="23"><%=startCounter%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=serviceName%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=serviceClass%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=startDefault%>&nbsp;</TD>
              <TD class="data_Td_char" align="left" height="23"><%=startRunonce%></TD>
              <TD class="data_Td_char" align="center" height="23"><input type="button" onclick="stopService('<%=serviceId%>');this.disabled=true;" value="停止"></TD>
            </TR>
<%
      }
   }
%>	
          </table>
      </div>

      <div class="tab_aTab" id="tabPage2" marginwidth="0" marginheight="0" topmargin="0">           
        <div align=left  class=tab><table align=left cellpadding=0 cellspacing=0  style="font-size:13px"><tr><td class="tabpaneleft2" ></td><td class="tabpanebg2" width="120">未启动</td><td class="tabpaneright2"></td></tr></table></div>
        <script type="text/javascript">
        	tp1.addTabPage( document.getElementById( "tabPage2" ) );
        	function startService(serviceId) {
		   		sysTaskAction.startTask(serviceId,callbackStartService);
		   }
		   function callbackStartService(serviceId) {
		    	document.form1.serviceId.value=serviceId;
		   		document.form1.action="/sys/sysTaskAction.do?method=initRunningAndStopTaskIndex";
		   		document.form1.submit();
		   }
        </script>
          <table class="table" style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
            <TR class="titletr">
              <TD height="23" align="cneter" width="10%" nowrap>序号</TD>
              <TD height="23" align="cneter" width="25%" nowrap>未启动服务名称</TD>  
              <TD height="23" align="cneter" width="50%" nowrap>未启动服务CLASS</TD>
              <TD height="23" align="cneter" width="5%" nowrap>默认启动</TD>
              <TD height="23" align="cneter" width="5%" nowrap>只启动一次</TD>
              <TD height="23" align="cneter" width="5%" nowrap>操作</TD>
            </TR>
<%
   if (stopTaskCol!=null && stopTaskCol.size()>0)
   {
      int terminateCounter = 0;
      Iterator terminateIter = stopTaskCol.iterator();      
      while (terminateIter.hasNext())
      {         
    	  SysServiceConfig vo = (SysServiceConfig)terminateIter.next();
    	  String serviceId = vo.getServiceId();
    	  String serviceName = vo.getServiceName();
          String serviceClass = vo.getServiceClass();
          String startDefault = vo.getStartDefault();
          String startRunonce = vo.getStartRunonce();
          terminateCounter++;
%>      
            <TR>
              <TD class="data_Td_char" align="center" height="23"><%=terminateCounter%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=serviceName%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=serviceClass%></TD>
              <TD class="data_Td_char" align="left" height="23"><%=startDefault%>&nbsp;</TD>
              <TD class="data_Td_char" align="left" height="23"><%=startRunonce%></TD>
              <TD class="data_Td_char" align="center" height="23"><input type="button" onclick="javascript:startService('<%=serviceId%>');this.disabled=true;" value="启动"></TD>
            </TR>
<%
      }
   }
%>	
          </table>
          
        </div>
     </td>
    </tr>
  </table>
</form>
<script language="javascript"> 
  var tabIndex = "<%=tabIndex%>";
  tp1.setSelectedIndex(tabIndex);
  
  function ev_exit()
  {
     history.back();
  }

  /*实例公共服务对象*/
  //var  fs = new frameService();

  /*初始化工具区域，为创建按钮作准备*/
  /*
  fs.initbutton();
  fs.showtoolbar(); 
  */
  /*创建各种操作按钮*/
  //fs.hidetoolbar();
</script>

</body>
</html>
