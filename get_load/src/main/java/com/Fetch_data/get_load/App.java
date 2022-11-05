package com.Fetch_data.get_load;

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
    public static void main( String[] args ){
        System.out.println( "Starting" );
     
    
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg5.xml");
    SessionFactory factory = cfg.buildSessionFactory();
     
    // Creating object of Student class
      Student bt = new Student();
      bt.setId(12);
      bt.setName("Ananya");
      bt.setCity("Haryana");
      bt.setIsplaced(true);
      
      Student bt1 = new Student();
      bt1.setId(13);
      bt1.setName("soniya");
      bt1.setCity("bihar");
      bt1.setIsplaced(true);
     
      
      Student bt2 = new Student();
      bt2.setId(14);
      bt2.setName("Savita");
      bt2.setCity("UP");
      bt2.setIsplaced(true);
      
      
      Student bt3 = new Student();
      bt3.setId(15);
      bt3.setName("Mansi");
      bt3.setCity("MP");
      bt3.setIsplaced(true);
    
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      session.save(bt);
      session.save(bt1);
      session.save(bt2);
      session.save(bt3);
      tx.commit();
      factory.close();
      session.close();
    
    }
}
