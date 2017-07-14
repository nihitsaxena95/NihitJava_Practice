import java.util.*;

class Printval {
	ArrayList<Emp> ar;
	Printval(ArrayList<Emp> ar) {
		this.ar = ar;
		this.get();
	}
	void get() {
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			Emp e = (Emp)it.next();
			System.out.println(e.name+"--"+e.age+"--"+e.salary);
		}
	}


}