/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS.IMPL;

import Examen.DAOS.LoginDAO;
import Examen.DTOS.LoginDTO;
import Examen.Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public class LoginDAOMySQL implements LoginDAO{
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usuariosyreclamos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    
    

    @Override
    public Collection<LoginDTO> obtenerLogins(int id) {
        Collection<LoginDTO> logins = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM logins where personaid2="+id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                                
                LocalDate date = rs.getDate(2).toLocalDate();
                
                LocalTime time = rs.getTime(3).toLocalTime();
                                
                LoginDTO login = new LoginDTO(id,date,time);
                
                logins.add(login);
                 
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener login", ex);
        }
        return logins;
    }

    @Override
    public void cargarLogin(LoginDTO login) {
      
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO `usuariosyreclamos`.`logins` (`date`, `time`, `personaid2`) VALUES ('"+ login.getDate() +"', '"+login.getTime()+"', '"+login.getId()+"')");
    
            ps.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener login", ex);
        }
    }
    
}
