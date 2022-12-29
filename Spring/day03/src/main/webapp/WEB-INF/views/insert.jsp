<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<form method="POST">
	<p>도서 제목 : <input type="text" name="name" placeholder="도서 제목" required autofocus></p>
	<p>저자 : <input type="text" name="author" placeholder="저자" required></p>
	<p>출판사 : <input type="text" name="publisher" placeholder="출판사" required></p>
	<p>출판일 : <input type="date" name="publishDate" required></p>
	<p>가격 : <input type="number" min="0" max="500000" name="price" placeholder="가격" required></p>
	<p>내용 : <input type="text" name="memo" placeholder="내용" required></p>
	<p>평점 : <input type="number" name="score" placeholder="평점" min="0.00" max="10.00" step="0.01" required></p>
	<p><input type="submit" value="추가" ></p>
</form>

</body>
</html>