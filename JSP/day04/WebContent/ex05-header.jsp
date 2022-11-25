<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05-header</title>
<style>
	a {
		text-decoration: none;
		color: inherit;
	}
</style>
</head>
<body>

<h1><a href="ex05-index.jsp">logo</a></h1>
<hr>

<nav>
	<ul>
		<li><a href="ex05-list.jsp">목록</a></li>
		<li><a href="ex05-add.jsp">추가</a></li>
		<li><a href="ex05-delete.jsp">삭제</a></li>
	</ul>
</nav>

<%--
	단독으로 사용될 일이 없고, 하단에 다른내용이 추가될 것이므로
	</html>, </body>와 같은내용을 제거한다
--%>