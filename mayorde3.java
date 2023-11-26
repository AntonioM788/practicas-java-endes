ackage com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero1 = request.getParameter("numero1");
		 String numero2 = request.getParameter("numero2");
		 String numero3 = request.getParameter("numero3");
		 
		 PrintWriter out = response.getWriter(); //esto es para que me lo saque por pantalla
		 
			 Integer n1 = Integer.parseInt(numero1);//puedo escribir una variable nueva
			 Integer n2 = Integer.parseInt(numero2);
			 Integer n3 = Integer.parseInt(numero3);


		/* }catch(Exception error) {//Esto es para parsear de un String a un entero
			 System.out.println(error.toString());
		 }*/
			 out.println("<html>\n"
				 		+ "<head>\n"
				 		+ "<meta charset=\"UTF-8\">\n"
				 		+ "<title>Insert title here</title>\n"
				 		+ "</head>\n"
				 		+ "<body>");
		 if (n1>n2 && n1>n3) { 
			
			 out.println("El numero 1 es el mayor");
		 } else if (n2>n1 && n2>n3) {
			
			 out.println("El numero 2 es el mayor");
		 } else {

			 out.println("El número 3 es el mayor");
		 }
		 
		System.out.println("Hola, introduce "+numero1);
		System.out.println("Hola, introduce " +numero2);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
