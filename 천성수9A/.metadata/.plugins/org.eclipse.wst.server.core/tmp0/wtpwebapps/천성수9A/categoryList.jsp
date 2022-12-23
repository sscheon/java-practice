<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="천성수9A.*"%>

<%@ include file="header.jsp" %>

<br>
<fieldset class="categoryList">
	<legend class="legend">검색 할 항목을 선택하세요</legend>
	<form action="categoryList.jsp">
		<select name="category" required>
			<option value="">==분류선택==</option>
			<option>추천메뉴</option>
			<option>치킨세트</option>
			<option>버거세트</option>
			<option>스낵사이드</option>
			<option>음료</option>
		</select>
		<input type="submit" value="선택">
	</form>
</fieldset>

<br>
<div id="wrap">		
	<c:forEach var="dto" items="${dao.selectCaList(param.category) }">
		<div class="item">
			<div class="img"><img width="300px;" src="image/${dto.imgPath }"></div>
			<div class="name">${dto.name }</div>
			<div class="memo">${dto.memo }</div>
			<div class="price">${dto.price }</div>
		</div>
	</c:forEach>
</div>


</body>
</html>