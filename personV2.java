package com.in28minutes.rest.webservices.restfull_web_services.versioning;

public class personV2 {
	private Name name;

	public personV2(Name name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("personV2 [name=%s]", name);
	}

	public Name getName() {
		return name;
	}

	

}
