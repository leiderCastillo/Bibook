package programa.OperacionesDB;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class usuario {
    Connection con;
    String id;
    String nombre;
    String TpId;
    String telefono;

    public usuario(String id, String nombre, String TpId, String telefono) {
        this.con = coneccion.getConexion();
        this.id = id;
        this.nombre = nombre;
        this.TpId = TpId;
        this.telefono = telefono;
    }
    
    public String[] consultar(String idUsr){
        String[] valores = new String[2];
        try{
         String sql = "call  consultarUsuario(\""+idUsr+"\")";
         CallableStatement cmd = con.prepareCall(sql);
         ResultSet rs = cmd.executeQuery();
         while(rs.next()){
            valores[0]=rs.getString(1);
            valores[1]=rs.getString(2);
         }
         if (valores[0] == null){
                JOptionPane.showMessageDialog(null, "Error, parece que este usuario no existe,\n Puede agregarlo en nuevo usuario");
         }
         return valores;
        }catch(SQLException e){
            System.out.print("error usuario consulta: "+e);
            if (valores[0] == null){
                JOptionPane.showMessageDialog(null, "Error, parece que este usuario no existe,\n Puede agregarlo en nuevo usuario");
            }
            return valores;
        }
    }
    
        
    public void agregarUsuario(){
        try {
            String sql = "call  ingresarUsuario(\""+id+"\",\""+nombre+"\", \""+TpId+"\",\""+telefono+"\")" ;
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            JOptionPane.showMessageDialog(null, "Usuario agregado Correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este usuario ya fue creado");
            System.out.print("Error Bibliotecario: "+e);
        }
    }
    
    
    public void LLenarDatos(DefaultTableModel modelo){
        try {
            String sql="select * from Usuario";
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
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public usuario() {
        coneccion c = new coneccion();
        con = c.getConexion();
    }
}
    
    
   
