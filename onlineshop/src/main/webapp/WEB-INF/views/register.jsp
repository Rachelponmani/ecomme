<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
          pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>

    <style type="text/css">
     h1 {color:red;}
     p {color:blue;}
  
  body {
    
    background-color: green;
    height: 100%; 
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
  </style>
  </head>
<body>
    <div class="container">
    <h1>Sign Up Form</h1>

  <form action="SaveRegister" method="post">
  <div class="col-lg-4">

  <div class="form-group">
  <lable>Name</lable>
  <input type="name" placeholder="Enter name...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Email</lable>
  <input type="email" placeholder="Enter email id...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Phone</lable>
  <input type="phone" placeholder="Enter phone no...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Address</lable>
  <input type="address" placeholder="Enter address...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Password</lable>
  <input type="text"  path="password" placeholder="Enter password...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Role</lable>
  <input type="role" placeholder="Enter role...." class="form-control">
  </div>

  <div class="form-group">
  <lable>Country</lable>
  <input type="country" placeholder="Enter country...." class="form-control">
  </div>

   <div class="clearfix">
    <a href="Home" class="btn btn-info" role="button">Cancel</a>
    <a href="Login" class="btn btn-info" role="button">SignUp</a>
    </div>
    </div>
    </form>
    </div>
    <%@ include file='footer.jsp' %>
    </body>
    </html>  
