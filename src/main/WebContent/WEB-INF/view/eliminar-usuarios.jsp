<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Usuarios</h1>

	<form:form action="del" modelAttribute="usuario" method="GET" >

		<form:hidden path="idUsuario" id="idUsuario" name="idUsuario"/>
		<strong>¿Desea eliminar el registro?</strong>
		<hr/>
		<button type="submit" id="btnEliminar">Eliminar </button>
		<button type="button" id="btnCancelar" onClick="window.location,href='/Examen-Web/usuarios'; return false;">Cancelar </button>
	</form:form>
</body>
</html>