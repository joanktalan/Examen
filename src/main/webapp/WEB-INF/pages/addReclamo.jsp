<%-- 
    Document   : addReclamo
    Created on : Nov 28, 2022, 6:53:31 PM
    Author     : Joancito
--%>

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
            <div id="formulario">
                <div class="formDatReclamo"><input type="radio" id="categoria" name="categoria" value="ALUMBRADO">
                <label for="categoria">ALUMBRADO</label><br>
                </div>
                
                <div class="formDatReclamo"><input type="radio" id="categoria" name="categoria" value="ARBOLADO">
                <label for="categoria">ARBOLADO</label><br>
                </div>
                
                <div class="formDatReclamo"><input type="radio" id="categoria" name="categoria" value="LIMPIEZA">
                <label for="categoria">LIMPIEZA</label><br>
                </div>
                
                <div class="formDatReclamo"><input type="radio" id="categoria" name="categoria" value="PLUVIAL">
                <label for="categoria">PLUVIAL</label><br>
                </div>
                
                <div class="formDatReclamo"><input type="text" id="calle" name="calle" placeholder="Calle" ></div>
                <div class="formDatReclamo"><input type="text" id="altura" name="altura" placeholder="Altura" ></div>
                
                <div class="button"><input type="submit" id="submit" value="Generar Reclamos" ></div>
                
            </div>
                
            <br>
            
            
            
        </form>
        
        
        
        
    </body>
</html>
