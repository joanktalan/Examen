<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body>
        
        <h1 style='text-align:center'>${nombre} ${apellido}</h1>
        <p><a class="btn btn-warning btn-lg" href="${pageContext.request.contextPath}/Reclamo">volver</a></p>
         
        <p style='text-align:center'>Fecha de creacion-- Categoria --Domicilio</p>
        
        <ul>
            <c:forEach items="${reclamos}" var="reclamo">
                <li style='text-align:center'>"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"</li>
            </c:forEach>
                
        </ul>
        
    </body>
</html>
