<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="user" class="product.ProductDTO"/>
<jsp:setProperty property="*" name="user"/>

<jsp:useBean id="dao" class="product.ProductDAO"/>
<%-- <h3>${dao.insert(user) == 1 ? '추가성공' : '추가실패' }</h3> --%>
<c:choose>
	<c:when test="${dao.insert(user) == 1 }">
		<h3>추가성공</h3>
		<a href="${cpath }/list.jsp"><button>목록으로</button></a>
		<a href="${cpath }/index.jsp"><button>메인</button></a>
	</c:when>
	<c:otherwise>
		<h3>추가실패</h3>
		<a href="${cpath }/add.jsp"><button>재시도</button></a>
	</c:otherwise>
</c:choose>
</body>
</html>