<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ENVIAR CORREO</h1>

	<button><a href="${pageContext.request.contextPath}/envio/enviocorreo" >ENVIAR</a></button>

	<table>
	<thead>
		<tr>
					
			<th>correo</th>
			
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="item" items="${envio}">
		<tr>
				
			<td>${item.correo}</td>
			
			
		</tr>
		</c:forEach>
	</tbody>
	</table>



</body>
</html>