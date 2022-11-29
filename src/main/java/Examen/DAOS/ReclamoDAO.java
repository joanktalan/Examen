/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.DAOS;

import Examen.DTOS.PersonaDTO;
import Examen.DTOS.ReclamoDTO;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public interface ReclamoDAO {
      public Collection<ReclamoDTO> obtenerReclamos(PersonaDTO persona);
      public void agregarReclamo(ReclamoDTO reclamo);
}


//CODIGO EXTRA//
//public Collection<ReclamoDTO> obtenerReclamos();