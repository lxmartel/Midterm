package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();
	static Staff Staff1;
	static Staff Staff2;
	static Staff Staff3;
	static Staff Staff4;
	static Staff Staff5; 

	@BeforeClass
	public static void setup() throws PersonException {
		Staff1 = new Staff("Katie","Elizabeth", "Kennedy", newDate(1998, 03, 02), "21 road drive","(401)-201-2542",
				"kt@yahoo.com","M 10am-4pm",1,000.00, newDate(2016, 5, 4), com.cisc181.eNums.eTitle.MS);
		Staff2 = new Staff("Dagmara","Nicole", "Puzio", newDate(1998, 12, 17), "35 blah drive","(202)-506-7589",
				"dn@aol.com","F 1am-5pm",2,000.00, newDate(2017, 8, 2), com.cisc181.eNums.eTitle.MRS);
		Staff3 = new Staff("Hannah","Maureen", "Dignam", newDate(1998, 8, 22), "43 asdk road","(202)-506-7589",
				"hmd@gmail.com","W 6am-8pm",3,000.00, newDate(2017, 6, 21), com.cisc181.eNums.eTitle.MS);		
		Staff4 = new Staff("Pino","Blah", "Vingo", newDate(1997, 6, 14), "75 denckd ave","(914)-237-7319",
				"pbv@yahool.com","T 10am-3pm",4,000.00, newDate(2017, 3, 18), com.cisc181.eNums.eTitle.MR);
		Staff5 = new Staff("Michael","What", "Birch", newDate(1997, 1, 20), "392 uskldp drive","(937)-381-3572",
				"mbirch@gmail.com","F 1am-5pm",5,000.00, newDate(2016, 8, 2), com.cisc181.eNums.eTitle.MR);
		
		StaffList.add(Staff1);
		StaffList.add(Staff2);
		StaffList.add(Staff3);
		StaffList.add(Staff4);
		StaffList.add(Staff5); 
		
	}
	
	private static Date newDate(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void AverageTest() {
		double total = 0.0;
		for (int i = 0; i<StaffList.size();i++) {
			total += (StaffList.get(i).getSalary() / 5);	

		}
		assertEquals(3000.00, total, 0.1);
		
	}	
	
	@Test (expected = PersonException.class)
	public void testPhone_Number() throws PersonException {
		new Staff("Ed", "Rone", "Girl", newDate(1944, 3, 29), "Meadow Street", "302-636-6436",
				"eddie@hotmail.com", "T 8:15-10:15am", 4, 49300, newDate(2000, 5, 12), com.cisc181.eNums.eTitle.MR);
		
	}
	
	
	@Test (expected = PersonException.class)
	public void testDOB() throws PersonException {
		
		new Staff("Ed", "Rone", "Girl", newDate(1900, 2, 9), "Meadow Street", "(302)-636-6436",
				"eddie@hotmail.com", "T 8:15-10:15am", 4, 49300, newDate(2000, 5, 12), com.cisc181.eNums.eTitle.MR);
		
	}

}
