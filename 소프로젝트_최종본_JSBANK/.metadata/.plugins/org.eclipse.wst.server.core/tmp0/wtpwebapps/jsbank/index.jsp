<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<style type="text/css">
.cal_top {
	text-align: center;
	font-size: 30px;
}

.cal {
	text-align: center;
}

table.calendar {
	border: 1px solid black;
	display: inline-table;
	text-align: left;
}

table.calendar td {
	vertical-align: top;
	border: 1px solid skyblue;
	width: 100px;
}
</style>
<div class="cal_top">
	<a href="#" id="movePrevMonth"><span id="prevMonth" class="cal_tit">&lt;</span></a>
	<span id="cal_top_year"></span> <span id="cal_top_month"></span> <a
		href="#" id="moveNextMonth"><span id="nextMonth" class="cal_tit">&gt;</span></a>
</div>
<div id="cal_tab" class="cal"></div>

<script type="text/javascript">
	var today = null;
	var year = null;
	var month = null;
	var firstDay = null;
	var lastDay = null;
	var $tdDay = null;
	var $tdSche = null;
	var jsonData = null;
	$(document).ready(function() {
		drawCalendar();
		initDate();
		drawDays();
		drawSche();
		$("#movePrevMonth").on("click", function() {
			movePrevMonth();
		});
		$("#moveNextMonth").on("click", function() {
			moveNextMonth();
		});
	});

	//Calendar 그리기
	function drawCalendar() {
		var setTableHTML = "";
		setTableHTML += '<table class="calendar">';
		setTableHTML += '<tr><th>SUN</th><th>MON</th><th>TUE</th><th>WED</th><th>THU</th><th>FRI</th><th>SAT</th></tr>';
		for (var i = 0; i < 6; i++) {
			setTableHTML += '<tr height="100">';
			for (var j = 0; j < 7; j++) {
				setTableHTML += '<td style="text-overflow:ellipsis;overflow:hidden;white-space:nowrap">';
				setTableHTML += '    <div class="cal-day"></div>';
				setTableHTML += '    <div class="cal-schedule"></div>';
				setTableHTML += '</td>';
			}
			setTableHTML += '</tr>';
		}
		setTableHTML += '</table>';
		$("#cal_tab").html(setTableHTML);
	}

	//날짜 초기화
	function initDate() {
		$tdDay = $("td div.cal-day")
		$tdSche = $("td div.cal-schedule")
		dayCount = 0;
		today = new Date();
		year = today.getFullYear();
		month = today.getMonth() + 1;
		if (month < 10) {
			month = "0" + month;
		}
		firstDay = new Date(year, month - 1, 1);
		lastDay = new Date(year, month, 0);
	}

	//calendar 날짜표시
	function drawDays() {
		$("#cal_top_year").text(year);
		$("#cal_top_month").text(month);
		for (var i = firstDay.getDay(); i < firstDay.getDay()
				+ lastDay.getDate(); i++) {
			$tdDay.eq(i).text(++dayCount);
		}
		for (var i = 0; i < 42; i += 7) {
			$tdDay.eq(i).css("color", "red");
		}
		for (var i = 6; i < 42; i += 7) {
			$tdDay.eq(i).css("color", "blue");
		}
	}

	//calendar 월 이동
	function movePrevMonth() {
		month--;
		if (month <= 0) {
			month = 12;
			year--;
		}
		if (month < 10) {
			month = String("0" + month);
		}
		getNewInfo();
	}

	function moveNextMonth() {
		month++;
		if (month > 12) {
			month = 1;
			year++;
		}
		if (month < 10) {
			month = String("0" + month);
		}
		getNewInfo();
	}

	//정보갱신
	function getNewInfo() {
		for (var i = 0; i < 42; i++) {
			$tdDay.eq(i).text("");
			$tdSche.eq(i).text("");
		}
		dayCount = 0;
		firstDay = new Date(year, month - 1, 1);
		lastDay = new Date(year, month, 0);
		drawDays();
		drawSche();
	}

	//2019-08-27 추가본

	//데이터 등록
	function setData() {
		jsonData = {
			"2022" : {
				"12" : {
					"22" : "지리는발표일",
					"23" : "시험일",
					"25" : "메리크리스마스"
				}
				
			}
		}
	}

	//스케줄 그리기
	function drawSche() {
		setData();
		var dateMatch = null;
		for (var i = firstDay.getDay(); i < firstDay.getDay()
				+ lastDay.getDate(); i++) {
			var txt = "";
			txt = jsonData[year];
			if (txt) {
				txt = jsonData[year][month];
				if (txt) {
					txt = jsonData[year][month][i];
					dateMatch = firstDay.getDay() + i - 1;
					$tdSche.eq(dateMatch).text(txt);
				}
			}
		}
	}
</script>

</body>
</html>