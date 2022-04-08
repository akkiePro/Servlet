package com.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));

		int n3 = n1 + n2;

		PrintWriter out = res.getWriter();
		out.println("addition is = " + n3);
	}
}
// This program will give error because in .html method="get" but here doPost()
/*
 * Error: HTTP Status 405 – Method Not Allowed Type : Status Report Message :
 * HTTP method GET is not supported by this URL Description : The method
 * received in the request-line is known by the origin server but not supported
 * by the target resource.
 */