package com.ektha.app.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

//	@Autowired
	private Engine engine;// field injection

	public Car() {

		System.out.println("Default constructor");
	}
	
	@Autowired
	public Car(Engine engine) { //constructor injection

		System.out.println("Constructor injection");
		this.engine = engine;

	}

//	@Autowired
	public void setEngine(Engine engine) {   //setter injection
		System.out.println("Using setter injection");
		this.engine = engine;
	}

	public String hasEngine() {
		return engine.hasEngine();
	}
}
