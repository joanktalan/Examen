/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Examen.Servlets;

import Examen.DAOS.IMPL.LoginDAOHardCode;
import Examen.DAOS.IMPL.LoginDAOMySQL;
import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DTOS.AdministradorDTO;
import Examen.DTOS.LoginDTO;
import Examen.DTOS.PersonaDTO;
import Examen.Modelo.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joancito
 */
public class logins extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    //isError400 =
    
    
    
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
        request.getRequestDispatcher("WEB-INF/pages/ingreseId.jsp").forward(request, response);
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
         int id;
            //PersonaDTO persona=null;

            Modelo model = new Modelo(new PersonaDAOMySQL(), new LoginDAOMySQL());

            boolean isErrorPage400=true;            //ID INCORRECTO X
            boolean isErrorPage401=true;            //NO ES ADMINISTRADOR


            id = Integer.parseInt(request.getParameter("id"));

            boolean existe=model.IdExiste(id);            //NO ES ADMINISTRADOR


            if(existe){

                isErrorPage400=false;
                Collection<LoginDTO> logins= model.obtenerLogins(id);


                request.setAttribute("id",id);
                request.setAttribute("logins",logins);


                RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/vistaLogins.jsp");

                vista.forward(request, response);
            }

            else{
                RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/page400.jsp");
                vista.forward(request, response);
            }

            //}
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
