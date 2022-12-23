<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.BPDAO"%>
<%@ include file="bplist.jsp" %>

<br>
<form method="POST" action="bpadd-action.jsp">
<fieldset style="width:850px">
<legend class="legend">상품 추가</legend>
<p>상품명 : <input type="text" name="bpname" placeholder="이름" required autofocus>
	가입조건 : 	
		<select name="regcon" required>
			<option value="">==선택하세요 (1~10등급)==</option>
			<option>1등급이상</option>
			<option>2등급이상</option>
			<option>3등급이상</option>
			<option>4등급이상</option>
			<option>5등급이상</option>
			<option>6등급이상</option>
			<option>7등급이상</option>
			<option>8등급이상</option>
			<option>9등급이상</option>
			<option>10등급이상</option>
		</select>
	
	가입기간 : 
		<select name="period" required>
			<option value="">==선택하세요==</option>
			<option>1년</option>
			<option>2년</option>
			<option>3년</option>
			<option>4년</option>
			<option>5년이상</option>
		</select>
</p>
<p>세전이자율 : <input type="text" name="taxrate" placeholder="세전이자율" required>
	최대우대금리 : <input type="text" name="maxrate" placeholder="최대우대금리" required >
	변동 : <input type="text" name="wave" placeholder="변동">
	</p>
<p>비고 : <input type="text" name="note" placeholder="비고"></p>
<p><input style="width:70px; height:40px; font-size:15px; font-weight:bold;" type="submit" value="추가"></p>
	
</fieldset>
</form>
</body>
</html>