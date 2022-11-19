<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Logins</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body>
        
        
        <h1 style='text-align:center'>Logins del id: ${id}</h1>
          <p><a class="btn btn-warning btn-lg" href="${pageContext.request.contextPath}/Login">volver</a></p>
        <p style='text-align:center'>Fecha------Hora</p>
        
        <ul>
            <c:forEach items="${logins}" var="login">
                <li style='text-align:center'> "${login.date}" "${login.time}" </li>
            </c:forEach>
                
        </ul>
        
    </body>
</html>
