package de.entwicklerkurs.springboot.cars.api;

import java.io.Serializable;

public class CarResponse implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
