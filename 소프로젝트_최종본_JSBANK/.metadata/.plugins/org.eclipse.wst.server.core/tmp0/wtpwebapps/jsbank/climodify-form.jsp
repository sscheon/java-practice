<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.CliDAO"%>
<%@ include file="clilist.jsp" %>
<br>

<jsp:useBean id="dao2" class="jsbank.CliDAO" />
<c:set var="dto" value="${dao2.selectOne(param.clino) }" />


<form method="POST" action="climodify-action.jsp">
<fieldset style="width:800px">
<legend class="legend">고객 수정</legend>
<p><input type="hidden" name="clino" value="${dto.clino }"></p>
<p>	이름	 : <input type="text" name="cname" value="${dto.cname }" required>
	주민번호 : <input type="text" name="regnum" value="${dto.regnum }" required>
	전화번호 : <input type="text" name="cphonenum" value="${dto.cphonenum }"  required>
</p>
<p>	
	주소   : <input type="text" name="address" value="${dto.address }" required>
계좌번호   : <input type="text" name="acntnum" value="${dto.acntnum }"  required>
이메일     : <input type="text" name="cliemail" value="${dto.cliemail }"  required >
</p>
<p>상품번호 : <input type="number" name="bpno" value="${dto.bpno }" required>
고객 신용등급 :	
		<select name="grade" required>
			<option value="">==신용등급(1등급 ~ 10등급)==</option>
			<option ${dto.grade == '1등급(VIP)' ? 'selected' : '' }>1등급(VIP)</option>
			<option ${dto.grade == '2등급' ? 'selected' : '' }>2등급</option>
			<option ${dto.grade == '3등급' ? 'selected' : '' }>3등급</option>
			<option ${dto.grade == '4등급' ? 'selected' : '' }>4등급</option>
			<option ${dto.grade == '5등급' ? 'selected' : '' }>5등급</option>
			<option ${dto.grade == '6등급' ? 'selected' : '' }>6등급</option>
			<option ${dto.grade == '7등급' ? 'selected' : '' }>7등급</option>
			<option ${dto.grade == '8등급' ? 'selected' : '' }>8등급</option>
			<option ${dto.grade == '9등급' ? 'selected' : '' }>9등급</option>
			<option ${dto.grade == '10등급' ? 'selected' : '' }>10등급</option>
		</select>
	</p>
	
<p>가입일자 : <input type="text" name="bpdate" value="${dto.bpdate }" placeholder="yyyy-MM-dd" required>
담당자 번호 : <input type="number" name="empno" value="${dto.empno }" required >
</p>
	<p><input style="width:80px; height:40px; font-size:15px; font-weight:bold;" type="submit" value="수정"></p>
</fieldset>
</form>
</body>
</html>