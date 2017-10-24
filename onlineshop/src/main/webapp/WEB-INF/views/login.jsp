<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
   <style type="text/css">
   button {
           background-color: #00ff00;
           background-color: #7FFFD4;
           border: none;
           color: white;
           padding: 14px 28px;
           cursor: pointer;
       }
       
       </style>
<script type="text/javascript">
function myFunction()
    {
    var x = document.getElementById("myInput");
    if (x.type=="password")
    {
    x.type="text";
    }
    else {
    x.type="password";
    }
}
</script>       
</head>
<body>
<br>
<br>
  <div class="container">
  <button class="btn success">Registration successfully Completed</button>
  <h1>Login...</h1>

  <form action="SaveRegister" method="post">
  <div class="col-lg-4">

   <div class="form-group">
  <lable>User Name</lable>
  <input type="role" placeholder="Enter User Name..." class="from-control">
  </div>

   <div class="form-group">
  <lable>Password</lable>
  <input type="password" id="myInput" placeholder="Enter Password..." class="from-control">
  <input type="checkbox" onclick="myFunction()">Show Password
  
  <div class="clearfix">
    <a href="Login" class="btn btn-info" role="button">Login</a>
    </div>
   </div>
   </div>
   </form>
   </div>
   </body>
   </html>