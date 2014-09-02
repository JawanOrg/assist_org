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
									告警类型
								</td>
								<td style="word-break: keep-all;">
									告警次数
								</td>
								<td style="word-break: keep-all;">
									告警内容
								</td>
								<td style="word-break: keep-all;">
									告警对象
								</td>
								<td style="word-break: keep-all;">
									联接页面地址
								</td>
								<td style="word-break: keep-all;">
									备注
								</td>
							</tr>
							<c:forEach items="${requestScope.alarmList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.alarmId}" />
									</td>
									<td align="center">
										${obj.alarmType}
									</td>
									<td align="center">
										${obj.alarmTimes}
									</td>
									<td align="center">
										${obj.alarmContent}
									</td>
									<td align="center">
										${obj.alarmObject}
									</td>
									<td align="center">
										${obj.linkPage}
									</td>
									<td align="center">
										${obj.remark}
									</td>
								</tr>
							</c:forEach>
							<tr>
							<td colspan="12" height="40" >
							<input type="button" class="button" value="清除(C)" accesskey="C"  onclick="delAlarm()" />
							</td>
							</tr>
                    </tbody>
                  </table>
 </form>
</body>
</html>