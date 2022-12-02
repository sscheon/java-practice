<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="day08.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03</title>
<style>
	div.wrap {
		width: 900px;
		display: flex;
		flex-flow: wrap;
	}
	div.item {
		width: 200px;		
		display: flex;
		flex-flow: column;
		margin: 10px;
		padding: 10px;
		border: 1px solid #dadada;
		border-radius: 20px;
		cursor: pointer;
		text-align: center;
	}
	div.item:hover {
		background-color: #f5f6f7;
	}
	div.recent {
		width: 200px;
		height: 500px;
		background-color: #dadada;
		position: fixed;
		top: 100px;
		right: 20px;
	}
	h4 {
		text-align: center;
	}
	div.recent > div.item {
		width: 150px;
	}
	div.recent > div.item > div.img {
		position: relative;
	}
	div.recent > div.item > div.img > div.close {
		position: absolute;
		display: none;
		top: 0;
		right: 0;
	}
	div.recent > div.item > div.img > div.close > a {
		background-color: black;
		color: white;
		font-weight: bold;
		text-decoration: none;
		display: block;
		width: 25px;
		height: 25px;
	}
	div.recent > div.item > div.img:hover > div.close {
		display: block;
	}
</style>
</head>
<body>

<%
	ArrayList<Product> list = (ArrayList<Product>)application.getAttribute("list");

	if(list == null) {
		Product[] arr = {
			new Product("숏패딩", 50000, "1.jpg"),
			new Product("올흰스니커즈", 110000, "2.jpg"),
			new Product("롱패딩", 140000, "3.jpg"),
			new Product("집업숏패딩", 240000, "4.jpg"),
			new Product("흰빨스니커즈", 80000, "5.jpg"),
		};
		list = new ArrayList(Arrays.asList(arr));
		application.setAttribute("list", list);
	}
%>

<h1>상품 목록</h1>
<hr>

<div class="wrap">
	<%
		for(Product product : list) {
			pageContext.setAttribute("product", product);
			%>
			<div class="item">
				<div class="img">
					<a href="ex03-detail.jsp?idx=${product.idx }">
						<img src="img/${product.imgPath }" width="150" height="170">
					</a>
				</div>
				<div class="name">${product.name }</div>
				<div class="price">${product.price }원</div>
			</div>

	<%	} %>
</div>

<%
	int recent = -1;
	Cookie[] cookies = request.getCookies();
	for(int i = 0; cookies != null && i < cookies.length; i++) {
		if(cookies[i].getName().equals("recent")) {
			recent = Integer.parseInt(cookies[i].getValue());
			break;
		}
	}
	if(recent != -1) {
		for(Product p : list) {
			if(p.getIdx() == recent) {
				pageContext.setAttribute("recent", p);
			}
		}
		%>
		<div class="recent">
			<h4>최근 본 상품</h4>
			<div class="item">
				<div class="img">
					<div class="close">
						<a href="ex03-delete.jsp">X</a>
					</div>
					<a href="ex03-detail.jsp?idx=${recent.idx }">
						<img src="img/${recent.imgPath }" width="100">
					</a>
				</div>
				<div class="name">${recent.name }</div>
			</div>
		</div>		
<%	} %>

</body>
</html>