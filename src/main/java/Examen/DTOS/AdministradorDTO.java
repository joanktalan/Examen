package Examen.DTOS;

import java.util.Collection;

public class AdministradorDTO extends PersonaDTO {

    public AdministradorDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contrasenia) {
        super(id, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
    }
    
    @Override
    public String getSQL() {
        String SQL="SELECT * FROM reclamos";
        return SQL;
    }
    
    @Override
     public String getUrlDoGetLogins(){
        return "/WEB-INF/pages/ingreseId.jsp";
    }
    
     @Override
    public String getUrlVerLogins(){
        return "/WEB-INF/views/vistaLogins.jsp";
    }
    

    @Override
    public String getUrlBorrarReclamo() {
         return "/WEB-INF/pages/deleteReclamo.jsp";
    }

    @Override
    public String getUrlModificarReclamo() {
        return "/WEB-INF/pages/modifyReclamo.jsp";
    }

    @Override
    public String getUrlVerReclamosPendientes() {
        return "/WEB-INF/views/vistaReclamosPendientes.jsp";
    }
    
    @Override
    public boolean tieneNavbar() {
        return true;
    }
    
}
