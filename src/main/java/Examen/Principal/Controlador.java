/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.Principal;

import Examen.Modelo.Modelo;
import Examen.Vista.Vista;

/**
 *
 * @author Alumno
 */
public class Controlador {
    private Modelo model;
    private Vista view;

    public Controlador(Modelo m, Vista v) {
        this.model = m;
        this.view = v;
    }
    
    public void iniciar() {
        view.iniciar();
    }
}
