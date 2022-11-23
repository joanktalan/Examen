/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DTOS;


import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author Joancito
 */
public class LoginDTO {
    
    int id;
    LocalDate date;
    LocalTime time;
    

    public LoginDTO(int id, LocalDate date, LocalTime time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

   
     public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

   
    public LocalTime getTime() {
        return time;
    }
    
    
    
    
}
