<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05</title>
<style>
	#wrap {
		width: 800px;
		display: flex;
		flex-flow: wrap;
		margin: auto;
	}
	div.item {
		width: 200px;		
		display: flex;
		flex-flow: column;
		margin: 10px;
		padding: 10px;
		border: 1px solid #dadada;
		cursor: pointer;
		text-align: center;
	}
	div.item:hover {
		background-color: #f5f6f7;
	}
	img {
		width: 150px;
		height: 170px;
	}
	form > p {
		display: flex;
		justify-content: center;
	}
</style>
</head>
<body>

<h1>상품 목록</h1>
<hr>

<jsp:useBean id="dao" class="product.ProductDAO"/>
<div id="wrap">
<c:forEach var="pro" items="${empty param.keyword ? dao.selectList() : dao.selectListByName(param.keyword) }">
	<div class="item">
		<div class="img">
			<a href="ex05-detail.jsp?idx=${pro.idx }" title="상세보기">
				<img src="img/${pro.imgPath }">
			</a>
		</div>
		<div class="name">${pro.name }</div>
		<div class="price">${pro.price }원</div>
	</div>
</c:forEach>
</div>

<form>
	<p>
	<input type="search" name="keyword" placeholder="검색" autocomplete="off">
	<input type="submit" value="검색">
	</p>
</form>

</body>
</html>