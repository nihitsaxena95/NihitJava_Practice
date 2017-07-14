class Pattern {
public static void main(String arg[]) {
for(int i=0;i<5;i++) {
for(int j=5;j>i;j--) {
System.out.print(" ");
}
for(int k=0;k<=i;k++) {
System.out.print("* ");
}
System.out.println("");
}
for(int i=5;i>0;i--) {
for(int j=6;j>=i;j--) {
System.out.print(" ");
}
for(int k=1;k<i;k++) {
System.out.print("* ");
}
System.out.println("");
}
}
}