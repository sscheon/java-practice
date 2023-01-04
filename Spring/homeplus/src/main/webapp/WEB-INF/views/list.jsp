<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div>
	<p>
		<input type="text" name="search" placeholder="검색어를 입력하세요">
		<input type="submit" value="검색">
	</p>
</div>
<div class="list">
	<div class="wrap">
		<c:forEach var="dto" items="${list }">
			<div class="thumbnail"><img src="${cpath }/upload/${dto.thumbnail }" height="150px"></div>
			<div class="idx">${dto.idx }</div>
			<div class="category">${dto.category }</div>
			<div class="name">${dto.productName }</div>
			<div class="price">${dto.price }원</div>
			<div class="score">${dto.score }</div>
			<div class="date">${dto.registDate }</div>		
		</c:forEach>
	</div>
</div>

</body>
</html>