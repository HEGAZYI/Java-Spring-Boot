package com.in28minutes.rest.webservices.restfull_web_services.versioning;

public class personV1 {
	private String name;

	public personV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("personV1 [name=%s]", name);
	}

	
	

}
