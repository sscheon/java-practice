<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ex03.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-form</title>
</head>
<body>

<form action="ex03-action.jsp" method="POST" enctype="multipart/form-data">
	<p><input type="text" name="name" placeholder="Name" required autofocus></p>
	<p><input type="date" name="birthDate" required></p>
	<p><input type="file" name="uploadFile" required></p>
	<p><input type="submit"></p>	
</form>

<div id="root">
	<div class="wrap">
		<c:forEach var="dto" items="${dao.selectList() }">
			<div class="item">
				...
			</div>
		</c:forEach>
	</div>
</div>

</body>
</html>