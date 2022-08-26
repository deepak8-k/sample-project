<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<head>
<title>Book</title>
</head>
<body>

<form action="/book/save" modelAttribute="${book}" method="POST">
	<h1>Borrow Book</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Book Name</th>
		<!-- 	<th>Book Status</th> -->
		</tr>
			<tr>

				<td><input type="number" name ="id"  value="${book.id}"></td>
				<td><input type="text" name ="name"  value="${book.name}"></td>	
				<%-- <td><input type="" name ="id"  placeholder="${drink.id}"></td> --%>
			</tr>	
	</table>
	<br /> <input type="submit" value="Save">
	</form>
	<br />
</body>
</html>