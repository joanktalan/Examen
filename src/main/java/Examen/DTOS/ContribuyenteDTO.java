package Examen.DTOS;

import java.util.Collection;

public class ContribuyenteDTO extends PersonaDTO {

    public ContribuyenteDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contrasenia) {
        super(id, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
    }

    public ContribuyenteDTO(String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contraseña) {
        super(dni, nombre, apellido, mail, telefonoMovil, usuario, contraseña);
    }
    
    
    
    
    @Override
    public String getSQL() {
        String SQL="SELECT * FROM reclamos where personaid1="+getId();
        return SQL;
    }
    
    @Override
     public String getUrlDoGetLogins(){
        return "/WEB-INF/views/page401.jsp";
    }
    
     @Override
    public String getUrlVerLogins(){
        return "/WEB-INF/views/page401.jsp";
    }
    
    @Override
    public String getUrlBorrarReclamo(){
        return "/WEB-INF/views/page401.jsp";
    }
    
    @Override
    public String getUrlModificarReclamo(){
        return "/WEB-INF/views/page401.jsp";
    }
    
    @Override
    public String getUrlVerReclamosPendientes(){
        return "/WEB-INF/views/page401.jsp";
    }

    @Override
    public boolean tieneNavbar() {
        return false;
    }
    
    
    
}
