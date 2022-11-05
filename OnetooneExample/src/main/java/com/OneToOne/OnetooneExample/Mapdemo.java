package com.OneToOne.OnetooneExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapdemo {

	public static void main(String[] args) {
		 Configuration cfg =  new Configuration();
	        cfg.configure("hibernate.cfg4.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	      // creating question 1
	        Question q1 = new Question();
	        q1.setId(1212);
	        q1.setQuestion("What is java");
	        
	     // creating question 2
	        Question q2 = new Question();
	        q2.setId(1213);
	        q2.setQuestion("full form of oops");
	        
	        // creating answer 1
	        Answers an = new Answers();
	        an.setId(343);
	        an.setAnswer("java is a programming language");
	        q1.setAnswer(an);
	        
	     // creating answer 2
	        Answers an1 = new Answers();
	        an1.setId(353);
	        an1.setAnswer("object oriented programming language");
	        q2.setAnswer(an1);
	        
	        
	        // session
	        
	        Session s = factory.openSession();
	        Transaction tx = s.beginTransaction();
	        
	        
	      // save
	         s.save(q1);
	         s.save(q2);
	         s.save(an);
	         s.save(an1);
	         tx.commit();
	         s.close();
	        factory.close();

	}

}
