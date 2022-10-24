package cl.awakelab.empresaprevencion.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn = null;

    private Conexion() {

        try {
            Class.forName("com.mysql.ck.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datos","root","kupita");

            if (conn != null) {

                System.out.println("¡Conexion Correcta!");
            }   else {
                System.out.println("Fallo en la conexión!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
         }
        }

    public static Connection getConn() {

        if (conn == null) {
        new Conexion();
        }

        return conn;
    }
}
