<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									详情
								</td>
								<td style="word-break: keep-all;">
									后台服务名称
								</td>
								<td style="word-break: keep-all;">
									后台服务CLASS
								</td>
								<td style="word-break: keep-all;">
									后台服务描述
								</td>
								<td style="word-break: keep-all;">
									默认启动
								</td>
								<td style="word-break: keep-all;">
									间隔时间(以秒为单位)
								</td>
								<td style="word-break: keep-all;">
									是否只启动一次
								</td>
							</tr>
							<c:forEach items="${requestScope.sysTaskServiceList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${objData.serviceId}"/>
									</td>
									<td align="center">
										<img  alt="查看详情" onclick="updateSysServiceConfigDetail('${objData.serviceId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.serviceName}
									</td>
									<td align="center">
										${objData.serviceClass}
									</td>
									<td align="center">
										${objData.serviceDesc}
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.startDefault == 'Y' }">
												是
											</c:when>
											<c:when test="${objData.startDefault == 'N' }">
												否
											</c:when>
											<c:otherwise>
												数据不对
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										<c:if test="${objData.startRunonce eq 'N'}">
											${objData.runInterval}
										</c:if>
									</td>
									<td align="center">
										${objData.startRunonce}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="sysTaskServiceList" />