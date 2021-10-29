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
    $(document)
            .ready(
                    function(event) {
                        $("#drivinglicensenumber")
                                .keyup(
                                        function(e) {
                                            var drivinglicensenumber = $(
                                                    "#drivinglicensenumber")
                                                    .val();
                                            console.log("drivinglicensenumber "
                                                    + drivinglicensenumber);
                                            $
                                                    .ajax({
                                                        type : "POST",
                                                        url : "${pageContext.request.contextPath}/getVehicle",
                                                        data : {
                                                            'drivinglicensenumber' : drivinglicensenumber
                                                        },
                                                        success : function(
                                                                response) {
                                                            $
                                                                    .each(
                                                                            response,
                                                                            function(
                                                                                    index,
                                                                                    value) {
                                                                                $("#display-heading")
                                                                                        .html("Response Vehicle Information");
                                                                                
                                                                                var result = "VIN : "
                                                                                        + value.vinNumber
                                                                                        + "</br>"
                                                                                        + "Manufacturer : "
                                                                                        + value.manufacture
                                                                                        + "</br>"
                                                                                        + "Model : "
                                                                                        + value.model
                                                                                        + "</br>";
                                                                                $("#display-info")
                                                                                        .html(result);
                                                                            });
                                                        },
                                                        error : function() {
                                                            alert("Error occured");
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
			id="drivinglicensenumber" name="drivinglicensenumber"><br>
		<br>
		<!-- <input type="submit" value="submit"> -->
	</form>
	<hr />
	<div id="display-heading"></div>
	<div id="display-info"></div>

</body>
</html>