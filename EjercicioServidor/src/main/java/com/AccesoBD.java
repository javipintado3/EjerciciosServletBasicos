	package com;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	public class AccesoBD {
		

		String URL = "jdbc:mysql://172.22.0.225:3306/superheroes";
        String USUARIO = "root";
        String CONTRASEÑA = "123";
		
		public List<String> nombres = new ArrayList<String>();
		
		
		public List<String> devolverNombres(){
			
	        
	        
				  try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA)) {
			   
					  String consulta = "SELECT * FROM heroe";
			            try (Statement stmt = conexion.createStatement();
			                 ResultSet rs = stmt.executeQuery(consulta)) {
			                
			                while (rs.next()) {
			                    
			                    int id = rs.getInt("id");
			                    String nombreHeroe = rs.getString("nombreHeroe");
			                    String nombreReal = rs.getString("nombreReal");
			                    String compania = rs.getString("compania");
			                    nombres.add(nombreHeroe);
			                    
			                }
			                
			            } catch (Exception e) {
			                e.printStackTrace();
			            }
			        } catch (Exception e) {
			            e.printStackTrace();
			            System.out.println("nipa");  
			        }
					
					
			
	        System.out.println(nombres);
			return nombres;
	        
	      
		}
	}
