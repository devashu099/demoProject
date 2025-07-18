package com.practice.demo;

public class Car {

	Engine engine;
	

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void start()
	{
		engine.startEngine();
		System.out.println("car started...");
	}
	
}
