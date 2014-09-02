<%@ page contentType="text/html;charset=gbk" language="java"%>
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
									服务类别
								</td>
								<td style="word-break: keep-all;">
									维护人员
								</td>
								<td style="word-break: keep-all;">
									维护人员电话号码
								</td>
								<td style="word-break: keep-all;">
									Email 地址
								</td>
								<td style="word-break: keep-all;">
									接口名称
								</td>
								<td style="word-break: keep-all;">
									协议名称(详)
								</td>
								<td style="word-break: keep-all;">
									远程地址
								</td>
								<td style="word-break: keep-all;">
									授权帐户
								</td>
								<td style="word-break: keep-all;">
									帐户密码
								</td>
								<td style="word-break: keep-all;">
									服务名称
								</td>
								<td style="word-break: keep-all;">
									端口名称
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceConfigProtocolList}" var="objData" varStatus="n">
							<tr align="center" bgcolor="" style="cursor: 'hand'">
								<td align="center" style="">
									<input type="checkbox" name="checkid" value="${objData.protocolId}"/>
								</td>
								<td align="center" style="">
									<img  alt="查看详情" onclick="openIfaceConfigProtocolEdit('${objData.protocolId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
								</td>
								<td align="center">
									${objData.serveType}
								</td>
								<td align="center">
									${objData.userName}
								</td>
								<td align="center">
									${objData.phoneNumber}
								</td>
								<td align="center">
									${objData.emailAddress}
								</td>
								<td align="center">
									${objData.interfaceName}
								</td>
								<td align="center" onmouseover="TagToTip('T2TAdaptWidth_${objData.protocolName}',TITLE,'详细信息',FADEIN, 300, FADEOUT, 300, WIDTH, 300,CLICKSTICKY, true)" onmouseout="UnTip()">
										${objData.protocolName}
										<span id="T2TAdaptWidth_${objData.protocolName}" style="display: none">提供商名称：${objData.providerName}<br/>JNDI 名称：${objData.jndiName}<br/>
										JMS消息目的地：${objData.destination}<br/>命名空间：${objData.nameSpace}</span>
								</td>
								<td align="center">
									${objData.wsdlAddr}
								</td>
								<td align="center">
									${objData.authAccount}
								</td>
								<td align="center">
									${objData.authPassword}
								</td>
								<td align="center">
									${objData.serviceName}
								</td>
								<td align="center">
									${objData.portName}
								</td>
							</tr>
						</c:forEach>
                    </tbody>
                  </table>