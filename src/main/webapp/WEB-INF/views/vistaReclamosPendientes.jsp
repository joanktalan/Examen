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
        
         
    <c:choose>
        <c:when test="${!reclamos.isEmpty()}">

            <h1 id="TituloReclamosSoloPendientes">Reclamos Pendientes</h1>
            
            <h2 id="tituloAlumbrado">ALUMBRADOS</h2>
            <p id="tipoDatoReclamoCuarto1">Fecha de creacion Categoria Domicilio</p>
             <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio == null && reclamo.categoria eq 'ALUMBRADO'}">
                        <li id="reclamoIndividualAlumbrado">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                         <form action="/reclamos/pending" method="post">
                        <button id="botonResolver" name="boton" type="submit" value=${reclamo.id}>Resolver Reclamo</button>
                            </form>
                        </li>
                        </c:if>

                </c:forEach>
            </ol>
            
            <h2 id="tituloPluvial">PLUVIALES</h2>
            <p id="tipoDatoReclamoCuarto2">Fecha de creacion Categoria Domicilio</p>
            <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio == null && reclamo.categoria eq 'PLUVIAL'}">
                        <li id="reclamoIndividualPluvial">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                         <form action="/reclamos/pending" method="post">
                        <button id="botonResolver" name="boton" type="submit" value=${reclamo.id}>Resolver Reclamo</button>
                            </form>
                        </li>
                        </c:if>

                </c:forEach>
            </ol>
            
            <h2 id="tituloLimpieza">LIMPIEZAS</h2>
            <p id="tipoDatoReclamoCuarto3">Fecha de creacion Categoria Domicilio</p>
            <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio == null && reclamo.categoria eq 'LIMPIEZA'}">
                        <li id="reclamoIndividualLimpieza">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                         <form action="/reclamos/pending" method="post">
                        <button id="botonResolver" name="boton" type="submit" value=${reclamo.id}>Resolver Reclamo</button>
                            </form>
                        </li>
                        </c:if>

                </c:forEach>
            </ol>
            
            <h2 id="tituloArbolado">ARBOLADOS</h2>
            <p id="tipoDatoReclamoCuarto4">Fecha de creacion Categoria Domicilio</p>

            <ol>
                <c:forEach items="${reclamos}" var="reclamo">

                    <c:if test="${reclamo.fechaSeResolvio == null && reclamo.categoria eq 'ARBOLADO'}">
                        <li id="reclamoIndividualArbolado">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                         <form action="/reclamos/pending" method="post">
                        <button id="botonResolver" name="boton" type="submit" value=${reclamo.id}>Resolver Reclamo</button>
                            </form>
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
