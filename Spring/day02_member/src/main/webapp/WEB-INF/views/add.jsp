<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p>아이디 : <input type="text" name="userid" placeholder="ID" required></p>
	<p>비밀번호 : <input type="password" name="userpw" placeholder="Password" required></p>
	<p>이름 : <input type="text" name="username" placeholder="name" required></p>
	<p>생일 : <input type="date" name="birth"></p>
	<p>성별 : 
		남<input type="radio" name="gender" value="남성">
		여<input type="radio" name="gender" value="여성">
	</p>
	<p><input type="submit" value="추가"></p>
</form>

</body>
</html>