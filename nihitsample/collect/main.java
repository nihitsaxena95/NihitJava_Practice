import java.util.*;

class Entry {
	ArrayList ar;
	void putval() {
		Emp e = new Emp();
		e.getname("Nihit");
		e.getage(22);
		e.getsalary(100000);
		Emp e1 = new Emp();
		e1.getname("Blasss");
		e1.getage(25);
		e1.getsalary(60000);
		Emp e2 = new Emp();
		e2.getname("Plassd");
		e2.getage(31);
		e2.getsalary(40000);
		Add a = new Add();
		a.insert(e);
		a.insert(e1);
		a.insert(e2); 
		this.ar = a.get();
	}

	void printval() {
		Printval pr = new Printval(ar);
	}
	public static void main(String[] args) {
		Entry e = new Entry();
		e.putval();
		e.printval();
	}
}