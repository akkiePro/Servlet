package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sq = 0;
		Cookie[] cookie = req.getCookies();

		for (Cookie c : cookie) {
			if (c.getName().equals("n3"))
				sq = Integer.parseInt(c.getValue());
		}

		sq = sq * sq;

		PrintWriter out = resp.getWriter();
		out.println("Square(num1+num2) using cookie = " + sq);
	}
}
