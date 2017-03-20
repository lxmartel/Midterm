package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {

	public Semester(Date date, Date date2) {
		
	}
	UUID SemesterID;
	Date StartDate;
	Date EndDate;
	
	public UUID getSemesterID() {
		return SemesterID;	
	}
	
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	
	public Date getStartDate() {
		return StartDate;
	}
	
	public void setStartDate(Date startdate) {
		StartDate = startdate;
	}
	
	public Date getEndDate() {
		return EndDate;
	}
	
	public void setEndDate(Date enddate) {
		EndDate = enddate;
	}
}
