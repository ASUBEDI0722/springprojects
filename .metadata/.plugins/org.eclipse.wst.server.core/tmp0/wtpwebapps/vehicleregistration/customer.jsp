<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
</style>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(event) {
      				$("#driverLicense").keyup(function(e) {
                       var drivinglicensenumber = $("#driverLicense").val();
                       console.log("driverLicense "+ drivinglicensenumber);
                       $.ajax({
                                   type : "POST",
                                   url : "${pageContext.request.contextPath}/getVehicle",
                                   data : {
                                       'driverLicense' : drivinglicensenumber
                                   },
                                   success : function(
                                           response) {
                                	   console.log(response);
                                         $("#display-heading").html("Response Vehicle Information");
                                         var result = "VIN : "
                                                 + response.vin
                                                 + "</br>"
                                                 + "Manufacturer : "
                                                 + response.manufacturer
                                                 + "</br>"
                                                 + "Model : "
                                                 + response.model
                                                 + "</br>";
                                         $("#display-info")
                                                 .html(result);
                                                      },
                                   error : function() {
                                       console.log("Error occured");
                                   $("#display-info")
                                           .html(result);
                                   }
                               })
                   })
                    })
</script>
<body>
	<h2>Vehicle Information</h2>
	<form method="post">
		First name: <input type="text" id="fname" name="firstName"><br>
		<br> Last name: <input type="text" id="lname" name="lastName"><br>
		<br> DrivingLicenseNumber :<input type="text"
			id="driverLicense" name="driverLicense"><br>
		<br>
	</form>
	<hr />
	<div id="display-heading"></div>
	<div id="display-info"></div>

</body>
</html>