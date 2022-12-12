<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<table>
	<thead>
		<tr>
			<th>관리번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>가입일자</th>
			<th>성별</th>
			<th>사진</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao.showList() }">
		<tr>
			<td>${dto.idx }</td>
			<td>
				<a href="${cpath }/detail.jsp?idx=${dto.idx }">${dto.userid }</a>
			</td>
			<td>${dto.userpw }</td>
			<td>${dto.username }</td>
			<td>${dto.joindate }</td>
			<td>${dto.gender }</td>
			<td>${dto.profileimg }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>