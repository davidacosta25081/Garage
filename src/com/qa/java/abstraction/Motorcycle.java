package com.qa.java.abstraction;

public class Motorcycle extends Vehicle {

	private int numOfTires;
	private String size;

	public Motorcycle(String madeIn, int model, int numOfTires, String size) {
		super(madeIn, model);
		this.numOfTires = numOfTires;
		this.size = size;
	}

	public Motorcycle(String madeIn, int model) {
		this(madeIn, model, 2, "small");

	}

	@Override
	public void numberOfTires() {
		System.out.println("This motorcycle has " + this.numOfTires + " tires!");

	}

	@Override
	public void sizeOfVehicle() {
		System.out.println("This motorcycle has a " + this.size + " size!");

	}




}
