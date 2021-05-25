package com.qa.java.abstraction;

  public class Car extends Vehicle {
	  private int numOfTires;
	  private String size;
  
  public Car(String madeIn, int model,int numOfTires, String size) {
			super(madeIn, model,size);
			this.numOfTires = numOfTires;
			this.size = size;
  }

  /* Practicing Constructor chaining... If values for numOfTires and size are NOT provided, 
     this constructor invokes main constructor and provides values by default.
  */
    public Car(String madeIn,int model) {
      this(madeIn,model,4, "medium");
    }

    public Car() {
      super();	
    }
    
    @Override
	public void numberOfTires() {
		System.out.println("This Car has " + this.numOfTires + " tires!");
		
	}

	
	@Override
	public String getSize() {
	  return this.size;
	}
	

	@Override
	public String toString() {
	  return "Car has " + numOfTires + " tires " + "and its size is " + size + ".";
	}

}
