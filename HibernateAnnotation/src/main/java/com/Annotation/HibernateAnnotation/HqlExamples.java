package com.Annotation.HibernateAnnotation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlExamples {

	public static void main(String[] args) {
		Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session s = factory.openSession();
        
        // HQL
        // Syntax
        //
        
        String query = "from Friends where Address ='Gurgaon'";
        Query q = s.createQuery(query);
        
        // single - (Unique) / q.uniqueResult();
        // multiple- list
        List<Friends>list=q.list();
        
        for (Friends friend: list) {
        	System.out.println(friend.getName());
        }
        
        s.close();
        factory.close();

	}

}

