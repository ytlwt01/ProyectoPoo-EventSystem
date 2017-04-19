
package Herramientas;


import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Procedimientos {
    
     public static void CrearEvento(String Descripcion, String Mensaje, Date fecha, int CodUsu)throws SQLException{
         CallableStatement entrada = Utilidades.getConexion().prepareCall("{call CrearEvento(?,?,?,?)}");
         entrada.setString(1, Descripcion);
         entrada.setString(2, Mensaje);

         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

         String fechaFormat = (String) formato.format(fecha);

         entrada.setString(3, fechaFormat);

         entrada.setInt(4, CodUsu);
         entrada.execute();
    }
     
       public static void InsertarEventosVsMiembros(String CodEvento, String CodMiembro)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call InsertarEventosVsMiembros(?,?)}");
        entrada.setString(1, CodEvento);
        entrada.setString(2, CodMiembro);
      
        entrada.execute();
    }
       
         public static void InsertarGruposVsMiembros(String CodGrupo, String CodMiembro)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call InsertarGruposVsMiembros(?,?)}");
        entrada.setString(1, CodGrupo);
        entrada.setString(2, CodMiembro);
      
        entrada.execute();
    }
       
       public static void EliminarEvento(String Codigo, int CodUsu)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarEvento(?,?)}");
        entrada.setString(1, Codigo);
        entrada.setInt(2, CodUsu);
        entrada.execute();
    }
       
       
        public static void NotificarEvento(String Codigo, int CodUsu)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call NotificarEvento(?,?)}");
        entrada.setString(1, Codigo);
        entrada.setInt(2, CodUsu);
        entrada.execute();
    }
       
      public static void EliminarInvitado(String CodEvento, String CodMiembro)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarInvitado(?,?)}");
        entrada.setString(1, CodEvento);
        entrada.setString(2, CodMiembro);
        entrada.execute();
    }
      
      public static void EliminarMiembroGrupo(String CodGrupo, String CodMiembro)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarMiembroGrupo(?,?)}");
        entrada.setString(1, CodGrupo);
        entrada.setString(2, CodMiembro);
        entrada.execute();
    }
       
         public static void EliminarMiembro(String Codigo, int CodUsu)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarMiembro(?,?)}");
        entrada.setString(1, Codigo);
        entrada.setInt(2, CodUsu);
        entrada.execute();
    }
    

    
    public static void AgregarMiembro(String nombre, String apellido, String correo, int CodUsu)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call AgregarMiembro(?,?,?,?)}");
        entrada.setString(1, nombre);
        entrada.setString(2, apellido);
        entrada.setString(3, correo);
        entrada.setInt(4, CodUsu);
        entrada.execute();
    }
    
    public static void EliminarMiembro(String nombre, String apellido, String correo, int CodUsu)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarMiembro(?,?,?,?)}");
        entrada.setString(1, nombre);
        entrada.setString(2, apellido);
        entrada.setString(3, correo);
        entrada.setInt(4, CodUsu);
        entrada.execute();
    }
    
    
      public static void CrearUsuario(String user, String contra)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call CrearUsuario(?,?)}");
        entrada.setString(1, user);
        entrada.setString(2, contra);
      
        entrada.execute();
    }
      
       public static void EliminarUsuario(String user, String contra)throws SQLException{
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarUsuario(?,?)}");
        entrada.setString(1, user);
        entrada.setString(2, contra);
      
        entrada.execute();
    }
       
    public static void CrearGrupo(String nombre, int CodUsu) throws SQLException {
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call CrearGrupo(?,?)}");
        entrada.setString(1, nombre);
        entrada.setInt(2, CodUsu);
        entrada.execute();
    }
    
     public static void EliminarGrupo(String nombre, int CodUsu) throws SQLException {
        CallableStatement entrada = Utilidades.getConexion().prepareCall("{call EliminarGrupo(?,?)}");
        entrada.setString(1, nombre);
        entrada.setInt(2, CodUsu);
        entrada.execute();
    }
         
    
}
