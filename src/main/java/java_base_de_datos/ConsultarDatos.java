package java_base_de_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarDatos {
    public static void main(String[] args) {
        String sql = "SELECT * FROM contacto";

        try (Connection conexion = ConexionMySQL.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id + " | " + nombre + " |");
            }

        } catch (SQLException e) {
            System.out.println("⚠️ Error al recuperar datos");
            e.printStackTrace();
        }
    }
}