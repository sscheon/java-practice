<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.BPDAO"%>
<%@ include file="bplist.jsp" %>

<br>
<jsp:useBean id="dao3" class="jsbank.BPDAO" />
<c:set var="dto" value="${dao3.selectOne(param.bpno) }" />


<form method="POST" action="bpmodify-action.jsp">
<fieldset style="width:850px">
<legend class="legend">상품 수정</legend>
	<p><input type="hidden" name="bpno" value="${dto.bpno }"></p>
	<p>상품명 : <input type="text" name="bpname" value="${dto.bpname }" required>
		가입조건 : 
		<select name="regcon" required>
			<option value="">==선택하세요 (1~10등급)==</option>
			<option ${dto.regcon == '1등급이상' ? 'selected' : '' }>1등급이상</option>
			<option ${dto.regcon == '2등급이상' ? 'selected' : '' }>2등급이상</option>
			<option ${dto.regcon == '3등급이상' ? 'selected' : '' }>3등급이상</option>
			<option ${dto.regcon == '4등급이상' ? 'selected' : '' }>4등급이상</option>
			<option ${dto.regcon == '5등급이상' ? 'selected' : '' }>5등급이상</option>
			<option ${dto.regcon == '6등급이상' ? 'selected' : '' }>6등급이상</option>
			<option ${dto.regcon == '7등급이상' ? 'selected' : '' }>7등급이상</option>
			<option ${dto.regcon == '8등급이상' ? 'selected' : '' }>8등급이상</option>
			<option ${dto.regcon == '9등급이상' ? 'selected' : '' }>9등급이상</option>
			<option ${dto.regcon == '10등급이상' ? 'selected' : '' }>10등급이상</option>
		</select>
	
	가입기간 : 
		<select name="period" required>
			<option value="">==선택하세요==</option>
			<option ${dto.period == '1년' ? 'selected' : '' }>1년</option>
			<option ${dto.period == '2년' ? 'selected' : '' }>2년</option>
			<option ${dto.period == '3년' ? 'selected' : '' }>3년</option>
			<option ${dto.period == '4년' ? 'selected' : '' }>4년</option>
			<option ${dto.period == '5년이상' ? 'selected' : '' }>5년이상</option>
		</select>
	</p>
	<p>세전이자율 : <input type="text" name="taxrate" placeholder="세전이자율" value="${dto.taxrate }" required>
	최대우대금리 : <input type="text" name="maxrate" placeholder="최대우대금리" value="${dto.maxrate }" required >
	변동 : <input type="text" name="wave" placeholder="변동" value="${dto.wave }"></p>
	<p>비고 : <input style="width:450px" type="text" name="note" placeholder="비고" value="${dto.note }"></p>
	<p><input style="width:70px; height:40px; font-size:15px; font-weight:bold;" type="submit" value="수정"></p>
</fieldset>
</form>
</body>
</html>