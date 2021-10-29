<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
 $(document).ready(function(event){
	$("#driverLicense").keyup(function(e){
		var driverLicense = $('#driverLicense').val();
		
		$.ajax({
			type : "POST",
			url: "${pageContext.request.contextPath}/getVehicle",
			data : {'driverLicense' : driverLicense},
			success: function(response){
				$.each(response, function(index, value){
					$("#display-heading").html("Vehicle Information");
					var result = "Vin : " + value.vin + "</br>" + "</br>" +
					"Manufacturer : " + value.manufacturer + "</br>" + "</br>" +
					"Model :" + value.model + "<br>" + "</br>";
					
					$("#display-info").append(result);				
				});		
			},	
			error: function(){
				alert("Error occured");
			}
		})	
	})
	 
 })
 </script>

<title>Search Vehicle</title>
</head>
<body>
	<div class="main-holder">
		<h2 class="customer-info"></h2>
		<form id="customer-form">
			<label>First Name</label><br /> <input type="text" id="firstName"
				name="firstName" /><br /> <br /> <label>Last Name</label> <br />
			<input type="text" id="lastName" name="lastName" /><br /> <br /> <label>Driver
				License </label> <br /> <input type="text" id="driverLicense"
				name="driverLicense" /><br /> <br />
		</form>
		<div>
			<h2><u id="display-heading"></u></h2>
			<h3 id="display-info"></h3>
		</div>
	</div>
</body>
</html> --%>