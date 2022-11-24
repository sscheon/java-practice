<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04-form</title>
</head>
<body>

<h1>jsp:useBean (액션태그)</h1>
<hr>

<form action="ex04-result.jsp">
	<p><input type="text" name="name" placeholder="메뉴이름" required autofocus autocomplete="off"></p>
	<p><input type="number" name="price" placeholder="메뉴가격" required autocomplete="off"></p>
	<p><input type="submit"></p>
</form>

</body>
</html>