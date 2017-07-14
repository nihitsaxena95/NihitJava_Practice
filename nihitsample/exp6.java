class Exp6 {
public static void main(String a[]) {
try {
int x = 10/0;
}
catch(Exception e) {
System.out.println(e);
}
catch(ArithmeticException e) {
System.out.println(e);
}
}
}