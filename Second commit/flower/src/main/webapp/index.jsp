 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <style>
  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(10%); /* make all photos black and white */ 
      width: 100%; 
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file='WEB-INF/view/header.jsp' %>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="http://wallportal.com/uploads/posts/rose-flower-wallpaper-images/rose_flower_wallpaper_images_006.jpg" width="800" height="40">
        <div class="carousel-caption">
          <h3>Rose</h3>
          
        </div>      
      </div>

      <div class="item">
        <img src="http://www.flowermeaning.com/flower-pics/Jasmine-1.jpg" width="800" height="40">
        <div class="carousel-caption">
          <h3>Jasmin</h3>
          
        </div>      
      </div>
    
      <div class="item">
        <img src="https://i.ytimg.com/vi/DasUQ-EdDqI/maxresdefault.jpg" width="800" height="40">
        <div class="carousel-caption">
          <h3>Lily</h3>
          
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>


<%@ include file='WEB-INF/view/footer.jsp' %>


</body>
</html>
