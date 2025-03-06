package java_base_de_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Elimnardatos {
    public static void main(String[] args) {
        String sql = "DELETE FROM contacto WHERE id = ?";
        try (Connection conexion = ConexionMySQL.conectar();
            PreparedStatement stmt = conexion.prepareStatement(sql)) {
                try (Scanner sc = new Scanner(System.in)){
                    System.out.println("Intruduce el id de la persona a eliminar");
                    int id = sc.nextInt();
                    sc.nextLine();
                    stmt.setInt(1, id);
                }
                stmt.executeUpdate();
                System.out.println("contacto Eliminado");
            }catch(SQLException e){
                System.out.println("error al eliminar");
                e.printStackTrace();
        }
    }
}
