<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="day07.Member"/>
<jsp:setProperty property="*" name="user"/>

<%
	Member login = memberHandler.login(user);
	if(login != null) {
		session.setAttribute("login", login);
		session.setMaxInactiveInterval(600);	// 아무것도 안하고 600초가 지나가면 세션이 만료됨
		response.sendRedirect(request.getContextPath());
		// 문서 최상위 경로만 요청하고 파일이름이 없다
		// 파일 이름없이 요청하면 해당위치에서 index.jsp를 찾아보고 있으면 index.jsp로 응답한다
	}
	else {
		%>
		<h3>로그인 실패</h3>
		<button onclick="history.back()">뒤로 가기</button>
	<%	} %>

</body>
</html>