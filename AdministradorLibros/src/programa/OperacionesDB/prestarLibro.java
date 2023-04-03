
package programa.OperacionesDB;

import java.sql.*;

public class prestarLibro {
    int idPrestarLibro;
    String fsalida;
    String fingreso;
    String idBibli;
    String idUser;
    int idLibro;
    int entregado;
    Connection con;
    
    public void entregar(int i){
        try {
            String sql = "call entregarLibro("+i+")";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
        }catch(Exception e){
            System.out.println("Error en Entregar "+e);
        }
    }

    public String[] recibirDatos(int codigo){
        String valores[] = new String[3];
        try {
            String sql = "call obtenerValoresEntrega("+codigo+")";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                valores[0] = rs.getString(1);
                valores[1] = rs.getString(2);
                valores[2] = rs.getString(3);
            }
            
        } catch (Exception e) {
            System.out.println("Error en recibir Datos "+e);
        }
        return valores;
    }
    
    public prestarLibro(String fsalida, String fingreso, String idBibli, String idUser, int idLibro, int entregado) {
        this.fsalida = fsalida;
        this.fingreso = fingreso;
        this.idBibli = idBibli;
        this.idUser = idUser;
        this.idLibro = idLibro;
        this.entregado = entregado;
        con = coneccion.getConexion();
    }
    
    public prestarLibro(){
        con=coneccion.getConexion();
    }
    
    public void realizar(){
        try {
            String sql = "call prestarLibro(\""+fsalida+"\",\""+fingreso+"\",\""+idBibli+"\",\""+idUser+"\",\""+idLibro+"\")";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();            
        } catch (SQLException e) {
            System.out.println("Error en prestarLibro: "+e);
            System.out.println(fsalida+" "+fingreso+" "+idBibli+" "+idUser+" "+idLibro+" "+entregado);
            
        }
       
    }
    
    
    
            
    
}
