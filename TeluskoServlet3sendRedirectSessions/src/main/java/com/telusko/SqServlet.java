package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* int sq = Integer.parseInt(request.getParameter("n3")); */
		HttpSession s = request.getSession();
		int sq = (int) s.getAttribute("n3");
		sq = sq * sq;

		PrintWriter out = response.getWriter();
		out.print("Sq(num1+num2) = " + sq);
		System.out.println("sq called...");
	}

}
