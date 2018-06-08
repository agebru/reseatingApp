<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%--  <link type="text/css" href="<c:url value='/assets/css/bootstrap.min.css' />" rel="stylesheet" />
        <script src="<c:url value='/assets/js/app.js' />" type="text/javascript"></script> --%>
<%-- <link href="<c:url value="/resources/css/StyleSheet.css" />" rel="stylesheet"> --%>

<link href="<c:url value='/resources/css/StyleSheet.css'/>"  rel="stylesheet">


      



<title>Login page</title>
</head>
<body>
	
	<div class="InputPanel ">			
	<div class="PageTitle"> 		 
		 <div class="imagePanel"><img src="resources/images/deltaLogo.gif"></div>		 
		<div class="imagePanel"><img src="<c:url value='/resources/images/deltaPlane.jpg' />"> </div>
	</div>
	</div>
	<div class="InputPanel">
	<a href="home">Home</a>&nbsp;|&nbsp;<a href="?lang=en">English</a>&nbsp;|&nbsp;<a href="?lang=am">Amharic</a>
	</div>
</body>
</html>
