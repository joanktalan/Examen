/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.DAOS;

import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.sql.Date;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public interface PersonaDAO {
    public Collection<PersonaDTO> obtenerPersonas();
    
    public PersonaDTO obtenerPersona(String usuarioAfuera, String contraseniaAfuera);
    public boolean usuarioExiste(String usuario);
    public boolean contraseñaExiste(String contraseña,String usuario);
   
    public PersonaDTO login(String usuario, String contraseña);
    
    //public PersonaDTO obtenerPersona(int id);
    // public String agregarReclamo(int idReclamo, Date fechaSeCreo, Date fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario);
    //public void verReclamos(Collection<ReclamoDTO> reclamos, PersonaDTO persona);

    public boolean IdExiste(int id);
    
}
