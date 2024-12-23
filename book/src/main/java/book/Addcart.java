package book;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(name="addcart", urlPatterns="/addcart.com")
public class Addcart extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	String bname=req.getParameter("bname");
	HttpSession hs=req.getSession();
	List<String> mycart=(List<String>) hs.getAttribute("Mycart");
	hs.setAttribute("BN",bname);
	mycart.add(bname);
	System.out.println(bname);
	System.out.println(mycart);
	String page="booklist.jsp";
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req, res);
}
}
