package area;
import java.sql.*;
import java.util.*;
public class Jdbcconnect {
	public Pojo p;
	ArrayList<Pojo> al = new ArrayList<Pojo>(); 
	Jdbcconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		    if(!c.isClosed()) {
		    	System.out.println("Success");
		    }
		    Statement stmt=c.createStatement();
//		    for(int i=0;i<10;i++) {
//		    stmt.executeUpdate("insert into Emp values ("+i+",'Nihit"+i+"',"+i*1000+")");
//		}
		    ResultSet rs=stmt.executeQuery("select * from EMP");  
		    while(rs.next())  {
		     p = new Pojo(); 
		     p.inp(rs.getInt(1),rs.getString(2),rs.getInt(3));
		   
		     al.add(p);
		    }
		    c.close(); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	ArrayList<Pojo> ret() {
		return al;
	}
	
}