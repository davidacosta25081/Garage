package com.qa.java.abstraction;

  public class Car extends Vehicle {
	  private int numOfTires;
	  private String size;
  
  public Car(String madeIn, int model, int numOfTires, String size) {
			super(madeIn, model);
			this.numOfTires = numOfTires;
			this.size = size;
  }

  //(Constructor chaining) If NO numOfTires and size is provided, this constructor provides values by default.
    public Car(String madeIn,int model) {
    this(madeIn,model,4,"medium");
  }

	@Override
	public void numberOfTires() {
		System.out.println("This Car has " + this.numOfTires + " tires!");
		
	}

	@Override
	public void sizeOfVehicle() {
		System.out.println("This Car has a " + this.size + " size!");
		
	}




}
