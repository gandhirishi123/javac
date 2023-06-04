

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	 	PrintWriter pw = response.getWriter();
		double num1 = Double.parseDouble(request.getParameter("t1")); 
		double num2 = Double.parseDouble(request.getParameter("t2"));
		String operation=request.getParameter("op"); 
		if(operation.equals("+"))  
			pw.println("Addition::"+ (num1+num2));
		else if(operation.equals("-")) 
			pw.println("Subtraction::"+ (num1-num2));
		else if(operation.equals("*")) 
			pw.println("Multiplication::"+ (num1*num2));	
		else
			pw.println("Division::"+ (num1/num2));
		pw.close();
	}

}
