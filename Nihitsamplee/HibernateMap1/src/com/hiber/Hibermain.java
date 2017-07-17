package com.hiber;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Hibermain {
	SessionFactory fac = new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
Hibermain(Employee em) {
	this.add(em);
}
void add(Employee em) {
	Session sess = fac.openSession();
	Transaction tx = sess.beginTransaction();
	sess.save(em);
	tx.commit();
	System.out.println("Successs");
}
}
