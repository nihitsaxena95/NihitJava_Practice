package com.hiber;

public class Certi {
private int id;
private String name;
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
public boolean equals(Object obj) {
	if(obj == null)  return false;
	if(!this.getClass().equals(obj.getClass())) return false;
	
	Certi obj1 = (Certi)obj;
	if((this.id == obj1.getId()) && (this.name == obj1.getName())) {
		return true;
	}
	return false;
}

public int hashCode() {
	int tmp;
	tmp = (id + name).hashCode();
	return tmp;
}
}
