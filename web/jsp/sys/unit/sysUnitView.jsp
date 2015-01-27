<!DOCTYPE html>
<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysUnitAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="/css/cb2.css" type="text/css">
<link rel="stylesheet" href="/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>


<html>

<script type="text/javascript">
	DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
        return false;
    }
</script>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body>
	<form name="formView">
		<table border="0" width="100%" cellpadding="0" cellspacing="0">
			<tr>
				<table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
					<tr>
						<td  class="tabpaneleft2"></td>
						<td class="tabpanebg2"   width="120">
							<img src="/images/main_01/ico_fellow.gif" width="18" height="15">
							<span>组织细节</span>
						</td>
						<td class="tabpaneright2"></td>
				    </tr>
			    </table>
			</tr>
			<tr>
				<td>
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table">
						<tr>
							<td class="bg_01">
								<table width="100% border=" 0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     上级组织:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="parentName" disabled >
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      组织名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="unitName" maxlength="50" size="40" dataType="Require" msg="组织名称不能为空" disabled />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																组织类型:
															</div>
														</td>
														<td align="left">
															<div id="unitType"></div>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     电话:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="phone"  maxlength="16"  size="18"  dataType="Require" msg="电话不能为空" disabled />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																管理员:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="unitDesName" maxlength="100" size="50" disabled  />
															<input type="hidden" id="unitDes" name="unitDes"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     是否有效:
															</div>
														</td>
														<td align="left" >
															<input type="radio" id="isValid_Y" name="isValid" value="Y" disabled>有效
															<input type="radio" id="isValid_N" name="isValid" value="N" disabled>无效
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     排序:
															</div>
														</td>
														<td align="left" >
															<input type="text" class="inputtext01" name="sortOrder" maxlength="3" size="3" disabled />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																备注:
															</div>
														</td>
														<td align="left">
															<textarea id="remark" name="remark" rows="3"  style="width: 95%;" class="inputtext01" disabled>
															</textarea>
														</td>
													</tr>
													<input type="hidden" id="parentUnitid" name="parentUnitid" value="${requestScope.parentUnitid}"/>
												</tbody>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
	function initData()
	{
		document.forms[0].parentName.value ="${requestScope.parentName}";
		document.forms[0].unitName.value ="${requestScope.unitName}";
		if("U"=="${requestScope.unitType}") {
			$("unitType").innerText="单位";
		}else if("P"=="${requestScope.unitType}"){
			$("unitType").innerText="部门";
		}else if("N"=="${requestScope.unitType}"){
			$("unitType").innerText="地区";
		}else if("G"=="${requestScope.unitType}"){
			$("unitType").innerText="协作组";
		}else if("S"=="${requestScope.unitType}") {
			$("unitType").innerText="市县";
		}
		document.forms[0].unitDes.value ="${requestScope.unitDes}";
		document.forms[0].unitDesName.value ="${requestScope.unitDesName}";
		document.forms[0].phone.value ="${requestScope.phone}";
		if("Y"=="${requestScope.isValid}") {
			$("isValid_Y").checked=true;
		} else {
			$("isValid_N").checked=true;
		}
		document.forms[0].sortOrder.value ="${requestScope.sortOrder}";
		document.forms[0].remark.value ="${requestScope.remark}";
		trimForm();
	}
	initData();
</script>
</html>