package com;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

    
    public Ejercicio() {
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		List<String> list = new ArrayList<String>();
		list.add("Test1");
		list.add("a");
		//list = ctrlC.devolverNombres();
		*/
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Escribir la lista de nombres en el cuerpo de la respuesta
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Listado de Nombres</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listado de Nombres</h1>");
    /*    out.println("<ul>");
        for (String nombre : list) {
            out.println("<li>" + nombre + "</li>");
        }
        out.println("</ul>");*/
        out.println("</body>");
        out.println("</html>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
