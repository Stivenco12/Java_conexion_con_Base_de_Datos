package java_base_de_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertar_datos {
    public static void main(String[] args) {
        String sql = "INSERT INTO contacto (nombre) VALUES(?)";
        try (Connection conexion = ConexionMySQL.conectar();
                PreparedStatement stmt = conexion.prepareStatement(sql)) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Introduce el nombre del contacto:");
                    String nombre = sc.nextLine();
                    stmt.setString(1, nombre);
                }
                stmt.executeUpdate();
                System.out.println("✅ Contacto insertado correctamente");
                
            } catch (SQLException e) {
                System.out.println("⚠️ Error al insertar Contacto");
                e.printStackTrace();
            }
            
    }
}
