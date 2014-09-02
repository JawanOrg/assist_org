<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
	<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
		topmargin="4">
		<form name="queryListForm">
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				bgcolor="#FFFFFF">
				<tr>
					<td>
						<table border="0" cellspacing="0" cellpadding="0"
							style="font-size: 13px">
							<tr>
								<td class="tabpaneleft2"></td>
								<td class="tabpanebg2" width="140">
									<img
										src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
										width="18" height="15">
									包含的策略组列表
								</td>
								<td class="tabpaneright2">
								</td>
								<td>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="hidden" name="cimpFaceId"
										value="${taticConfigForm.cimpFaceId}">
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF" width="100%">
						<table class=table id=powergrid style="FONT-SIZE: 13px"
							cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
							bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
							<tbody>
								<tr class="titletr">
									<td style="word-break: keep-all;">
										选择
									</td>
									<td style="word-break: keep-all;">
										策略组名称
									</td>
									<td style="word-break: keep-all;">
										策略类型
									</td>
									<td style="word-break: keep-all;">
										优先级
									</td>
									<!--
								<td style="word-break: keep-all;">
									备注
								</td>
								 -->
								</tr>
								<c:forEach items="${requestScope.ifaceGroupList}" var="obj"
									varStatus="n">
									<tr align="center" bgcolor="" style="cursor: 'hand'">
										<td align="center">
											<input type="checkbox" name="checkid"
												value="${obj.ifaceGroupId}" />
											<input type="hidden" name="ifaceGroupId"
												value="${obj.ifaceGroupId}" />
											<!-- <img  alt="查看详情" onclick="getDetail('${obj.taticgoupid}','${obj.taticgoupName}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer"> -->
										</td>
										<td align="center">
											${obj.taticgoupName}
										</td>
										<td align="center">
										<blocimp:sysDicDisName dictionaryCodeIn="SUPT_TACTIC_TYPE"  itemCodeIn="${obj.tatictype}" />
										</td>
										<td align="center">
											<input type="text" name="priority" value="${obj.priority}"
												size="10">
										</td>
										<!--
									<td align="center">
										${obj.remark}
									</td>
									 -->
									</tr>
								</c:forEach>
							</tbody>
							<tr>
								<td colspan="10" height="30">
									<input type="button" class="button" value="新增" accesskey="Q"
										onclick="toAddIfaceGroup('${taticConfigForm.cimpFaceId}')" />
									<input type="button" class="button" value="删除" accesskey="R"
										onclick="delIfaceGroup('${taticConfigForm.cimpFaceId}')" />
									<input type="button" class="button" value="保存修改" accesskey="S"
										onclick="updateIfaceGroup('${taticConfigForm.cimpFaceId}')" />
								</td>
							</tr>
						</table>
						</form>

					</td>
				</tr>
			</table>
	</body>
</html>