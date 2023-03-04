
package programa.OperacionesDB;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programa.Body;

//Esquema de como esta el bibliotecario
public class bibliotecario {
    Connection con;
    private String id;
    private String nombre;
    private String telefono;
    private String clave;
    
    public bibliotecario(){
        con = coneccion.getConexion();
    }
    
    public bibliotecario(String id, String nombre, String telefono, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
        con = coneccion.getConexion();
    }
    
    public void agregar(){
        try {
            String sql = "call ingresarBibliotecario(\""+id+"\",\""+nombre+"\",\""+telefono+"\",\""+clave+"\");" ;
            CallableStatement cmd = con.prepareCall(sql);
            System.out.println("ss");
            ResultSet rs = cmd.executeQuery();
            JOptionPane.showMessageDialog(null, "Bibliotecario Agregado Correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este Bibliotecario ya fue creado");
            System.out.print("Error Bibliotecario: "+e);
        }
    }
    

    public void LLenarDatos(DefaultTableModel modelo){
        try {
            String sql="select * from Bibliotecario";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
            while(rs.next()){
                Object[] datos=new Object[4];
                for(int i=0;i<4;i++){
                    datos[i]=rs.getString(i+1);
                }
                modelo.addRow(datos);
            }
            cmd.close();
            con.close();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean login(String nombre, String clave){
        try {
            String sql="call loginBibliotecario(\""+clave+"\",\""+nombre+"\");";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
            //Comprobar si el usuario con esa clave y nombre existe            
            while(rs.next()){
                Body.Administrador = new bibliotecario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                return true;
            }
            return false;
            
        } catch (SQLException e) {
            System.out.print("Error Bibliotecario: "+e);
            return false;
        }
    }
    
    public void getDatos(){
        try {
            String sql="select * from Bibliotecario;";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.print("Error: "+e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    
}
