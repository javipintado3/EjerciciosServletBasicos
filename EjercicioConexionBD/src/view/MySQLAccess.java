package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess {

    public static void main(String[] args) {
        String url = "jdbc:mysql://172.22.0.225:3306/superheroes";
        String usuario = "root";
        String contraseña = "123";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            String consulta = "SELECT * FROM heroe";
            try (Statement stmt = conexion.createStatement();
                 ResultSet rs = stmt.executeQuery(consulta)) {
                
                while (rs.next()) {
                    // Suponiendo que tu_tabla tiene dos columnas llamadas 'id' y 'nombre'.
                    int id = rs.getInt("id");
                    String nombreH = rs.getString("nombreHeroe");
                    String nombreR = rs.getString("nombreReal");
                    String compania = rs.getString("compania");
                    System.out.printf("ID: %d, NombreHeroe: %s%n, NombreReal: %s%n, Compañia: %s%n,", id, nombreH, nombreR, compania);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
