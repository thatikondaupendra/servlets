package com.jlc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Helloservlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	String sn=req.getParameter("sname");
	String msg="Hello"+sn+"!!!";
	msg=msg+"Wellcome to myworld";
	PrintWriter out=res.getWriter();
	out.print(msg);
	
}
}
