/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS.IMPL;
import Examen.DAOS.PersonaDAO;
import Examen.DTOS.AdministradorDTO;
import Examen.DTOS.ContribuyenteDTO;
import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 *
 * @author Joancito
 */
public class PersonaDAOHardCode implements PersonaDAO {
    
    private Collection<PersonaDTO> personas;

    public PersonaDAOHardCode() {
        this.personas = new ArrayList<>();
        cargarPersonas();
    }
    
     private void cargarPersonas() {
        personas.add(new PersonaDTO(1, "55487621", "romeo", "santos", "romeosantos@gmail.com", "00000000", "romeoSantito", "12345",0));
        personas.add(new PersonaDTO(2, "33421675", "ricky", "martin", "rickymartin@gmail.com", "11111111", "rickyElMartin", "12345",0));
        personas.add(new PersonaDTO(3, "65123458", "alejandro", "sanz", "alesanz@outlook.com", "02316554", "AleSanz", "123456",1));
    }
    
     
    
    
    
//BIEN
    @Override
    public Collection<PersonaDTO> obtenerPersonas() {
        return personas;
    }



    @Override
    public PersonaDTO obtenerPersona(String usuarioAfuera, String contraseniaAfuera) {
        
        boolean seEncontro=false;
        Iterator<PersonaDTO> it = personas.iterator();
        
        PersonaDTO personaEncontrada = null;
        PersonaDTO aux = null;
        
        while(it.hasNext() && seEncontro == false) {
            aux = it.next();
            if (aux.getUsuario().equals(usuarioAfuera) && aux.getContraseña().equals(contraseniaAfuera)) {
                seEncontro = true;
            }
        }
        //hardcodeo un administrador para no tener un boolean en personaDTO
            //tendria que replantear muchas logicas para un problema que se va a solucionar
            
        if(aux.getId()==3){
                    personaEncontrada = new AdministradorDTO(aux.getId(), aux.getDni(), aux.getNombre(), aux.getApellido(), aux.getMail(), aux.getTelefonoMovil(), usuarioAfuera, contraseniaAfuera);
                }
                else
                {
                    //personaEncontrada = (ContribuyenteDTO) aux;
                     personaEncontrada = new ContribuyenteDTO(aux.getId(), aux.getDni(), aux.getNombre(), aux.getApellido(), aux.getMail(), aux.getTelefonoMovil(), usuarioAfuera, contraseniaAfuera);
                
                }
        
        
        
        
        return personaEncontrada;
    }
        
    

    @Override
    public boolean usuarioExiste(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contraseñaExiste(String contrasenia, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public PersonaDTO login(String usuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
//    @Override
//    public String agregarReclamo(int idReclamo, Date fechaSeCreo, Date fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion, int idUsuario) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void verReclamos(Collection<ReclamoDTO> reclamos, PersonaDTO persona) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    //    @Override
//    public PersonaDTO obtenerPersona(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public boolean IdExiste(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
