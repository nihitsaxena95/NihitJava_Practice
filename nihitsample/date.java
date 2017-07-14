import java.util.Date;
import java.text.SimpleDateFormat; 

class Dt {
public static void main(String a[]) {
Date date = new Date();
System.out.println(date);
SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");
String st = ft.format(date);
System.out.println(st);

SimpleDateFormat ft1 = new SimpleDateFormat("dd/MM/yyyy");
String st1 = ft1.format(date);
System.out.println(st1);
}
}