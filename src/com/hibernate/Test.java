package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		student.setFirstName("Vedant");
		student.setLastName("Chavan");
		student.setAddress("Talegaon dabhade");
		student.setMobNumber(9011675557l);
		
		session.save(student);
		transaction.commit();
		
		session.close();
		
		
		
	}
}
