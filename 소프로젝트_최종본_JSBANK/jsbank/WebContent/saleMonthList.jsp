<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.SaleDAO" %>
<%@ include file="header.jsp" %>
<fieldset style="width:30%;">

<legend class="legend">검색하실 연월을 선택하세요</legend>
<form action="saleMonthList.jsp">
	<select style="width:200px; height:30px;" name="year" required>
		<option value="">년도선택</option>
		<option>2022</option>
		<option>2021</option>
	</select>
	<select style="width:200px; height:30px;" name="month" required>
		<option value="">월 선택</option>
		<option>01</option>
		<option>02</option>
		<option>03</option>
		<option>04</option>
		<option>05</option>
		<option>06</option>
		<option>07</option>
		<option>08</option>
		<option>09</option>
		<option>10</option>
		<option>11</option>
		<option>12</option>
	</select>
	<input style="height:30px" type="submit" value="검색">
</form>
</fieldset>

<br>

<table class="scrolltable4" >
	<thead>
		<tr>
			<th>가입일</th>
			<th>고객번호</th>
			<th>고객이름</th>
			<th>신용등급</th>
			<th>상품번호</th>
			<th>상품이름</th>
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
	<c:forEach var="dto" items="${dao4.selectMonthList(param.year, param.month) }">
		<tr>
			<td>${dto.bpdate }</td>
			<td>${dto.clino }</td>
			<td>${dto.cname }</td>
			<td>${dto.grade }</td>
			<td>${dto.bpno }</td>
			<td>${dto.bpname }</td>
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

</body>
</html>