<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST" action="modify-action.jsp">
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td>아이디</td>
			<td>${login.userId }<input type="hidden" name="userId" value="${login.userId }"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="userPw"></td>
	 	</tr>
	 	<tr>
	 		<td>이름</td>
	 		<td><input type="text" name="userName" value="${login.userName }"></td>
	 	</tr>
	 	<tr>
	 		<td>나이</td>
	 		<td><input type="number" name="age" value="${login.age }"></td>
	 	</tr>
	 	<tr>
	 		<td>생년월일</td>
	 		<td><input type="date" name="birth" value="${login.birth }"></td>
	 	</tr>
	</table>
<input type="submit" value="수정">	
</form>

</body>
</html>