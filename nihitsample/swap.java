class Swap {
public static void main(String arg[]) {
int i =100;
int j =200;
System.out.println("before "+i+ " ,"+j );
int t=i;
i=j;
j=t;
System.out.println("After"+i+","+j);
i=i+j;
j=i-j;
i=i-j;
System.out.println("New"+i+","+j);
}
}