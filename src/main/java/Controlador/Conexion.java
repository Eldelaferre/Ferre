
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection cnn;

    public Connection conexionbd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en drivers" + e);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/ferreteria", "root", "238238");
            JOptionPane.showMessageDialog(null, "Ok" );
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en nuestro local Host" + e);
        }
        return cnn;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conexionbd();
    }
}