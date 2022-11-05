package com.Annotation.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Program Starting" );
       
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating object of Friends class
        Friends frd = new Friends();
        frd.setName("Saif");
        frd.setPlaced(true);
        frd.setAddress("Gurgaon");
        frd.setBatch(2023);
        frd.setCompanyName("capgemini");
        
        Friends frd1 = new Friends();
        frd1.setName("Pandey");
        frd1.setPlaced(true);
        frd1.setAddress("noida");
        frd1.setBatch(2022);
        frd1.setCompanyName("TCS");
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(frd);
        session.save(frd1);
        tx.commit();
        session.close();
        System.out.println("Done");
    }
}
