/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.Vista;

import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import Examen.Otros.Domicilio;
import Examen.Modelo.Modelo;
import Examen.Otros.Categoria;
import java.sql.Date;
import java.util.Collection;
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class VistaConsola implements Vista {

    private Modelo model;

    public VistaConsola(Modelo model) {
        this.model = model;
    }

    @Override
    public void iniciar() {
        //Collection<ReclamoDTO> reclamos = model.obtenerReclamos(); 
        Collection<PersonaDTO> personas = model.obtenerPersonas(); 
        
        //mostrarReclamos(reclamos);
        String usuario="";
        String contraseña="";
        
        PersonaDTO persona = model.login(usuario, contraseña);
        Collection<ReclamoDTO> reclamos = model.obtenerReclamos(persona);
        mostrarReclamos(reclamos);
        //persona.verReclamos(reclamos);
        //mostrarPersonas(personas);
        
        
//        usuario="rickyElMartin";
//        pass="12345";
     
        
        

        
//        int idReclamo=5;
//        Date fechaSeCreo=Date.valueOf("2020-10-10");
//        Date fechaSeResolvio=Date.valueOf("2020-10-14");
//        Domicilio inmueble = new Domicilio("Azcuenaga", 3200);
//        int idUsuario=3;
//        
//        String msg=model.agregarReclamo(idReclamo, fechaSeCreo, fechaSeResolvio, Categoria.LIMPIEZA, inmueble, "Se callo un poste en el tacho de reciclaje", idUsuario);
//        
//        System.out.println(msg);
//        
//        mostrarReclamos(reclamos);
        
        

        }
             
        
        
    

    @Override
    public void mostrarReclamos(Collection<ReclamoDTO> reclamos) {
        System.out.println("*** RECLAMOS ***");
        System.out.println("FECHA DE CREACION " + " CATEGORIA " + " DOMICILIO ");
        for (ReclamoDTO re : reclamos) {
            System.out.println(re.getFechaSeCreo() + " " + re.getCategoria() + " " + re.getInmueble());//aca va descripcion y lo que me pida el profe en el examen
        }
    }

    @Override
    public void mostrarPersonas(Collection<PersonaDTO> personas) {
        System.out.println("*** PERSONAS ***");
        System.out.println("NOMBRE\tAPELLIDO\tUSUARIO");
        for (PersonaDTO persona : personas) {
            System.out.println(persona.getNombre()+"\t"+persona.getApellido()+"\t"+persona.getUsuario());
        }
    }
    
    @Override
    public void mostrarPersona(PersonaDTO persona){
        
        System.out.println("Usuario y contraseña ingresados correctamente");
        System.out.println("Mostrando Usuario:");
        
        
        System.out.println("*** PERSONA SELECCIONADA ***");
        System.out.println("NOMBRE\tAPELLIDO\tUSUARIO");
        
        System.out.println(persona.getNombre()+"\t"+persona.getApellido()+"\t"+persona.getUsuario());
        
    }

    
    
}