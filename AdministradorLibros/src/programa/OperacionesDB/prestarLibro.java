
package programa.OperacionesDB;

import java.sql.*;

public class prestarLibro {
    String fsalida;
    String fingreso;
    String idBibli;
    String idUser;
    int idLibro;
    int entregado;
    Connection con;

    public prestarLibro(String fsalida, String fingreso, String idBibli, String idUser, int idLibro, int entregado) {
        this.fsalida = fsalida;
        this.fingreso = fingreso;
        this.idBibli = idBibli;
        this.idUser = idUser;
        this.idLibro = idLibro;
        this.entregado = entregado;
        con = coneccion.getConexion();
    }
    
    public void realizar(){
        try {
            String sql = "call prestarLibro(\""+fsalida+"\",\""+fingreso+"\",\""+idBibli+"\",\""+idUser+"\",\""+idLibro+"\",\""+entregado+"\")";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();            
        } catch (SQLException e) {
            System.out.println("Error en prestarLibro: "+e);
            System.out.println(fsalida+" "+fingreso+" "+idBibli+" "+idUser+" "+idLibro+" "+entregado);
            
        }
       
    }
    
    
    
            
    
}
