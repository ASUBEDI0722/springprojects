<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">

<script src = "${pageContext.request.contextPath}/resources/customer.js"></script>



<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Customer Registration Form</h2>

	<div align="center">

		<form action="CustomerPortal" method="post" id='customer-form'>

			<div class="form-group">
				<label>First Name</label> <input type="text" name="fname"
					id="first_name" size="15"><br> <br> <label>Last
					Name</label> <input type="text" name="lname" id="last_name" size="15"><br>
				<br> <label>Email</label> <input type="text" name="email"
					id="e-mail" size="15"><br> <br> <label>Phone</label>
				<input type="text" name="phone" id="contact-number" size="15"><br>
				<br> <label>AddressLine1</label> <input type="text"
					name="address1" id="address1" size="15"><br> <br>
				<label>AddressLine 2</label> <input type="text" name="address2"
					id="address2" size="15"><br> <br> <label>City</label>
				<input type="text" name="city" id="City" size="15"><br>
				<br> <label>State</label> <input type="text" name="state"
					id="State" size="15"><br> <br> <label>ZipCode</label>
				<input type="text" name="zip" id="zipcode" size="15"><br>
				<br>
			</div>
			<div class="btn-layer">
				<input type="submit" value="submit" id="submit-form">
			</div>


		</form>


	</div>


</body>
</html>