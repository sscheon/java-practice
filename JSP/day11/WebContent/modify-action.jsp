<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="dao" class="product.ProductDAO"/>

<jsp:useBean id="user" class="product.ProductDTO"/>
<jsp:setProperty property="*" name="user"/>

<c:choose>
	<c:when test="${dao.update(user) == 1 }">
		<h3>수정성공</h3>
		<a href="${cpath }/list.jsp"><button>목록으로</button></a>
		<a href="${cpath }/index.jsp"><button>메인</button></a>
	</c:when>
	<c:otherwise>
		<h3>수정실패</h3>
		<a href="${cpath }/modify-form.jsp"><button>뒤로가기</button></a>
	</c:otherwise>
</c:choose>


</body>
</html>