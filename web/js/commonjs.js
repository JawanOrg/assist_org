
/* ���ýű�,�� Prototype version 1.5.0_rc1Ϊ��
 * ���� 2007-01-06
 *
/*--------------------------------------------------------------------------*/
/*------------------------checkbox��-------------------------*/
/*
*ȫѡ(all),��ѡ(opp),ȡ��(none)  formstrΪForm���,��form1,list.form1  inputnameΪcheckbox���,selectmodeΪѡ��ģʽ
*����ȫ��Ϊstring
*/
function selectCheckBox(formstr, inputname, selectmode) {
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	checkboxarray.each(function (checkbox) {
		if (selectmode == "all") {
			checkbox.checked = true;
		}
		if (selectmode == "opp") {
			checkbox.checked = !checkbox.checked;
		}
		if (selectmode == "none") {
			checkbox.checked = false;
		}
	});
}
/*
*���ر�ѡcheckboxֵ,��strΪ�ָ��,laststr(true,false)�Ƿ���Ҫ���һ��ָ��
*laststrΪboolean
*/
function getSelectCheckboxValue(formstr, inputname, str) {
	var checkvalue = "";
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			checkvalue += checkbox.value + str;
		}
	});
	checkvalue = checkvalue.substr(0, checkvalue.length - 1);
	return checkvalue;
}

function getSelectCheckboxId(formstr, inputname, str) {
	var checkvalue = "";
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			checkvalue += checkbox.id + str;
		}
	});
	checkvalue = checkvalue.substr(0, checkvalue.length - 1);
	return checkvalue;
}

function getSelectCheckboxValueArr(formstr, inputname) {
	var checkvalue = "";
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	var resultArray = new Array();
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			resultArray[resultArray.length] = checkbox.value;
		}
	});
	return resultArray;
}
function getSelectValidCheckboxValue(formstr, inputname, str, invalidvalue, msg) {
	var checkvalue = "";
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	var valid = "0";
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			var value = $(checkbox.value + "_hidden").value;
			if (value == invalidvalue) {
				valid = "1";
			}
			checkvalue += checkbox.value + str;
		}
	});
	if (valid == "1") {
		alert(msg);
		return false;
	}
	checkvalue = checkvalue.substr(0, checkvalue.length - 1);
	return checkvalue;
}
/*����Ƿ�ѡ��һ��checkbox
*/
function isSelectOneChecbox(formstr, inputname) {
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	var i = 0;
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			i++;
			if (i >= 2) {
				return false;
			}
		}
	});
	if (i == 0) {
		return false;
	}
	return true;
}
function getSelectCheckboxHiddenValue(formstr, inputname, str, laststr, str2) {
	var checkvalue = "";
	var list = Form.getInputs(formstr, "checkbox", inputname);
	var checkboxarray = $A(list);
	checkboxarray.each(function (checkbox) {
		if (checkbox.checked) {
			var t = formstr.lastIndexOf(".");
			var formstrs = formstr.substring(0, t);
			var ops = formstrs + ".document.getElementById('" + checkbox.value + str2 + "').value";
			var v = eval(ops);
			checkvalue += v + str;
		}
	});
	if (checkvalue != "" && !laststr) {
		checkvalue = checkvalue.substr(0, checkvalue.length - 1);
	}
	return checkvalue;
}
function selectcheckbox(id) {
	$(id).checked = !$(id).checked;
}
/*--------------------------form��---------------------------*/
/*
*disable����formԪ��
*����Ϊstring
*/
function disableForm(formstr) {
	if(formstr==undefined||formstr==''){
		$A(document.all).each(function (form) {
		Form.disable(form);
	});
	}else{
		Form.disable(formstr);

	}
}
/*
*enable����formԪ��
*����Ϊstring
*/
function enableForm(formstr) {
if(formstr==undefined||formstr==''){
		$A(document.all).each(function (form) {
		Form.enable(form);
	});
	}else{
		Form.enable(formstr);

	}
}
/*--------------------------Date��---------------------------*/
var MinMilli = 1000 * 60;
var HrMilli = MinMilli * 60;
var DyMilli = HrMilli * 24;
/*
*��ԭ��ʱ�����������,�����ո�ʽ����,day����,����Ϊ��λ,����Ϊ����
*����dateΪʱ���ַ�,��ʽΪYYYY-MM-DD[ HH:mm:ss] day����  dateFormat����ʽ YYYY-MM-DD[ HH:mm:ss]
*/
function addTime(date, day, dateFormat) {//YYYY-MM-DD HH:mm
	var str1 = date;
	var str11 = new Date(str1.replace("-", ",")).getTime();
	var totalDyMilli = day * DyMilli;
	var d;
	d = new Date();
	d.setTime(str11 + totalDyMilli);
	return d.Format(dateFormat);
}
/*
*��ʽ��ʱ��
*/
Date.prototype.Format = function (formatStr) {
	var str = formatStr;
	var Week = ["\u65e5", "\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d"];
	str = str.replace(/yyyy|YYYY/, this.getFullYear());
	str = str.replace(/yy|YY/, (this.getYear() % 100) > 9 ? (this.getYear() % 100).toString() : "0" + (this.getYear() % 100));
	str = str.replace(/MM/, this.getMonth() + 1 > 10 ? (this.getMonth() + 1).toString() : "0" + (this.getMonth() + 1));
	str = str.replace(/M/g, this.getMonth());
	str = str.replace(/w|W/g, Week[this.getDay()]);
	str = str.replace(/dd|DD/, this.getDate() > 9 ? this.getDate().toString() : "0" + this.getDate());
	str = str.replace(/d|D/g, this.getDate());
	str = str.replace(/hh|HH/, this.getHours() > 9 ? this.getHours().toString() : "0" + this.getHours());
	str = str.replace(/h|H/g, this.getHours());
	str = str.replace(/mm/, this.getMinutes() > 9 ? this.getMinutes().toString() : "0" + this.getMinutes());
	str = str.replace(/m/g, this.getMinutes());
	str = str.replace(/ss|SS/, this.getSeconds() > 9 ? this.getSeconds().toString() : "0" + this.getSeconds());
	str = str.replace(/s|S/g, this.getSeconds());
	return str;
};
var popUpWin = 0;
function openWindow(URLStr, win_name, left, top, width, height) {
	popUpWin = open(URLStr, win_name, "toolbar=no,location=no,directories=no,status=no,menub ar=no,scrollbar=yes,resizable=no,copyhistory=yes,width=" + width + ",height=" + height + ",left=" + left + ", top=" + top + ",screenX=" + left + ",screenY=" + top + "");
	popUpWin.focus();
    //    window.showModalDialog(URLStr, "",
    //                    "dialogHeight:600px;dialogWidth:800px;status:no;help:no");
}
/*-----------------INPUT��-------------------*/
function myoption(text, value, selectedvalue) {
	this.text = text;
	this.value = value;
	this.sele = (value == selectedvalue) ? "selected" : "";
}
function inputStr(type, name, value, datatype, myoptions) {
	var inputstr = "";
	if (value == undefined) {
		value = "";
	}
	switch (type) {
	  case "text":
		inputstr = "<input type='text' msg='\u683c\u5f0f\u9519\u8bef' dataType='" + datatype + "' id='" + name + "' name='" + name + "' value='" + value + "'";
		if (datatype == "Date") {
			inputstr = inputstr + "readonly='true' />" + "dataimage";
		} else {
			inputstr += "/>";
		}
		break;
	  case "checkbox":
		inputstr = "<input type='checkbox' name='" + name + "' value = '" + value + "'/>";
		break;
	  case "select":
		inputstr = "<select id='" + name + "' name='" + name + "'>";
		if (myoptions != null) {
			myoptions.each(function (myoption) {
				inputstr = inputstr + "<option value='" + myoption.value + "' " + myoption.sele + ">" + myoption.text + "</option>";
			});
		}
		inputstr += "</select>";
		break;
	  default:
		inputstr = "<input type='hidden' id='" + name + "' name='" + name + "' value='" + value + "'/>";
		break;
	}
	return inputstr;
}
function getFormValue(eleType, startStr, splitStr) {
	var returnValue = "";
	$A(document.getElementsByTagName(eleType)).each(function (ele) {
		if (ele.id.startsWith(startStr) || ele.name.startsWith(startStr)) {
			returnValue = returnValue + ele.value + splitStr;
		}
	});
	return returnValue.substr(0, returnValue.length - 1);
}
document.onkeydown = function () {
	var elem = event.srcElement;
	if ((event.keyCode == 13) && (elem.type != "textarea") && (elem.type != "button")) {
		event.keyCode = 9;
	}
};
/*-------------ƴ��������-------------*/
function getspellformcode(str, spellid, formid) {
	if (str != "") {
		ContentMetaDataAction.getSpellFormCode(str, function (resultstr) {
			if (resultstr != "") {
				var spellcode = resultstr.substr(0, resultstr.indexOf("|"));
				var formcode = resultstr.substr(resultstr.indexOf("|") + 1, resultstr.length);
				$(spellid).value = spellcode;
				$(formid).value = formcode;
			}
		});
	}
}
window.history.forward(1);
/*----------------��������--------------*/
function ev_hiddenQueryTable(query_condition, arrowimg) {
	if ($(query_condition).style.display == "none") {
		$(query_condition).style.display = "";
		$(arrowimg).src = "/images/main/arrowup.gif";
	} else {
		$(query_condition).style.display = "none";
		$(arrowimg).src = "/images/main/arrowdown.gif";
	}
}
function changeDIV(div1, div2) {
	$(div1).show();
	$(div2).hide();
}
function displayDIV(div1, str) {
	Form.getElements(this.form).each(function (input) { // Thanks Mike!
		if (input.type == "") {
		}
	});
}
function divIsShow(div) {
	if (div.style.display == "none") {
		return false;
	} else {
		return true;
	}
}
function changeDIVdis(div) {
	if ($(div).style.display == "none") {
		$(div).show();
	} else {
		$(div).hide();
	}
}
function ev_hiddenDIV(div,arrowimg) {
	if ($(div).style.display == "none") {
		$(div).show();
		$(arrowimg).src = "/ccatscas/images/up.JPG";
		$(arrowimg).alt = "close";
	} else {
		$(div).hide();
		$(arrowimg).src = "/ccatscas/images/down.JPG";
		$(arrowimg).alt = "open";
	}
}

   //�ж��Ƿ񽫲�ѯ������
function displayDIV(divid, startWith, extend) {
	if ("" == startWith) {
		$(divid).show();
		return true;
	}
	$A(document.getElementsByTagName("div")).each(function (div) {
		if (div.id.startsWith(startWith)) {
			if (div.id == divid) {
				$(divid).show();
			} else {
				$(div.id).hide();
			}
		}
	});
	$(divid).show();
	if (extend != "") {
		$A(document.getElementsByTagName("div")).each(function (div) {
			if (div.id.startsWith(extend)) {
				$(div.id).hide();
			}
		});
	}
}
function displayOnlyDIV(divid, extend) {
	$(divid).show();
	$A(document.getElementsByTagName("div")).each(function (div) {
		if (div.id.startsWith(extend)) {
			$(div.id).hide();
		}
	});
}
/*--------------dbclick---------------*/
function show_detail(formname, url, targetname) {
	$(formname).action = url;
	$(formname).target = targetname;
	$(formname).submit();
}
/*------------����----------*/
function show_window(url) {
	var returnValue = window.showModalDialog(url, window, "dialogHeight:400px;dialogWidth:600px;status=no;resizable:no");
}
function show_window(url, height, width) {
	var returnValue = window.showModalDialog(url, window, "dialogHeight:" + height + "px;dialogWidth:" + width + "px;status=no;resizable:no");
}
function open_window(url,win_name){
	var popUpWin = open(url, win_name, 'location=no,resizable=yes,scrollbars=yes,top=20');
    popUpWin.focus();
}
/*----------ȡ��url����---------*/
function getUrlParam(paramName) {
	var oRegex = new RegExp("[?&]" + paramName + "=([^&]+)", "i");
	var oMatch = oRegex.exec(window.top.location.search);
	if (oMatch && oMatch.length > 1) {
		return unescape(oMatch[1]);
	} else {
		return "";
	}
}
/**Ajax���ص�������,�����JavaScript�ű���Ҫ����,����ô˷���
*  ele:Ԫ��
*  innerHtml:����˷��ص��ı�
*  @author ��ӱ�� 2008��7��2��
**/
var reInnerHTML = function (ele, innerHtml) {
	ele.innerHTML = "";
	var nA = navigator.appVersion;
	if (nA.indexOf("MSIE") >= 0) {
		var curIE = nA.substr(nA.indexOf("MSIE") + 5, 3);
	}
	if (curIE) {
		innerHtml = innerHtml.replace(/<script([^>]*)>/gi, "<script$1 defer=\"true\">");
		var reStartScript = /^(\s*<script)/gi;
		if (reStartScript.test(innerHtml)) {
			innerHtml = "<span style=\"display:none;\"></span>" + innerHtml;
			ele.innerHTML = innerHtml;
			ele.removeChild(ele.firstChild);
		} else {
			ele.innerHTML = innerHtml;
		}
	} else {
		var el_next = ele.nextSibling;
        var el_parent = ele.parentNode;
        el_parent.removeChild(ele);
        ele.innerHTML = innerHtml;
        if (el_next) {
            el_parent.insertBefore(ele, el_next)
        } else {
            el_parent.appendChild(ele);
        }
	/*
		alert(ele.tagName)
		var newObj = document.createElement(ele.tagName);
		newObj.id = ele.id;
		newObj.className = ele.className;
		newObj.innerHTML = innerHtml;
		ele.parentNode.replaceChild(newObj, ele);
		*/
	}
};
function trOnc(obj,colorvalue) {
	for (var i = 0; i < obj.rows.length; i++) {
		if (i == event.srcElement.parentElement.rowIndex) {
			obj.rows[i].style.backgroundColor = colorvalue;
		} else {
			obj.rows[i].style.backgroundColor = "";
		}
	}
}

function trOnc(obj) {
	for (var i = 0; i < obj.rows.length; i++) {
		if (i == event.srcElement.parentElement.rowIndex) {
			obj.rows[i].style.backgroundColor = 'khaki';
		} else {
			obj.rows[i].style.backgroundColor = "";
		}
	}
}

function commonGetLength(strTemp) {
	var i,sum;
	sum=0;
	for(i=0;i<strTemp.length;i++)  {
		if ((strTemp.charCodeAt(i)>=0) && (strTemp.charCodeAt(i)<=255)) {
			sum=sum+1;
		} else {
			sum=sum+2;
		}
	}
	return sum;
}

function commonTrim(str){
	return str.replace(/^\s+/, '').replace(/\s+$/, '');
}

function trimForm(formstr) {
	if(formstr==undefined||formstr==''){
		var inputList = document.getElementsByTagName('input');
	    var inputs = $A(inputList);
	    inputs.each(function(input){
	    	  var strValue=input.value;
	          input.value=strValue.strip();
	    });

	    var textareaList =document.getElementsByTagName('textarea');
	    var textareas = $A(textareaList);
	    textareas.each(function(textarea){
	    	  var strValue=textarea.value;
	          textarea.value=strValue.strip();
	    });
	}else{
		var inputList = $(formstr).getElementsByTagName('input');
	    var inputs = $A(inputList);
	    inputs.each(function(input){
	    	  var strValue=input.value;
	          input.value=strValue.strip();
	    });

	    var textareaList = $(formstr).getElementsByTagName('textarea');
	    var textareas = $A(textareaList);
	    textareas.each(function(textarea){
	    	  var strValue=textarea.value;
	          textarea.value=strValue.strip();
	    });
	}
}

	function showTips(moduleId,labelId) {
		if(moduleId != null && moduleId != '' && labelId != null && labelId != '') {
			var obj = new Object();
			obj.tipLabel = labelId;
			obj.tipModuleId = moduleId;
        	var rtnValue = window.showModalDialog("/jsp/sys/tip/tip.jsp",obj,"dialogWidth=450px;dialogHeight=350px;center=true;status=no;scroll=no");
		} 
	}
