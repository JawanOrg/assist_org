	/************************************************************************************************************
	(C) www.dhtmlgoodies.com, October 2005

	This is a script from www.dhtmlgoodies.com. You will find this and a lot of other scripts at our website.

	Terms of use:
	You are free to use this script as long as the copyright message is kept intact. However, you may not
	redistribute, sell or repost it without our permission.

	Updated:

		March, 14th, 2006 - Create new tabs dynamically
		March, 15th, 2006 - Dynamically delete a tab
		2008ÔøΩÔøΩ7ÔøΩÔøΩ13ÔøΩÔøΩ4:20:00 - ÔøΩﬁ∏ÔøΩÔøΩÔøΩ ΩÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩÕ¨ÔøΩÔøΩÔøΩÔøΩÔøΩ(title)ÔøΩÔøΩtabÔøΩÔøΩ ±ÔøΩÔøΩÔøΩ⁄¥ÔøΩÔøΩÔøΩÔøΩÔøΩtab,÷ªÔøΩÔøΩÃ¨ÔøΩƒ±ÔøΩÔøΩtabÔøΩÔøΩÔøΩÔøΩ by ÔøΩÔøΩ”±ÔøΩÔøΩ
	    2008ÔøΩÔøΩ7ÔøΩÔøΩ14ÔøΩÔøΩ0:19:02 - ÔøΩÔøΩ ºÔøΩÔøΩÔøΩÔøΩ ±ÔøΩÔøΩ,ÔøΩÔøΩÔøΩ‘∏ÔøΩÔøΩ“≥ÔøΩÔøΩtabÔøΩÔøΩÔøΩÔøΩ,ÔøΩÔøΩÔøΩÔøΩÔøΩÿ∏ÔøΩÔøΩÔøΩÔøΩÔøΩ;ÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩ‘∂ÔøΩÔøΩÔøΩÔøΩtabÔøΩ¬ºÔøΩ

	Thank you!

	www.dhtmlgoodies.com
	Alf Magne Kalleland

	************************************************************************************************************/
	var textPadding = 3; // Padding at the left of tab text - bigger value gives you wider tabs
	var strictDocType = true;
	var tabView_maxNumberOfTabs = 6;	// Maximum number of tabs

	var oTab_id = "";

	/* Don't change anything below here */
	var tab_tabObj = new Array();
	var activeTabIndex = new Array();
	var MSIE = navigator.userAgent.indexOf('MSIE')>=0?true:false;

	var regExp = new RegExp(".*MSIE ([0-9]\.[0-9]).*","g");
	var navigatorVersion = navigator.userAgent.replace(regExp,'$1');

	var ajaxObjects = new Array();
	var tabView_countTabs = new Array();
	var tabViewHeight = new Array();
	var tabDivCounter = 0;
	var closeImageHeight = 8;	// Pixel height of close buttons
	var closeImageWidth = 8;	// Pixel height of close buttons


	function setPadding(obj,padding){
		var span = obj.getElementsByTagName('SPAN')[0];
		span.style.paddingLeft = padding + 'px';
		span.style.paddingRight = padding + 'px';
	}

	function closeActiveTab(parentId,index){
		if(activeTabIndex[parentId]>=0){
			if(index=='undefined'){
				deleteTab(false,activeTabIndex[parentId],parentId);
			}else{
				if(activeTabIndex[parentId]>index){
					deleteTab(false,activeTabIndex[parentId],parentId);
				}
			}
		}
	}

	function showTab(parentId,tabIndex)
	{
		var parentId_div = parentId + "_";
		if(!document.getElementById('tabView' + parentId_div + tabIndex)){
			return;
		}
		if(activeTabIndex[parentId]>=0){
			if(activeTabIndex[parentId]==tabIndex){
				return;
			}

			var obj = document.getElementById('tabTab'+parentId_div + activeTabIndex[parentId]);

			obj.className='tabInactive';
			/*
			var img = obj.getElementsByTagName('IMG')[0];
			if(img.src.indexOf('tab_')==-1)img = obj.getElementsByTagName('IMG')[1];
			img.src = 'images/tab_right_inactive.gif';
			*/
			document.getElementById('tabView' + parentId_div + activeTabIndex[parentId]).style.display='none';
		}

		var thisObj = document.getElementById('tabTab'+ parentId_div +tabIndex);

		thisObj.className='tabActive';
		/*
		var img = thisObj.getElementsByTagName('IMG')[0];
		if(img.src.indexOf('tab_')==-1)img = thisObj.getElementsByTagName('IMG')[1];
		img.src = 'images/tab_right_active.gif';
		*/
		document.getElementById('tabView' + parentId_div + tabIndex).style.display='block';
		activeTabIndex[parentId] = tabIndex;


		var parentObj = thisObj.parentNode;
		var aTab = parentObj.getElementsByTagName('DIV')[0];
		countObjects = 0;
		var startPos = 2;
		var previousObjectActive = false;
		while(aTab){
			if(aTab.tagName=='DIV'){
				if(previousObjectActive){
					previousObjectActive = false;
					startPos-=2;
				}
				if(aTab==thisObj){
					startPos-=2;
					previousObjectActive=true;
					//setPadding(aTab,textPadding+1);
				}else{
					//setPadding(aTab,textPadding);
				}

				//aTab.style.left = startPos + 'px';
				countObjects++;
				startPos+=2;
			}
			aTab = aTab.nextSibling;
		}

		return;
	}

	function tabClick(event)
	{
		var idArray = this.id.split('_');
		showTab(this.parentNode.parentNode.id,idArray[idArray.length-1].replace(/[^0-9]/gi,''));

	}

	function rolloverTab()
	{
		if(this.className.indexOf('tabInactive')>=0){
			this.className='inactiveTabOver';
			/*
			var img = this.getElementsByTagName('IMG')[0];
			if(img.src.indexOf('tab_')<=0)img = this.getElementsByTagName('IMG')[1];
			img.src = 'images/tab_right_over.gif';
			*/
		}

	}
	function rolloutTab()
	{
		if(this.className ==  'inactiveTabOver'){
			this.className='tabInactive';
			/*
			var img = this.getElementsByTagName('IMG')[0];
			if(img.src.indexOf('tab_')<=0)img = this.getElementsByTagName('IMG')[1];
			img.src = 'images/tab_right_inactive.gif';

			*/
		}

	}

	function hoverTabViewCloseButton()
	{
		this.src = this.src.replace('close.gif','close_over.gif');
	}

	function stopHoverTabViewCloseButton()
	{
		this.src = this.src.replace('close_over.gif','close.gif');
	}

	function initTabs(mainContainerID,tabTitles,activeTab,width,height,closeButtonArray,additionalTab)
	{
		if(!closeButtonArray)closeButtonArray = new Array();
		if(!additionalTab || additionalTab=='undefined'){
			tab_tabObj[mainContainerID] = document.getElementById(mainContainerID);
			width = width + '';
			if(width.indexOf('%')<0)width= width + 'px';
			tab_tabObj[mainContainerID].style.width = width;
			height = height + '';
			if(height.length>0){
				if(height.indexOf('%')<0)height= height + 'px';
				tab_tabObj[mainContainerID].style.height = height;
			}
			tabViewHeight[mainContainerID] = height;
			var tabDiv = document.getElementById(mainContainerID+'tab_tabPane');
			if(tabDiv==null){
				tabDiv = document.createElement('DIV');
				var firstDiv = tab_tabObj[mainContainerID].getElementsByTagName('DIV')[0];

				tab_tabObj[mainContainerID].insertBefore(tabDiv,firstDiv);
			}
			tabDiv.className = 'tab_tabPane';
			tabView_countTabs[mainContainerID] = 0;
		}else{
			var tabDiv = tab_tabObj[mainContainerID].getElementsByTagName('DIV')[0];
			var firstDiv = tab_tabObj[mainContainerID].getElementsByTagName('DIV')[1];
			height = tabViewHeight[mainContainerID];
			activeTab = tabView_countTabs[mainContainerID];
		}

		for(var no=0;no<tabTitles.length;no++){
			var aTab = document.getElementById('tabTab' + mainContainerID + "_" +  (no + tabView_countTabs[mainContainerID]));
			if(aTab==null){
				aTab = document.createElement('DIV');
				aTab.className='tabInactive';
				aTab.id = 'tabTab' + mainContainerID + "_" +  (no + tabView_countTabs[mainContainerID]);
				tabDiv.appendChild(aTab);
				var table = document.createElement('table');
				table.border=0;
				table.cellSpacing=0;
				table.cellPadding=0;
				table.style.fontSize=13;
				var row = table.insertRow();
				var c1 = row.insertCell(0);
				c1.className="tabpaneleft2";
				var c2=row.insertCell(1);
				c2.innerHTML="<span>"+tabTitles[no]+"</span>";
				c2.className="tabpanebg2";
				var c3=row.insertCell(2);
				c3.className="tabpaneright2";
				aTab.appendChild(table);
				if(closeButtonArray[no]){
					var closeButton = document.createElement('IMG');
					closeButton.src = '/js/tab-view/images/close.gif';
					closeButton.height = closeImageHeight + 'px';
					closeButton.width = closeImageHeight + 'px';
					closeButton.setAttribute('height',closeImageHeight);
					closeButton.setAttribute('width',closeImageHeight);
					closeButton.style.position='absolute';
					closeButton.style.top = '5px';
					closeButton.style.right = '5px';
					closeButton.onmouseover = hoverTabViewCloseButton;
					closeButton.onmouseout = stopHoverTabViewCloseButton;
					var deleteTxt = tabTitles[no]+'';
					closeButton.onclick = function(){ deleteTab(deleteTxt,null,mainContainerID) };
					aTab.appendChild(closeButton);
				}
			}
			aTab.onmouseover = rolloverTab;
			aTab.onmouseout = rolloutTab;
			Event.observe(aTab,'click',tabClick)
			aTab.className='tabInactive';
		}
		var tabs = tab_tabObj[mainContainerID].getElementsByTagName('DIV');
		var divCounter = 0;
		for(var no=0;no<tabs.length;no++){
			if(tabs[no].className=='tab_aTab' && tabs[no].parentNode.id == mainContainerID){
				if(height.length>0)tabs[no].style.height = height;
				tabs[no].style.display='none';
				tabs[no].id = 'tabView' + mainContainerID + "_" + divCounter;
				divCounter++;
			}
		}
		tabView_countTabs[mainContainerID] = tabView_countTabs[mainContainerID] + tabTitles.length;
		showTab(mainContainerID,activeTab);
		return activeTab;
	}

	function showAjaxTabContent(ajaxIndex,parentId,tabId,tabTitle,callback)
	{
		var thisObj = document.getElementById('tabTab'+ parentId+'_' +tabId);
		var span = thisObj.getElementsByTagName('SPAN')[0];
		span.innerHTML=tabTitle;
		var obj = document.getElementById('tabView'+parentId + '_' + tabId);
		reInnerHTML(obj,ajaxObjects[ajaxIndex].response)
		//obj.innerHTML = ajaxObjects[ajaxIndex].response;
		if (callback && window[callback]) {
			window[callback]();
		}
	}

	function resetTabIds(parentId)
	{
		var tabTitleCounter = 0;
		var tabContentCounter = 0;


		var divs = tab_tabObj[parentId].getElementsByTagName('DIV');


		for(var no=0;no<divs.length;no++){
			if(divs[no].className=='tab_aTab'){
				divs[no].id = 'tabView' + parentId + '_' + tabTitleCounter;
				tabTitleCounter++;
			}
			if(divs[no].id.indexOf('tabTab')>=0){
				divs[no].id = 'tabTab' + parentId + '_' + tabContentCounter;
				tabContentCounter++;
			}
		}

		tabView_countTabs[parentId] = tabContentCounter;
	}

	/**
	*ÔøΩÔøΩÔøΩÔøΩ“ªÔøΩÔøΩtab,ÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩ–∂ÔøΩÔøΩ«∑ÔøΩÔøΩÔøΩÔøΩÔøΩÔøΩ«∏ƒ±ÔøΩÔøΩÔøΩ«∞ÔøΩ⁄µÔøΩÔøΩÔøΩÔøΩÔøΩ
	**/
	function createNewTab(parentId,tabTitle,tabContent,tabContentUrl,closeButton, callback)
	{
		if(tabView_countTabs[parentId]>=tabView_maxNumberOfTabs)return;	// Maximum number of tabs reached - return
		var index = getTabIndexByTitle(parentId,tabTitle);
		var tabId;
		if(index==-1){
			var div = document.createElement('DIV');
			div.className = 'tab_aTab';
			tab_tabObj[parentId].appendChild(div);
			tabId = initTabs(parentId,Array(tabTitle),0,'','',Array(closeButton),true);
		}else{
			tabId = index[1];
			showTab(parentId,tabId);
		}
		//if(tabContent)div.innerHTML = tabContent;
		var obj = document.getElementById('tabView'+parentId + '_' + tabId);
		if(tabContent){
			reInnerHTML(obj,tabContent);
		}
		if(tabContentUrl){
			var ajaxIndex = ajaxObjects.length;
			ajaxObjects[ajaxIndex] = new sack();
			ajaxObjects[ajaxIndex].requestFile = tabContentUrl;	// Specifying which file to get
			var obj = document.getElementById('tabView'+parentId + '_' + tabId);
			obj.innerHTML = " ˝æ›º”‘ÿ÷–....";
			var thisObj = document.getElementById('tabTab'+ parentId+'_' +tabId);
			var span = thisObj.getElementsByTagName('SPAN')[0];
			span.innerHTML="º”‘ÿ÷–...";
			ajaxObjects[ajaxIndex].onCompletion = function(){ showAjaxTabContent(ajaxIndex,parentId,tabId,tabTitle, callback); };	// Specify function that will be executed after file has been found
			ajaxObjects[ajaxIndex].runAJAX();		// Execute AJAX function

		}

	}

	function getTabIndexByTitle(mainId,tabTitle)
	{
		var regExp = new RegExp("(.*?)&nbsp.*$","gi");
		tabTitle = tabTitle.replace(regExp,'$1');
		var divs = tab_tabObj[mainId].getElementsByTagName('DIV');
		for(var no=0;no<divs.length;no++){
			if(divs[no].id.indexOf('tabTab')>=0){
				var span = divs[no].getElementsByTagName('SPAN')[0];
				var regExp2 = new RegExp("(.*?)&nbsp.*$","gi");
				var spanTitle = span.innerHTML.replace(regExp2,'$1');
				if(spanTitle == tabTitle){
					var tmpId = divs[no].id.split('_');
					return Array(mainId,tmpId[tmpId.length-1].replace(/[^0-9]/g,'')/1);
				}
			}
		}
		return -1;
	}

	/* Call this function if you want to display some content from external file in one of the tabs
	Arguments: Title of tab and relative path to external file */

	function addAjaxContentToTab(mainId,tabTitle,tabContentUrl)
	{
		var index = getTabIndexByTitle(mainId,tabTitle);
		if(index!=-1){
			var ajaxIndex = ajaxObjects.length;

			tabId = index[1];
			parentId = index[0];
			showTab(parentId,tabId);

			ajaxObjects[ajaxIndex] = new sack();
			ajaxObjects[ajaxIndex].requestFile = tabContentUrl;

			ajaxObjects[ajaxIndex].onCompletion = function(){ showAjaxTabContent(ajaxIndex,parentId,tabId,tabTitle); };
			ajaxObjects[ajaxIndex].runAJAX();

		}
	}


	/**
	*…æÔøΩÔøΩtab
	**/
	function deleteTab(tabLabel,tabIndex,parentId)
	{
		if(tabLabel){
			var index = getTabIndexByTitle(parentId,tabLabel);
			if(index!=-1){
				deleteTab(false,index[1],index[0]);
			}
		}else if(tabIndex>=0){
			if(document.getElementById('tabTab' + parentId + '_' + tabIndex)){
				var obj = document.getElementById('tabTab' + parentId + '_' + tabIndex);
				var id = obj.parentNode.parentNode.id;
				obj.parentNode.removeChild(obj);
				var obj2 = document.getElementById('tabView' + parentId + '_' + tabIndex);
				obj2.parentNode.removeChild(obj2);
				resetTabIds(parentId);
				activeTabIndex[parentId]=-1;
				showTab(parentId,'0');
			}
		}
	}

	function addEvent(obj, evType, fn, useCapture)   {
	    if (!useCapture) useCapture = false;
	    if (obj.addEventListener){
	        obj.addEventListener(evType, fn, useCapture);
	    }else {
	        //-- event capturing not supported
	        if (useCapture) {
	            alert('This browser does not support event capturing!');
	        }else{
	            var evTypeRef = '__' + evType;
	            if (!obj[evTypeRef]){
	                obj[evTypeRef] = [];
	                var orgEvent = obj['on'+evType];
	                if (orgEvent) obj[evTypeRef][0] = orgEvent;
	                obj['on'+evType] = IEEventHandler;
	            } else {
	                for (var ref in obj[evTypeRef]){
	                    if (obj[evTypeRef][ref] === fn) return;
	                }
	            }
	            obj[evTypeRef][obj[evTypeRef].length] = fn;
	        }
	    }
	}

	function removeEvent(obj, evType, fn, useCapture){
	    if (!useCapture) useCapture = false;
	    if (obj.removeEventListener){
	        obj.removeEventListener(evType, fn, useCapture);
	    }else {
	        var evTypeRef = '__' + evType;
	        if (obj[evTypeRef]){
	            for (var ref in obj[evTypeRef]){
	                if (obj[evTypeRef][ref] === fn){
	                    try{
	                        delete obj[evTypeRef][ref];
	                    } catch(e){
	                        obj[evTypeRef][ref] = null;
	                    }
	                    return;
	                }
	            }
	        }
	    }
	}

	function IEEventHandler(e){
	    e = e || window.event;
	    var evTypeRef = '__' + e.type;
	    if (this[evTypeRef])
	    {
	        for (var ref in this[evTypeRef])
	        {
	            if (Function.call)
	            {
	                this[evTypeRef][ref].call(this, e);
	            }
	            else
	            {
	                this.__fn = this[evTypeRef][ref];
	                this.__fn(e);
	                this.__fn = null;
	            }
	        }
	    }
	}

