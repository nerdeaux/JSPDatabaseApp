<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class = "container">
	
		<h1>Employee Directory</h1>
		<hr/>
		
		<div class = "row">
			<div class = "col-md-4">
				<form action = "${pageContext.request.contextPath}/EmployeeController" method="POST">
				
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "name" placeholder = "Enter Name" value = "${employee.Full_Name}"/>
					</div>
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "telephonename" placeholder = "Enter Telephone Number" value = "${employee.Telephone_Number}"/>
					</div>
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "telephonename" placeholder = "Enter Home Address" value = "${employee.Home_Location}"/>
					</div>
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "telephonename" placeholder = "Enter Telephone Number" value = "${employee.Telephone_Number}"/>
					</div>
					<div class="form-group">
					  	<input type = "text" class = "form-control" name = "homelocation" placeholder = "Enter Branch Name" value = "${employee.Branch_Name}"/>
					</div>
					<div class="form-group">
					  	<input type = "text" class = "form-control" name = "homelocation" placeholder = "Enter Branch Location" value = "${employee.Branch_Location}"/>
					</div>
				
					<input type = "hidden" name = "id" value = "${employee.EmployeeID}"/>
				
					<button type = "submit" class = "btn btn-primary">Save</button>
				</form>
			</div>
		</div>
		<a href = "${pageContext.request.contextPath}/EmployeeController?action=LIST" onclick="window.location.href ='employee-list.jsp'">Back to List</a>
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>