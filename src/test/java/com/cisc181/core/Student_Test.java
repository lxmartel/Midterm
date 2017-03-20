package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import com.cisc181.core.PersonException;

public class Student_Test {
	
	private static ArrayList<Student> ListOfStudents = new ArrayList<Student>();
	private static ArrayList<Course> ListOfCourse = new ArrayList<Course>();
	private static ArrayList<Semester> ListOfSemester = new ArrayList<Semester>();
	private static ArrayList<Section> ListOfSection = new ArrayList<Section>();
	private static ArrayList<Enrollment> ListOfEnrollment = new ArrayList<Enrollment>();

	
	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}
	static ArrayList<Enrollment> ChemF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ChemS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> MathF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> MathS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> PsychF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> PsychS = new ArrayList<Enrollment>();

	
	@BeforeClass
	public static void setup() throws PersonException{
		
		Course Chem = new Course("CHEM105",3, eMajor.CHEM);
		Course Math = new Course("MATH221",1, eMajor.BUSINESS);
		Course Psych = new Course("PSYCH200",5, eMajor.NURSING);
		ListOfCourse.add(Chem);
		ListOfCourse.add(Math);
		ListOfCourse.add(Psych);
		
		Semester Fall = new Semester(new Date(), new Date());
		Semester Spring = new Semester(new Date(), new Date());
		ListOfSemester.add(Fall);
		ListOfSemester.add(Spring);
		
		Section FallChem = new Section(Chem.getCourseID(), Fall.getSemesterID());
		Section SpringChem = new Section(Chem.getCourseID(), Spring.getSemesterID());
		Section FallMath = new Section(Math.getCourseID(), Fall.getSemesterID());
		Section SpringMath = new Section(Math.getCourseID(), Spring.getSemesterID());
		Section FallPsych = new Section(Psych.getCourseID(), Fall.getSemesterID());
		Section SpringPsych = new Section(Psych.getCourseID(), Spring.getSemesterID());
		ListOfSection.add(FallChem);
		ListOfSection.add(SpringChem);
		ListOfSection.add(FallMath);
		ListOfSection.add(SpringMath);
		ListOfSection.add(FallPsych);
		ListOfSection.add(SpringPsych);
		
		Student stud1 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud2 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud3 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud4 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud5 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud6 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud7 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud8 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud9 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		Student stud10 = new Student("Lorna", "Xiaoqin", "Martel", newDate(1997, 10, 28),eMajor.CHEM,"21 east road","(210)-431-4686","email@hotmail.com");
		ListOfStudents.add(stud1);
		ListOfStudents.add(stud2);
		ListOfStudents.add(stud3);
		ListOfStudents.add(stud4);
		ListOfStudents.add(stud5);
		ListOfStudents.add(stud6);
		ListOfStudents.add(stud7);
		ListOfStudents.add(stud8);
		ListOfStudents.add(stud9);
		ListOfStudents.add(stud10); 

	}

	@Test
	public void testGPA() {
		for (int i=0; i < ListOfStudents.size(); i++) {
			double GPA = 0;
			for (int j=i; j < ListOfEnrollment.size(); j = j + ListOfStudents.size()) {
				GPA += ListOfEnrollment.get(j).getGrade();
				
			}
			assertEquals((int)GPA/ListOfSection.size(), 90);
		}
	}
	@Test
	public void testMajor() {
		Student.get(1).setMajor(eMajor.CHEM);
		assertTrue(Student.get(1).getMajor() == eMajor.CHEM);
}
}