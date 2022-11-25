package Examen.DTOS;

import java.util.Collection;

public class ContribuyenteDTO extends PersonaDTO {

    public ContribuyenteDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contrasenia) {
        super(id, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
    }
    
    
    @Override
    public String getSQL() {
        String SQL="SELECT * FROM reclamos where personaid1="+getId();
        return SQL;
    }
    
    @Override
     public String getUrlDoGet(){
        return "WEB-INF/views/page401.jsp";
    }
    
     @Override
    public String getUrlVerLogins(){
        return "WEB-INF/views/page401.jsp";
    }
    
    
    
    //WORK IN PROGRESS
    public void generarReclamo() {
    }
    
}
