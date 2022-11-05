package com.Student.StudentElectiveSystem;

import java.util.ArrayList;
import java.util.List;

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
        
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg3.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating object of student class
        Student st = new Student();
        st.setId(18);
        st.setName("Altaf");
        
        
        
        // creating object from Subject class
        Subjects s1 = new Subjects();
        s1.setElectivesubject("Rural Development");
        s1.setDuration("5 month");
        s1.setId(1234);
        s1.setStudent(st);
        
        Subjects s2 = new Subjects();
        s2.setElectivesubject("Constitution of india");
        s2.setDuration("4 month");
        s2.setId(1244);
        s2.setStudent(st);
        
        Subjects s3 = new Subjects();
        s3.setElectivesubject("machine learning");
        s3.setDuration("7 month");
        s3.setId(1266);
        s3.setStudent(st);
        
        List<Subjects> list = new ArrayList<Subjects>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        st.setSubject(list);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(s1);
        session.save(s2);
        session.save(s3);
        tx.commit();
        session.close();
        System.out.println("Done");
    }
}
