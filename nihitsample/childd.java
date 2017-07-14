
class Child extends Parent {
int i=15;
int j=25;
int k=35;
void c() {
System.out.println("i,j,k of Class Parent"+super.i+","+super.j+","+super.k);
}
public static void main(String arg[]) {
Child c = new Child();
System.out.println("i,j,k of Class Child"+c.i+","+c.j+","+c.k);
c.c();
}
} 