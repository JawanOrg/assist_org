//职位，地区选择弹出层函数
function OpenCategoryLayer(objid, showid, input_cn, input, QSarr, strlen) {
	jq(objid)
			.click(
					function() {
						jq(this).blur();
						jq(this).parent("div").before(
								"<div class=\"menu_bg_layer\"></div>");
						jq(".menu_bg_layer").height(jq(document).height());
						jq(".menu_bg_layer").css({
							width : jq(document).width(),
							position : "absolute",
							left : "0",
							top : "0",
							"z-index" : "0",
							"background-color" : "#000000"
						});
						jq(".menu_bg_layer").css("opacity", 0);
						jq(showid + " .OpenFloatBoxBg").css("opacity", 0.2);
						jq(showid).show();
						jq(showid + " .OpenFloatBox")
								.css(
										{
											"left" : (jq(document).width() - jq(
													showid + " .OpenFloatBox")
													.width()) / 2,
											"top" : "120",
											"z-index" : "999"
										});
						SetBoxBg(showid);
						jq(showid + " .item")
								.unbind()
								.hover(
										function() {
											jq(this).find(".titem").addClass(
													"titemhover");
											var strclass = QSarr[jq(this).attr(
													"id")];
											var pid = jq(this).attr("id");
											if (strclass) {
												jq(this).find(".sitem").css(
														"display", "block");
												if (jq(this).find(".sitem")
														.html() == "") {
													jq(this)
															.find(".sitem")
															.html(
																	MakeLi(
																			strclass,
																			pid));// 生成LI
												}
											}
											jq(showid + " .OpenFloatBox label")
													.unbind()
													.click(
															function() {
																if (jq(this)
																		.attr(
																				"title")) {
																	if (jq(this)
																			.find(
																					":checkbox")
																			.attr(
																					'checked')) {
																		jq(this)
																				.next()
																				.find(
																						":checkbox")
																				.attr(
																						'checked',
																						true);
																	} else {
																		jq(this)
																				.next()
																				.find(
																						":checkbox")
																				.attr(
																						'checked',
																						false);
																	}
																} else {
																	if (jq(this)
																			.parent()
																			.find(
																					":checkbox[checked]").length > 0) {
																		jq(this)
																				.parent()
																				.prev()
																				.find(
																						":checkbox")
																				.attr(
																						'checked',
																						false);
																	}
																}
																CopyItem(showid);
															});
										},
										function() {
											jq(this).find(".titem").removeClass(
													"titemhover");
											jq(this).find(".sitem").css(
													"display", "none");
										});
						jq(showid + " .OpenFloatBox .DialogClose").unbind()
								.hover(function() {
									jq(this).addClass("spanhover")
								}, function() {
									jq(this).removeClass("spanhover")
								});
						jq(showid + " .DialogClose").click(function() {
							DialogClose(showid);
						});
						// 确定选择
						jq(showid + " .Set").unbind().click(function() {
							SetInput(showid, input_cn, input, strlen);
						});
						// 关闭
						function DialogClose(showid) {
							jq(".menu_bg_layer").hide();
							jq(showid).hide();
						}
						// 设置表单
						function SetInput(showid, input_cn, input, strlen) {
							var a_cn = new Array();
							var a_id = new Array();
							var i = 0;
							/*if (jq(showid
									+ " .OpenFloatBox .selecteditem :checkbox[checked]").length > 8) {
								alert("不能超过8个选项");
								return false;
							}*/
							jq(
									showid
											+ " .OpenFloatBox .selecteditem :checkbox[checked]")
									.each(
											function(index) {
												a_cn[index] = jq(this).attr(
														"title");
												if (jq(this).attr("class") == "b") {
													a_id[i] = jq(this).val();//+ ".0";
												} else {
													a_id[i] = jq(this)
															.attr("id")
															+ "."
															+ jq(this).val();
												}
												i++;
											});
							jq(input_cn).val(limit(a_cn.join("+"), strlen));
							if (jq(input_cn).val() == "")
								jq(input_cn).val("未选择");
							jq(input).val(a_id.join("-"));
							DialogClose(showid);
						}

					});
}
// 设置阴影
function SetBoxBg(showid) {
	var FloatBoxWidth = jq(showid + " .OpenFloatBox").width();
	var FloatBoxHeight = jq(showid + " .OpenFloatBox").height();
	var FloatBoxLeft = jq(showid + " .OpenFloatBox").offset().left;
	var FloatBoxTop = jq(showid + " .OpenFloatBox").offset().top;
	jq(showid + " .OpenFloatBoxBg").css({
		display : "block",
		width : (FloatBoxWidth + 12) + "px",
		height : (FloatBoxHeight + 12) + "px"
	});
	jq(showid + " .OpenFloatBoxBg").css({
		left : (FloatBoxLeft - 5) + "px",
		top : (FloatBoxTop - 5) + "px"
	});
}
// 生成小类
function MakeLi(val, pid) {
	if (val == "")
		return false;
	arr = val.split("|");
	var htmlstr = '';
	for (x in arr) {
		var v = arr[x].split(",");
		htmlstr += "<label><input type=\"checkbox\" value=\"" + v[0]
				+ "\" title=\"" + v[1] + "\" class=\"s\" id=\"" + pid + "\"/>"
				+ v[1] + "</label><br/>";
	}
	return htmlstr;
}
// 拷贝
function CopyItem(showid) {

	var htmlstr = '&nbsp;&nbsp;&nbsp;已经选择分类：<span class=\"empty\">[清空已选]</span><br/>';
	//jq(showid + " .item :input[class='b'][type='checkbox']")
	jq('.item :input[type=checkbox][class="b"]:checked')
			.each(
					function() { 
							htmlstr += "<label><input class=\"b\"  type=\"checkbox\" value=\""
									+ jq(this).attr("value")
									+ "\" title=\""
									+ jq(this).attr("title")
									+ "\" checked/>"
									+ jq(this).attr("title") + "</label>";
					})
	//jq(showid + " .item :checkbox[class='s']")
	//alert(htmlstr);
	jq('.item :input[type=checkbox][class="s"]:checked')
			.each(
					function(index) {
							if (jq(this).parent().parent().prev().find(":checkbox")
									.attr('checked') == true) {
								htmlstr += "<label><input class=\"s\"  type=\"checkbox\" id=\""
										+ jq(this).attr("id")
										+ "\" value=\""
										+ jq(this).attr("value")
										+ "\" title=\""
										+ jq(this).attr("title")
										+ "\" checked/>"
										+ jq(this).attr("title") + "</label>";
							}
					})
	htmlstr += "<div class=\"clear\"></div>";
	jq(showid + " .selecteditem").html(htmlstr);
	//alert(htmlstr);
	//if (jq(showid + " .item :checkbox[checked]").length > 0) {
	if(jq("input[type=checkbox][class=b][checked]").length>0){
		jq(showid + " .selecteditem").css("display", "block");
	} else {
		jq(showid + " .selecteditem").css("display", "none");
	}
	// 已选项目绑定click
	jq(showid + " .selecteditem :checkbox").unbind().click(
			function() {
				var selval = jq(this).val();
				//jq(showid + " .item :checkbox[checked]").each(
				jq(showid + " .item :input[type=checkbox][checked]").each(
						function() {
							if (jq(this).val() == selval) {
								jq(this).attr("checked", false);
								if (jq(this).attr("class") == "b") {
									jq(this).parent().next().find(":checkbox")
											.attr("checked", false);
								}
								// 重新克隆
								CopyItem(showid);
							}
						})
			});
	jq(showid + " .OpenFloatBox .item label :checkbox").parent()
			.css("color", "");
	jq(showid + " .OpenFloatBox .item label :checkbox[checked]").parent().css(
			"color", "#FF6600");
	jq(showid + " .OpenFloatBox .sitem :checkbox[checked]").each(
			function(index) {
				jq(this).parent().parent().prev().css("color", "#FF6600");
			});
	SetBoxBg(showid);
	// 清空
	jq(showid + " .selecteditem .empty").unbind().click(
			function() {
				jq(showid + " .selecteditem").css("display", "none");
				jq(showid + " .selecteditem").html("");
				jq(showid + " :checkbox[checked]").parent().css("color", "");
				jq(showid + " :checkbox[checked]").parent().parent().prev().css(
						"color", "");
				jq(showid + " :checkbox[checked]").attr('checked', false);
				SetBoxBg(showid);
			});
}
// 截取字符
function limit(objString, num) {
	var objLength = objString.length;
	if (objLength > num) {
		return objString.substring(0, num) + "...";
	}
	return objString;
}