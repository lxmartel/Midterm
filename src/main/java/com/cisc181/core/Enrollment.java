package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;

	private Enrollment() {
	}
	
	public UUID getSectionID() {
		return SectionID;	
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return SectionID;	
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public double getGrade() {
		return Grade;	
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
}
