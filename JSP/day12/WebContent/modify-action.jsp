<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO"/>
<jsp:useBean id="user" class="restaurant.RestaurantDTO"/>
<jsp:setProperty property="*" name="user"/>

<c:set var="row" value="${dao.update(user) }"/>

<c:if test="${row != 0 }">
	<h3>수정 성공</h3>
	<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</c:if>

<c:if test="${row == 0 }">
	<h3>수정 실패</h3>
	<button onclick="history.back()">이전으로</button>
</c:if>

</body>
</html>