/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Examen.Servlets.Reclamos;

import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DAOS.IMPL.ReclamoDAOMySQL;
import Examen.DTOS.LoginDTO;
import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Modelo.Modelo;
import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joancito
 */
@WebServlet(name = "AddReclamoServlet", urlPatterns = {"/reclamos/add"})
public class AddReclamoServlet extends HttpServlet {

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
            RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/pages/addReclamo.jsp");
            vista.forward(request, response);
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
        
        Modelo model = new Modelo(new PersonaDAOMySQL(),new ReclamoDAOMySQL());
        PersonaDTO persona = (PersonaDTO) request.getSession().getAttribute("usuario"); 
        
        
        //Cargando el reclamo
        LocalDate fechaCreacion = LocalDate.now();
        
         //Veo si es obligatorio es tuUpperCase
        
        String catego = request.getParameter("categoria");

        Categoria categoria = Categoria.valueOf(catego);
        
        String calle = (String) request.getParameter("calle");
       
        int altura = Integer.parseInt(request.getParameter("altura"));
        
        Domicilio domicilio = new Domicilio(calle,altura);
        
        //String descripcion = (String) request.getParameter("descripcion");
        
        int id = persona.getId();
        
        //Se añade el reclamo
        ReclamoDTO reclamo = new ReclamoDTO(fechaCreacion,categoria,domicilio,id);
        model.añadirReclamo(reclamo);
        
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
