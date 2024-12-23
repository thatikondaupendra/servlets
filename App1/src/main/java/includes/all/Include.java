package includes.all;

	import java.io.IOException;

	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletConfig;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	@WebServlet(name="logins", 
	urlPatterns="/logins.com"
			)
	public class Include extends HttpServlet{
	public void init(ServletConfig sconfig) throws ServletException {
		super.init(sconfig);
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

		RequestDispatcher rd=req.getRequestDispatcher("header.jsp");
		rd.include(req,res);
		RequestDispatcher rd2=req.getRequestDispatcher("home2.jsp");
		rd2.include(req,res);
		RequestDispatcher rd3=req.getRequestDispatcher("footer.jsp");
		rd3.include(req, res);
	}
	}
