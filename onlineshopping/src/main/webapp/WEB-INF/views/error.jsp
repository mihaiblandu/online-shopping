<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">


<title>Online Shopping - ${title}</title>

</head>
  <title>The page you were looking for doesn't exist (404)</title>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <style>

  body {
    background-color: #2A292F;
    color: #00BBBD;
    text-align: center;
    font-family: arial, sans-serif;
    margin: 0;
  }

  .logo {
    position: absolute;
    left: 1%;
    top: 2%;
    width: 5%;
    height: auto;
  }

  .title {
    position: relative;
    margin: 60px auto;

  }

  .main-image {
    position: absolute;
    top: 25px;
    background-color: rgba(0, 0, 0, 0.5);
    bottom: 35px;
    left: 82px;
    margin: auto;
    right: 82px;
    background-repeat: no-repeat;
    background-position: 50% 50%;
    background-size: auto 85%;
  }

  .screen {
    position: relative;
    width: 700px;
    margin: auto;
  }

  h1, h2 {
    font-weight: normal;
    margin: 50px auto;
  }
  </style>
</head>

<body>
  <!-- This file lives in public/404.html -->
  <div class="logo"><img src="${images}/404/42_logo.svg" alt="logo"></div>
  <div class="title"><img src="${images}/404/404.png" alt=""></div>
  <div class="screen">
    <div class="main-image">

    </div>
  <a href="${contextRoot}/home"> <img src="${images}/404/macbook.png" ></a> 
  </div>
  <div class="content">
		
			<div class="container">
			
				<div class="row">
				
					<div class="col-xs-12">
					
						
						<div class="jumbotron">
						
							<h1>${errorTitle}</h1>
							<hr/>
						
							<blockquote style="word-wrap:break-word">
								
								${errorDescription}
							
							</blockquote>						
						
						</div>
						
											
					</div>					
				
				</div>
			
			</div>
							
		</div>

		
  <script>
    $(document).ready(function() {
      var image = "${images}/404/" + (Math.floor(Math.random() * 100 % 8) + 1) + "-sorry.gif";
      $(".main-image").css("background-image", "url(" + image + ")");
    });
  </script>
</body>
</html>
