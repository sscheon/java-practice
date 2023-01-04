<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="date" class="java.util.Date"/>
<fmt:formatDate var="now" value="${date }" pattern="yyyy-MM-dd"/>
<%
	java.util.Date day = new java.util.Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String now = sdf.format(day);
%>
<hr>
<h3>품목 추가</h3>
<form method="POST" enctype="multipart/form-data">
	<label>카테고리 : 
		<select name="category">
			<option value="">==선택하세요==</option>
			<option>사과</option>
			<option>배</option>
		</select>
	</label>
	<p>품목명 : <input type="text" name="productName" placeholder="품목명" required></p>
	<p>가격 : <input type="number" name="price" min="0" max="500000" placeholder="가격" required></p>
	<p>평점 : <input type="number" name="score" min="0" max="5" step="0.1" placeholder="평점" required></p>
	<p>썸네일 파일 : <input type="file" name="fileName"></p>
	<p>상세보기 파일 : <input type="file" name="fileName2"></p>
	<p>등록일자 : <input type="date" name="registDate" value="${now }"></p>
	<p><input type="submit" value="추가"></p>
</form>

</body>
</html>