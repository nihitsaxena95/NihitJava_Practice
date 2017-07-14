import java.util.*;

class Test {
public static void main(String arg[]) {

ArrayList<String> ad = new ArrayList<String>();

ad.add("Nihit");
ad.add("bhaiiii");
ad.add("Broo");

Iterator it = ad.iterator();
while(it.hasNext()) {
System.out.println(it.next());
}
}
}