<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>테이블 데이터 수정하기 (3)</h1>
<hr>

<jsp:useBean id="dao" class="product.ProductDAO"/>

<jsp:useBean id="user" class="product.ProductDTO"/>
<jsp:setProperty property="*" name="user"/>
<h3>${dao.update(user) != 0 ? '수정성공' : '수정실패' }</h3>
<a href="ex03.jsp"><button>돌아가기</button></a>

</body>
</html>