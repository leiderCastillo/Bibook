package programa.OperacionesDB;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class coneccion {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USER = "admin";
    public static final String CLAVE = "root";
     
    public static Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}