<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>


<head>
<title>Home Page</title>
</head>
<body>
	<h1>Hello !</h1>
	<p>
		Welcome to spring boot app - <span>${appName}</span><br><br>
		Would you like to borrow a book?
		<a href="/book/display">Try Now</a>
		
	</p>
</body>
</html>