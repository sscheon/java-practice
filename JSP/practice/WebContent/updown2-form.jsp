<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updown2-form</title>
</head>
<body>

<h1>UP DOWN GAME</h1>
<hr>

<form action="updown2-action.jsp" method="POST">
	<input type="number" name="user" min="1" max="100" placeholder="1~100" required autofocus>
	<input type="submit" value="확인">
</form>

<h3>${msg }</h3>

</body>
</html>