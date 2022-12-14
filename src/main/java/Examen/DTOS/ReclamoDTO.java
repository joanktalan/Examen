package Examen.DTOS;

import Examen.Otros.Domicilio;
import Examen.Otros.Categoria;

import java.time.LocalDate;

public class ReclamoDTO {

    private int id;

    private LocalDate fechaSeCreo;

    private LocalDate fechaSeResolvio;

    private Categoria categoria;

    private Domicilio inmueble;
    
    private String descripcion;
    
    private int idUsuario;

    public ReclamoDTO(int id, LocalDate fechaSeCreo, LocalDate fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario) {
        this.id = id;
        this.fechaSeCreo = fechaSeCreo;
        this.fechaSeResolvio = fechaSeResolvio;
        this.categoria = categoria;
        this.inmueble = inmueble;
        this.descripcion = descripcion;
        this.idUsuario=idUsuario;
    }
    
     public ReclamoDTO(LocalDate fechaSeCreo, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario) {
        this.fechaSeCreo = fechaSeCreo;
        this.categoria = categoria;
        this.inmueble = inmueble;
        this.descripcion = descripcion;
        this.idUsuario=idUsuario;
    }
     
     public ReclamoDTO(LocalDate fechaSeCreo, Categoria categoria, Domicilio inmueble,int idUsuario) {
        this.fechaSeCreo = fechaSeCreo;
        this.categoria = categoria;
        this.inmueble = inmueble;
        this.idUsuario=idUsuario;
    }

    public LocalDate getFechaSeCreo() {
        return fechaSeCreo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Domicilio getInmueble() {
        return inmueble;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaSeResolvio() {
        return fechaSeResolvio;
    }

    public int getId() {
        return id;
    }
    
    
    
    
    public int getIdUsuario() {
        return idUsuario;
    }
    
    
//
//    public int getId() {
//        return id;
//    }

    
    
    
    
    
}
