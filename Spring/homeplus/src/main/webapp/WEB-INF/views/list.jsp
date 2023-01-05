<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<form method="POST">
	<select name="category">
		<option value="사과">사과</option>
		<option value="배">배</option>
	</select>
	<p>
		<input type="text" name="search" placeholder="검색어를 입력하세요">
		<input type="submit" value="검색">
	</p>
</form>
<div class="wrap">
	<c:forEach var="dto" items="${list }">
		<div class="thumbnail">
			<a href="${cpath }/view/${dto.idx}">
				<img src="${cpath }/upload/${dto.thumbnail }" height="150px">
			</a>
		</div>
		<div class="idx">${dto.idx }</div>
		<div class="category">${dto.category }</div>
		<div class="name">${dto.productName }</div>
		<div class="price">${dto.price }원</div>
		<div class="score">${dto.score }</div>
		<div class="date">${dto.registDate }</div>		
	</c:forEach>
</div>


</body>
</html>