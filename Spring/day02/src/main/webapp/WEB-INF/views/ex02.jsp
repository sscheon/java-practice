<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>학생 추가</h1>
<hr>

<form method="POST">
	<p>이름 : <input type="text" name="name" placeholder="이름" required autofocus></p>
	<p>국어점수 : <input type="text" name="kor" placeholder="국어점수" required></p>
	<p>영어점수 : <input type="text" name="eng" placeholder="영어점수" required></p>
	<p>수학점수 : <input type="text" name="mat" placeholder="수학점수" required></p>
	<p><input type="submit"></p>
</form>

</body>
</html>