
package programa.OperacionesDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ComprobarFechas {
    Connection con = coneccion.getConexion();
    
    
    public void init(){
        try {
            String sql = "call fechaLimiteEntrega();";
            CallableStatement cmd = con.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                if (fecha(rs.getString(2))){
                    try{
                        String sql2="call AgregarAListaNegra(\""+rs.getInt(1)+"\")";
                        CallableStatement cmd2 = con.prepareCall(sql2);
                        cmd2.executeQuery();
                    }catch (Exception s){}
                }
            }     
        } catch (Exception e) {
            System.out.println("Error en recibir Datos "+e);
        }
    }
    
    public boolean fecha(String limite){
        try {
            LocalDate fechaActual = LocalDate.now();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            // Convertir las cadenas de fecha en objetos Date
            Date fecha1 = dateFormat.parse(fechaActual.toString());
            Date fecha2 = dateFormat.parse(limite);
            // Comparar las fechas utilizando el método compareTo()
            if (fecha1.compareTo(fecha2) < 0) {
                return false;
            } else if (fecha1.compareTo(fecha2) > 0) {
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public void listaNegra(DefaultTableModel modelo){
        try {
            String sql="call  obtenerValoresListaNegra();";
            CallableStatement cmd=con.prepareCall(sql);
            ResultSet rs= cmd.executeQuery(); 
            while(rs.next()){
                Object[] datos=new Object[4];
                for(int i=0;i<=3;i++){
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
}
