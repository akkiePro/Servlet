//	please view deployment descripto(web.xml) first
package com.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		out.println("ServletConfig...");

		ServletConfig cfg = getServletConfig();
		String Name = cfg.getInitParameter("name");
		String field = cfg.getInitParameter("Field");

		out.println("Hi " + Name + " you are in " + field);

		out.println("ServletContext...");

		ServletContext ctx = getServletContext();
		String Name_ctx = ctx.getInitParameter("name");
		String field_ctx = ctx.getInitParameter("Field");

		out.println("Hi " + Name_ctx + " you are in " + field_ctx);
	}
}
