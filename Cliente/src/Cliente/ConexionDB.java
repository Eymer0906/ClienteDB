package Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_calzado";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "J3r0n1m0220120.";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            System.err.println("Estado SQL: " + e.getSQLState());
            System.err.println("Código de error: " + e.getErrorCode());
            System.err.println("Mensaje: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Intenta conectar a la base de datos
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("La conexión se ha realizado correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
