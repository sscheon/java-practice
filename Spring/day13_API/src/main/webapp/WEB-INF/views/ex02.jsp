<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.item {
		position: relative;
		border: 1px solid black;
		padding: 10px;
		margin: 10px 0;
	}
	.LAT, .LNG, .MAIN_IMG_THUMB, .UC_SEQ {
		display: none;
	}
	.MAIN_IMG_NORMAL {
		position: absolute;
		top: 10px;
		right: 10px;
		background-position: center center;
		background-size: auto 100%;
		width: 250px;
		height: 250px;
	}
</style>
</head>
<body>

<h1>부산축제정보</h1>
<hr>

<div id="root"></div>

<script src="${cpath }/resources/js/function.js"></script>
<script>

	const url = 'https://apis.data.go.kr/6260000/FestivalService/getFestivalKr?serviceKey=BUqn7KhXDZy%2BSvuyPyUSFqWhhfFcBR9tNIZLD%2F1jb9lFjFyQnK4SQM42exU70wRahiqpq6wmf8c%2BH37JG7b6zw%3D%3D&pageNo=1&numOfRows=20&resultType=json'
	fetch(url)
	.then(resp => resp.json())
	.then(json => {
		const arr = json.getFestivalKr.item
		arr.forEach(dto => root.innerHTML += getHTMLfromDTO(dto))
	})
	
</script>

</body>
</html>