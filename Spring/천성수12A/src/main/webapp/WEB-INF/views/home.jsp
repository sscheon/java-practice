<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>평가12A 통합구현(응시자 : 천성수)</title>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="${cpath }/resources/js/function.js"></script>
<link rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>

<h1>평가12A 통합구현(응시자 : 천성수)</h1>
<h3>서울과 부산의 미세먼지 농도차이 그래프</h3>
<hr>

<div id="root">
	<canvas id="myChart"></canvas>
</div>

<script>
	const url = '${cpath}/air'
	fetch(url)
	.then(resp => resp.json())
	.then(json => {
		const arr = json.response.body.items.map(e => {
			return {'서울':e.seoul, '부산':e.busan, '날짜':e.dataTime}
		})
		
		arr.sort((a, b) => a.날짜 > b.날짜 ? 1 : -1)
		const chart = getChart(arr)
	})	
</script>

</body>
</html>