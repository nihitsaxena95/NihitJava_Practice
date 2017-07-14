package com.niit.loginpg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logg2
 */
@WebServlet("/Logg2")
public class Logg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
      public static boolean check(String user,String pass) {
    	  boolean status = false;
    	  try{
    		  Class.forName("com.mysql.jdbc.Driver").newInstance();
    		  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
    		  PreparedStatement ps = c.prepareStatement("select * from Logg where username = ? and password = ?");
    	  } catch(Exception e) {
    		  System.out.println("Exception");
    	  }
      }
     
    public Logg2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
