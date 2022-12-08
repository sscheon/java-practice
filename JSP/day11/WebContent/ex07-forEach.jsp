<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex07-forEach</title>
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

<%
	String[] arr = { "AAA", "BBB", "CCC", "DDD", "EEE" };
	pageContext.setAttribute("arr", arr);
%>

<h1>c:forEach</h1>
<hr>

<table>
	<thead>
		<tr>
			<th>item</th>
			<th>var</th>
			<th>st.index</th>
			<th>st.count</th>
			<th>st.first</th>
			<th>st.last</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="i" begin="0" end="4" step="1" varStatus="st">
			<tr>
				<td>${arr[i] }</td>
				<td>${i }</td>
				<td>${st.index }</td>
				<td>${st.count }</td>
				<td>${st.first }</td>
				<td>${st.last }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<table>
	<thead>
		<tr>			
			<th>var</th>
			<th>st.index</th>
			<th>st.count</th>
			<th>st.first</th>
			<th>st.last</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${arr }" varStatus="st">
			<tr>
				<td>${item }</td>				
				<td>${st.index }</td>
				<td>${st.count }</td>
				<td>${st.first }</td>
				<td>${st.last }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>