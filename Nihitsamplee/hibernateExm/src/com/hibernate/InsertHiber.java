package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertHiber {
	Empdata em;
	public SessionFactory fac;
	InsertHiber(Empdata em) {
		this.em = em;
	}
	void postdata() {
		try {
		Session sess = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		sess.persist(em);
		t.commit();
		} catch(Exception e) {
		System.out.println(e);
	}
	}
}
