package app.login;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="login", 
urlPatterns="/login.in"
		)
public class Login extends HttpServlet{
public void init(ServletConfig sconfig) throws ServletException {
	super.init(sconfig);
}
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	String un=req.getParameter("un");
	String pw=req.getParameter("pw");
	String page="";
	if(un.equals(pw)) {
		page="home.jsp";
		req.setAttribute("UN", un);
	}
	else {
		String msg="Invalid user cradentials";
		req.setAttribute("MSG",msg);
		page="login.jsp";
	}
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req,res);
}
}
