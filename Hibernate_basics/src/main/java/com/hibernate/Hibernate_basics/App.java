package com.hibernate.Hibernate_basics;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("starting project");
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg2.xml" );
    	SessionFactory factory = cfg.buildSessionFactory();
    	// creating Employee
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("anand");
        emp.setSallery(12000);
        System.out.println(emp);
        
        
        
        
        // creating object of  Address class
        Addresss ad = new Addresss();
        ad.setStreet("street1");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("Done");
    }
}