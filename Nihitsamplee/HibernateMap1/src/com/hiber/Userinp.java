package com.hiber;
import java.util.HashSet;
import java.util.Scanner;

public class Userinp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name and salary");
	String name = sc.nextLine();
	int salary = sc.nextInt();
	System.out.println("Enter house no and location");
	sc.nextLine();
	String cname = sc.nextLine();
	HashSet hs = new HashSet();
	Certi c = new Certi();
	c.setName(cname);
	hs.add(c);
	Employee em = new Employee();
	em.setCert(hs);
	em.setName(name);
	em.setSalary(salary);
	new Hibermain(em);
	sc.close();
}
}