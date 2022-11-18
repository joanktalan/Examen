/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS.IMPL;

import Examen.DAOS.ReclamoDAO;
import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;


import Examen.Otros.Categoria;
import Examen.Otros.Domicilio;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Alumno
 */
public class ReclamoDAOHardCode implements ReclamoDAO {
    
     private Collection<ReclamoDTO> reclamos;

    public ReclamoDAOHardCode() {
        this.reclamos = new ArrayList<>();
        cargarReclamos();
    }
    
     private void cargarReclamos() {
         Domicilio inmueble1= new Domicilio("Lope de Vega", 3600);
         Domicilio inmueble2= new Domicilio("Lope de Vega", 3700);
         Domicilio inmueble3= new Domicilio("Jonte", 1233);
         
         Date fechaSC1 = Date.valueOf("2020-10-02");
         Date fechaSC2 = Date.valueOf("2020-11-01");
         Date fechaSC3 = Date.valueOf("2021-03-04");
         
         Date fechaSR1 = Date.valueOf("2020-10-06");
         Date fechaSR2 = Date.valueOf("2020-11-05");
         Date fechaSR3 = Date.valueOf("2021-03-08");
         
        reclamos.add(new ReclamoDTO(1, fechaSC1.toLocalDate(), fechaSR1.toLocalDate(), Categoria.ALUMBRADO, inmueble1, "luz calle rota", 2));
        reclamos.add(new ReclamoDTO(0, fechaSC2.toLocalDate(), fechaSR2.toLocalDate(), Categoria.ARBOLADO, inmueble2, "Arbol callo sobre mi", 2));
        reclamos.add(new ReclamoDTO(0, fechaSC3.toLocalDate(), fechaSR3.toLocalDate(), Categoria.LIMPIEZA, inmueble3, "tacho basura roto", 1));
    }
    
     
    
    
    

    @Override
    public Collection<ReclamoDTO> obtenerReclamos() {
        return reclamos;
    }

    @Override
    public ReclamoDTO obtenerReclamo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Collection<ReclamoDTO> obtenerReclamos(PersonaDTO persona) {
        
        Collection<ReclamoDTO> reclamosExclusivos=null;
        reclamosExclusivos=persona.darReclamos(reclamos);
        return reclamosExclusivos;
        
    }
    
}
