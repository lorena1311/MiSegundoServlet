package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LorenaRivasServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/**
		 * Utilizamos request (req) para leer los encabezados http entrantes
		 * es decir los parametros
		 */
		
		/**
		 * Utilizamos response (resp) para especificar el codigo y los encabezados
		 * de respuesta al estado HTTP
		 */
		
		PrintWriter salida = resp.getWriter();
		//el contenido de respuesta va a ser un texto html
		resp.setContentType("text/html");
		String doctype = "<!DOCTYPE>";
		salida.println(doctype 
				+ "<html>"
					+ "<body>"
						+ "<h1>Hola, mi nombre es: Lorena Ir</h1>"
					+ "</body>"
				+ "</html>");
		
		}

}
