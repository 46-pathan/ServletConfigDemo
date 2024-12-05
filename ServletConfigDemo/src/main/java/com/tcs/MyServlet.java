package com.tcs;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//Write a Java program to fetch data from web.xml to Servlet using ServletConfig. 
/**
 * Servlet implementation class Myservlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		id=config.getInitParameter("id");
		name=config.getInitParameter("name");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h2>ServletConfig</h2>");
		response.getWriter().println("<p>id:</p>"+id);
		response.getWriter().println("<p>name:</p>"+name);
		response.getWriter().println("<body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
