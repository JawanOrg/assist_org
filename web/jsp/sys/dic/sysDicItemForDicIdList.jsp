<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >

<form name="allForm3" id="allForm3">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
            		<thead>
            			<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									详情
								</td>
								<td style="word-break: keep-all;">
									数据字典条目名称
								</td>
								<td style="word-break: keep-all;">
									数据字典条目代号
								</td>
								<td style="word-break: keep-all;">
									描述
								</td>
							</tr>
            		</thead>
                    <tbody>
							<c:forEach items="${requestScope.sysDicItemForDicIdList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center" style="width:3%">
										<input type="checkbox" name="checkid1" value="${obj.itemId}"/>
									</td>
									<td align="center" style="width:3%">
										<img  alt="查看详情" onclick="toSysDicItemEdit('${obj.itemId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
									   ${obj.itemValue}
									</td>
									<td align="center">
									   ${obj.itemCode}
									</td>
									<td align="center">
									   ${obj.itemDesc}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
               </form>
</body>
</html>