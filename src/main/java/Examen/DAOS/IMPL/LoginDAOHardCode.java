/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS.IMPL;

import Examen.DAOS.LoginDAO;
import Examen.DTOS.LoginDTO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Joancito
 */
public class LoginDAOHardCode implements LoginDAO{
    
    private Collection<LoginDTO> logins;

    public LoginDAOHardCode() {
        this.logins=new ArrayList<>();
        cargarLogins();
    }

    @Override
    public Collection<LoginDTO> obtenerLogins(int id) {
        
        Collection<LoginDTO> loginsPorId=new ArrayList<>();
        
        for (LoginDTO loginDTO : logins) {
            if(loginDTO.getId()==id){
                loginsPorId.add(loginDTO);
            }
        }
        
        return loginsPorId;
    }

    @Override
    public void cargarLogin(LoginDTO login) {
        logins.add(login);
    }
    
     private void cargarLogins() {
         
         
         LocalDate fechaS1 = LocalDate.of(2020, 10, 02);
         LocalDate fechaS2 = LocalDate.of(2020, 11, 01); 
         LocalDate fechaS3 = LocalDate.of(2021, 03, 04); 
         
         LocalDate fechaR1 = LocalDate.of(2020, 10, 06);
         LocalDate fechaR2 = LocalDate.of(2020, 11, 05);
         LocalDate fechaR3 = LocalDate.of(2021, 3, 8);  
         
         LocalTime horaS1 = LocalTime.of(15, 30);
         LocalTime horaS2 = LocalTime.of(16, 30); 
         LocalTime horaS3 = LocalTime.of(17, 45); 
         
         LocalTime horaR1 = LocalTime.of(19, 30);
         LocalTime horaR2 = LocalTime.of(20, 30);
         LocalTime horaR3 = LocalTime.of(21, 18);  
         
         
         
         
                  
         
         //USUARIO 1 INGRESO EN 2020-10-02 
    
         //USUARIO 2 INGRESO EN 2020-11-01
         //USUARIO 2 INGRESO EN 2021-03-04
         
         //USUARIO 3 INGRESO EN 2020-10-06
         //USUARIO 3 INGRESO EN 2020-11-05
         //USUARIO 3 INGRESO EN 2021-03-08
         
         LoginDTO login1 = new LoginDTO(1,fechaS1,horaS1);
         LoginDTO login2 = new LoginDTO(2,fechaS2,horaS2);
         LoginDTO login3 = new LoginDTO(2,fechaS3,horaS3);
                 
         LoginDTO login4 = new LoginDTO(3,fechaR1,horaR1);
         LoginDTO login5 = new LoginDTO(3,fechaR2,horaR2);
         LoginDTO login6 = new LoginDTO(3,fechaR3,horaR3);
         
         
         
           logins.add(login1);
           logins.add(login2);
           logins.add(login3);
           logins.add(login4);
           logins.add(login5);
           logins.add(login6);
           
           
    }
    
    
    
}
