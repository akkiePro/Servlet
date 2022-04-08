package com.demoservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Adder for program", urlPatterns = { "/AddServlet" })
public class AddServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));

		int n3 = n1 + n2;

		req.setAttribute("n3", n3);

		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}

}
