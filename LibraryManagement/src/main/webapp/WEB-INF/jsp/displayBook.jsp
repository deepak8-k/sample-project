<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<head>
<title>Display Page</title>
</head>
<body>

	<h1>Book Selection</h1>
	<br>
	<div>${msg}</div>
	<br>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Book Name</th>
			<th>Book Status</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>

				<td><c:out value="${book.id}" /></td>
				<td><c:out value="${book.name}" /></td>
				<c:choose>
				<c:when test="${book.status}">
				<td>Borrowed</td>
				</c:when>
				<c:otherwise><td><a href = "/book/borrow/${book.id}">Borrow</a></td></c:otherwise>
				</c:choose>
				
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href ="/book/add" > Add a Book</a>
</body>
</html>