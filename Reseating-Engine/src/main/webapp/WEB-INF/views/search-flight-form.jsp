<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Flight</title>
<script src="<c:url value="/resources/js/jquery-3.3.1.min.js" />"></script>


<script type="text/javascript">

$(document).ready(function(){
	
	$('#btnSearchFlight').click(function(){
		
		var flightNumber=$('#fln').val();
		
		
		 $.ajax({
			
			type:'GET',
			dataType:'json',
			url:'${pageContext.request.contextPath}/all-flights/'+flightNumber, 
			success:function(){
				
				$('#searchResult').html('<h2>JSON output of Single Flight Information</h2>');
				$('#searchResult')
				    .append('<table><tr><th>Flight Number</th><th>Name</th><th>From </th><th>To</th><th>Start</th><th>Arrival</th></tr>');
				jQuery.each(data,function(i,val){
					
					$('#searchResult').append('<tr><td>'+val.flightNumber+'</td> </tr>');
					/* $('#searchResult').append('<tr><td>'+val.flightNumber+'</td>   <td>'+val.name+'</td>   <td>'+val.from+'</td>   <td>'+val.to+'</td> <td>'+val.startTime+'</td><td>'+val.destinationTime+'</td></tr>'); */
				})
				$('#searchResult').append('</table>');
			},
			
			error:function(){
				$('#searchResult').html('<h2>Error submiting Request!</h2>')
			    }
			
		});
		 
		
		
		
	});
	
	
	// when clear Button is clicked
	$('#btnClear').click(function(){
		
		$('#searchResult').html("");
		
		
	});
	
	
	
	
});


</script>







</head>
<body>
<jsp:include page="layout/header.jsp"></jsp:include>

<jsp:include page="layout/sidemenu.jsp"></jsp:include>

<div class="ContentPanel">



Enter FlightNumber: <input type="text" id="fln"> <input type="button" id="btnSearchFlight" value="Find Flight"/>
<input type="button" id="btnClear" value="Clear"/><br/>


<div id="searchResult"></div>






</div>

<jsp:include page="layout/footer.jsp"></jsp:include>
</body>
</html>