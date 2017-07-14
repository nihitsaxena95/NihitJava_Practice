class A {
public int i=1;
//private int j=2;
protected int k=3;
}
class C extends A{}

class B extends C {
int i=5,j=6,k=7;
public static void main(String arg[]) {
C a = new B();
B b = new B();
System.out.println(a.i+","+","+a.k);
}
}