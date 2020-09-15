<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Directory</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.css"/>
</head>
<body>
	
	<div class = "container">
		
		<h1>Employee Directory</h1>
		<hr/>
		
		<p>${NOTIFICATION}</p>
		
		<p>
			<button class = "btn btn-primary" onclick="window.location.href ='employee-form.jsp'">Add Employee</button>
		</p>
	
		<table class = "table table-striped table-bordered" id="datatable">
			<thead>
				<tr class = "thead-dark">
					<th>Full_Name</th>
					<th>Telephone_Name</th>
					<th>Home_Location</th>
					<th>Branch_Name</th>
					<th>Branch_Location</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="employee">
					<tr>
						<td>${employee.Full_Name}</td>
						<td>${employee.Telephone_Number}</td>
						<td>${employee.Home_Location}</td>
						<td>${employee.Branch_Name}</td>
						<td>${employee.Branch_Location}</td>
						<td> 
							<a href = "${pageContext.request.contextPath}/EmployeeController?action=EDIT&id=${employee.EmployeeID}">Edit</a> 
							| 
							<a href = "${pageContext.request.contextPath}/EmployeeController?action=DELETE&id=${employee.EmployeeID}">Delete</a> 
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>
<script>
	$(document).ready(function(){
		$("#datatable").DataTable();
	})
</script>
</body>
</html>