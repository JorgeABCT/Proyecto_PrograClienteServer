/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author XPC
 */
public class ManejoBD {
    public static final String url = "jdbc:mysql://localhost:3306/proyecto_clienteserver";
    public static final String user = "root";
    public static final String pass = "";

    public static Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa!");
        } catch(Exception e){
            System.out.println("Hubo un error\n" + e.getMessage());
        }
        return con;
    }
    
    public void Importar(ListaCliente lista){
        try{
            String instruccion = "SELECT * FROM `cliente`";
            Connection con = ManejoBD.getConnection();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int id = Integer.parseInt(res.getString("id"));
                String nombre = res.getString("nombre");
                String apellidos = res.getString("apellidos");
                String email = res.getString("email");
                String telefono = res.getString("telefono");
                String contra = res.getString("contra");
                int pin = Integer.parseInt(res.getString("pin"));
                boolean tarjeta = false;
                if(res.getString("tarjeta").equals("1")){
                    tarjeta = true;
                }
                lista.inserta(new Cliente(id, nombre, apellidos, email, telefono, contra, pin, tarjeta));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al contactar la base de datos");
        }
    }
    
    public String insertarCliente(int id, String nombre, String apellidos, String email, String telefono, String contra, int pin) {
        try {
            Connection con = ManejoBD.getConnection();
            Statement st = con.createStatement();
            
            StringBuilder instruccionC = new StringBuilder();
            instruccionC.append("Insert Into cliente(id,nombre,apellidos,email,telefono,contra,PIN,tarjeta) values (");
            instruccionC.append("'").append(id).append("',");
            instruccionC.append("'").append(nombre).append("',");
            instruccionC.append("'").append(apellidos).append("',");
            instruccionC.append("'").append(email).append("',");
            instruccionC.append("'").append(telefono).append("',");
            instruccionC.append("'").append(contra).append("',");
            instruccionC.append(pin).append(",");
            instruccionC.append(0);
            instruccionC.append(")");
            st.executeUpdate(instruccionC.toString());
            
            con.close();
            return "Se agrego el cliente de manera correcta!";
        } catch (SQLException ex) {
            return "Hubo un error con la comunicacion a la base de datos\n"+ex.getLocalizedMessage();
        }
    }
    
    public void select(String id, String contra){
        Connection con = null;
        try{
            con = ManejoBD.getConnection();
            String instruccion = "SELECT * FROM `cliente` WHERE `id` = "+id+" AND `contra` = '"+contra+"'";
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet res = ps.executeQuery();
            String boolT = "";
            if(res.next()){
            if(res.getString("tarjeta").equals("1")){
                boolT = "Tiene tarjetas";
            }else{
                boolT = "No tiene tarjetas";
            }
            JOptionPane.showMessageDialog(null, "Cedula: "+res.getString("id")+
                                                            "\nNombre: "+res.getString("nombre")+
                                                            "\nApellidos: "+res.getString("apellidos")+
                                                            "\nEmail: "+res.getString("email")+
                                                            "\nNumero celular: "+res.getString("telefono")+
                                                            "\n"+boolT);}
        } catch(Exception e){
            System.out.println("Hubo un error\n" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close(); // Cierra la conexión aquí
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión\n" + e.getMessage());
            }
        }
    }
    
    public void eliminarCliente(String id){
        try {
            Connection con = ManejoBD.getConnection();
            Statement st = con.createStatement();
            
            String instruccion = "DELETE FROM `cliente` WHERE `cliente`.`id` = "+id;
            st.executeUpdate(instruccion);
            
            System.out.println("Datos eliminados correctamente");
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
