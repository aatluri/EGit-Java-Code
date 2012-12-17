package org.aatluri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Called the doGet Method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello from getMethod in XmlServlet </h3>");
	}
	
}
