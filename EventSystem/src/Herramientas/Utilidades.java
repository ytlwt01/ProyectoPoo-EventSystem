
package Herramientas;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Utilidades {
    
        static Connection contacto = null;
      
       /*Datos para la conexión
         Colocar el usuario y contraseña de su base de datos sql-server */
        
       static String Usuario= "Escriba el usuario de la base de datos aqui";
        static String clave = "Escriba la clave de la base de datos aqui";
         
        /*Nota: 
                Es necesario el usuario y contraseña, 
                de lo contrario debera crear una cuenta en SqlServer*/ 
       
        
    public static Connection getConexion() 
        {
        
         
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EventSystem";
            try 
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                } catch (ClassNotFoundException e) 
                    {
                        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... revisar el Driver" + e.getMessage(),"Error de Conexion", JOptionPane.ERROR_MESSAGE);
                    }
                    try 
                        {
                            contacto = DriverManager.getConnection(url, Usuario,clave);
                        } catch (SQLException e) 
                            {
                                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",JOptionPane.ERROR_MESSAGE);
                            }
            return contacto;
        }
    
public static ResultSet Consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            
            
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
