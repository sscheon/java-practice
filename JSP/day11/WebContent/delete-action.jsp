<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="dao" class="product.ProductDAO" />

<%-- <h3>${dao.delete(param.idx) == 1 ? '삭제성공' : '삭제실패' }</h3> --%>

<c:choose>
	<c:when test="${dao.delete(param.idx) == 1 }">
		<c:set var="delete" value="삭제 성공"/>	
	</c:when>
	
	<c:otherwise>
		<c:set var="delete" value="삭제 실패"/>
	</c:otherwise>
</c:choose>

<h3>${delete }</h3>
<a href="${cpath }/delete.jsp"><button>뒤로가기</button></a>
<a href="${cpath }/list.jsp"><button>목록으로</button></a>
<a href="${cpath }/index.jsp"><button>메인</button></a>

</body>
</html>