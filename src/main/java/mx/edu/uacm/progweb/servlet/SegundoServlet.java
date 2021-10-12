package mx.edu.uacm.progweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;

public class SegundoServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		/* Se escribe un  metodo init que tome un ServletConfig como argumento 
		 * siempre llame a super.init(); en la primera linea
		 */
		/* ServletConfig cuenta con un metodo getInitParameter con el cual podemos buscar 
		 * parametros
		 */
		super.init();
	}
	
	public void init() throws ServletException{
    super.init();
	
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* Cada vez que el servidor recibe una peticion, el servlet emite un nuevo proceso
		 * y llama al metodo service
		 */
		super.service(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombre = req.getParameter("nombre");
		System.out.println("El nombre es: " + nombre);
		
		String apellido = req.getParameter("apellido");
		System.out.println("El apellido es: " + apellido);
		
		PrintWriter salida = resp.getWriter();
		//Utilice salida para enviar el contenido al navegador web
		salida.println("Hola, tu nombre es:" + nombre + " y tu apellido es: " + apellido);
		
	}
	
	
	
	

}