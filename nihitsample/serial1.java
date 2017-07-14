import java.io.*;

class Std implements Serializable {
	String name;
	int age;
	int salary;
	Std(String name,int age,int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

class Serial  {
	Serial() {
		Std s = new Std("Nihit",22,300000);
		Std s1 = new Std("hjsdjks",25,39847);
		Std s2 = new Std("skhdj",23,83746);
		try {
		FileOutputStream fo = new FileOutputStream("Emp.txt");
		ObjectOutputStream ot = new ObjectOutputStream(fo);
		ot.writeObject(s);
		ot.writeObject(s1);
		ot.writeObject(s2);
		ot.close();
		fo.close();
	} catch(Exception e) {
		System.out.print(e);
	}
	}

	void Ser() {
		try {
		FileInputStream fo = new FileInputStream("Emp.txt");
		ObjectInputStream ot = new ObjectInputStream(fo);
		Std s1 = (Std)ot.readObject();
		System.out.print(s1.name+"--"+s1.age+"--"+s1.salary);
		ot.close();
		fo.close();
	} catch(Exception e) {
		System.out.print(e);
	}
	}
	public static void main(String[] args) {
		Serial s = new Serial();
		s.Ser();
	}
}