package com.hiber.map;
import java.util.*;

public class UserInput {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name and salary");
	String name = sc.nextLine();
	int salary = sc.nextInt();
	System.out.println("Enter house no and location");
	int no = sc.nextInt();
	String loc = sc.nextLine();
	Address ad = new Address();
	ad.setLoc(loc);
	ad.setNo(no);
	Employee em = new Employee();
	em.setAdd(ad);
	em.setName(name);
	em.setSalary(salary);
	
	new Hibermain(em,ad);
	sc.close();
}
}
