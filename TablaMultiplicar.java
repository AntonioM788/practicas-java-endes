package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TablaMultiplicar
 */
public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaMultiplicar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero1 = request.getParameter("TablaMultiplicar");
		int tabla = 0;
		
		 
		 PrintWriter out = response.getWriter(); //esto es para que me lo saque por pantalla
		 
		Integer n1 = Integer.parseInt(numero1);//puedo escribir una variable nueva


		/* }catch(Exception error) {//Esto es para parsear de un String a un entero
			 System.out.println(error.toString());
		 }*/
		 
		 for (int i = 1; i <=10; i++) {
			 
			 tabla = i*n1;
			 out.println("La tabla de multiplicar es: "+ i +" x "+ n1 + " = "+ tabla);
			
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
