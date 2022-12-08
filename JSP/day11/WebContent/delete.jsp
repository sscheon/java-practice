<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>삭제할 물건의 idx를 입력하세요</h3>

<form action="delete-action.jsp">
	<p><input type="number" name="idx" placeholder="idx" required></p>
	<p><input type="submit" value="삭제"></p>
</form>

</body>
</html>