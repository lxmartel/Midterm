package com.cisc181.core;


public class PersonException extends Exception {
	
	private Person Person;
	
	public PersonException(Person p) {
		this.Person = Person;
	}
	
	public Person getPerson() {
		return Person;
	}
	

}
