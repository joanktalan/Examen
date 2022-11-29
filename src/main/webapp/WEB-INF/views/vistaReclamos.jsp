<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    
    <body>
        
        <h1 id="NombreYApe">${nombre} ${apellido}</h1>
         
        <h2 id="TituloReclamos">Viendo Reclamos</h2>
    
        <p id="tipoDatoReclamo">Fecha de creacion Categoria Domicilio</p>
        
        <ol>
            <c:forEach items="${reclamos}" var="reclamo">
                <li id="reclamoIndividual">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"</li>
            </c:forEach>
                
        </ol>
        
    </body>
</html>
