<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>생일</th>
			<th>성별</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td>${dto.userid }</td>
				<td>${dto.userpw }</td>
				<td>${dto.userName }</td>
				<td>${dto.birth }</td>
				<td>${dto.gender }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<form method="POST">
	<p><input type="text" name="userid" placeholder="아이디" required></p>
	<p><input type="password" name="userpw" placeholder="비밀번호" required></p>
	<p><input type="text" name="userName" placeholder="이름" required></p>
	<p><input type="date" name="birth"></p>
	<p>
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