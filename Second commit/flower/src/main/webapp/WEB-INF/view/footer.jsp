<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
</style>
<title>Insert title here</title>
</head>
<body>
<footer class="w3-padding-64 w3-light-grey w3-small w3-center" id="footer">
    <div class="w3-row-padding">
      <div class="w3-col s4">
          <button type="submit" class="w3-button w3-block w3-black">Send</button>
        
      </div>
   
                      <p><h3>Follow us on</h3></p>
        <a href="https://www.facebook.com/" class="fa fa-facebook"></a>
        <a href="https://twitter.com/" class="fa fa-twitter"></a>
        <a href="https://plus.google.com/discover" class="fa fa-google"></a>
        
        <div class="w3-col s4">
        <h3>Subscribe to our news letter to Know latest offers</h3>
        <div class="col-lg-8">
        <form action="AddSubscribe" modelAttribute="subscribe"  method="POST"></form></form>
        <div class="form-group">
        <input path="email" placeholder="Enter your email address" class="form-control"/>
        </div></div>
        <input type="submit" value="Subscribe!"></div>
        
        
         <div class="w3-col s4">
         <h3><p>Order For Flower online</p></h3>
         <p><a href="">Rose</a></p>
         <p><a href="">Jasmin</a></p>
         <p><a href="">Lily</a></p>
         <p><a href="">SunFlowers</a></p>
         <p><a href="">Tropicals</a></p>
        
      </div>
      <center><p>© Copyright 2016 Flowers. All Rights Reserved</p></center>
     <p>Names and images of flowers - have you ever seen a flower and wondered what it was called, or heard a flower name and wished to know  what it looked like?</p>
     </footer>
 
</body>
</html>