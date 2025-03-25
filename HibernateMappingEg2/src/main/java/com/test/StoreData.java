package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		
		//1.Create config class obj
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				
				//2. Create SessionFactory Object
				SessionFactory sf = cfg.buildSessionFactory();
				
				//3.Create 
				Session session = sf.openSession();
				
				Transaction t = session.beginTransaction();
				//4.transient state
				Address a = new Address();
				
				a.setCity("Cbe");
				a.setPin(641025);
				a.setCountry("IND");
				
				Employee e = new Employee();
				
				e.setEmpName("Aki");
				e.setEmpEmail("aki@gmn.com");
				e.setAddress(a);
				a.setEmployee(e);
				//5.Execute the object
				session.save(e);
				//Persistent State
				t.commit();
	}
}
