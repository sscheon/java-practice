<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member3.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<c:set var="dao" value="${Member2DAO.getInstance() }"/>
<% request.setCharacterEncoding("UTF-8"); %>
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
</style>
</head>
<body>
<header>	
	<h1>회원 관리 프로그램</h1>
	<hr>
	<div>
		<ul>
			<li><a href="${cpath }/list.jsp">목록</a></li>		
		</ul>
	</div>	
</header>
