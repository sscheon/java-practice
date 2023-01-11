<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>게시판 목록</h3>

<a href="${cpath }/board/boardAdd"><button>글쓰기</button></a>
<br>
<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>글쓴이</th>
			<th>제목</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td><a href="${cpath }/board/view/${dto.idx }">${dto.idx }</a></td>
			<td><a href="${cpath }/board/view/${dto.idx }">${dto.writer }</a></td>
			<td><a href="${cpath }/board/view/${dto.idx }">${dto.title }</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>