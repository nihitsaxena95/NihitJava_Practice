package com.niit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServFirst
 */
@WebServlet("/ServFirst")
public class ServFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
   
    
    @Override
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
    	
    	res.setContentType("text/html");
    	PrintWriter pw = res.getWriter();
    	pw.println("Welcome to servlet home...........");
    	pw.println("<h1>YO</h1> Working");
    	pw.close();
    }
}

