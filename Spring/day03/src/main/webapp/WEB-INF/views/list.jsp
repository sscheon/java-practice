<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p> 도서 검색 : 
	<input type="text" name="search" placeholder="책 검색" required>
	<input type="submit" value="검색">
	</p>
</form>

<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>책제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출판일</th>
			<th>가격</th>
			<th>내용</th>
			<th>평점</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.idx }</td>
			<td><a href="${cpath }/detail?idx=${dto.idx}">${dto.name }</a></td>
			<td>${dto.author }</td>
			<td>${dto.publisher }</td>
			<td>${dto.publishDate }</td>
			<td>${dto.price }원</td>
			<td>${dto.memo }</td>
			<td>${dto.score }</td>
			<td><a href="${cpath }/modify?idx=${dto.idx}"><button>수정</button></a></td>
			<td><a href="${cpath }/delete?idx=${dto.idx}"><button>삭제</button></a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>