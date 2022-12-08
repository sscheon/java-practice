<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="dao" class="product.ProductDAO"/>

<table>
	<thead>
		<tr>
			<th>idx</th>
			<th>name</th>
			<th>price</th>
			<th>imgPath</th>
		</tr>		
	</thead>
	<tbody>
	<c:forEach var="st" items="${dao.showList() }">
		<tr>
		  <td>${st.idx }</td>
		  <td>${st.name }</td>
		  <td>${st.price }</td>
		  <td>${st.imgPath }</td>
		</tr>
	</c:forEach>	
	</tbody>
</table>


</body>
</html>