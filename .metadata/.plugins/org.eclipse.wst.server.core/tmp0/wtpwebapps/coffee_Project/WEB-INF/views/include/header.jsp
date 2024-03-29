<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!-- <link rel="stylesheet" href=""/> -->
<script src="http://code.jquery.com/jquery-3.3.1.js"></script>

 <!-- Bootstrap core CSS -->
  <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

  <!-- Custom styles for this template -->
  <link href="resources/css/agency.min.css" rel="stylesheet">


<script>
<!-- Java Script Section -->



</script>

<body id="page-top">


<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">spring coffee</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
    	 <br><br>   Menu
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav text-uppercase ml-auto">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}">Coffee</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}/adeNtea">Ade & Tea</a>
          </li>
<!--           <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#Juice">Juice</a>
          </li> -->
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}/dessert">Dessert</a>
          </li>
<%--           <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}/tea">Tea</a>
          </li> --%>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}/getCartElement.do">Cart</a>
          </li>
            <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${path}/login">Settings</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</body>