<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
body {margin:0;}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #FF69B4;
    position: fixed;
    top: 0;
    height: 45px;
    width: 100%;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
input[type=text1] {
    width: 400px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 75px;
    font-size: 16px;
    height: 43px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}
input[type=text1]:focus {
    width: 300px;
}
</style>
</head>
<title>online shop</title>
<body>
<div>
<ul>
  <li><a href="home">Home</a></li>
  <li><a href="aboutus">About</a></li>
  <li><a href="rose">Rose</a></li>
  <li><a href="jasmin">Jasmin</a></li>
  <li><a href="lotus">Lotus</a></li>
  <li><a href="register">Register</a></li>
  <li><a href="login">Login</a></li>
  
  </ul>
</div>
<br>
<br>
</body>
</html>