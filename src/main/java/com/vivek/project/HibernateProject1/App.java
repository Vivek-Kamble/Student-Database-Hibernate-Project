package com.vivek.project.HibernateProject1;

import java.util.ArrayList;
import java.util.HashMap;

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
    	StudentsData studentData = new StudentsData();    
    	ArrayList<HashMap> data= studentData.getstudents();
//    	System.out.println(data.size());
//    	System.out.println(data.get(2).get("enrollment"));
    	int i;
    	for(i=0;i<data.size();i++)
    	{
    		StudentName studentName = new StudentName();
        	studentName.setStudentFirstName(data.get(i).get("firstName").toString());
        	studentName.setStudentMiddleName(data.get(i).get("middleName").toString());
        	studentName.setStudentLastName(data.get(i).get("lastName").toString());
        	
            Student student = new Student();
            student.setEnrollmentNumber(Integer.parseInt((String) data.get(i).get("enrollment")));
            student.setStudentName(studentName);
            student.setStudentPercentage(Float.parseFloat((String) data.get(i).get("percentage")));
            
            
            //create config
            Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
            
            //create session factory
            SessionFactory sf = config.buildSessionFactory();
            
            //create session
            Session session = sf.openSession();
            
            //create transaction
            Transaction tx = session.beginTransaction();
            
            session.save(student);
            
            tx.commit();
            System.out.println(studentName.toString());
            System.out.println(student.toString());
//    			System.out.println(data.get(i));
    		
    	}
    }
}
