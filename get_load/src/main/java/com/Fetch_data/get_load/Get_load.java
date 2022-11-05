package com.Fetch_data.get_load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Get_load {

	public static void main(String[] args) {
		// get , load
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg5.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession(); 
        
        // get - batch ; 12
        Student i = (Student)session.get(Student.class,12); // it return null if object not found but load throe object not found exception
        System.out.println(i);
        System.out.println(i.getCity());
        
        
        session.clear();
        factory.close();
        
	}
}