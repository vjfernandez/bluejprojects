import java.io.*;
import java.util.*;
import java.sql.*;


/**
 * Esta clase representa a un esquema básico para acceder a SGBDR desde Java
 * utilizando el API JDBC
 */

public class AppAccesoDatosEsquema
{
    //El nombre del driver y la cadena de conexion
    static final String JDBC_DRIVER = "org.h2.Driver";  
    static final String DB_URL = "jdbc:h2:tcp://localhost/Ejemplo01";
    
    //Las credenciales que va a usar nuestra aplicacion para identificarse
    //ante el SGBD. Como es solo un ejemplo, usaremos las del administrador
    static final String USER = "sa";
    static final String PASS = "";
    
    public void run()
    {
        String sql; //lo usaremos para almacenar la orden SQL
        
        //Las referencias a conexiones y sentencias se declaran fuera del bloque try,
        //porque las tenemos que devolver en el finally y les asignamos null.
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null; //lo usaremos para el resultado de la select. No es necesario si
           //la orden no va a ser Select.
    
        try
        {
            //PASO 1: Registrar el DRIVER JDBC
            Class.forName(JDBC_DRIVER);
            
            //PASO 2: Solicitar una conexion al SGBD
            System.out.println("Conectando con la base de datos (y el SGBD, claro)");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Si ves este mensaje, hemos conectado correctamente");
            
            //PASO 3: Ejecutar una query
            System.out.println("Creando sentencia...");
            stmt = conn.createStatement();
            
            //PASO 4: Ejecutar la query y obtener un ResultSet
            //La query debe ser auto-explicativa con respecto a las columnas que solicita
            sql = "SELECT num_exp, nombre, apellido1, apellido2, nota FROM alumno";
            rs = stmt.executeQuery(sql);
    
            //una cabecera para la tabla.
            System.out.format("\n%-4s %-30s %s\n--------------------------------------------\n", 
                           "EXP", "APELLIDOS Y NOMBRE" , "NOTA"
                           );        
            
            //PASO 5: Recorrer un ResultSet
            while(rs.next())
            {
                //Los recorreremos por nombre
                //Java permite la declaracion de variables en el interior de estructuras
                //Su ambito es el de la propia estructura. Estas variables se crean y destruyen
                //en cada iteracion del bucle.
                int id  = rs.getInt("num_exp");
                String nombre = rs.getString("nombre");
                String ape1 = rs.getString("apellido1");
                String ape2 = rs.getString("apellido2");
                Double nota = rs.getDouble("nota");
                
                //Mostrar valores
                System.out.format("%4d %-30s %.2f\n", 
                           id, String.format("%s %s, %s", ape1, ape2, nombre), nota
                           );
            }
        }
       catch(SQLException ex)
       {
          //Tratar excepciones JDBD
          ex.printStackTrace();
       }
       catch(Exception ex)
       {
          //Tratar otras excepciones, incluido Class.forName
          ex.printStackTrace();
       }
       finally
       {
           //el paranoico cierre de recursos de JDBC
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
       }//fin try
       System.out.println("\nAdios");
    }//fin del metodo


    
    public static void main(String[] args)
    {
        new AppAccesoDatosEsquema().run();
    }
}

