<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="queryListForm">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
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
									备注
								</td>
							</tr>
							<c:forEach items="${requestScope.taticGroupList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.taticgoupid}"/>
										<img  alt="查看详情" onclick="getDetail('${obj.taticgoupid}','${obj.taticgoupname}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${obj.taticgoupname}
									</td>
									<td align="center">
									  <blocimp:sysDicDisName dictionaryCodeIn="SUPT_TACTIC_TYPE"  itemCodeIn="${obj.tatictype}" />
									</td>
									<td align="center">
										${obj.remark}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
 </form>
</body>
</html>