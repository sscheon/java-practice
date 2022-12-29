<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 2px solid black;
		border-collapse: collapse;
		margin: 20px;
	}
	td, th {
		padding: 10px 20px;
		border: 1px solid gray;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: underline;
	}
	li {
		list-style: none;
	}
	ul {
		display: flex;
		justify-content: space-around;
		font-size: 25px;
	}
</style>
</head>
<body>

<h1><a href="${cpath }">day03 - book</a></h1>
<nav>
	<ul>
		<li><a href="${cpath }/list">도서 목록 및 검색</a></li>		
		<li><a href="${cpath }/insert">도서 추가</a></li>
	</ul>
</nav>