<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrandote</title>
         <link rel="stylesheet" href="/css/styles.css">
    </head>
    
    <body>
        
        <h1 id="TituloRegistro">REGISTRO:</h1>
        
       <form action="/registrarse" method="post">
           
           
            <div id="formulario">
                
                <div class="formDat"><input type="text" id="nombre" name="nombre" placeholder="Nombre/s" required></div>
                <div class="formDat"><input type="text" id="apellido" name="apellido" placeholder="Apellido/s" required></div>
                <div class="formDat"><input type="email" id="mail" name="mail" placeholder="Mail" required></div>
                <div class="formDat"><input type="tel" id="telefonoMovil" name="telefonoMovil" placeholder="Número Telefono" required></div>
                <div class="formDat"><input type="text" id="dni" name="dni" placeholder="DNI" required></div>
                <div class="formDat"><input  type="text" id="nombreUsuario" name="user" placeholder="Nombre de usuario"required></div>
                <div class="formDat"><input type="password" id="contrasenia" name="contrasenia" placeholder="contraseña"required></div>
                <input type="hidden" name="deDondeViene" value="${param.origen}">
                <div class="button"><input type="submit" id="submit" value="Enviar Datos" ></div>
                
            </div>
                
            <br>
            
        </form>
              
            <p>${mensajeRegistro}</p>
                
                
    </body>
    
</html>
