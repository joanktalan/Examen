package Examen.DTOS;

import java.util.Collection;

public class ContribuyenteDTO extends PersonaDTO {

    public ContribuyenteDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contrasenia) {
        super(id, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
    }
    
    
    
    public void generarReclamo() {
    }
    
     @Override
    public void verReclamos(Collection<ReclamoDTO> reclamos){
        System.out.println("*** RECLAMOS ***");
        System.out.println("FECHA DE CREACION " + " CATEGORIA " + " DOMICILIO ");
        for (ReclamoDTO re : reclamos) {
            if(re.getIdUsuario()==getId())
            System.out.println(re.getFechaSeCreo() + " " + re.getCategoria() + " " + re.getInmueble());
        }
    }
    
    @Override
    public Collection<ReclamoDTO> darReclamos(Collection<ReclamoDTO> reclamos)
    {
        Collection<ReclamoDTO> reclamosFiltrados = null;
        
        for (ReclamoDTO re : reclamos) 
             {
                if(re.getIdUsuario()==getId())
                reclamosFiltrados.add(re);
             }
      return reclamosFiltrados;
    }
    
    @Override
    public String getSQL() {
        String SQL="SELECT * FROM reclamos where personaid1="+getId();
        return SQL;
    }
    
    
}
