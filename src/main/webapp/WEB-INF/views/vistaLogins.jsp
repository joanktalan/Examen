<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Logins</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css">
    </head>
    
    <body>
        
        
        <h1 id="TituloLogins">Logins del id: ${id}</h1>
        <p id="TipoDatoLogin">Fecha <span style="margin: 0px 60px">Hora</span></p>
        
        <ol>
            <c:forEach items="${logins}" var="login">
                <li id="loginIndividual"> "${login.date}" "${login.time}" </li>
            </c:forEach>
                
        </ol>
        
    </body>
</html>
