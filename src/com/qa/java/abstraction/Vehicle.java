package com.qa.java.abstraction;

public abstract class Vehicle {

	private String madeIn;
	private int model;

	public Vehicle(String madeIn, int model) {
		this.madeIn = madeIn;
		this.model = model;
	}

	public abstract void numberOfTires();
	public abstract void sizeOfVehicle();
	
	
	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}










}
