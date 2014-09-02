var RoyalCalendar_ISSHOW="0";
var RoyalCalendar_CurrentDay="1";
function RoyalCalendar(){
 this.obj=null;
 this.showTime = null;
}
function IsLeapYear(AYear) 
{
 var b = ((AYear % 4)==0) && ((AYear % 100)!=0) || ((AYear % 400)==0) ; 
 return (b); 
}
function GetDaysOfMonth(AMonth,AYear)  
{
 monthdays = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31)
 days = -1;
 if ( AMonth>=1 && AMonth<=12 ) days = monthdays[AMonth -1 ]; 
 if (AMonth==2 && IsLeapYear(AYear) ) days=29;
 return (days);
}
function GetIntegerValue(Str, pos, len )
{
 result = 0;
 astr = Str.substring(pos, pos+len)
 if ( /^[-+]?([0-9]+)$/.test( astr ) )
 {
  result = astr ;
 } else { result = -1 }
 return result;
}
function CheckIsDateTime( ADtStr , FmtStr )
{
 res=true;
 if ( ADtStr=="" || FmtStr=="")  return false  
 fstr = FmtStr.toUpperCase();
 i =0 ; p = 0; Li = 0; Lp = 0;
 y = -1 ; m = -1; d = -1; h= -1; mi= -1; s=-1;
 while( i < fstr.length )
 {
  fmtch = fstr.substring(i,i+1);  // current
  fmtchn = fstr.substring(i+1,i+2); // next
  adtch = ADtStr.substring(p, p+1); // current
  adtchn = ADtStr.substring(p+1, p+2); // next
  if ( fmtch=="Y" )   // get year
  { 
   if ( fmtchn=="Y" )
   {
    y3=fstr.substring(i+2,i+3); // next
    y4=fstr.substring(i+3,i+4); // next
    if ( y3 =="Y" && y4 =="Y" ){ Li = 4; Lp = 4; }
    else { Li=2; Lp=2; }
    y = GetIntegerValue( ADtStr, p, Lp );
    if ( !( y>=0 && y<=9999 ) ) res = false;
   }else
   {
    if ( fmtch == adtch ) { Li=1; Lp=1 }
    else{ res =false; }
   }
  }else // get m .d . h .mi s
  {
   if ( fmtchn == fmtch ) Li = 2; else Li = 1;
   if ( adtchn >="0" && adtchn <="9") Lp = 2 ;else Lp = 1; 
   avalue = GetIntegerValue( ADtStr, p, Lp);
   if ( fmtch=="M" )
   {
    if ( fmtchn=="I" ) // Minute
    {
     Li=2;  // special
     mi = avalue;
     if ( !( mi>=0 && mi<=59 ) ) res = false;
    }else // default is as Month 
    {
     m = avalue;
     if ( !( m>=1 && m<=12 ) ) res = false;
    }
   }else
   if ( fmtch=="D" )
   {
    d = avalue;
    if ( !( d>=1 && d<=31 ) ) res = false;
   }else
   if ( fmtch=="H" )
   {
    h = avalue;
    if ( !( h>=0 && h<=23 ) ) res = false;
   }else
   if ( fmtch=="S" )
   {
    s = avalue;
    if ( !( s>=0 && s<=59 ) ) res = false;
   }else
   {
    if ( fmtch == adtch ) { Li=1; Lp=1 }
    else{ res =false; }
   }
  }
  i += Li; p+=Lp; //==================>>>!!!
  if (! res ) return res;
 }
 if ( res && i != fstr.length || p != ADtStr.length ) res = false;
 if ( ! ( res &&  m!=-1 && d!=-1 && d<=GetDaysOfMonth(m, y ) ) )  res = false;
 return res;
} 
function RoyalCalendar_OK(){
 var add=0;
 var msg="";
 //var ampm=$("RoyalCalendar_AMPM").value;
 //if(ampm=="PM"){
 // add=12;
 //}
 var calendar=RCalendar;
 var obj=calendar.obj;
 var showTime=calendar.showTime;
 var year=$("RoyalCalendar_Year").value;
 var month=Number($("RoyalCalendar_Month").value);
 var day=RoyalCalendar_CurrentDay;
 var hour=Number($("RoyalCalendar_Hour").value);
 if(hour<0 || hour>24){
 		alert("小时错误");
 		return false;
 	}
 	
 //hour+=add;
 var minute=$("RoyalCalendar_Minute").value;
 if('true' == showTime){
 if(minute<0 ||minute>59){
 		alert("分钟错误");
 		return false;
 	}
 var second=$("RoyalCalendar_Second").value;
 if(minute<0 ||minute>59){
 		alert("秒错误");
 		return false;
 	}
 if(year<10){
  year="0"+year;
 }
 if(month<10){
  month="0"+month;
 }
 if(day<10){
  day="0"+day;
 }
 if(hour<10){
  hour="0"+hour;
 }
 if(minute<10){
  minute="0"+minute;
 }
 if(second<10){
  second="0"+second;
 }
}

 //if(Number(hour)==0&&Number(minute)==0&&Number(second)==0){
 if('true'==showTime){
  obj.value=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
 }else{
  obj.value=year+"-"+month+"-"+day;
 }
 RoyalCalendar_Cancel();
}
function RoyalCalendar_Cancel(){
 $("RoyalCalendar").style.visibility="hidden";
}
function RoyalCalendar_SetValue(date){
 var year=date.getFullYear();
 $("RoyalCalendar_Year").value=year;
 var month=date.getMonth();
 $("RoyalCalendar_Month").value=Number(month)+1;
 var hour=date.getHours();
 //if(hour>12){
 // hour=hour-12;
 // $("RoyalCalendar_AMPM").value="PM";
 //}else{
 // $("RoyalCalendar_AMPM").value="AM";
 //}
 $("RoyalCalendar_Hour").value=hour;
 var minute=date.getMinutes();
 $("RoyalCalendar_Minute").value=minute;
 var second=date.getSeconds();
 $("RoyalCalendar_Second").value=second;
 
}
function RoyalCalendar_IncYear(){
 var div=$("RoyalCalendar_Year");
 div.value++;
 RoyalCalendar_ReSetCalendar();
}
function RoyalCalendar_DecYear(){
 var div=$("RoyalCalendar_Year");
 div.value--;
 RoyalCalendar_ReSetCalendar();
}
function RoyalCalendar_IncHour(){
 var div=$("RoyalCalendar_Hour");
 var hour=div.value;
 hour=(hour)%12+1;
 div.value=hour;
}
function RoyalCalendar_DecHour(){
 var div=$("RoyalCalendar_Hour");
 var hour=div.value;
 hour=hour-1;
 if(hour<0){
  hour=11;
 }
 div.value=hour;
}
function RoyalCalendar_IncMinute(){
 var div=$("RoyalCalendar_Minute");
 var minute=div.value;
 minute++;
 if(minute>59){
  minute=0;
 }
 div.value=minute;
}
function RoyalCalendar_DecMinute(){
 var div=$("RoyalCalendar_Minute");
 var minute=div.value;
 minute--;
 if(minute<0){
  minute=59;
 }
 div.value=minute;
}
function RoyalCalendar_IncSecond(){
 var div=$("RoyalCalendar_Second");
 var second=div.value;
 second++;
 if(second>59){
  second=0;
 }
 div.value=second;
}
function RoyalCalendar_IncAMPM(){
 var div=$("RoyalCalendar_AMPM");
 if(div.value=="AM"){
  div.value="PM";
 }else{
  div.value="AM";
 }
}
function RoyalCalendar_DecAMPM(){
 var div=$("RoyalCalendar_AMPM");
 if(div.value=="AM"){
  div.value="PM";
 }else{
  div.value="AM";
 }
}
function RoyalCalendar_DecSecond(){
 var div=$("RoyalCalendar_Second");
 var second=div.value;
 second--;
 if(second<0){
  second=59;
 }
 div.value=second;
}
function RoyalCalendar_parseDate(str){
 var date=new Date();
 try{
 if(CheckIsDateTime(str,"YYYY-MM-DD HH:mi:ss")){
  var arr=str.split(" ");
  var datestr=arr[0];
  var timestr=arr[1];
  var datearr=datestr.split("-");
  var timearr=timestr.split(":");
  date.setYear(datearr[0]);
  date.setMonth(datearr[1]-1);
  date.setDate(datearr[2]);
  date.setHours(timearr[0]);
  date.setMinutes(timearr[1]);
  date.setSeconds(timearr[2]);
  return date;
 }
 if(CheckIsDateTime(str,"YYYY-MM-DD")){ 
  var datearr=str.split("-");
  date=new Date();
  date.setYear(datearr[0]);
  date.setMonth(datearr[1]-1);
  date.setDate(datearr[2]);
  date.setHours(0);
  date.setMinutes(0);
  date.setSeconds(0);
  return date;
 }
 }catch(e){}
 return date;
}
function RoyalCalendar_SetCalendar(date){
 var totalDays=GetDaysOfMonth(Number(date.getMonth()+1),date.getFullYear());
 var firstday=new Date(date.getYear(),date.getMonth(),1);
 var firstDiv=firstday.getDay()%7+1;
 for(var i=1;i<42;i++){
  $("RoyalCalendar_Day_"+i).innerHTML="";
 }
 for(var i=firstDiv;i<firstDiv+totalDays;i++){
  var t=i-firstDiv+1;
  if((i-firstDiv+1)==date.getDate()){
   $("RoyalCalendar_Day_"+i).innerHTML="<B><div id='day_"+t+"'><a onclick=RoyalCalendar_oneClickSelectDay(this,"+t+") ondblclick=javascript:RoyalCalendar_SelectDay("+t+")>"+t+"</a></div></B>";
  }else{
   $("RoyalCalendar_Day_"+i).innerHTML="<div id='day_"+t+"'><a onclick=RoyalCalendar_oneClickSelectDay(this,"+t+") ondblclick=javascript:RoyalCalendar_SelectDay("+t+")>"+t+"</a></div>";
  }
 }
}
function RoyalCalendar_ReSetCalendar(){
 var day=RoyalCalendar_CurrentDay;
 var month=$("RoyalCalendar_Month").value;
 var year=$("RoyalCalendar_Year").value;
 var date=new Date(year,month-1,day,0,0,0);
 RoyalCalendar_SetCalendar(date);
}
RoyalCalendar.prototype.show=function(obj,b){
 this.obj=obj;
 this.showTime = b;
 var date=RoyalCalendar_parseDate(obj.value);
 RoyalCalendar_SetValue(date);
 RoyalCalendar_SetCalendar(date);
// RoyalCalendar_ReSetCalendar();
 $("RoyalCalendar").style.left=event.x;
 $("RoyalCalendar").style.top=event.y;
 $("RoyalCalendar").style.zindex=100;

 $("RoyalCalendar").style.position="absolute";
 $("RoyalCalendar").style.visibility="visible";
 RoyalCalendar_ISSHOW="1";
}
RoyalCalendar.prototype.init=function(){
 var text="";
 text+="<div id=\"RoyalCalendar\" align=center>";
 text+="<table border=0 id=\"RoyalCalendar_TopTable\" width=100%>";
 text+="<!----年月----->";
 text+="<tr>";
 text+="<td><select id=\"RoyalCalendar_Month\" onchange=\"RoyalCalendar_ReSetCalendar()\"><option value='1'>一月<option value='2'>二月<option value='3'>三月<option value='4'>四月<option value='5'>五月<option value='6'>六月<option value='7'>七月<option value='8'>八月<option value='9'>九月<option value='10'>十月<option value='11'>十一月<option value='12'>十二月</select></td>";
 text+="<td nowrap align=right>";
 text+="<input readonly onchange=\"RoyalCalendar_ReSetCalendar()\" type=text size=3 value=\"2006\" id=\"RoyalCalendar_Year\" onblur=\"if(this.value){}\">";
 text+="</td>";
 text+="<td align=left>";
 text+="<div><input type=button value=\"+\" class=\"RoyalSmallButton\" onclick=\"RoyalCalendar_IncYear()\"></div>";
 text+="<div><input type=button value=\"-\" class=\"RoyalSmallButton\" onclick=\"RoyalCalendar_DecYear()\"></div>";
 text+="</td>";
 text+="</tr>";
 text+="<!----年月----->";
 text+="<!----日历----->";
 text+="<td align=center colspan=3>";
 text+="<table border=0 id=\"RoyalCalendar_CalendarTable\" align=center>";
 text+="<Tr>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\"><font color=red>日</font></td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">一</td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">二</td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">三</td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">四</td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">五</td>";
 text+=" <td style=\"border-bottom:solid black 1px;cursor:crosshair\">六</td>";
 text+="</tr>";
 for(var i=0;i<6;i++){
 text+="<tr>";
 text+=" <td align=center class=\"RoyalCalendar_Sunday_Normal\" onmouseover='this.className=\"RoyalCalendar_Sunday_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Sunday_Normal\"'><font color=red><div id=\"RoyalCalendar_Day_"+(i*7+1)+"\">&nbsp;</div></font></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+2)+"\">&nbsp;</div></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+3)+"\">&nbsp;</div></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+4)+"\">&nbsp;</div></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+5)+"\">&nbsp;</div></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+6)+"\">&nbsp;</div></td>";
 text+=" <td align=center class=\"RoyalCalendar_Day_Normal\" onmouseover='this.className=\"RoyalCalendar_Day_MouseOver\"' onmouseout='this.className=\"RoyalCalendar_Day_Normal\"'><div id=\"RoyalCalendar_Day_"+(i*7+7)+"\">&nbsp;</div></td>";
 text+="</tr>";
 }
 text+="</table>";
 text+="</td>";
 text+="</tr>";
 text+="<!----日历----->";
 text+="<tr>";
 text+="<td colspan=3>";
 text+="<table width=100 border=0 cellspadding=1 cellspacing=1>";
 text+="<tr>";
 text+="<td align=center>";
 text+="<input type=text size=1 id=\"RoyalCalendar_Hour\" value=\"00\">";
 text+="</td>";
 text+="<td align=center style=\"font-size:9pt\">:</td>";
 text+="<td align=center>";
 text+="<input size=1 type=text id=\"RoyalCalendar_Minute\" value=\"00\">";
 text+="</td>";
 text+="<td align=center style=\"font-size:9pt\">:</td>";
 text+="<td align=center>";
 text+="<input type=text size=1 id=\"RoyalCalendar_Second\" value=\"00\">";
 text+="</td>";
 text+="<td align=center style=\"font-size:9pt\">&nbsp;</td>";
 //text+="<td align=center>";
 //text+="<input type=text size=1 id=\"RoyalCalendar_AMPM\" value=\"AM\">";
 //text+="</td>";
 text+="<td>";
 text+="<input type=button id=\"RoyalOKButton\" value=\"确定\" onclick=\"RoyalCalendar_OK()\">";
 text+="</td>";
 text+="</tr>";
 text+="<tr>";
 text+="<td align=center><input type=button value=\"+\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_IncHour()\"><input type=button value=\"-\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_DecHour()\"></td>";
 text+="<td></td>";
 text+="<td align=center><input type=button value=\"+\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_IncMinute()\"><input type=button value=\"-\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_DecMinute()\"></td>";
 text+="<td></td>";
 text+="<td align=center><input type=button value=\"+\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_IncSecond()\"><input type=button value=\"-\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_DecSecond()\"></td>";
 text+="<td></td>";
 //text+="<td align=center><input type=button value=\"+\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_IncAMPM()\"><input type=button value=\"-\" class=\"RoyalSmallButton2\" onclick=\"RoyalCalendar_DecAMPM()\"></td>";
 text+="<td align=center>";
 text+="<input type=button id=\"RoyalCancelButton\" value=\"取消\" onclick=\"RoyalCalendar_Cancel()\">";
 text+="</td>";
 text+="</tr>";
 text+="</table>";
 text+="</td>";
 text+="</tr>";
 text+="</table>";
 text+="</div>";
 document.writeln(text);
}
function RoyalCalendar_SelectDay(day){
 RoyalCalendar_CurrentDay=day;
 RoyalCalendar_OK();
}
function RoyalCalendar_oneClickSelectDay(obj,day){
	document.getElementById("day_"+RoyalCalendar_CurrentDay).style.backgroundColor = "";
 	RoyalCalendar_CurrentDay=day;
 	document.getElementById("day_"+day).style.backgroundColor = "#FF00FF";
}
var RCalendar=new RoyalCalendar();
RCalendar.init();