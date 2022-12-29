<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day02</title>
</head>
<body>

<h1>day02</h1>
<hr>

<h3>DB Version : ${version }</h3>

<a href="${cpath }/ex01">student1 테이블 목록</a>
<a href="${cpath }/ex02">student1 테이블 목록 추가</a>

</body>
</html>