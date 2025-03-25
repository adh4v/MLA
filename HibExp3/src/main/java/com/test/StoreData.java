package com.test;

import java.util.ArrayList;
import java.util.List;

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
				Skills s = new Skills();
				s.setS_name("IT");
				Skills s2 = new Skills();
				s2.setS_name("Python");
				
				Student st = new Student();
				st.setName("Adhav");
				
				List<Skills> l = new ArrayList<>();
				l.add(s2);
				l.add(s);
				st.setSkills(l);
				session.save(st);
				t.commit();
				
				session.clear();
	}
}