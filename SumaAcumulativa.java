package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class sumaAcumulativaServlet
 */
public class sumaAcumulativaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sumaAcumulativaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero1 = request.getParameter("numero1");
		
		int sumaNumeros= 0;
		
		 PrintWriter out = response.getWriter(); //esto es para que me lo saque por pantalla
		 
		 Integer n1 = Integer.parseInt(numero1);//puedo escribir una variable nueva
		 
		 out.println("<html>\n"
			 		+ "<head>\n"
			 		+ "<meta charset=\"UTF-8\">\n"
			 		+ "<title>Insert title here</title>\n"
			 		+ "</head>\n"
			 		+ "<body>");
		 
		 for (int i = 1; i < n1; i++) {
			
			 sumaNumeros=sumaNumeros + n1;			 
		}
		 
		 System.out.println("Hola, introduce "+numero1);
		 
		out.print("<h1>La suma de los números es"+ sumaNumeros+"</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
