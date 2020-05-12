package com.vivek.project.HibernateProject1;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	private int enrollmentNumber;
	private StudentName studentName;
	private float studentPercentage;

	public String getStudentPercentage() {
		return "Student Percentage " + studentPercentage;
	}

	public void setStudentPercentage(float studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	public StudentName getStudentName() {
		return studentName;
	}

	public void setStudentName(StudentName studentName) {
		this.studentName = studentName;
	}

	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(int enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}
	
	@Override
	public String toString()
	{
		return "Student [enrollment id ="+enrollmentNumber+",studentName = "+studentName+",student Percentage = "+studentPercentage+"]\n";
	}
	

}
