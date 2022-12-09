<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO"/>
<c:set var="dto" value="${dao.selectOne(param.idx) }"/>

<form method="POST" action="modify-action.jsp">
	<p>
		<select name="category" required>
			<option value="">==선택하세요==</option>
			<option ${dto.category == '한식' ? 'selected' : '' }>한식</option>
			<option ${dto.category == '중식' ? 'selected' : '' }>중식</option>
			<option ${dto.category == '일식' ? 'selected' : '' }>일식</option>
			<option ${dto.category == '양식' ? 'selected' : '' }>양식</option>
			<option ${dto.category == '기타' ? 'selected' : '' }>기타</option>
		</select>
	</p>
	<p><input type="number" name="idx" placeholder="관리번호" value="${dto.idx }" readonly></p>
	<p><input type="text" name="storeName" placeholder="가게이름" value="${dto.storeName }" required></p>
	<p><input type="text" name="address" placeholder="가게주소" value="${dto.address }" required></p>
	<p><input type="text" name="phoneNum" placeholder="전화번호" value="${dto.phoneNum }" required></p>
	<p>주차장 여부 :
		<label><input type="radio" name="parking" value="y" ${dto.parking == 'y' ? 'checked' : '' } required>y</label>
		<label><input type="radio" name="parking" value="n" ${dto.parking == 'n' ? 'checked' : '' } required>n</label>
	</p>
<%-- 	<p><input type="date" name="joinDate" placeholder="등록날짜" value="${dto.joinDate }" readonly></p> --%>
	<p><input type="submit" value="수정"></p>
</form>

</body>
</html>