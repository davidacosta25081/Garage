package com.qa.java.abstraction;

public class Motorcycle extends Vehicle {

	private int numOfTires;
	private String size;

	public Motorcycle(String madeIn, int model, int numOfTires, String size) {
		super(madeIn, model,size);
		this.numOfTires = numOfTires;
		this.size = size;
	}

	/* Practicing Constructor chaining... If values for numOfTires and size are NOT provided, 
	   this constructor invokes main constructor and provides values by default.
    */
	public Motorcycle(String madeIn, int model) {
		this(madeIn, model,2, "small");
    }

	public Motorcycle() {
	  super();	
	}
	
	@Override
	public void numberOfTires() {
		System.out.println("This motorcycle has " + this.numOfTires + " tires!");

	}

	
	@Override
	public String toString() {
		return "Motorcycle has " + numOfTires + " tires " + "and its size is " + size + ".";
	}
}
