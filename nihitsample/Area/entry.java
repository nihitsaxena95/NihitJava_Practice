import java.util.Scanner;

class Entry {
public static void main(String arg[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your OPtion --- circle -- rectangle -- square");
String option = sc.nextLine();
switch(option) {
case "circle" : 
Circle c = new Circle();
break;

case "rectangle" : 
Rectang re = new Rectang();
break;

case "square" : 
Square sq = new Square();
break;

default : 
System.out.println("Invalid");
break;
}
}
}