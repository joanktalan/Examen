<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/styles.css">
        <h1>Ingrese ID que desea ver</h1>
    
        <form action="/verLogins" method="post">
            <input type="text" name="id" placeholder="Id de usuario">
            <input type="submit" value="Enviar Datos">
        </form>
    
    </body>
</html>