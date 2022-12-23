<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="천성수9A.*"%>

<%@ include file="header.jsp" %>

<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<div id="wrap">		
	<div class="item">			
		<div class="img"><img width="300px;" src="image/${dto.imgPath }"></div>
		<div class="name">${dto.name }</div>
		<div class="memo">${dto.memo }</div>
		<div class="price">${dto.price }</div>
		<div class="button"><a href="modify-form.jsp?idx=${dto.idx }"><button>수정</button></a></div>
	</div>
</div>


</body>
</html>