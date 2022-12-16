<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    
    
    <body>  
        <div class="navbar"">
            <ul>
                
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>
                </li>
                
                 <c:choose>
                     <c:when test="${!sesionIniciada}">
                         <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/parcial2">Iniciar Sesion</a>
                        </li>
                
                        <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/registrarse">Registrarse</a>
                        </li>



                     </c:when>    
                     <c:otherwise>
                         
                         

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/reclamos/all">Ver Reclamos</a>
                    </li>
                    
                    <li class="nav-item2">
                    <a class="nav-link" href="${pageContext.request.contextPath}/reclamos/add">Añadir Reclamo</a>
                    </li>


                     <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Logout">Cerrar Sesion</a>
                    </li>

                     </c:otherwise>
                 </c:choose>
                
                
                
                
                
                
                
                
                
                    
                
                
                    
                
            </ul>
        </div>
    </body>
     
</html>



