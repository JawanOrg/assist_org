
/*公共服务对象*/
/*版本 v.1.2
 *作者 zengjunjia 
 *最后修改时间 2006-03-15
 */
function frameService(){

    this.top     = null;     //TOP窗口句柄
    this.left    = null;     //left窗口句柄
    this.toolbar = null;     //工具栏窗口句柄
	this.footer  = null;     //页脚窗口句柄
    /****************初始公共服务对象************************/
    try{
        for(var i = 0 ; i < window.top.frames.length;  i++){
			if( window.top.frames(i).name == "top")     this.top = window.top.frames(i);
			if( window.top.frames(i).name == "footer")  this.footer = window.top.frames(i);
			if(window.top.frames(i).name == "main"){
				for(var n = 0; n < window.top.frames(i).frames.length;n++){
					if( window.top.frames(i).frames(n).name == "left") this.left = window.top.frames(i).frames(n);
					if( window.top.frames(i).frames(n).name == "worktable"){ 
						for(var k = 0 ; k< window.top.frames(i).frames(n).frames.length; k++){
							if(window.top.frames(i).frames(n).frames(k).name == "toolbar"){
							    this.toolbar = window.top.frames(i).frames(n).frames(k);
								break;
							}
					    }
				    }
				}	
			}
       }
    }catch (e){
        alert("frameservice对象初始化出现错误，原因是:" + e.description);
    }
    /***************初始公共服务对象结束**********************/

    /***************设置当前位置提示信息**************************/
    this.setCurrentLocation = function(sarg){
        try{
            if (this.top == null)
                return ;
            this.top.document.all.clocation.innerText = "当前位置" + sarg;
        }
        catch (e){
            alert("[设置当前位置提示信息]出现错误，原因是:" + e.description);
        }

    }
    /***************设置当前位置提示信息结束s**************************/

    /***************设置当前用户名**************************/
    this.setCurrentUserName = function(sarg){
        try{
            if (this.top == null)
                return ;
            this.top.document.all.currentuser.innerText = sarg;
        }
        catch (e){
            alert("[设置当前用户名]出现错误，原因是:" + e.description);
        }

    }
	/************** 按钮创建前初始化工作******************/
   this.initbutton = function (){
	  if (this.toolbar.toolBar.rows.length != 1) return;
         for(var i = 1; i< this.toolbar.toolBar.rows(0).cells.length;i++){
		         this.toolbar.toolBar.rows(0).deleteCell(i);
				 i--;
		 }
       
   }
    /******************获取客户端当前日期*******/
  this.getdate = function(arg){
      var format =  "-";
      if(arg != null && typeof(arg) == "string")  format = arg;
      var s ="";
      var d = new Date();
      s += d.getYear() +format;
      s += ((d.getMonth() + 1)>=10?(d.getMonth() + 1):"0"+(d.getMonth() + 1)) + format;
      s += d.getDate()>=10?d.getDate():"0"+d.getDate();  
      return(s);
  }
  /*隐藏工具条*/
  this.hidetoolbar = function(){
      this.toolbar.parent.document.all.workframe.rows = "0,*";
  }
  /*显示工具条*/
  this.showtoolbar = function(){
      this.toolbar.parent.document.all.workframe.rows = "32,*";
  }
   /******************************创建工具条的按钮*********************/
   this.createbutton = function(ispic ,imgurl,functionname,name){
	   var otd ;
	   try{
		   if(this.toolbar.toolBar.rows.length == 1){
				otd = this.toolbar.toolBar.rows(0).insertCell();
				var temp = "";
				otd.onclick = functionname; 
				if (ispic == true){
					temp = temp +"<img name='Image15' border='0' src='" + imgurl + "' width='20' height='20' align='absmiddle'>";
				}else{
				    temp = "&nbsp;";
				}
				otd.insertAdjacentHTML("beforeEnd",temp + "&nbsp;" +  name +  "</a>");   
				this.toolbar.createButton(otd);
			}
	   }catch(e){
	       alert( "JavaScript脚本运行错误：" + e.description);
	   }
   }
}
