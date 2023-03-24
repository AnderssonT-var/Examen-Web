<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Usuarios Eventos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

 <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/checkout/">

<link href="/docs/5.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
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
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="#">ISMAC</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="navbar-nav">
    <div class="nav-item text-nowrap">
      <a class="nav-link px-3" href="#">Sign out</a>
    </div>
  </div>
</header>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3 sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}/">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home align-text-bottom" aria-hidden="true">
            <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
            <polyline points="9 22 9 12 15 12 15 22"></polyline>
            </svg>
             Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/usuarios/frmAdd">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file align-text-bottom" aria-hidden="true">
              <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
              <polyline points="13 2 13 9 20 9"></polyline>
              </svg>
			  Registro
            </a>
          </li>  
          <li class="nav-item">
            <a class="nav-link active" href="${pageContext.request.contextPath}/registro/principal">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file align-text-bottom" aria-hidden="true">
              <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
              <polyline points="13 2 13 9 20 9"></polyline>
              </svg>
			  Registro Años80
            </a> 
          </li>  
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/usuarios/findAll">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-users align-text-bottom" aria-hidden="true">
              <path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path>
              <circle cx="9" cy="7" r="4"></circle>
              <path d="M23 21v-2a4 4 0 0 0-3-3.87"></path>
              <path d="M16 3.13a4 4 0 0 1 0 7.75"></path>
              </svg>
              Usuarios
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-airplay align-text-bottom" aria-hidden="true">
              <path d="M5 17H4a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h16a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2h-1"></path>
              <polygon points="12 15 17 21 7 21 12 15"></polygon>
              </svg>
              Eventos
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
  			  <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
			</svg>
              Mi Cuenta
            </a>
          </li>
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
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text align-text-bottom" aria-hidden="true">
              <path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
              <polyline points="14 2 14 8 20 8"></polyline>
              <line x1="16" y1="13" x2="8" y2="13"></line>
              <line x1="16" y1="17" x2="8" y2="17"></line>
              <polyline points="10 9 9 9 8 9"></polyline>
              </svg>
              Reporte
            </a>
          </li>
        </ul>
      </div>
    </nav>

    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
<h1 align="center">Registro de Usuarios a Eventos Casa Abierta Años 80</h1>
<div class="table-responsive">
<form action="add"  method="POST">
		
		<%-- <form:hidden path="idUsuario"/>  --%>
		<label>Cedula</label>                 
        <input type="number" id="cedula" name="cedula" value="${usuario.cedula}" formControlName="cedula" class="form-control" maxlength="20" />                                                    
                               
		<br>
		<label>Primer Nombre</label>  
		<input type="text" id="nombre1" name="nombre1" value="${usuario.nombre1}" formControlName="nombre1" class="form-control" maxLength="15" />
		<br>
		<label>Segundo Nombre</label>  
		<input type="text" id="nombre2" name="nombre2" value="${usuario.nombre2}" formControlName="nombre2" class="form-control" maxLength="15" />
		<br>
		<label>Apellido Paterno</label>
		<input type="text" id="apellido1" name="apellido1" value="${usuario.apellido1}" formControlName="apellido1" class="form-control" maxLength="15" />
		<br>
		<label>Apellido Materno</label>
		<input  type="text" id="apellido2" name="apellido2" value="${usuario.apellido2}" formControlName="apellido2"  class="form-control" maxLength="15" />
		<br>
		<label>Fecha de Nacimiento</label>
		<input type="date" id="fechaNacimiento" name="fechaNacimiento" value="${usuario.fechaNacimiento}"  class="form-control" />
		<br>
		<label>Género</label>
		<errors style="color:red" /></errors>
	                 <div class="form-group">
		                 <div class="form-check form-check-inline">		                  		                                
						   <input type="radio" class="form-check-input" value="Masculino" name="sexo" id="flexRadioDefault1" />						  						
						   <label class="form-check-label" for="flexRadioDefault1">Masculino</label>
						 </div>
						 
						 <div class="form-check form-check-inline">						   						 					
						   <input type="radio" class="form-check-input" value="Femenino" name="sexo" id="flexRadioDefault2" />			
						   <label class="form-check-label" for="flexRadioDefault2">Femenino</label>
						 </div>
						 <br>
		<br>
		<label>Correo</label>
		<input type="email" id="correo" name="correo" value="${usuario.correo}" class="form-control" maxLength="40" />
		<br>
		<br>
		<h4>Escoja los colores que mas le gustan, podrá saber tu conexión con los años 80!!</h4>
		<div class="form-group">
			<input type="checkbox" id="color1" name="color1" value="1" class="form-check-input">
			<label for="color1" style="color:#042261 ; background-color:#042261">Color</label>
			<input type="checkbox" id="color2" name="color2"  value="1" class=""form-check-input">
			<label for="color2" style="color:#FB9C04 ; background-color:#FB9C04">Color</label>
			<input type="checkbox" id="color3" name="color3" value="1" class="form-check-input">
			<label for="color3" style="color:#44546C ; background-color:#44546C">Color</label>
			<input type="checkbox" id="color4" name="color4" value="1" class="form-check-input">
			<label for="color4" style="color:#B4DC8C ; background-color:#B4DC8C">Color</label>
			<input type="checkbox" id="color5" name="color5" value="1" class="form-check-input">
			<label for="color5" style="color:#F443F4 ; background-color:#F443F4">Color</label>
			<input type="checkbox" id="color6" name="color6" value="1" class="form-check-input">
			<label for="color6" style="color:#2C74B4 ; background-color:#2C74B4">Color</label>
			<input type="checkbox" id="color7" name="color7" value="1" class="form-check-input">
			<label for="color7" style="color:#FC0404 ; background-color:#FC0404">Color</label>
			<input type="checkbox" id="color8" name="color8" value="1" class="form-check-input">
			<label for="color8" style="color:#818181 ; background-color:#818181">Color</label>
			<input type="checkbox" id="color9" name="color9" value="1" class="form-check-input">
			<label for="color9" style="color:#040404 ; background-color:#040404">Color</label>
			<input type="checkbox" id="color10" name="color10" value="1" class="form-check-input">
			<label for="color10" style="color:#FCFC04 ; background-color:#FCFC04">Color</label>
		</div>
		<br>
		<h4>Escoja los juegos que mas le gustan</h4>
		<div class="form-group">
			<div class="form-check form-check-inline">
				<input type="checkbox" id="juego1" name="juego1" value="1">
				<label for="juego1">Pac Man</label>
			</div>
			<div class="form-check form-check-inline">
				<input type="checkbox" id="juego2" name="juego2" value="1">
				<label for="juego2">Tetris</label>
			</div>
			<div class="form-check form-check-inline">
				<input type="checkbox" id="juego3" name="juego3" value="1">
				<label for="juego3">Donkey Kong</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego4" name="juego4" value="1">
				<label for="juego4">Mario Bros</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego5" name="juego5" value="1">
				<label for="juego5">Counter</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego6" name="juego6" value="1">
				<label for="juego6">Contra</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego7" name="juego7" value="1">
				<label for="juego7">Fall Guys</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego8" name="juego8" value="1">
				<label for="juego8">Street Figther</label>
			</div>	
			<div class="form-check form-check-inline">	
				<input type="checkbox" id="juego9" name="juego9" value="1">
				<label for="juego9">Rocket League</label>
			</div>	
			<div class="form-check form-check-inline">
				<input type="checkbox" id="juego10" name="juego10" value="1">
				<label for="juego10">The Legends of Zelda</label>
			</div>	
		</div>
		<br>
		
		<div>
		<button type="submit" id="btnGuardar" class="btn btn-primary">Registrarse</button>
		<button type="button" id="btnCancelar" class="btn btn-danger" onClick="window.location.href='/Examen-Web/registro'; return false;">Cancelar</button>
		</div>
	
	</form>
	
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>

</body>
</html>
