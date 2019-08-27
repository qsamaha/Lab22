<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bbootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu"
	crossorigin="anonymous">
<title>Rewards</title>

</head>
<body>
	<h2>Fill Out Form To Register For Rewards</h2>

	<form action = "addToDB">

		First name:<br> <input type="text" name="firstName"><br>
		Last name:<br> <input type="text" name="lastName"><br>
		Email: <br> <input type="text" name="eMail"><br>
		Password:<br> <input type="password" id="pass" name="passWord"required><br> 
		Phone Number:<br> <input type = "text"  name = "phoneNum"> <br>
		<br> <input type="submit" value="Register">
</form>

</body>
</html>