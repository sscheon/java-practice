<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="jsbank.LoginDTO"/>
<jsp:setProperty property="*" name="user"/>
<jsp:useBean id="dao" class="jsbank.LoginDAO"/>



<c:choose>
	<c:when test="${dao.login(user) == 1 }">
	<c:redirect url="/index.jsp" />	
	</c:when>
	<c:otherwise>
		<h3>로그인 실패</h3>
		<button onclick="history.back()">뒤로가기</button>
	</c:otherwise>
</c:choose>


</body>
</html>