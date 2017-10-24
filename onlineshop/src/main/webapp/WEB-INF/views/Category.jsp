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
<title>Category</title>
</head>
<body>
<form action="AddCategory" method="post"></form>
<table  align="center" cellspacing="2">

<tr>
   <td colspan="2">Category Module</td>
   </tr>
   
   <tr>
   <td>Category ID</td>
   <td><input type="text" name="catId"/></td>
   </tr> 
   
   <tr>
   <td>Category Name</td>
   <td><input type="text" name="catName"/></td>
   </tr> 
   
   <tr>
   <td>Category Desc</td>
   <td><input type="text" name="catDesc"/></td>
   </tr> 
   </table>
 
   <table cellspacing="2" align="center">
   <tr bgcolor="gray">
     <td>Category ID</td>
     <td>Category Name</td>
     <td>Category Description</td>
     <td>Operation</td>
  </tr>
 
  <c:forEach items="${categoryList}" var="category">
     <tr bgcolor="cyan">
         <td>${category.catId}</td>
         <td>${category.catName}</td>
         <td>${category.catDesc}</td>
         <td>UPDATE/DELETE</td>
      </tr>
      <td>
      <a href="<c:url value="deleteCategory/${category.catId}"/>">DELETE</a></td>
      <a href="<c:url value="updateCategory/${category.catId}"/>">UPDATE</a></td>
         </c:forEach>  
  
  </table>   
   

</body>
</html>