<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        
        <h1>Ingrese usuario y contraseña</h1>
        
        <form action="/parcial2" method="post">
            <input type="text" name="user" placeholder="Nombre de usuario">
            <br>
            <input type="text" name="contrasenia" placeholder="contrasenia">
            <input type="hidden" name="deDondeViene" value="${param.origen}">
            <input type="submit" value="Enviar Datos">
        </form>
        
        <br>
       
       
    </body>
</html>
