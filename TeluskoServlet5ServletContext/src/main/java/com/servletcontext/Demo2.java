package com.servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		// ServletContext ctx = (ServletContext) req.getServletContext();
		ServletContext ctx = getServletContext(); // req is not required
		String Name = ctx.getInitParameter("name");
		String phone = ctx.getInitParameter("Phone");

		out.println("Your name is " + Name + " but you have cheap " + phone);
	}
}
