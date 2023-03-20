<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<style><%@include file="resources/css/sign-in.css"%></style>
<!DOCTYPE html>
<html>
    <body>

        <div class="wrapper fadeInDown">
            <div id="formContent">
                <!-- Tabs Titles -->
                <h2 class="active"> Iniciar sesión </h2>
                <!-- Icon -->
                <div class="fadeIn first">
				<svg class="fadeIn first" xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
				  <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
				  <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
				</svg>
                </div>

                <!-- Login Form -->
                <form method="post" action="login">
                    <input type="text" id="usuario" class="fadeIn second" name="usuario" placeholder="USUARIO">
                    <input type="text" id="contrasena" class="fadeIn third" name="contrasena" placeholder="CONTRASEÑA">
                    <input type="submit" class="fadeIn fourth" value="INICIAR">
                </form>

                <!-- Remind Passowrd -->
                <div id="formFooter">
                    <a class="underlineHover" href="#">Solicitar contraseña?</a>
                </div>

            </div>
        </div>

    </body>
</html>