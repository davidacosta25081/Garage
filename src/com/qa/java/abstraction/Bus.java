package com.qa.java.abstraction;

public class Bus extends Vehicle {
	private int numOfTires;
	public String size;

	public Bus(String madeIn, int model, int numOfTires, String size) {
		super(madeIn, model);
		this.numOfTires = numOfTires;
		this.size = size;
	}

	// (Constructor chaining) If NO numOfTires and size is provided, this
	// constructor provides values by default.
	public Bus(String madeIn, int model) {
		this(madeIn, model, 8, "Big");
	}

	@Override
	public void numberOfTires() {
		System.out.println("This Bus has " + this.numOfTires + " tires!");

	}

	@Override
	public void sizeOfVehicle() {
		System.out.println("This Bus has a " + this.size + " size!");

	}

}