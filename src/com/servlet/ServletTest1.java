package com.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ServletTest1 extends HttpServlet{
	 public ServletTest1() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html;charset=UTF-8");
		System.out.println("-------------Get");
//		resp.setContentType("form.html");
		
//		resp.setCharacterEncoding("UTF-8");
//		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		
		PrintWriter out= resp.getWriter();
		out.println("<p>"+req.getParameter("username")+"</p>");
		out.println("<p>"+req.getParameter("password")+"</p>");
		out.println("<p>"+Arrays.asList(req.getParameterValues("hobby"))+"</p>");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-------------Post");
		req.setCharacterEncoding("UTF-8");
		PrintWriter out= resp.getWriter();
		out.println("<p>"+req.getParameter("username")+"</p>");
		out.println("<p>"+req.getParameter("password")+"</p>");
		out.println("<p>"+Arrays.asList(req.getParameterValues("hobby"))+"</p>");
		
	}
}
