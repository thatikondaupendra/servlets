package com.servlets.jlc;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servpack extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//1.collect data
		String sn=req.getParameter("sname");
		System.out.println(sn);
		//2.processing
		String msg="Hello"+sn+"!!!";
		msg=msg+"Wellcome to jlc";
		//3.response
		PrintWriter out=res.getWriter();
		out.print(msg);
	}
}
