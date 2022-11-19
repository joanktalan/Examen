/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.Modelo;

import Examen.DAOS.PersonaDAO;
import Examen.DAOS.ReclamoDAO;
import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DAOS.IMPL.ReclamoDAOMySQL;
import Examen.DAOS.LoginDAO;
import Examen.DTOS.LoginDTO;
import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Joan
 */
public class Modelo {

    private PersonaDAO personaDAO;
    private ReclamoDAO reclamoDAO;
    private LoginDAO loginDAO;
    
    public Modelo() {
    }

    public Modelo(PersonaDAO personaDAO, ReclamoDAO reclamoDAO) {
        this.personaDAO = personaDAO;
        this.reclamoDAO = reclamoDAO;
    }

    public Modelo(PersonaDAO personaDAO, LoginDAO loginDAO) {
        this.personaDAO = personaDAO;
        this.loginDAO = loginDAO;
    }

    public Modelo(PersonaDAO personaDAO, ReclamoDAO reclamoDAO, LoginDAO loginDAO) {
        this.personaDAO = personaDAO;
        this.reclamoDAO = reclamoDAO;
        this.loginDAO = loginDAO;
    }
    
    
    
    
    
    //RECLAMOS
    public Collection<ReclamoDTO> obtenerReclamos(){
        return reclamoDAO.obtenerReclamos();
    }
    
    public Collection<ReclamoDTO> obtenerReclamos(PersonaDTO persona){
        return reclamoDAO.obtenerReclamos(persona);
    }
    
    
    public void verReclamos(Collection<ReclamoDTO> reclamos,PersonaDTO persona){
    }
    
    
    public ReclamoDTO obtenerReclamo(int reclamoID){
        return reclamoDAO.obtenerReclamo(reclamoID);
    }
    
     public Collection<PersonaDTO> obtenerPersonas(){
        return personaDAO.obtenerPersonas();
    }
 
     //PERSONAS
     
     public PersonaDTO obtenerPersona(String usuario, String contraseña){
        return personaDAO.obtenerPersona(usuario,contraseña);
    }
     
    
    public boolean usuarioExiste(String usuario){
        return personaDAO.usuarioExiste(usuario);
    }
    

    public boolean contraseñaExiste(String contrasenia,String usuario) {
        return personaDAO.contraseñaExiste(contrasenia,usuario);
    }
    
    public PersonaDTO login(String usuario, String contraseña) {
        return personaDAO.login(usuario, contraseña);
    }
    
    public boolean IdExiste(int id) {
        return personaDAO.IdExiste(id);
    }
    
    //LOGINS
    
    public Collection<LoginDTO> obtenerLogins(int id) {
        return loginDAO.obtenerLogins(id);
    }


    public void cargarLogin(LoginDTO login) {
        loginDAO.cargarLogin(login);
    }
    
    
    //    public String agregarReclamo(int idReclamo, Date fechaSeCreo, Date fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario){
//    return personaDAO.agregarReclamo(idReclamo,fechaSeCreo,fechaSeResolvio,categoria,inmueble,descripcion,idUsuario);
//    }
    
//     public PersonaDTO obtenerPersona(int personaID){
//        return personaDAO.obtenerPersona(personaID);
//    }

  

    
    
    
}
