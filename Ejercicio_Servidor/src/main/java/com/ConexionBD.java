package com;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexionBD {
	
    String url = "jdbc:mysql://172.22.0.225:3306/superheroes";
    String usuario = "root";
    String contraseña = "123";
    
	private List<Heroe> nombres = new ArrayList<Heroe>();
	
	public List<Heroe> devolverNombres(){
	        
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			

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
	                    nombres.add(new Heroe(nombreH, nombreR, compania));
	                    System.out.printf("ID: %d, NombreHeroe: %s%n, NombreReal: %s%n, Compañia: %s%n,", id, nombreH, nombreR, compania);
	                }
	                
		                
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
				
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombres;
        
      
	}
/**
	public List<Heroe> devolverTodosLosNombres(){
		try {
			Class.forName("com.mysql.cj.jbdc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
			  try {
				  
				  Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
				  String consulta = "SELECT * FROM heroe";
		            try (Statement stmt = conexion.createStatement();
		                 ResultSet rs = stmt.executeQuery(consulta)) {
		                
		                while (rs.next()) {
		                    
		                    int id = rs.getInt("id");
		                    String nombreHeroe = rs.getString("nombreHeroe");
		                    String nombreReal = rs.getString("nombreReal");
		                    String compania = rs.getString("compania");
		                    nombres.add(new Heroe(nombreHeroe, nombreReal, compania));
		                    
		                }
		                
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		            
		        }
				
				
        System.out.println(nombres);
		return nombres;
        
      
	}*/
}

