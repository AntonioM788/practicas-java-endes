package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numero1 = request.getParameter("numero1");
		
		 
		 PrintWriter out = response.getWriter(); //esto es para que me lo saque por pantalla
		 
			 Integer n1 = Integer.parseInt(numero1);//puedo escribir una variable nueva


		/* }catch(Exception error) {//Esto es para parsear de un String a un entero
			 System.out.println(error.toString());
		 }*/
		 
		 switch (n1) {
		 
		 case 1: out.println("Lunes");break;
		 case 2: out.println("Martes");break;
		 case 3: out.println("Miercoles");break;
		 case 4: out.println("Jueves");break;
		 case 5: out.println("Viernes");break;
		 case 6: out.println("Sábado");break;
		 case 7: out.println("Domingo");break;
		 }
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
