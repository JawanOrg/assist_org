
this.popup = function(msg, tablePara)
{
  var tblWidth = "";
  var tblHeight = ""; 
  var td1Width = "";
  var td2Width = "";
    
  if (tablePara!=null && tablePara!="")
  {
    try
    {
      var paraArr = tablePara.split(" "); 
      for(i=0;i<=paraArr.length-1;i++)
      {
        var paraStr = paraArr[i];
        var para = paraStr.split(":");
        if (para.length==2)
        {
          var paraName = para[0];
          var paraValue = para[1];
          if (paraName=="tblWidth")
            tblWidth = paraValue;
          else if (paraName=="tblHeight")
            tblHeight = paraValue;  
          else if (paraName=="td1Width")
            td1Width = paraValue;  
          else if (paraName=="td2Width")
            td2Width = paraValue;
        }
      }
    }
    catch(e)
    {
	
    }
  }

  if (tblWidth=="")
    tblWidth = "300";
  if (tblHeight=="")
  {
    var msgArr =msg.split("|");
    if (msgArr!=null)
      tblHeight = 25 * msgArr.length + "";
    else
      tblHeight = "300";
  } 
  if (td1Width=="") 
    td1Width = "30%";
  if (td2Width=="")
    td2Width = "70%";

  //var odiv = document.all.item("myDiv");
  var odiv = document.getElementById("myDiv");
  if(odiv == null)
  {
    odiv = window.document.createElement("DIV");
    odiv.id = "myDiv";
    odiv.style.position = "absolute";
    odiv.style.display = "none";
    odiv.innerHTML = ""; 
    window.document.body.appendChild(odiv); 
  }

  var strArr=new Array();
  var tempArr=new Array();
  strArr=msg.split("|");
  var content="<table id=info width="+tblWidth+" height="+tblHeight+" border=1 cellpadding=3 cellspacing=0 bordercolorlight=BLUE bordercolordark=BLUE bgcolor=BLUE frame=box id=powergrid style=\"FONT-SIZE: 12px\" pcolor=BLUE>";
  content=content+"<tbody>";
  var count = 0;
  for(i=0;i<=strArr.length-1;i++)
  {
    var trBgColor = "#FFFFFF";
    tempArr=strArr[i].split("^");
    //if (tempArr[1]!="")
    //{
      if (count%2==0)
        trBgColor = "#F4F4F4";
      content=content+"<tr>";
      content=content+"<td width="+td1Width+" noWrap bgcolor="+trBgColor+" height=20><div align=left><font color=#0000CC>"+tempArr[0]+"</font></div></td>"
      content=content+"<td width="+td2Width+" bgcolor="+trBgColor+" height=20><font color=#0000FF>"+tempArr[1]+"</font></td>";
      content=content+"</tr>";
      count = count + 1;
    //}
  }
  content=content+"</tbody>";
  content=content+"</table>";

  myDiv.innerHTML = content;

  myDiv.style.pixelLeft = parseInt(window.event.clientX); 
  myDiv.style.pixelTop = parseInt(window.event.clientY) + parseInt(document.body.scrollTop);
  if((parseInt(window.event.screenX)  + parseInt(info.width) ) > (parseInt(window.screen.availWidth)))
  {
    myDiv.style.pixelLeft = parseInt(window.event.clientX) - parseInt(info.width) ;
  }
  if((parseInt(window.event.screenY)  + parseInt(info.height) ) > (parseInt(window.screen.availHeight)))
  {
    myDiv.style.pixelTop = parseInt(window.event.clientY) + parseInt(document.body.scrollTop) - parseInt(info.height);
  }

  myDiv.style.display = "";
}


this.closePopup = function()
{
  try
  {
    document.all.myDiv.style.display ="none";    
  }
  catch(e)
  {
	
  }
}
