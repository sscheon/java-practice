<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.BPDAO"%>
<%@ include file="header.jsp" %>


<table class="scrolltable">
	<thead>
		<tr>
			<th style="width:60px">상품번호</th>
			<th style="width:130px">상품이름</th>
			<th>가입조건</th>
			<th>가입기간</th>
			<th>세전이자율</th>
			<th>최대우대금리</th>
			<th style="width:40px">변동</th>
			<th style="width:250px">비고</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao3.selectList() }">
		<tr>
			<td style="width:60px">${dto.bpno }</td>
			<td style="width:130px">${dto.bpname }</td>
			<td>${dto.regcon }</td>
			<td>${dto.period }</td>
			<td>${dto.taxrate }%</td>
			<td>${dto.maxrate }%</td>
			<td style="width:40px" >${dto.wave }%</td>
			<td style="width:250px" >${dto.note }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>


</body>
</html>