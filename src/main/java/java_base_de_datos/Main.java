package java_base_de_datos;

public class Main {
    public static void main(String[] args) {
        ConexionMySQL.conectar();
        Insertar_datos.main(args);
        ConsultarDatos.main(args);
    }
}