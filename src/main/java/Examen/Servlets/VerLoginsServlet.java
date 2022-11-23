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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joancito
 */
@WebServlet(name = "VerLoginsServlet", urlPatterns = {"/verLogins"})
public class VerLoginsServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int id;
            //PersonaDTO persona=null;

            Modelo model = new Modelo(new PersonaDAOMySQL(), new LoginDAOMySQL());
            PersonaDTO persona = (PersonaDTO) request.getSession().getAttribute("usuario"); 
            
           //ID INCORRECTO X
          

            id = Integer.parseInt(request.getParameter("id"));

            boolean incorrecto=model.IdExiste(id);            //NO ES ADMINISTRADOR
               

            if(incorrecto){
//                if(persona instanceof AdministradorDTO){          VER SI ESTO ES CORRECTO O SE PUEDE HACER MEJOR...
                    Collection<LoginDTO> logins= model.obtenerLogins(id);
                request.setAttribute("id",request.getParameter("id"));
                request.setAttribute("logins",logins);


                RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/vistaLogins.jsp");

                vista.forward(request, response);
//                }
//                else{
//                    RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/page401.jsp");
//                vista.forward(request, response);
//                }
                
            }
            else{
                RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/vistas/page400.jsp");
                vista.forward(request, response);
            }
                   
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //SI PONGO ESTO EN EL DOGET LO QUE ESTA EN PROCESSREQUEST DEJA DE FUNCIONAR (PARAMETRO POR URL)
            
        //request.getRequestDispatcher("WEB-INF/pages/ingreseId.jsp").forward(request, response);
        
        
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
