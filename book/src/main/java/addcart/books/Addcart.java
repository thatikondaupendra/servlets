package addcart.books;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(name="cart", urlPatterns="/addcart/books/addcart.in")
public class Addcart extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	String bname=req.getParameter("bname");
	HttpSession hs=req.getSession();
	hs.setAttribute("BN",bname);
	System.out.println(bname);
	String page="booklist.jsp";
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req, res);
}
}
