<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Sistema de Registro de Eventos</title>    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Diego Maiquez 0.109.0">    

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    
        <!-- Custom styles for this template -->
    <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/dashboard/">
    
    <link href="${pageContext.request.contextPath}/resources/css/dashboard.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/resources/css/estilos.css" rel="stylesheet"/>
	<%-- <link href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css" rel="stylesheet"> --%>
	
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>     	
	<%-- <script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.min.js"></script> --%>
	
	
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> -->
    <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css" /> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css" />	
		
	<!-- JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/alertify.min.js"></script>
	
	<!-- CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/alertify.min.css"/>
	<!-- Default theme -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/themes/default.min.css"/>
	<!-- <!-- Semantic UI theme
	<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
	Bootstrap theme 
	<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/> -->

	<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</head>



<body>

<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="${pageContext.request.contextPath}/">ISMAC</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <!-- <input class="form-control form-control-dark rounded-0 border-0" text="Registro de Ingreso a Eventos" /> -->
  <!-- <h1 class="form-control form-control-dark rounded-0 border-0" >Registro de Ingreso a Eventos</h1> -->
  <h1 class="form-control-dark rounded-0 border-0" >Registro de Ingreso a Eventos</h1>
  <div class="navbar-nav">
    <div class="nav-item text-nowrap">
      <a class="nav-link px-3" href="${pageContext.request.contextPath}/">Sign out</a>
    </div>
  </div>
</header>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3 sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/dashboard">
              <span data-feather="home" class="align-text-bottom"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/usuarios/frmAdd">
              <span data-feather="file" class="align-text-bottom"></span>
              Registro
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/usuarios">
              <span data-feather="users" class="align-text-bottom"></span>
              Usuarios
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/eventos">
              <span data-feather="airplay" class="align-text-bottom"></span>
              Eventos
            </a>
          </li>
          <li class="nav-item active">
            <a class="nav-link active" href="${pageContext.request.contextPath}/mi-cuenta">
              <span data-feather="user" class="align-text-bottom"></span>
              Mi Cuenta
            </a>
          </li>
          <!-- <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="bar-chart-2" class="align-text-bottom"></span>
              Reportes
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="layers" class="align-text-bottom"></span>
              Integraciones
            </a>
          </li> -->
        </ul>

        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted text-uppercase">
          <span>Reportes Guardados</span>
          <a class="link-secondary" href="#" aria-label="Add a new report">
            <span data-feather="plus-circle" class="align-text-bottom"></span>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text" class="align-text-bottom"></span>
              Reporte
            </a>
          </li>
          <!-- <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text" class="align-text-bottom"></span>
              Ultimo Trimestre
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text" class="align-text-bottom"></span>
              Categorias Productos
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text" class="align-text-bottom"></span>
              Ventas en el ultimo a�o
            </a>
          </li> -->
        </ul>
      </div>
    </nav>

    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
	
	<h1>Mi Cuenta</h1>


    </main>
  </div>
</div>

	  <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js" integrity="sha384-zNy6FEbO50N+Cg5wap8IKA4M/ZnLJgzc6w2NqACZaK0u0FXfOWRRJOnQtpZun8ha" crossorigin="anonymous"></script>
      <script src="${pageContext.request.contextPath}/resources/js/dashboard.js"></script>

	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.6.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js" ></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.min.js"></script>


    <div class="container text-center">
    <div class="row align-items-start">
  		<table>
		<thead>
			<tr>
				<th scope="col"> nombre1</th>
				<th scope="col">nombre2</th>
				<th scope="col">apellido1</th>
				<th scope="col">apellido2</th>
				<th scope="col">sexo</th>
				<th scope="col">direccion</th>
				<th scope="col">telefono</th>
				<th scope="col">correo</th>
				<th scope="col">tipo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${usuarios}">
				<tr>
					<td>${item.nombre1}</td>
					<td>${item.nombre2}</td>
					<td>${item.apellido1}</td>
					<td>${item.apellido2}</td>
					<td>${item.sexo}</td>
					<td>${item.direccion}</td>
					<td>${item.telefono}</td>
					<td>${item.correo}</td>
					<td>${item.tipo}</td>

					<td>
					<%-- <button type="button" class="btn btn-outline-success"><a href="${pageContext.request.contextPath}/usuarios/findOne?id=${item.id}&opcion=1">Actualizar</a></button>
				    <button type="button" class="btn btn-outline-danger" class="btn btn-danger"><a href="${pageContext.request.contextPath}/usuarios/findOne?id=${item.id}&opcion=2" >Cancelar</a></button> --%>
					
					<button type="button" class="btn btn-success" ><a href="${pageContext.request.contextPath}/usuarios/findOne?id=${item.id}&opcion=1" ><svg style="color: white; text-decoration: none;" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-clockwise" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 3a5 5 0 1 0 4.546 2.914.5.5 0 0 1 .908-.417A6 6 0 1 1 8 2v1z"></path><path d="M8 4.466V.534a.25.25 0 0 1 .41-.192l2.36 1.966c.12.1.12.284 0 .384L8.41 4.658A.25.25 0 0 1 8 4.466z"></path></svg></a></button>
				    <button type="button" class="btn btn-danger" ><a href="${pageContext.request.contextPath}/usuarios/findOne?id=${item.id}&opcion=2" ><svg style="color: white; text-decoration: none; xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16"><path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/></svg></a></button>
					
					
					</td> 
				</tr>



			</c:forEach>
		</tbody>
	</table>
      
  
      
    </div>
  </div>	

</body>
</html>