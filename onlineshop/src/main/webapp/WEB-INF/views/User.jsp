<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href="<c:url value="/resources/css/About.css" />" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>	
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
<form action="AddUser" method="post"></form>
<table  align="center" cellspacing="2">

<tr>
   <td colspan="2">User Detail</td>
   </tr>
   
   <tr>
   <td>User ID</td>
   <td><input type="text" name="userId"/></td>
   </tr> 
   
   <tr>
   <td>User Name</td>
   <td><input type="text" name="userName"/></td>
   </tr> 
   
   <tr>
   <td>User Address</td>
   <td><input type="text" name="userAddress"/></td>
   </tr> 
   </table>
 
   <table cellspacing="2" align="center">
   <tr bgcolor="gray">
     <td>User ID</td>
     <td>User Name</td>
     <td>User Address</td>
     <td>Operation</td>
  </tr>
 
  <c:forEach items="${userList}" var="user">
     <tr bgcolor="cyan">
         <td>${user.userId}</td>
         <td>${user.userName}</td>
         <td>${user.userAddress}</td>
         <td>UPDATE/DELETE</td>
      </tr>
      <td>
      <a href="<c:url value="deleteCategory/${user.userId}"/>">DELETE</a></td>
      <a href="<c:url value="updateCategory/${user.userId}"/>">UPDATE</a></td>
         </c:forEach>  
  
  </table>   

</body>
</html>