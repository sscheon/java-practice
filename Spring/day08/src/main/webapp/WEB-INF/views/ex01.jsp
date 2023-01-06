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
<br>
<br>
<h3>추가</h3>
<form method="POST">
	<p>아이디 : <input type="text" name="userid" placeholder="아이디" autofocus></p>
	<p>비밀번호 : <input type="password" name="userpw" placeholder="비밀번호"></p>
	<p>이름 : <input type="text" name="userName" placeholder="이름"></p>
	<p>생일 : <input type="date" name="birth"></p>
	<p>성별 : 
		<select name="gender">
			<option value="">== 성별 ==</option>
			<option value="남성">남성</option>
			<option value="여성">여성</option>
		</select>
	</p>
	<input type="submit" value="추가">
</form>
</body>
</html>