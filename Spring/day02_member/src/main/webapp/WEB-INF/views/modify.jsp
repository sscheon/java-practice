<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p>아이디 : <input type="text" name="userid" placeholder="ID" value="${dto.userid }" required readonly></p>
	<p>비밀번호 : <input type="password" name="userpw" placeholder="Password" value="${dto.userpw }" required></p>
	<p>이름 : <input type="text" name="username" placeholder="name" value="${dto.username }" required></p>
	<p>생일 : <input type="date" name="birth" value="${dto.birth }"></p>
	<p>성별 : 
		남<input type="radio" name="gender" value="남성" ${dto.gender == '남성' ? 'checked' : '' }>
		여<input type="radio" name="gender" value="여성"${dto.gender == '여성' ? 'checked' : '' }>
	</p>
	<p><input type="submit" value="수정"></p>
</form>

</body>
</html>