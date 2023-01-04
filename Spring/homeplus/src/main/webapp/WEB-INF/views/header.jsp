<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath">${pageContext.request.contextPath }</c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homeplus</title>
<style>
	.list {
		display: flex;
	}
	.wrap {
		display: flex;
		flex-flow: wrap;
		width: 900px;
		margin: auto;
	}
</style>
</head>
<body>

<header>
	<h1><a href="${capth }/home">Homeplus</a></h1>	
</header>



