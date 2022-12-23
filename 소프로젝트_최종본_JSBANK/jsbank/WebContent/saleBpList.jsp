<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.SaleDAO"%>
<%@ include file="header.jsp" %>

<table class="scrolltable">
	<thead>
		<tr>
			<th>상품번호</th>
			<th>상품이름</th>
			<th>고객번호</th>
			<th>고객이름</th>
			<th>신용등급</th>
			<th>가입일</th>
			<th>가입조건</th>
			<th>가입기간</th>
			<th>세전이자율</th>
			<th>최대이자율</th>
			<th>적용이자율</th>
			<th>비고</th>
			<th>담당자번호</th>
			<th>담당자</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao4.selectBpList() }">
		<tr>
			<td>${dto.bpno }</td>
			<td>${dto.bpname }</td>
			<td>${dto.clino }</td>
			<td>${dto.cname }</td>
			<td>${dto.grade }</td>
			<td>${dto.bpdate }</td>
			<td>${dto.regcon }</td>
			<td>${dto.period }</td>
			<td>${dto.taxrate }</td>
			<td>${dto.maxrate }</td>
			<td>${dto.rate }</td>
			<td>${dto.note }</td>
			<td>${dto.empno }</td>
			<td>${dto.ename }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<br>
<h3>상품별 총 판매량</h3>
<table class="scrolltable3">
	<thead>
		<tr>
			<th>상품이름</th>
			<th>상품개수</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao4.selectBpTotalList() }">
		<tr>
			<td>${dto.bpname }</td>
			<td>${dto.bptotalnum }</td>
		</tr>
	</c:forEach>
	</tbody>
	

</table>
<%-- <h3>총 가입 고객 수 : ${ }명</h3> --%>

</body>
</html>