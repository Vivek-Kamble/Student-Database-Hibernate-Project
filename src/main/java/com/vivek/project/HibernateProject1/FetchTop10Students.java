package com.vivek.project.HibernateProject1;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchTop10Students {
public static void main( String[] args ) {
		
		Student student = null;
	
		
	    
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);			
		
	
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session session = sf.openSession();
		
		
		
		
		Transaction tn = session.beginTransaction();
    	
		String hql = "FROM Student S ORDER BY S.studentPercentage DESC";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<Object[]> results = query.list();
		
		System.out.print(results);
		
    	tn.commit();
		
	 }
}
