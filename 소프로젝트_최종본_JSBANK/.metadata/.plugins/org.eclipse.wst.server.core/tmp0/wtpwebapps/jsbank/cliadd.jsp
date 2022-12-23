<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.CliDAO"%>
<%@ include file="clilist.jsp" %>

<br>
<form method="POST" action="cliadd-action.jsp">
<fieldset style="width:800px">
<legend class="legend">고객 추가</legend>

<p>    이름 : <input type="text" name="cname" placeholder="고객이름" required autofocus>
   주민번호 : <input type="text" name="regnum" placeholder="주민등록번호" required>
   전화번호 : <input type="text" name="cphonenum" placeholder="전화번호" required>
</p>
<p>	   주소 : <input type="text" name="address" placeholder="주소" required>
   계좌번호 : <input type="text" name="acntnum" placeholder="계좌번호" required>
	 이메일 : <input type="text" name="cliemail" placeholder="이메일" required >
</p>
<p>상품번호 : <input style="width:135px" type="number" name="bpno" placeholder="상품번호(1 ~ 999)" required min="1" max="999">
고객 신용등급 : 	
		<select name="grade" required>
			<option value="">==신용등급(1등급 ~ 10등급)==</option>
			<option>1등급(VIP)</option>
			<option>2등급</option>
			<option>3등급</option>
			<option>4등급</option>
			<option>5등급</option>
			<option>6등급</option>
			<option>7등급</option>
			<option>8등급</option>
			<option>9등급</option>
			<option>10등급</option>
		</select>
	</p>
<p>가입일자 : <input style="width:135px" type="text" name="bpdate" placeholder="가입일(yyyy-MM-dd)" required>
담당자 번호 : <input style="width:80px" type="number" name="empno" placeholder="담당자번호(1000 ~ 2000)" required min="1001" max="2000" ></p>
	
	<p><input style="width:80px; height:40px; font-size:15px; font-weight:bold;"  type="submit" value="추가"></p>

</fieldset>
</form>
</body>
</html>