<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO"/>

<jsp:useBean id="user" class="restaurant.RestaurantDTO"/>
<jsp:setProperty property="*" name="user"/>

<c:set var="row" value="${dao.insert(user) }" />

<c:if test="${row != 0 }">
	<h3>추가성공!</h3>
	<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</c:if>

<c:if test="${row == 0 }">
	<h3>추가실패!</h3>
	<button onclick="history.back()">재시도</button>
</c:if>

</body>
</html>