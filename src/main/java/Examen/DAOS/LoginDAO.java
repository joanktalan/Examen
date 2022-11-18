/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS;

import Examen.DTOS.LoginDTO;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public interface LoginDAO {
    public Collection <LoginDTO> obtenerLogins(int id);
    public void cargarLogin (LoginDTO login);
}
