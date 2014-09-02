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
									返回编码
								</td>
								<td style="word-break: keep-all;">
									返回错误信息
								</td>
								<td style="word-break: keep-all;">
									静态数据编码
								</td>
								<td style="word-break: keep-all;">
									静态数据名称
								</td>
								<td style="word-break: keep-all;">
									实例项目编码
								</td>
								<td style="word-break: keep-all;">
									实例项目名称
								</td>
								<td style="word-break: keep-all;">
									父类实例项目ID
								</td>
								<td style="word-break: keep-all;">
									操作类型
								</td>
								<td style="word-break: keep-all;">
									系列号码
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceWxtogbeomsList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<!-- <input type="checkbox" name="checkid" value="${objData.rootId}"/>  -->
										<c:choose>
											<c:when test="${objData.changetype == 'DELETE'}">
												<img  alt="删除操作" onclick="removeOperation('${objData.rootId}')" src="/images/main/icon_del01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:when test="${objData.changetype == 'INSERT'}">
												<img  alt="添加操作" onclick="insertOperation('${objData.rootId}')" src="/images/main/icon_save01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:when test="${objData.changetype == 'UPDATE'}">
												<img  alt="更新操作" onclick="updateOperation('${objData.rootId}')" src="/images/main/icon_save01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:otherwise>
												<img  alt="无操作" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.responseCode == 0}">
												成功
											</c:when>
											<c:otherwise>
												失败
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										${objData.responseInfo}
									</td>
									<td align="center">
										${objData.sysCode}
									</td>
									<td align="center">
										${objData.sysCodename}
									</td>
									<td align="center">
										${objData.itemId}
									</td>
									<td align="center">
										${objData.itemName}
									</td>
									<td align="center">
										${objData.parentItemId}
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.changetype == 'UPDATE'}">
												更新
											</c:when>
											<c:when test="${objData.changetype == 'INSERT'}">
												插入
											</c:when>
											<c:when test="${objData.changetype == 'DELETE'}">
												删除
											</c:when>
											<c:otherwise></c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										${objData.serialNumber}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ifaceWxtogbeomsList" />