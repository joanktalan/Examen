/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.DAOS.IMPL;

import Examen.DAOS.PersonaDAO;
import Examen.DTOS.AdministradorDTO;
import Examen.DTOS.ContribuyenteDTO;
import Examen.DTOS.PersonaDTO;
import Examen.Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Joancito
 */
public class PersonaDAOMySQL implements PersonaDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usuariosyreclamos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASS = "root";

    @Override
    public PersonaDTO obtenerPersona(String usuarioAfuera, String contraseñaAfuera) {
        PersonaDTO persona = null;
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            String SQL = "SELECT * FROM personas where nombre_usuario='" + usuarioAfuera + "' and contrasenia='" + contraseñaAfuera + "'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int cod = rs.getInt(1);

                String dni = rs.getString(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                String mail = rs.getString(5);
                String telefonoMovil = rs.getString(6);
                String usuario = rs.getString(7);
                String contrasenia = rs.getString(8);
                int esAdmin = rs.getInt(9);

                if (esAdmin == 1) {
                    persona = new AdministradorDTO(cod, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
                } else {
                    persona = new ContribuyenteDTO(cod, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener persona", ex);
        }
        return persona;
    }

    @Override
    public boolean IdExiste(int id) {
        boolean existe = false;
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM personas where personaid=" + id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (id == rs.getInt(1)) {
                    existe = true;
                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Error al verificar usuario", ex);

        }

        return existe;
    }

    @Override
    public void registrarUsuario(PersonaDTO usuario) {
try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//MODIFICAR LO QUE SERIA UN USUARIO NUEVO CAMBIANDO TODO LO DEL QUERY
//DESPUES HACER PROCESO TAMBIEN EN UN SERVLET
            
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO `usuariosyreclamos`.`reclamos"
                    + "` (`fechaSeCreo`, `categoria`, `calle`,`altura`,`personaid1`)"
                    + " VALUES ('"+ reclamo.getFechaSeCreo() +"', '"+reclamo.getCategoria()+"', '"+reclamo.getInmueble().getCalle()+"'"
                            + ", '" + reclamo.getInmueble().getAltura() + "', '" + reclamo.getIdUsuario() + "')");
    
            ps.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener reclamo", ex);
        }    }

}



////////////CODIGO EXTRA O PARA USAR A FUTURO

  //    @Override //cambiar
//    public String agregarReclamo(int idReclamo, Date fechaSeCreo, Date fechaSeResolvio, Categoria categoria, Domicilio inmueble, String descripcion,int idUsuario) {
//       String msg="No se pudo agregar";
//        try {
//            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//            
//            PreparedStatement ps = con.prepareStatement("INSERT INTO `usuariosyreclamos`.`reclamos` (`reclamoid`, `fechaSeCreo`, `fechaSeResolvio`, `categoria`, `calle`, `altura`, `descripcion`, `personaid1`) VALUES ('"+idReclamo+"', '"+fechaSeCreo+"', '"+fechaSeResolvio+"', '"+categoria+"', '"+inmueble+"', '"+descripcion+ "', '"+idUsuario+"')");
//            ResultSet rs = ps.executeQuery();
//           
//            
//                        }
//         catch (SQLException ex) {
//            throw new RuntimeException("Error al agregar reclamo", ex);
//        }
//       
//       
//       return msg;
//    }

//@Override
//    public boolean contraseñaExiste(String contraseña,String usuario) {
//        boolean existe=false;
//        try {
//                Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//                PreparedStatement ps = con.prepareStatement("SELECT * FROM personas where nombre_usuario='"+usuario+"'");
//                ResultSet rs = ps.executeQuery();
//                if(rs.next()){
//                    if(contraseña.equals(rs.getString(8))){
//                        existe=true;
//                    }
//                }
//            } 
//            catch (SQLException ex) {
//                    throw new RuntimeException("Error al verificar contraseña", ex);
//                      }
//     
//        return existe;
//    }


//@Override
//    public boolean usuarioExiste(String usuario) {
//        boolean existe=false;
//        try {
//            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM personas where nombre_usuario='"+usuario+"'");
//            ResultSet rs = ps.executeQuery();
//            
//            if(rs.next()){
//                if(usuario.equals(rs.getString(7))){
//                existe=true;
//            }
//            }
//            
//            
//            
//            } catch (SQLException ex) {
//                throw new RuntimeException("Error al verificar usuario", ex);
//                
//                  }
//        
//        return existe;
//    }



//    @Override
//    public PersonaDTO obtenerPersona(int id) {
//        PersonaDTO persona = null;
//        try {
//            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//            
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM personas where personaid="+id);
//            ResultSet rs = ps.executeQuery();
//            
//            if(rs.next()){
//                int cod = rs.getInt(1);
//                String dni = rs.getString(2);
//                String nombre = rs.getString(3);
//                String apellido = rs.getString(4);
//                String mail = rs.getString(5);
//                String telefonoMovil = rs.getString(6);
//                String usuario = rs.getString(7);
//                String contrasenia = rs.getString(8);
//                int esAdmin=rs.getInt(9);
//                
//                if(esAdmin==1){
//                    persona = new AdministradorDTO(cod, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
//                }
//                else
//                {
//                    persona = new ContribuyenteDTO(cod, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
//                }
//                
//                 
//               
//            }
                
               
            
//        } catch (SQLException ex) {
//            throw new RuntimeException("Error al obtener persona", ex);
//        }
//        return persona;
//    }


//@Override
//    public Collection<PersonaDTO>obtenerPersonas()  {
//        Collection<PersonaDTO> personas = new ArrayList<PersonaDTO>();
//        try {
//            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
//            
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM personas");
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                
//                //aca completar con los datos de Persona
//                
//               int cod = rs.getInt(1);
//                String dni = rs.getString(2);
//                String nombre = rs.getString(3);
//                String apellido = rs.getString(4);
//                String mail = rs.getString(5);
//                String telefonoMovil = rs.getString(6);
//                String usuario = rs.getString(7);
//                String contrasenia = rs.getString(8);
//                
//                PersonaDTO persona = new PersonaDTO(cod, dni, nombre, apellido, mail, telefonoMovil, usuario, contrasenia);
//                personas.add(persona);
//            }
//        } catch (SQLException ex) {
//            throw new RuntimeException("Error al obtener personas", ex);
//        }
//        return personas;
//    }