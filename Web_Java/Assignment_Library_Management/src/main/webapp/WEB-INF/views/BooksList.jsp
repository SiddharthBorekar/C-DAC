<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
	background-color: #f4f4f4;
}

.container {
	width: 80%;
	margin: auto;
}

.header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 20px;
}

.cart {
	font-size: 22px;
	font-weight: bold;
}

.cart-count {
	background: red;
	color: white;
	padding: 3px 8px;
	border-radius: 50%;
	font-size: 14px;
}

table {
	width: 100%;
	border-collapse: collapse;
	background: white;
}

th, td {
	padding: 12px;
	border: 1px solid #ddd;
	text-align: center;
}

th {
	background-color: #007bff;
	color: white;
}

.btn {
	padding: 8px 15px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	color: white;
}

.add-btn {
	background-color: #28a745;
}

.delete-btn {
	background-color: #dc3545;
}

.add-btn:hover {
	background-color: #218838;
}

.delete-btn:hover {
	background-color: #c82333;
}
</style>
</head>

<body>

<div class="container">

	<div class="header">
		<h2>Library Books</h2>

		<div class="cart">
			🛒 Cart <span id="cartCount" class="cart-count">0</span>
		</div>
	</div>

	<table id="bookTable">
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Action</th>
		</tr>

		<tr>
			<td>101</td>
			<td>Java Programming</td>
			<td>James Gosling</td>
			<td>
				<button class="btn add-btn" onclick="addToCart()">Add</button>
				<button class="btn delete-btn" onclick="deleteBook(this)">Delete</button>
			</td>
		</tr>

		<tr>
			<td>102</td>
			<td>Spring MVC</td>
			<td>Rod Johnson</td>
			<td>
				<button class="btn add-btn" onclick="addToCart()">Add</button>
				<button class="btn delete-btn" onclick="deleteBook(this)">Delete</button>
			</td>
		</tr>

		<tr>
			<td>103</td>
			<td>Hibernate Basics</td>
			<td>Gavin King</td>
			<td>
				<button class="btn add-btn" onclick="addToCart()">Add</button>
				<button class="btn delete-btn" onclick="deleteBook(this)">Delete</button>
			</td>
		</tr>

	</table>

</div>

<c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>
                <button class="btn add-btn" onclick="addToCart()">
                    Add
                </button>

                <a href="deleteBook?id=${book.id}">
                    <button type="button" class="btn delete-btn">
                        Delete
                    </button>
                </a>
            </td>
        </tr>
    </c:forEach>
</body>
</html>