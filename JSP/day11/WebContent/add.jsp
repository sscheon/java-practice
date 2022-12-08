<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST" action="add-action.jsp">
	<p><input type="number" name="idx" placeholder="idx" required></p>
	<p><input type="text" name="name" placeholder="name" required></p>
	<p><input type="number" name="price" placeholder="price" required></p>
	<p><input type="text" name="imgPath" placeholder="imgPath" required></p>
	<p><input type="submit" value="추가"></p>	
</form>

</body>
</html>