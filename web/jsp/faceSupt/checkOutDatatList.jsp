<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<form name="allForm3" id="allForm3" action="">
<input id="num" type="hidden"  value="${requestScope.num}" />
<table class="table" cellspacing="0" cellpadding="1" width="100%" border="1" frame="box">
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">
			</td>
			<td style="word-break: keep-all;">
				编号
			</td>
			<td style="word-break: keep-all;">
				节点名称
			</td>
			<td style="word-break: keep-all;">
				是否叶子
			</td>								
			<td style="word-break: keep-all;">
				是否结束
			</td>
			<td style="word-break: keep-all;">
				入参节点
			</td>
			<td style="word-break: keep-all;">
				映射方式
			</td>
		</tr>
		<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
		<tr align="center" bgcolor="" style="cursor: 'hand'">
			<td align="center">
				<input type="checkbox" name="sendid" value="${obj.sendId}"/>
			</td>
			<td align="center">
			    ${obj.orderId}
			</td>
			<td align="center" onmouseover="TagToTip('T2TAdaptWidth_${obj.outNode}',TITLE,'详细信息',FADEIN, 300, FADEOUT, 300, WIDTH, 500,CLICKSTICKY, true)" onmouseout="UnTip()">
				${obj.outNode}
				<span id="T2TAdaptWidth_${obj.outNode}" style="display: none">映射前类型：${obj.mappForData}<br/> 映射前格式:${obj.mappForFormat}<br/> 映射后类型:${obj.mappAftData}<br />
						映射后格式:${obj.mappAftFormat}<br/>父节点:${obj.outParentNode}<br/>拼接名字:${obj.joinName}<br/>依赖节点:${obj.depenNode}</span>
			</td>
			<td align="center">
			    <c:if test="${'Y' eq obj.outIschidNode}">
				是
			  </c:if>
			   <c:if test="${'N' eq obj.outIschidNode}">
				否
			  </c:if>
			</td>									
			<td align="center">
			    <c:if test="${'Y' eq obj.outChidnodeOver}">
				是
			  </c:if>
			   <c:if test="${'N' eq obj.outChidnodeOver}">
				否
			  </c:if>
			</td>
			<td align="center">
			    ${obj.inNode}
			</td>
			<td align="center">
			    <c:if test="${'direct' eq obj.mappPatt}">
				直接映射
			  </c:if>
			   <c:if test="${'static' eq obj.mappPatt}">
				静态数据
			  </c:if>
			  <c:if test="${'systime' eq obj.mappPatt}">
				系统时间
			  </c:if>
			  <c:if test="${'final' eq obj.mappPatt}">
				固定值
			  </c:if>
			  <c:if test="${'changer' eq obj.mappPatt}">
				类型转换
			  </c:if>
			  <c:if test="${'source' eq obj.mappPatt}">
				源数据
			  </c:if>
			  <c:if test="${'tactic' eq obj.mappPatt}">
				策略
			  </c:if>
			  <c:if test="${'returnID' eq obj.mappPatt}">
				返回ID
			  </c:if>
			  <c:if test="${'cycleToPatch' eq obj.mappPatt}">
				循环转拼接
			  </c:if>
			  <c:if test="${'patchToCycle' eq obj.mappPatt}">
				拼接转循环
			  </c:if>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</form>