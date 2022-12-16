<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    
    
    <body>  
        
        
    <c:if test="${tieneNavbar}">
        <div class="navbar2"">
            <ul>

                <li class="nav-item2">
                    <a class="nav-link" href="${pageContext.request.contextPath}/reclamos/pending">Aprobar Reclamo</a>
                </li>
                
                <li class="nav-item2">
                  <a class="nav-link" href="${pageContext.request.contextPath}/reclamos/modify">Modificar Reclamo </a>
                </li>

                <li class="nav-item2">
                    <a class="nav-link" href="${pageContext.request.contextPath}/reclamos/delete">Borrar Reclamo</a>
                </li>

                <li class="nav-item2">
                    <a class="nav-link" href="${pageContext.request.contextPath}/verLogins">Ver Logins</a>
                </li>
                
                

            </ul>
        </div>
    </c:if>
       
    </body>
     
</html>



