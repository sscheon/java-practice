<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>회원가입</h3>

<form method="POST">
	<p>아이디 : <input type="text" name="userid" placeholder="아이디" required></p>
	<p>비밀번호 : <input type="password" name="userpw" placeholder="비밀번호" required></p>
	<p>이름 : <input type="text" name="userName" placeholder="이름" required></p>
	<p>생년월일 : <input type="date" name="birth"></p>
	<p>성별 : 
		<select name="gender">
			<option value="">==성별==</option>
			<option value="남성">남성</option>
			<option value="여성">여성</option>
		</select>
	</p>
	<p><input type="submit" value="가입"></p>
</form>

</body>
</html>