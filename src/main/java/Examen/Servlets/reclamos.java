/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Examen.Servlets;

import Examen.DAOS.IMPL.LoginDAOHardCode;
import Examen.DAOS.IMPL.LoginDAOMySQL;
import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DAOS.IMPL.ReclamoDAOMySQL;
import Examen.DTOS.LoginDTO;
import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Modelo.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
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
public class reclamos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //el usuario ingresa un nombre, ese nombre es buscado en la base de datos y si coincide se devuelve el usuario
        
        boolean isErrorPage=true;
        
        Modelo model = new Modelo(new PersonaDAOMySQL(), new ReclamoDAOMySQL(), new LoginDAOMySQL());
        
        String usuario=request.getParameter("user");
        
        String contrasenia=request.getParameter("contrasenia");
        
        PersonaDTO persona = model.obtenerPersona(usuario, contrasenia);
        
        if(persona!=null){
            isErrorPage=false;
            
        String nombre=persona.getNombre();
        String apellido=persona.getApellido();
        
        Collection<ReclamoDTO> reclamos = model.obtenerReclamos(persona);
        
        
        request.setAttribute("nombre",nombre);
        request.setAttribute("apellido",apellido);
        request.setAttribute("reclamos",reclamos);
        
        
        //cargando el login
        LoginDTO login = new LoginDTO(persona.getId(),LocalDate.now(),LocalTime.now());
        model.cargarLogin(login);
        
        //Vísta de la Pagina
        RequestDispatcher vista = request.getRequestDispatcher("jsps/vistaReclamos.jsp");
        
        vista.forward(request, response);
            
        
        }
        
        else{
            RequestDispatcher vista = request.getRequestDispatcher("jsps/erorres/page401.jsp");
            vista.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
