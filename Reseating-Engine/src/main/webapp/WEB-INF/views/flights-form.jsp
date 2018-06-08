<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Flights</title>
</head>
<body>

<jsp:include page="layout/header.jsp"></jsp:include>

<jsp:include page="layout/sidemenu.jsp"></jsp:include>

<div class="ContentPanel">
	 
<h2> List of All Flights</h2><hr/>

<table>

<tr>
		<th>Flight Id</th>
		<th>Flight Name</th>
		<th>From</th>
		<th>To</th>
		<th>Departure Time</th>
		<th>Destination Time</th>
  </tr>

<c:forEach var="fl" items="${allFlights }">
<tr>
<td>${fl.flightNumber }</td>
<td>${fl.name }</td>
<td>${fl.from }</td>
<td>${fl.to }</td>
<td>${fl.startTime }</td>
<td>${fl.destinationTime }</td>
</tr>


</c:forEach>


</table>
<p>Number of Records Found: <span style="color:blue">${size}</span></p><br/><br/>

<a href="home">Back to Home</a>
</div>

<jsp:include page="layout/footer.jsp"></jsp:include>
</body>
</html>