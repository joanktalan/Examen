/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen.Principal;

import Examen.DAOS.IMPL.PersonaDAOMySQL;
import Examen.DAOS.IMPL.ReclamoDAOMySQL;
import Examen.Modelo.Modelo;
import Examen.Vista.Vista;
import Examen.Vista.VistaConsola;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo m = new Modelo(new PersonaDAOMySQL(), new ReclamoDAOMySQL());
        Vista v = new VistaConsola(m);
        
        Controlador c = new Controlador(m, v);
        c.iniciar();
        
    }
    
}
