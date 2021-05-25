package com.qa.java.abstraction;

public abstract class Vehicle {

	private String madeIn;
	private int model;
	private String size;
	private int id;
	private static int counter = 0;
	public abstract void numberOfTires();
	public abstract String toString();
	
	public Vehicle(String madeIn, int model, String size) {
		this.madeIn = madeIn;
		this.model = model;
	    this.size = size;
		this.id = counter++;
    }

	
	public Vehicle() {
	  System.out.println("Vehicle features undefined");
	}
	
	
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

	
	public String getSize() {
	  return this.size;
	}
	
	public int getId() {
      return id;
    }
 }



