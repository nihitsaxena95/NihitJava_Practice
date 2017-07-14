import java.util.*;

class Coll {
public static void main(String arg[]) {
TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
hm.put(100,"Niht");
hm.put(101,"ADS");

for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}