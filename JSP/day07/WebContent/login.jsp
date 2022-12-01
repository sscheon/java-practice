<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST" action="login-action.jsp">
	<p>아이디 <input type="text" name="userId" placeholder="아이디" required></p>
	<p>비밀번호 <input type="password" name="userPw" placeholder="비밀번호" required></p>
	<p><input type="submit" value="로그인"></p>
</form>

</body>
</html>