/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Examen.Servlets;

import Examen.DAOS.IMPL.LoginDAOHardCode;
import Examen.DAOS.IMPL.LoginDAOMySQL;
import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DTOS.LoginDTO;
import Examen.DTOS.PersonaDTO;
import Examen.Modelo.Modelo;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class ServletParaLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //el usuario ingresa un nombre, ese nombre es buscado en la base de datos y si coincide se devuelve el usuario
        
        boolean isErrorPage=true;
        
        Modelo model = new Modelo(new PersonaDAOMySQL(), new LoginDAOMySQL());
        
        String usuario=request.getParameter("user");
        
        String contrasenia=request.getParameter("contrasenia");
        
        PersonaDTO persona = model.obtenerPersona(usuario, contrasenia);
        
        if(persona!=null){
            isErrorPage=false;
            
        
        //cargando el login
        LoginDTO login = new LoginDTO(persona.getId(),LocalDate.now(),LocalTime.now());
        model.cargarLogin(login);
        
        //Vísta de la Pagina
        
        request.getSession().setAttribute("user", usuario);
        request.getSession().setAttribute("contrasenia", contrasenia);
        
        response.sendRedirect(request.getContextPath() + "/reclamos/all");
                
        }
        
        else{
            RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/page401.jsp");
            vista.forward(request, response);
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
