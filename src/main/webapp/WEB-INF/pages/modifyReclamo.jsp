<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/partes/navbar.jsp"></jsp:include>
<jsp:include page="/WEB-INF/partes/navbarReclamos.jsp"></jsp:include>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Reclamos</title>
        <link rel="stylesheet" href="/css/styles.css">
    </head>
    <body>
                
        <h1 id="tituloReclamoCentrado">Seleccione Reclamo a Modificar</h1>
        
        <p id="tipoDatoReclamo">Fecha de creacion Categoria Domicilio</p>
        
            
            <ol>
                <c:forEach items="${reclamos}" var="reclamo">
                    
                    <li id="reclamoIndividual">"${reclamo.fechaSeCreo}"  "${reclamo.categoria}"  "${reclamo.inmueble}"
                        <div class="modificar"">
                            <ul>
                                <li> <form action="/reclamos/modify" method="post">
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
                                            <div class="formDatReclamo"><input type="number" id="altura" name="altura" placeholder="Altura" maxlength="5" ></div>


                                            <button id="botonModificar" name="boton" type="submit" value=${reclamo.id}>Modificar Reclamo</button>

                                        </div>
                                    </form>
                                </li>
		
	</ul>
</div>
                    </li>
                           
                </c:forEach>
            </ol>
        
        
        
        
    </body>
</html>
