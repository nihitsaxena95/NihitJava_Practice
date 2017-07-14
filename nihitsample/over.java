class A {
A() {
System.out.println("overloaded constructor1");
}
A(int a) {
System.out.println("overloaded constructor2"+a);
}
A(float b) {
System.out.println("overloaded cons 3"+b);
}
void ov() {
System.out.println("overloaded 1");
}
void ov(int a) {
System.out.println("overloaded 2"+a);
}
void ov(int a1,int b1) {
System.out.println("overloaded 3"+a1+","+b1);
}
void ov(int a,float b) {
System.out.println("overloaded 4"+a+b);
}
int ov(int a,int b,int c) {
System.out.println("overload diff return"+a+b+c);
return 0;
}

public static void main(String arg[]) {
A a = new A();
A a1 = new A(10);
A a2 = new A(5.4f);
a.ov(10);
a.ov(10,20);
a.ov(10,5.6f);
a.ov(1,2,3);
}
}