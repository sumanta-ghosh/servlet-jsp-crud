package in.sumanta;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
		rd.forward(req,res);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
		rd.forward(req,res);
		//res.sendRedirect("sqr");
	} 

}
