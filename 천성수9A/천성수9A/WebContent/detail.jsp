<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="천성수9A.*"%>
<%@ include file="header.jsp" %>


<br>
<h2>▼메뉴를 선택하세요▼</h2>

<div id="wrap">		
	<c:forEach var="dto" items="${dao.selectAllList() }">
		<div class="item">
			<div class="img"><a href="${cpath }/detail-action.jsp?idx=${dto.idx }"><img width="300px;" src="image/${dto.imgPath }"></a></div>
			<div class="name">${dto.name }</div>
			<div class="category">${dto.category }</div>
			<div class="memo">${dto.memo }</div>
			<div class="price">${dto.price }</div>
		</div>
	</c:forEach>
</div>

</body>
</html>