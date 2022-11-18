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
public interface ReclamoDAO {
     public Collection<ReclamoDTO> obtenerReclamos();
     public ReclamoDTO obtenerReclamo(int id);
     public Collection<ReclamoDTO> obtenerReclamos(PersonaDTO persona);
}
