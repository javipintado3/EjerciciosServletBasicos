package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public ControladorServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        ConexionBD conn = new ConexionBD(); 
        
        List<Heroe>  listCompleta = conn.devolverNombres();
        
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Listado de Nombres</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Listado de Nombres</h1>");
        out.println("<ul>");
        for (Heroe h : listCompleta) {
            out.println("<li>" + h.getNombreHeroe() + "</li>");
            out.println("<li>" + h.getNombreReal() + "</li>");
            out.println("<li>" + h.getCompania() + "</li>");
        }
        out.println("</ul>");
        out.print("</body>");
        out.print("</html>");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
