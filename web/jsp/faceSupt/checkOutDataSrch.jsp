<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
	<tr>
		<td valign="top">
			<br />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<tr>
					<td bgcolor="#FFFFFF">
						<table class="table" cellspacing="0" cellpadding="1" width="100%" border="1" frame="box">
							<tr>
								<td>
									<div id="queryResultList2" style="PADDING-RIGHT:0px;"></div>        
									<input id="addCheckOut" type="button" class="button" value="新增" onClick="addCheckOut()"/>
									<input id="modifyCheckOut" type="button" class="button" value="修改" onClick="modifyCheckOut()"/>
									<input id="deleteCheckOut" type="button" class="button" value="删除" onClick="deleteCheckOut()"/>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<script type="text/javascript">
    var sysid = "${param.sysid}";    
	initQueryResultList2();
	function initQueryResultList2(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj=$('queryForm').serialize(true);			
		formObj['cimpFaceId'] = sysid;
		checkAction.checkOutDataList(formObj,showResultList2);
	}

	function showResultList2(str){
		$('queryResultList2').innerHTML = str;
	}

</script>