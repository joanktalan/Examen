<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Reclamos</title>
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    <body>
        
        <form action="/reclamos/delete" method="post">
            <div id="formulario">
                <div class="formDat"><input  type="text" id="reclamoBorrar" name="reclamoBorrar" placeholder="Numero de Reclamo" required></div>
                <div class="button"><input type="submit" id="submit" value="X" ></div>
            </div>
                
            <br>
            
            <ol>
                <c:forEach items="${reclamos}" var="reclamo">
                        <li id="reclamoIndividual1">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"</li>
                </c:forEach>
            </ol>
        
        
        
        
    </body>
</html>
