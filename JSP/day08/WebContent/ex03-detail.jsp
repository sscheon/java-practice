<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, day08.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-detail</title>
</head>
<body>

<h1>상세 페이지</h1>
<hr>

<%
	int idx = Integer.parseInt(request.getParameter("idx"));
	ArrayList<Product> list = (ArrayList<Product>)application.getAttribute("list");
	
	Product product = null;
	for(Product p : list) {
		if(p.getIdx() == idx) {
			product = p;
			break;
		}
	}
	if(product == null) {
		response.sendRedirect("ex03.jsp");
	}
	pageContext.setAttribute("product", product);
%>

<div class="item">
	<div class="img">		
		<img src="img/${product.imgPath }" width="500" height="550">	
	</div>
	<div class="name">${product.name }</div>
	<div class="price">${product.price }원</div>
</div>

<a href="ex03.jsp"><button>목록으로</button></a>

<%
	Cookie cookie = new Cookie("recent", product.getIdx() + "");

	cookie.setMaxAge(60 * 5);
	
	response.addCookie(cookie);
%>

</body>
</html>