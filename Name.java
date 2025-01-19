package com.in28minutes.rest.webservices.restfull_web_services.versioning;

public class Name {
	private String firstName;
	private String lastName ;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return String.format("Name [firstName=%s, lastName=%s]", firstName, lastName);
	}
	
	
	

}
