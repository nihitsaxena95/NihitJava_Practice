package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Employeesave {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fac = cfg.buildSessionFactory();
		Session session = fac.openSession();
		Employee e = new Employee();
		
		e.setId(100);
		e.setLocation("Delhi");
		e.setName("Nihit");
		e.setSalary(10000);
		
		Transaction tx = session.beginTransaction();
		session.save(e);
		System.out.println("Success");
		tx.commit();
		session.close();
		//session.close();
	}
}
