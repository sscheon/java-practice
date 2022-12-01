<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<form action="join-action.jsp" method="POST">
	<p>아이디 <input type="text" name="userId" placeholder="아이디" required></p>
	<p>비밀번호 <input type="password" name="userPw" placeholder="비밀번호" required></p>		
	<p>이름 <input type="text" name="userName" placeholder="이름" required></p>
	<p>나이 <input type="number" name="age" placeholder="나이" required></p>
	<p>생년월일 <input type="date" name="birth" required></p>
	<p><input type="submit" value="가입"></p>
</form>


</body>
</html>