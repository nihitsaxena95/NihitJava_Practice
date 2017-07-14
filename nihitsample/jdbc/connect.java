import java.sql.*;

class Con {
	public static void main(String[] args) {
		Connection con = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test1","root","root");
			if (!con.isClosed()) {
				System.out.println("Successfully connected to mysql..");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally{
			try{
			if(con!=null)
				con.close();
		}
		catch(Exception e) {} 
	}
	}
}