<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<jsp:include page="/WEB-INF/partes/navbarReclamos.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    
    <body>
        
        <h1 id="NombreYApe">${nombre} ${apellido}</h1>
         
    <c:choose>
        <c:when test="${!reclamos.isEmpty()}">
            <h2 id="TituloReclamosResueltos">Reclamos Resueltos</h2>

            <h2 id="TituloReclamosPendientes">Reclamos Pendientes</h2>

            <p id="tipoDatoReclamo1">Fecha de creacion Categoria Domicilio</p>

            <p id="tipoDatoReclamo2">Fecha de creacion Categoria Domicilio</p>




            <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio != null}">
                        <li id="reclamoIndividual1">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"</li>
                        </c:if>

                </c:forEach>
            </ol>

            <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio == null}">
                        <li id="reclamoIndividual2">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                        </li>
                        </c:if>

                </c:forEach>
            </ol>

            <br />
        </c:when>    
        <c:otherwise>
            <p id="mensajeNoReclamos" >USTED NO TIENE NINGUN RECLAMO</p> 
            <br />
        </c:otherwise>
    </c:choose>







</body>
</html>
