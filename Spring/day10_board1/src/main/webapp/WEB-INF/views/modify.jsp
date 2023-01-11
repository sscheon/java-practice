<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>정보수정</h3>

<form method="POST">	
	<p><input type="hidden" name="idx" value="${ob.idx }"></p>
	<p>아이디 : <input type="text" name="userid" value="${ob.userid }" placeholder="아이디" readonly></p>
	<p>비밀번호 : <input type="password" name="userpw" value="${ob.userpw }" placeholder="비밀번호" required></p>
	<p>이름 : <input type="text" name="userName" value="${ob.userName }" placeholder="이름" required></p>
	<p>생년월일 : <input type="date" name="birth" value="${ob.birth }"></p>
	<p>성별 : 
		<select name="gender">
			<option value="">==성별==</option>
			<option value="남성" ${ob.gender == '남성' ? 'selected' : '' }>남성</option>
			<option value="여성" ${ob.gender == '여성' ? 'selected' : '' }>여성</option>
		</select>
	</p>
	<p><input type="submit" value="수정"></p>
</form>

</body>
</html>