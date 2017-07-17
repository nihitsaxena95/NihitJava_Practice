package com.hiber;
import java.util.*;

public class Employee {

private int id;
private String name;
private int salary;
private Set cert;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Set getCert() {
	return cert;
}
public void setCert(Set cert) {
	this.cert = cert;
}

}
