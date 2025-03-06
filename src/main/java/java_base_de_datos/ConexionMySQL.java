package java_base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    // Parámetros de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/directorio";
    private static final String USER = "root";
    private static final String PASSWORD = "campus2023";
    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer conexión
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión establecida");
        } catch (ClassNotFoundException e) {
            System.out.println("⚠️ Error: No se encontró el driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("⚠️ Error al conectar con MySQL");
            e.printStackTrace();
        }
        return conexion;
    }
}