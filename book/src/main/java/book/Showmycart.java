package book;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet (name="show", urlPatterns="/showmycart.com")
public class Showmycart extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	System.out.println("----showmycart----");
	String bname=req.getParameter("bname");
	HttpSession hs=req.getSession();
	List<String> mycart=(List<String>) hs.getAttribute("Mycart");
	RequestDispatcher rd=req.getRequestDispatcher("showcart.jsp");
	rd.forward(req, res);
}
}
