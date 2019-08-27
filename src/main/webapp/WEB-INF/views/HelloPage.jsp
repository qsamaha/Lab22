<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bbootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu"
	crossorigin="anonymous">
<title>Items</title>
</head>
<body>


<h1>Food</h1>
	
	<form action = "HelloPage"> 
	<table class = "table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="f" items="${listItems }">
				<tr>
					<td>${f.id }</td>
					<td>${f.name }</td>
					<td>${f.description }</td>
					<td>${f.quantity }</td>
					<td>${f.price }</td>
					
				</tr>

			</c:forEach>
			

		</tbody>




	</table>
	</form>

</body>
</html>