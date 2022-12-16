<%-- 
    Document   : addReclamo
    Created on : Nov 28, 2022, 6:53:31 PM
    Author     : Joancito
--%>
<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/partes/navbarReclamos.jsp"></jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/styles.css">
        <title>Reclamos</title>
    </head>
    <body>
        
        <form action="/reclamos/add" method="post">
            <div id="formulario2">
                <div class="formDatReclamo2"><input type="radio" id="categoria" name="categoria" value="ALUMBRADO" required>
                <label for="categoria">ALUMBRADO</label><br>
                </div>
                
                <div class="formDatReclamo2"><input type="radio" id="categoria" name="categoria" value="ARBOLADO" required>
                <label for="categoria">ARBOLADO</label><br>
                </div>
                
                <div class="formDatReclamo2"><input type="radio" id="categoria" name="categoria" value="LIMPIEZA" required>
                <label for="categoria">LIMPIEZA</label><br>
                </div>
                
                <div class="formDatReclamo2"><input type="radio" id="categoria" name="categoria" value="PLUVIAL" required>
                <label for="categoria">PLUVIAL</label><br>
                </div>
                
                <div class="formDatReclamo2"><input type="text" id="calle" name="calle" placeholder="Calle"required ></div>
                <div class="formDatReclamo2"><input type="number" id="altura" name="altura" placeholder="Altura" required></div>
                
                <div class="button2"><input type="submit" id="submit2" value="Generar Reclamo" ></div>
                
            </div>
                
            <br>
            
            
            
        </form>
        
        
        
        
    </body>
</html>
