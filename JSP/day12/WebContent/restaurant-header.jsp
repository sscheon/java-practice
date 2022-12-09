<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맛집 관리</title>
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
	h1 {
		text-align: center;
	}
	div > ul {
		display: flex;
		justify-content: space-around;
		margin: 20px 0;
		padding: 0;
	}
	div > ul > li {
		font-size: 20px;
		list-style: none;
		font-weight: bold;
	}
</style>
</head>
<body>
<header>	
	<h1><a href="${cpath }">맛집 관리 프로그램</a></h1>
	<hr>
	<div>
		<ul>
			<li><a href="${cpath }/list.jsp">목록</a></li>
			<li><a href="${cpath }/add.jsp">추가</a></li>
			<li><a href="${cpath }/modify.jsp">수정</a></li>
			<li><a href="${cpath }/delete.jsp">삭제</a></li>
		</ul>
	</div>
	
</header>