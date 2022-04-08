package com.demoservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int sq_num = (int) req.getAttribute("n3");
		int sq = sq_num * sq_num;

		PrintWriter out = res.getWriter();
		out.println("SQ(Num1+Num2) = " + sq);
	}
}
