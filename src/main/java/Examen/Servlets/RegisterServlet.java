/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Examen.Servlets;

import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DAOS.IMPL.ReclamoDAOMySQL;
import Examen.DTOS.ContribuyenteDTO;
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
@WebServlet(name = "RegisterServlet", urlPatterns = {"/registrarse"})
public class RegisterServlet extends HttpServlet {

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
            RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/pages/register.jsp");
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
        
        Modelo model = new Modelo (new PersonaDAOMySQL());
         RequestDispatcher vista;
        
        String mail = (String) request.getParameter("mail") ;
        String dni = (String) request.getParameter("dni") ;
        String nombreUsuario = (String) request.getParameter("user");
         String telefonoMovil = (String) request.getParameter("telefonoMovil")  ;
        
        String parametrosCorrectos = model.parametrosCorrectos(nombreUsuario,dni,mail,telefonoMovil);
        
        //CHEQUEAR SI HAY ERROR AL TENER EL PARAMETRO "mensajeRegistro" vacio
          while(!"ok".equals(parametrosCorrectos)) {      
            request.setAttribute("mensajeRegistro",model.parametrosCorrectos(nombreUsuario, dni, mail,telefonoMovil));
            vista = request.getRequestDispatcher("/WEB-INF/pages/register.jsp");
            vista.forward(request, response);
        }
        
          if (parametrosCorrectos.equals("ok")) {

            String nombre = (String) request.getParameter("nombre")  ;
            String apellido = (String) request.getParameter("apellido")  ;
            String contraseña = (String) request.getParameter("contrasenia")  ;
       

            PersonaDTO usuarioNuevo = new ContribuyenteDTO(dni, nombre, apellido, mail, telefonoMovil, nombreUsuario, contraseña);
            
            model.añadirUsuario(usuarioNuevo);
            
            vista=request.getRequestDispatcher("/WEB-INF/views/operacionExitosa.jsp");
            vista.forward(request, response);
        }
        
        
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
