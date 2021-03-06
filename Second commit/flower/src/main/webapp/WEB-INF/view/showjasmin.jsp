<%@ page language="java" import="com.model.Jasmin" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
    background-color: #3B3738;
    color: white;
    border: 1px solid black;
}
a:link, a:visited {
    background-color: #FF4500;
    color: white;
    padding: 14px 25px;
    text-align: center; 
    text-decoration: none;
    display: inline-block;
}

a:hover, a:active {
    background-color: #FF4500;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#3B3738">
<%@ include file='header.jsp' %>
<h1>Results........</h1>
<table class="table table-bordered">
	<thead>
	<tr>
		<th width="80">JASMIN ID</th>
		<th width="120">JASMIN NAME</th>
		
		<th width="550">JASMIN DESCRIPTION</th>
		<th width="120">QUANTITY</th>
		<th width="120">PRICE</th>
		
	</tr>
	</thead> 
         

		<tbody>
		<tr>
			<td>${Jasmin.ID}</td>
			<td>${Jasmin.NAME}</td>
		
			<td>${Jasmin.DESCRIPTION}</td>
			<td>${Jasmin.QUANTITY}</td>
			<td>${Jasmin.PRICE}</td>
			<td><a href="editjasminid/${Jasmin.ID}">Edit</a></td>  
             <td><a href="deletejasmin/${Jasmin.ID}">Delete</a></td>
			
		</tr>
	</tbody>

</table>
          
</body>
</html>