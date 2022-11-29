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
     public String getUrlDoGet(){
        return "WEB-INF/pages/ingreseId.jsp";
    }
    
     @Override
    public String getUrlVerLogins(){
        return "WEB-INF/views/vistaLogins.jsp";
    }
    
    
    //WORK IN PROGRESS
     public void darAlta() {
    }

    public void darBaja() {
    }

    public void modificarReclamo() {
    }

    public void consultaReclamo() {
    }

    public void resuelto() {
    }
    
    
    
}
