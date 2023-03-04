package programa.OperacionesDB;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import programa.Body;

public class libro {
    private int id;
    private String autor;
    private String nombre;
    private String edicion;
    private String paginas;
    private String genero;
    Connection con;
    
    public libro(){
        con = coneccion.getConexion();
    }

    public libro(int id, String Autor, String Nombre, String Edicion, String Paginas, String Genero) {
        con = coneccion.getConexion();
        this.id = id;
        this.autor = Autor;
        this.nombre = Nombre;
        this.edicion = Edicion;
        this.paginas = Paginas;
        this.genero = Genero;
    }
    
    
    
    public void libroDisponible(DefaultTableModel modelo){
        try {
            String sql="call  consultarLibrosDisponibles();";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery(); 
            while(rs.next()){
                Object[] datos=new Object[6];
                for(int i=0;i<=5;i++){
                    datos[i]=rs.getString(i+1);
                }
                modelo.addRow(datos);
            }
            cmd.close();
            rs.close();
            con.close();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void libroPrestado(DefaultTableModel modelo){
        try {
            String sql="call librosPrestados();";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
            while(rs.next()){
                Object[] datos=new Object[5];
              
                for(int i=0;i<=4;i++){
                    datos[i]=rs.getString(i+1);
                    System.out.println(rs.getString(i+1));
                }
                modelo.addRow(datos);
            }
            rs.close();
            cmd.close();
            con.close();
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void librosDisponibles(){

        try {
            Body.Libros.clear();
            String sql = "call  consultarLibrosDisponibles();";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                Body.Libros.add(rs.getInt(3)+".  "+rs.getString(1)+" ("+(rs.getString(2))+")");
            }
            rs.close();
            cmd.close();
           
        } catch (Exception e) {
            System.out.println("ERROR, EN libros DIsponibles"+e);
        }
        
        
    }
    
    public void agregarlibro(){
        try {
            String sql = "call ingresarLibro(\""+id+"\",\""+autor+"\",\""+nombre+"\",\""+edicion+"\",\""+paginas+"\",\""+genero+"\"); " ;
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            JOptionPane.showMessageDialog(null, "Libro Agregado Correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este usuario ya fue creado");
            System.out.print("Error Bibliotecario: "+e);
        }
    }
    

    public void LLenarDatos(DefaultTableModel modelo){
        try {
            String sql="select * from Libro";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
            while(rs.next()){
                Object[] datos=new Object[6];
                for(int i=0;i<6;i++){
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

}
