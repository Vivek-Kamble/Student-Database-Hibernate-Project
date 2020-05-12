package com.vivek.project.HibernateProject1;
import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchUsingSecondLevelCache {
	public static void main(String[] args) {
		
    	Student student = null;

    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction tn = session.beginTransaction();
    	
    	Query query = session.createQuery("SELECT E.enrollmentNumber,E.studentPercentage FROM Student E order by E.studentPercentage desc ");
    	query.setCacheable(true);
    	List<Object[]> results = query.list();
    	
    	for(Object[] obj : results) {
    		System.out.println(obj[0] + " " + obj[1]);
    	}
    	
    	tn.commit();
    	session.close();	}

}
