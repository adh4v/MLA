package com.test;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
		
		Book b = new Book();
		
		b.setB_name("SL");
		b.setAuthor("RDJ");
		b.setPrice(1235);
		
		//session.save(b);
		
		Book ob = session.get(Book.class, 1);
		session.delete(ob);
		//System.out.println(ob.getId()+" "+ob.getAuthor()+" "+ob.getB_name()+" "+ob.getPrice());
		t.commit();
		session.close();
	}
}
