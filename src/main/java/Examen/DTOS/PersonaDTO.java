package Examen.DTOS;


import java.util.Collection;
import java.util.List;

public abstract class PersonaDTO {

    private int id;
    
    private String dni;
    
    private String nombre;

    private String apellido;

    private String mail;

    private String telefonoMovil;

    private int idReclamo;
    
    private String usuario;
    
    private String contraseña;
   

    
   

    public PersonaDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contraseña, int idReclamo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefonoMovil = telefonoMovil;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.idReclamo = idReclamo;
    }

    public PersonaDTO(int id, String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contraseña) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefonoMovil = telefonoMovil;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public PersonaDTO(String dni, String nombre, String apellido, String mail, String telefonoMovil, String usuario, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefonoMovil = telefonoMovil;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getId() {
        return id;
    }

    public abstract String getSQL();
    
    //Metodos distintivos para los tipo de usuarios    
    
    public abstract String getUrlDoGetLogins();
    
    public abstract String getUrlVerLogins();
    
    public abstract String getUrlBorrarReclamo();
    
    public abstract String getUrlModificarReclamo();
    
    public abstract String getUrlVerReclamosPendientes();
       
    
    
    public String getContraseña() {
       return contraseña;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }
    
}
