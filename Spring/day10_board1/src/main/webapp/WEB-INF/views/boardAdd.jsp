<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p><input type="text" name="title" placeholder="제목을 입력하세요" autofocus></p>
	<p><input type="text" name="writer" value="${login.userid }" readonly></p>
	<p><textarea rows="30" cols="30" name="content" placeholder="내용을 입력하세요"></textarea></p>
	<input type="submit" value="추가">
</form>

</body>
</html>