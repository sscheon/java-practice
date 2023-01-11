<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>로그인 해주세요</h3>

<form method="POST">
	<input type="text" name="userid" placeholder="ID" required autofocus>
	<input type="password" name="userpw" placeholder="PW" required>
	<input type="submit" value="로그인">
</form>

</body>
</html>