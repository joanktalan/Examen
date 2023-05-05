<%@page language="java" pageEncoding="UTF-8" %>
<jsp:include page="WEB-INF/partes/navbar.jsp" />
<jsp:include page="/WEB-INF/partes/navbarReclamos.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido a la Pagina web de Joan</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1 id="bienvenido" >Bienvenido ${nomUsuario}!</h1>
    </body>
</html>
