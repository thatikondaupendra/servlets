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

@WebServlet (name="remove", urlPatterns="/remove.com")
public class Del extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	System.out.println("----removebook----");
	String bname=req.getParameter("bname");
	HttpSession hs=req.getSession();
	System.out.println(bname);
	List<String> mycart=(List<String>) hs.getAttribute("Mycart");
	mycart.remove(bname);
	RequestDispatcher rd=req.getRequestDispatcher("showcart.jsp");
	rd.forward(req, res);
}
}
