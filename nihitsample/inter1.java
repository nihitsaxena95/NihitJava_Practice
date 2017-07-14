interface Inter1 {
int typ = 123;
default int ni(int a,int b){
int c = a+b;
return c;
}
}
	
class Nw implements Inter1 {
public int ni(int a,int b) {
System.out.println("intside the class");
return 0;
}
public static void main(String arg[]) {
Nw n = new Nw();
int d = n.ni(10,20);
System.out.println(d);
}
}