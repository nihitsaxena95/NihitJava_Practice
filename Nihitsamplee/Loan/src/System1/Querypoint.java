package System1;
import java.sql.*;

public class Querypoint {
Querypoint(Connection c, Takedata td) {
	try{	
Statement stmt = c.createStatement();
ResultSet rs = stmt.executeQuery("select b.name, l.roi loan from bank b join loan l on (b.id = l.bankid and b.id = "+td.id+" and l.type = '"+td.loan+"')");
while(rs.next()) {
	System.out.println(rs.getString(1)+" Bank offers "+td.loan+" Loan via Rate of Interest = "+rs.getInt(2));
}
} catch(Exception e) {
	System.out.println(e);
}
}
}
