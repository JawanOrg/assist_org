<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<table class="table" id="powergrid" style="FONT-SIZE: 13px" cellspacing=0 bordercolordark=#ffffff  cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box  pcolor="#BCC8F5">
	<tr class="titletr">
		<td style="word-break: keep-all;">
			选择
		</td>
		<td style="word-break: keep-all;">
			登陆帐号
		</td>
		<td style="word-break: keep-all;">
			用户姓名
		</td>
		<td style="word-break: keep-all;">
			手机
		</td>
		<td style="word-break: keep-all;">
			备注
		</td>
		<td style="word-break: keep-all;">
			是否有效
		</td>
	</tr>
	<c:forEach items="${requestScope.ajaxPage}" var="obj" varStatus="n">
		<tr align="center" bgcolor="" style="cursor: 'hand'">
			<td align="center">
				<input type="checkbox" name="checkid" value="${obj.userId}"/>
				<img  alt="查看详情" onclick="getDetail('${obj.userId}','${obj.userName}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
			</td>
			<td align="center">
				${obj.loginName}
			</td>
			<td align="center">
				${obj.userName}
			</td>
			<td align="center">
				${obj.mobilePhone}
			</td>
			<td align="center">
			    ${obj.remark}
			</td>
			<td align="center">
			    ${obj.isValidName}
			</td>
		</tr>
	</c:forEach>
</table>