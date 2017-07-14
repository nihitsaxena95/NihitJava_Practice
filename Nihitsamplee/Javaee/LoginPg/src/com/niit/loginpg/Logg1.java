package com.niit.loginpg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logg1
 */
@WebServlet("/Logg1")
public class Logg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Logg1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(Logg2.check(user,pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request,response);
		}
		else {
			pw.print("Username not valid");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		pw.close();
	}

}
