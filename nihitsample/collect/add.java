import java.util.*;

class Add {
	Emp r;
	ArrayList<Emp> ts = new ArrayList<Emp>();
	void insert(Emp e) {
		
		ts.add(e);
	}
	ArrayList<Emp> get() {
		return ts;
	}
}