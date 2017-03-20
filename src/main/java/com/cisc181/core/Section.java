package com.cisc181.core;
import java.util.UUID;

public class Section {
	
	public Section(UUID courseID2, UUID semesterID2) {

	}
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	public UUID getCourseID() {
		return CourseID;	
	}
	
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;	
	}
	
	public void setSemesterID(UUID semesterID) {
		semesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;	
	}
	
	public void setSectionID(UUID sectionID) {
		SectionID = SectionID;
	}
	public int getRoomID() {
		return RoomID;	
	}
	
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
}
