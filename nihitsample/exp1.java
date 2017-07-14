class Exp1 {
public static void main(String arg[]) {
int a=0;
int b=10;
int x;
try {
x=b/a;
}
catch(ArithmeticException e) {
System.out.println("Caught"+e);
}
}
}