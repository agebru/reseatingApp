<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/StyleSheet.css'/>"
	rel="stylesheet">

<title>Side menu</title>
</head>
<body>

	<div class="SideMenuPanel">


		<fieldset>
			<legend>Flight Information</legend>
			<a href="flights">Show All flights</a><br>
			 <a href="search">Search Flight</a><br> 
			 <a href="#">Link 3 </a><br> <br />
		</fieldset>



		<fieldset>
			<legend>Flight Setting</legend>

			<a href="#">setting 1</a><br>
		   <a href="#">setting 2</a><br>
			<a href="#">setting 3</a><br>
		</fieldset>
		
		
		<fieldset>
			<legend>Flight Events</legend>

			<a href="#">event 1</a><br>
		   <a href="#">event 2</a><br>
			<a href="#">event 3</a><br>
		</fieldset>


		<fieldset>


			<%-- <a href="<spring:url  value="/doLogout" />" class="btn btn-danger btn-mini pull-right">Logout</a> --%>


		</fieldset>
	</div>
</body>
</html>
