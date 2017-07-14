import java.util.*;
class Add {
int id;
String nh;
Add(int id,String nh) {
this.id=id;
this.nh=nh;
}
}

class Test {
public static void main(String arg[]) {
 
Add a = new Add(1,"Nihit");
Add a1 = new Add(2,"Anurag");
Add a2 = new Add(3,"Bhaii");

ArrayList<Add> ad = new ArrayList<Add>();

ad.add(a);
ad.add(a1);
ad.add(a2);

Iterator it = ad.iterator();
while(it.hasNext()) {
System.out.println(it.next());
}
}
}