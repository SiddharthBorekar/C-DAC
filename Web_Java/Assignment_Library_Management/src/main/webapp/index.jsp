<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}	

body {
	height: 100vh;
	background: url('resources/images/library.jpg') no-repeat center center/cover;
		font-family: Arial, sans-serif;
		display: flex;
		justify-content: center;
		align-items: center;
	}

.overlay {
	background: rgba(0, 0, 0, 0.6);
	width: 100%;
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	text-align: center;
	color: white;
}

.container h1 {
	font-size: 60px;
	margin-bottom: 15px;
	text-shadow: 2px 2px 5px #000;
}

.container p {
	font-size: 22px;
	margin-bottom: 30px;
}

.btn {
	display: inline-block;
	padding: 15px 30px;
	background-color: #f39c12;
	color: white;
	text-decoration: none;
	font-size: 20px;
	font-weight: bold;
	border-radius: 8px;
	transition: 0.3s;
}

.btn:hover {
	background-color: #d68910;
	transform: scale(1.05);
}
</style>

</head>
<body>

	<div class="overlay">
		<div class="container">
			<h1>Welcome To Library</h1>
			<p>Library Management System</p>

			<a href="library/list" class="btn">Explore Books</a>
		</div>
	</div>

</body>
</html>