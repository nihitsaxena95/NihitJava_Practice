class Exp2 {
public static void main(String arg[]) {
int[] a = new int[2];
try {
a[2] = 10;
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Caught"+e);
}
}
}