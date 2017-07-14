class Exp5 {
public static void main(String ai[]) {
int x=0;
int y=10;
int a[] = new int [2];
try {
int c = y/x;
a[3]=50;
}
catch(ArithmeticException e) {
System.out.println("First Catch bc!");
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Second Catch bc!");
}
finally {
System.out.println("in finaly BC!");
}
}
}