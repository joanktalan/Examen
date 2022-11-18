package Examen.DTOS;

import java.util.Collection;

public class AdministradorDTO extends PersonaDTO {

    public AdministradorDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contrasenia) {
        super(id, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
    }
    
    

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
    
    @Override
    public void verReclamos(Collection<ReclamoDTO> reclamos){
             System.out.println("*** RECLAMOS ***");
        System.out.println("FECHA DE CREACION " + " CATEGORIA " + " DOMICILIO ");
        for (ReclamoDTO re : reclamos) {
            System.out.println(re.getFechaSeCreo() + " " + re.getCategoria() + " " + re.getInmueble());
        }
    }
    
    @Override
    public Collection<ReclamoDTO> darReclamos(Collection<ReclamoDTO> reclamos){
     return reclamos;   
    }
    
    @Override
    public String getSQL() {
        String SQL="SELECT * FROM reclamos";
        return SQL;
    }
    
}
