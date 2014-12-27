<%@ page contentType="text/html; charset=GBK"%>
<HTML>
<HEAD>
<TITLE>variety</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link rel="stylesheet" href="/css/main.css" type="text/css">
<link rel="stylesheet" href="/css/imgurl.css" type="text/css">
<script type="text/javascript">
function hiddenMenu(obj){
     if(window.parent.document.all.main.cols == "0,8,*"){
	    obj.src = "/images/main/left_arrow03.gif";	      
	    window.parent.document.all.main.cols = "185,8,*";
	 }else{
		obj.src = "/images/main/left_arrow04.gif";
	    window.parent.document.all.main.cols = "0,8,*";	    
	 }    
}
</script>
</HEAD>

<BODY leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	<TABLE wdith="8" height="100%" border="0" cellspacing="0"
		cellpadding="0" align="left">
		<TR>
			<td width="8" background="/images/main/left_bg02.gif" height="100%"
				align="center"><img class="variety" onclick="hiddenMenu(this)"
				src="/images/main/left_arrow03.gif" width="8" height="61"></td>
		</TR>
	</TABLE>
</BODY>
</HTML>