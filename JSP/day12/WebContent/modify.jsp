<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<h3>수정할 식당을 선택하세요</h3>

<table>
	<thead>
		<tr>
			<th>관리번호</th>
			<th>카테고리</th>
			<th>식당이름</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>주차여부</th>
			<th>등록날짜</th>
		</tr>
	</thead>
	<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />	
	<tbody>
		<c:forEach var="dto" items="${dao.showList() }">
			<tr>
				<td>${dto.idx }</td>
				<td>${dto.category }</td>
				<td>${dto.storeName }</td>
				<td>${dto.address }</td>
				<td>${dto.phoneNum }</td>
				<td>${dto.parking }</td>
				<td>${dto.joinDate }</td>
				<td>
					<a href="modify-form.jsp?idx=${dto.idx }"><button>수정</button></a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>