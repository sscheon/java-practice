<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="day07.Member"/>
<jsp:setProperty property="*" name="user"/>

	<%
	int row = memberHandler.modify(user);
	if(row == -1){
	%>
		<h3>수정실패</h3>
		<button onclick="history.back()">뒤로가기</button>
	<%
	}
	else {
		response.sendRedirect(request.getContextPath() + "/logout.jsp");
	}
	%>

</body>
</html>