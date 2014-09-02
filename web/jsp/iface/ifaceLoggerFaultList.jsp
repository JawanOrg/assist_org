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
									系统名称
								</td>
								<td style="word-break: keep-all;">
									故障日志
								</td>
								<td style="word-break: keep-all;">
									故障原因
								</td>
								<td style="word-break: keep-all;">
									故障描述
								</td>
								<td style="word-break: keep-all;">
									修复人
								</td>
								<td style="word-break: keep-all;">
									修复时间
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceLogRepairList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<img  alt="查看详情" onclick="openLogFacadeDetail('${objData.repositoryId}','${objData.repairId}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.applicationName}
									</td>
									<td align="center" width="30%">
										${objData.traceText}
									</td>
									<td align="center" width="15%">
										${objData.faultCause}
									</td>
									<td align="center" width="15%">
										${objData.faultDescription}
									</td>
									<td align="center">
										${objData.repairUser}
									</td>
									<td align="center">
										<fmt:formatDate type="both" value="${objData.repairDate}" />
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ifaceLogRepairList" />