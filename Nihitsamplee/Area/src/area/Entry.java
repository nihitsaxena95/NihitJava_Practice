package area;
import java.util.*;
public class Entry {
	ArrayList<Pojo> ar = new ArrayList<Pojo>();
	void prt() {
		for(Pojo p:ar) {
			//System.out.println(p.id+"----"+p.name+"----"+p.salary);
		}
	}
	void top() {
		System.out.println("Top Salary greater than 5000"); {
			for(Pojo p:ar) {
				if(p.salary>5000) {
					System.out.println("Name : "+p.name+" --  Salary : "+p.salary);
				}
			}
		}
	}
public static void main(String[] args) {
	Jdbcconnect jd = new Jdbcconnect();
	Entry er = new Entry();
	er.ar = jd.ret();
	er.prt();
	er.top();
}
}
