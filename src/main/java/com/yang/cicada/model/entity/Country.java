package com.yang.cicada.model.entity;

public class Country {
	private String name;
	private boolean active;
	private boolean useState;

	public Country(String name, boolean active, boolean useState) {
		super();
		this.name = name;
		this.active = active;
		this.useState = useState;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isUseState() {
		return useState;
	}
}
