class A {
void sys() {
System.out.println("In class A");
}

int pub() {
System.out.println("Again in  class A");
return 0;
}
}

class B extends A{
void sys() {
System.out.println("In class B");
}

int pub() {
System.out.println("Again in class B");
return 0;
}

public static void main(String arg[]) {
B b = new B();
b.sys();
b.pub();
}
}