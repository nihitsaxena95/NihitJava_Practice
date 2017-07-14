import java.util.*;
import java.io.*;

class Put {
	Date d = new Date();
	Put() {
		try{
		FileOutputStream fo = new FileOutputStream("Serial.txt");
		ObjectOutputStream ot = new ObjectOutputStream(fo);
		ot.writeObject(d);
		ot.close();
		fo.close();
	}catch(Exception e) {
	System.out.println(e);
}
}
void pri() {
	try{
		FileInputStream fi = new FileInputStream("Serial.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		System.out.println(oi.readObject());
		oi.close();
		fi.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	Put p = new Put();
	p.pri();
}

}