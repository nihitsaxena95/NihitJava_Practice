package com.hiber.map;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Hibermain {
SessionFactory fac = new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
	Hibermain(Employee em,Address ad) {
	this.addAddress(ad);
	this.addEmployee(em);
	}
void addAddress(Address ad) {
	Session sess = fac.openSession();
	Transaction tx = sess.beginTransaction();
	sess.save(ad);
	tx.commit();
	System.out.println("Success");
}

void addEmployee (Employee em) {
	Session sess = fac.openSession();
	Transaction tx = sess.beginTransaction();
	sess.save(em);
	tx.commit();
	System.out.println("Success");
}
}
