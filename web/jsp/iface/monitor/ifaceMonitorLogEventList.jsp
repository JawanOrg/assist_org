<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<table class=table id=powergrid style="FONT-SIZE: 13px" pcolor="#BCC8F5"
	cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box>
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">
				日志数据
			</td>
			<td style="word-break: keep-all;">
				事件类型
			</td>
			<td style="word-break: keep-all;">
				日志描述
			</td>
			<td style="word-break: keep-all;">
				是否成功
			</td>
			<td style="word-break: keep-all;">
				入参文档
			</td>
			<td style="word-break: keep-all;">
				事件描述
			</td>
			<td style="word-break: keep-all;">
				创建日期
			</td>
		</tr>
		<c:forEach items="${requestScope.ajaxPage}" var="objData"
			varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center">
					<img  alt="查看日志数据列表" onclick="openIfaceLogRepositoryDetail ('${objData.relateId}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<c:if test="${objData.type=='TRACE'}">
						跟踪
					</c:if>
					<c:if test="${objData.type=='ERROR'}">
						错误
					</c:if>
				</td>
				<td align="center">
					${objData.description}
				</td>
				<td align="center">
					<c:choose> 					
						<c:when test="${'Y'==objData.successful}">
							成功
						</c:when>
						<c:when test="${'N'==objData.successful}">
							失败	
						</c:when>
						<c:otherwise>
							未知
						</c:otherwise>
					</c:choose> 
				</td>
				<td align="center">
					<img  alt="查看入参文档" onclick="openIfaceLogEventArgu ('${objData.eventId}')" src="/images/icon/code.png" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<img  alt="查看事件描述" onclick="openIfaceLogEventDesc ('${objData.eventId}')" src="/images/icon/text.png" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<fmt:formatDate value="${objData.created}" pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>