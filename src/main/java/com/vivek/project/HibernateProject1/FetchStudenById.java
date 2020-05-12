package com.vivek.project.HibernateProject1;

import java.awt.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class FetchStudenById {

	 public static void main( String[] args ) {
		
		Student student = null;
	
		
	    
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);			
		
	
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session session = sf.openSession();
	
		
		
		Transaction tn = session.beginTransaction();
    	    	
		int studentId = 110;
    	Query queryTwo = session.createQuery("select enrollmentNumber, studentName ,studentPercentage  from Student e where e.enrollmentNumber=:id");
    	queryTwo.setParameter("id", studentId);
    	Object[] empObjArr = (Object[]) queryTwo.uniqueResult();
    	System.out.println(empObjArr[0] + " " + empObjArr[1]+ " " + empObjArr[2]);
		
//		student	= session.get(Student.class,120);
//		System.out.println(student.toString());
		
		
    	tn.commit();
		
	 }
}
