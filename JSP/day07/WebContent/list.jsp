<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<ol>
<%
	for(Member member : memberHandler.getList()) {
		pageContext.setAttribute("member", member);	
	%>
	<li>
		${member.userId } / 
		${member.userPw } / 
		${member.userName } / 
		${member.age } / 
		${member.birth }
	</li>
	<%} %>

</ol>

</body>
</html>