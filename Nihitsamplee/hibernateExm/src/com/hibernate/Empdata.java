package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="EMPHIBER")
public class Empdata {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "Name")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	private String name;
	@Column(name = "Location")
	private String loc;
	@Column(name = "Age")
	private int age;
	@Column(name = "salary")
	private int salary;
Empdata(String name,String loc,int age,int salary) {
	this.name = name;
	this.loc = loc;
	this.age = age;
	this.salary = salary;
}

String getName() {
	return name;
}
String getLoc() {
	return loc;
}
int getSalary() {
	return salary;
}
int getAge() {
	return age;
}
}
