package mockstmt;
import java.sql.*;

public class Mocki {

	private Connection con;
	
	public void getCon() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost::3306/test1","root","root");
	}
	
	public int executeQuery(String query) throws Exception {
		return con.createStatement().executeUpdate(query);
	}
}
