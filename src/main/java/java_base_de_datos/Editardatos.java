package java_base_de_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Editardatos {
    public static void main(String[] args) {
  
        String sql = "UPDATE contacto SET nombre = ? WHERE id = ? ";
        try (Connection conexion = ConexionMySQL.conectar();
            PreparedStatement stmt = conexion.prepareStatement(sql)) {
                try (Scanner sc = new Scanner(System.in)){
                    System.out.println("Intruduce el id de la persona a modificar");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el nuevo nombre del usuario");
                    String nombre = sc.nextLine();
                    stmt.setString(1, nombre);
                    stmt.setInt(2, id);
                }
                stmt.executeUpdate();
                System.out.println("contacto modificado");
            }catch(SQLException e){
                System.out.println("error al modificar");
                e.printStackTrace();
        }
    }
}
