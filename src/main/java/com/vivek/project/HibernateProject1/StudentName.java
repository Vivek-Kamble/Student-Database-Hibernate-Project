package com.vivek.project.HibernateProject1;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String studentFirstName;
	private String studentMiddleName;
	private String studentLastName;
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentMiddleName() {
		return studentMiddleName;
	}
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	@Override
	public String toString() {
		return "["+studentFirstName+" "+studentMiddleName+" "+studentLastName+"]";
	}
}
