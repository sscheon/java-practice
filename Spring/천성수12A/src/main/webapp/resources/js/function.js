function getChart(arr) {
	const context = document.getElementById('myChart')
	const labels = arr.map(e => e.날짜)
	const data = {
		labels: labels,
		datasets: [
			{
				label: '서울',
				data: arr.map(e => e.서울),
				backgroundColor: 'lightskyblue',
				pointBorderColor: 'lightskyblue',
				pointBorderWidth: 7,
				borderColor: 'lightskyblue',
				borderWidth: 4,
				
			},
			{
				label: '부산',
				data: arr.map(e => e.부산),
				backgroundColor: 'lightpink',
				pointBorderColor: 'lightpink',
				pointBorderWidth: 7,
				borderColor: 'lightpink',
				borderWidth: 4,
			}
		]
	}
	const config = {
		type: 'line',
		data: data,
		options: {},
	}
	const myChart = new Chart(context, config)
}