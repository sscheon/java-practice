<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04</title>
<style>
	table {
		border: 2px solid black;
		border-collapse: collapse;
	}
	thead th {
		background-color: #dadada;
	}
	td,th {
		padding: 10px 20px;
		border: 1px solid gray;
	}
</style>
</head>
<body>

<form>
	<p>
	<input type="search" name="keyword" placeholder="검색" autocomplete="off">
	<input type="submit" value="검색">
	</p>
</form>

<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>NAME</th>
			<th>PRICE</th>
			<th>IMGPATH</th>
		</tr>
	</thead>
	<jsp:useBean id="dao" class="product.ProductDAO"/>
	<c:forEach var="st" items="${empty param.keyword ? dao.selectList() : dao.selectListByName(param.keyword) }">
		<tr>
			<td>${st.idx }</td>
			<td>${st.name }</td>
			<td>${st.price }원</td>
			<td>${st.imgPath }</td>
		</tr>
	</c:forEach>	
</table>
</body>
</html>