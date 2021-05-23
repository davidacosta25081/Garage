package com.qa.java.abstraction;

public class Bus extends Vehicle {
	private int numOfTires;
	private String size;

	public Bus(String madeIn, int model,int numOfTires, String size) {
		super(madeIn, model,size);
		this.numOfTires = numOfTires;
		this.size = size;
	}

	// (Constructor chaining) If NO numOfTires and size is provided, this
	// constructor provides values by default.
	public Bus(String madeIn, int model, int id) {
		this(madeIn, model,8,"Big");
	}

	@Override
	public void numberOfTires() {
		System.out.println("This Bus has " + this.numOfTires + " tires!");

	}

	@Override
	public String getSize() {
	  return this.size;
	}
	
	
	@Override
	public String toString() {
		return "Bus has " + numOfTires + " tires " + "and its size is " + size + ".";
	}

}