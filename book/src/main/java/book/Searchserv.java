package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name="search",urlPatterns="/index.in")
public class Searchserv extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("index/searchserv");
		String cat=req.getParameter("cats");
		System.out.println(cat);
		List<String> cats=new ArrayList<>();		
		List<String> bl=new ArrayList<>();
		HttpSession session=req.getSession();
		
		if(session.getAttribute("Mycart")==null) {
		
		List<String> mycart=new ArrayList<>();
		session.setAttribute("Mycart", mycart);
		
		}
		
		int b=0;
		String msg="";
		String page="";
		cats.add("java");
		cats.add("python");
		cats.add("web");
		if(cat!=null) {
	for (String c:cats) {
			if (c.equals(cat)) {
				b=1;
			}
		}
	if(b==1) {
		if(cat.equals("web")) {
			bl.add("HTML");
			bl.add("JAVASCRIPT");
			bl.add("BOOTSTRAP");
			bl.add("CSS");
			session.setAttribute("BL",bl);
			page="booklist.jsp";
		}
		else if(cat.equals("java")) {
			bl.add("core java");
			bl.add("string");
			bl.add("Stringboot");
			bl.add("Advanced java");
			session.setAttribute("BL",bl);
			page="booklist.jsp";
		}
		else if(cat.equals("python")) {
			msg="Sorry books are not available";
			page="index.jsp";
		}
		
		else {
			msg="something went wrong";
		}
	}
	else {
		msg="Please select one";
	}
		} 
		
	req.setAttribute("MSG", msg);
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req,res);
	}
}
