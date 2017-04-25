<html>
	<head>
		<title>Owing List</title>
	</head>
	<body>
		
		<table border="1">
			<thead>
				<tr>
					<th><h3>Who owes to whom </h3></th>
				</tr>
			</thead>
			<tbody>
				<g:each in="${members}" var="it">
					<tr>
						<td>
							<b>${it.giver}</b> ows <b>${it.amount}</b> beer(s) to <b>${it.receiver}</b>
						</td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</body>
</html>