<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        
        <h1 id="TituloLogin">Ingrese usuario y contraseña</h1>
        
        <form action="/parcial2" method="post">
            <div id="formulario">
                <div class="formDat"><input  type="text" id="nombreUsuario" name="user" placeholder="Nombre de usuario" required></div>
                <div class="formDat"><input type="password" id="contrasenia" name="contrasenia" placeholder="contrasenia" required ></div>
                <input type="hidden" name="deDondeViene" value="${param.origen}">
                <div class="button"><input type="submit" id="submit" value="Enviar Datos" ></div>
            </div>
                
            <br>
            
            
            
        </form>
        
        <br>
       
        <p>Desea usted registrarse? </p>
        <a class="nav-link" href="${pageContext.request.contextPath}/registrarse">Registrarse</a>
       
    </body>
</html>
