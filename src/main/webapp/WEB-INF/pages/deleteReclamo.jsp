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
                
        <h1 id="tituloBorrarReclamo">Seleccione Reclamo a Borrar</h1>
        
        <p id="tipoDatoReclamo">Fecha de creacion Categoria Domicilio</p>
        
            
            <ol>
                <c:forEach items="${reclamos}" var="reclamo">
                        <li id="reclamoIndividual">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                            <form action="/reclamos/delete" method="post">
                        <button id="botonBorrar" name="boton" type="submit" value=${reclamo.id}>Eliminar Reclamo</button>
                            </form>
                        </li>
                           
                </c:forEach>
            </ol>
        
        
        
        
    </body>
</html>
