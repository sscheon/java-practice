<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<form method="POST" action="add-action.jsp">
	<p>
		<select name="category" required>
			<option value="">==선택하세요==</option>
			<option>한식</option>
			<option>중식</option>
			<option>일식</option>
			<option>양식</option>
			<option>기타</option>
		</select>
	</p>
	<p><input type="text" name="storeName" placeholder="가게이름" required></p>
	<p><input type="text" name="address" placeholder="가게주소" required></p>
	<p><input type="text" name="phoneNum" placeholder="전화번호" required></p>
	<p>주차장 여부 :
		<label><input type="radio" name="parking" value="y" required>y</label>
		<label><input type="radio" name="parking" value="n" required>n</label>
	</p>
	<p><input type="submit" value="추가"></p>
</form>


</body>
</html>