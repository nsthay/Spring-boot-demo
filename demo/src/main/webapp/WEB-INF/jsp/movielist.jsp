<html>
<head>
<title>Demo Web Application</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 5px;
}
th {
	text-align: left;
}
</style>
</head>
<body>
	<b>Top 10 movies</b>
	<table style = "width:30%">
		<tr>
			<th>Ranking</th>
			<th>Poster</th>
			<th>Title</th>
			<th>Year</th>
			<th>Rating</th>
			<th>My Rating</th>
		</tr>
		<tr>
			<td>#${ranking1}</td>
			<td><img src="${posterURL1}" alt="movie poster"></td>
			<td>${title1}</td>
			<td>${year1}</td>
			<td>${rating1}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking2}</td>
			<td><img src="${posterURL2}" alt="movie poster"></td>
			<td>${title2}</td>
			<td>${year2}</td>
			<td>${rating2}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking3}</td>
			<td><img src="${posterURL3}" alt="movie poster"></td>
			<td>${title3}</td>
			<td>${year3}</td>
			<td>${rating3}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking4}</td>
			<td><img src="${posterURL4}" alt="movie poster"></td>
			<td>${title4}</td>
			<td>${year4}</td>
			<td>${rating4}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking5}</td>
			<td><img src="${posterURL5}" alt="movie poster"></td>
			<td>${title5}</td>
			<td>${year5}</td>
			<td>${rating5}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking6}</td>
			<td><img src="${posterURL6}" alt="movie poster"></td>
			<td>${title6}</td>
			<td>${year6}</td>
			<td>${rating6}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking7}</td>
			<td><img src="${posterURL7}" alt="movie poster"></td>
			<td>${title7}</td>
			<td>${year7}</td>
			<td>${rating7}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking8}</td>
			<td><img src="${posterURL8}" alt="movie poster"></td>
			<td>${title8}</td>
			<td>${year8}</td>
			<td>${rating8}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking9}</td>
			<td><img src="${posterURL9}" alt="movie poster"></td>
			<td>${title9}</td>
			<td>${year9}</td>
			<td>${rating9}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
		<tr>
			<td>#${ranking10}</td>
			<td><img src="${posterURL10}" alt="movie poster"></td>
			<td>${title10}</td>
			<td>${year10}</td>
			<td>${rating10}</td>
			<td><input type="text" placeholder="1-10" size="5"></td>
		</tr>
	</table>
</body>
</html>