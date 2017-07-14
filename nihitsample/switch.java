import java.util.*;

class Swit {
public static void main(String a[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Input x or y or z");
Char a1 = sc.nextLine();
switch(a1) {
case 'x' : 
System.out.println("Hi");
break;

case 'y' : 
System.out.println("Hi Hi");
break;

case 'z' : 
System.out.println("Hello");
break;

default : 
System.out.println("enter valid input");
break;
}
}
}