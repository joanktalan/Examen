/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package Examen.Filtros;


import Examen.DTOS.ContribuyenteDTO;
import Examen.DTOS.PersonaDTO;
import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Joancito
 */
@WebFilter(filterName = "LoginFiltro", urlPatterns = {"/reclamos/all", "/verLogins"})
public class LoginFiltro implements Filter {
    
    private static final boolean debug = true;
    private FilterConfig filterConfig = null;
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        // Pido la sesión actual
        HttpSession session = httpRequest.getSession();

        System.out.println();

        if (session != null && session.getAttribute("usuario") != null) {
            if(httpRequest.getServletPath().contentEquals("/verLogins") && (PersonaDTO) session.getAttribute("usuario") instanceof ContribuyenteDTO){
                
                RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/views/page401.jsp");
                vista.forward(request, response);
            }
            chain.doFilter(request, response); // Ir al siguiente en la cadena de filters
            //en caso de que no haya uno va directo a una de esas paginas....

        } else {
            
            //este codigo es para enviarte a otra pagina en caso de que hayas ingresado mal las cosas...
            // httpRequest.getServletPath() me trae el servlet/jsp de origen, por ejemplo, "/perfil" o "/restringida"
            String origen = httpRequest.getServletPath();
            // Armo la queryString, por ejemplo, "?origen=/perfil" o "?origen=/restringida"
            
            String queryS = "?origen=" + origen;
            // Lo mando para el servlet de login con el dato de origen como parámetro
            // "/login?origen=/perfil" o "/login?origen=/restringida"
            //response.sendRedirect(request.getContextPath() + haciaDondeIba); 
            
            request.getRequestDispatcher("/parcial2" + queryS).forward(request, response);
            
        }

    }

    
    
    
    
    
    
    
    public void destroy() {        
    }
   
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {                
                log("LoginFiltro:Initializing filter");
            }
        }
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
    
}
