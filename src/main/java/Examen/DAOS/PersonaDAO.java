/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.DAOS;

import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public interface PersonaDAO {
    
    public PersonaDTO obtenerPersona(String usuarioAfuera, String contraseniaAfuera);
    
    public boolean IdExiste(int id);
    
    public boolean usuarioExiste(String usuario);
    public boolean dniExiste(String dni);
    public boolean mailExiste(String mail);
    public boolean telefonoExiste(String telefono);
    
    public String parametrosCorrectos(String nombreUsuario, String dni, String mail, String telefono);
    
    public void añadirUsuario(PersonaDTO usuarioNuevo);
    
    
}

//Codigo Extra/////////////////
//public Collection<PersonaDTO> obtenerPersonas();

//public boolean contraseñaExiste(String contraseña,String usuario);        
//public PersonaDTO obtenerPersona(int id);
// public String agregarReclamo(int idReclamo, Date fechaSeCreo, Date fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario); //CAMBIAR LAS DATE POR LocalDate
//public void verReclamos(Collection<ReclamoDTO> reclamos, PersonaDTO persona);