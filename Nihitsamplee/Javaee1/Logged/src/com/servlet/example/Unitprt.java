package com.servlet.example;

import org.junit.*;
import java.sql.*;

public class Unitprt {
	
	@Test
	public void connectTest() throws Exception {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
	Connect c = new Connect();
	Assert.assertEquals(con,c.ret());
	}

}
