/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.Vista;

import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import java.util.Collection;

/**
 *
 * @author Alumno
 */
public interface Vista {

    public abstract void iniciar();
    public abstract void mostrarReclamos(Collection<ReclamoDTO> reclamos);
    public abstract void mostrarPersonas(Collection<PersonaDTO> personas);
    public abstract void mostrarPersona(PersonaDTO persona);
   
    
    
}
