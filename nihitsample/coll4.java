
import java.util.*;

class MainCall {
public static void main(String a[]) {
Setclass s = new Setclass();
s.setname("Nihit");
s.setage(21);
s.setsalary(100000);
Setclass s1 = new Setclass();
s1.setname("Anurag");
s1.setage(22);
s1.setsalary(50000);
Setclass s2 = new Setclass();
s2.setname("saksham");
s2.setage(21);
s2.setsalary(2000);

ArrayList<Setclass> al = new ArrayList<Setclass>();
al.add(s);
al.add(s1);
al.add(s2);

Iterator it = al.iterator();
while(it.hasNext()) {
Setclass sn = (Setclass)it.next();
System.out.println(sn.ename);
}
}
}