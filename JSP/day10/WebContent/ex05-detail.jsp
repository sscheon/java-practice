<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05-detail</title>
</head>
<body>

<h1>${param.idx }번 상품 상세보기</h1>
<hr>
<jsp:useBean id="dao" class="product.ProductDAO" />

<c:set var="pro" value="${dao.selectOne(param.idx) }" />

<div class="item">
	<div class="img">	
		<img src="img/${pro.imgPath }">	
	</div>
	<div class="name">${pro.name }</div>
	<div class="price">${pro.price }원</div>
</div>

</body>
</html>