<%@ page contentType="text/html;charset=GBK" language="java"%>
<html>
<head>
<title>协作管理系统</title>
</head>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
	topmargin="0">
	<table width="100%" border="0" cellpadding="5" cellspacing="0"
		bgcolor="#FFFFFF" height="100%">
		<tr>
			<td valign="top"><br>
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					bgcolor="#FFFFFF">

					<tr>
						<td bgcolor="#FFFFFF">
							<table class=table id=powergrid style="FONT-SIZE: 13px"
								cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
								bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
								<tr>
									<td>
										<div id="queryResultList2" style="PADDING-RIGHT:0px;"></div> <input
										id="addItem" type="button" class="button" value="新增"
										onClick="toSysDicItemAdd();" /> <input id="del" type="button"
										class="button" value="删除" onClick="deleteRelateDicItem();" />

									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
<script>
var dictionaryId = "${param.dictionaryId}";
initLoad(dictionaryId);

</script>
</html>