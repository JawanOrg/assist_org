<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="allForm" id="allForm">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									错误类型
								</td>
								<td style="word-break: keep-all;">
									错误处理方式
								</td>															
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.errId}"/>
									</td>
									<td align="center">
									  
									  <blocimp:sysDicDisName itemCodeIn="${obj.errBusiness}" dictionaryCodeIn="ERROR_TYPE"/>									
									</td>
									<td align="center">									   
									  <blocimp:sysDicDisName itemCodeIn="${obj.errType}" dictionaryCodeIn="ERROR_TACK"/>	
									</td>																		
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
               </form>
</body>
</html>