package com.qa.java.abstraction;
import java.util.ArrayList;

public class Garage {
    
	private ArrayList<Vehicle> parked;
	
	public static void parking(Vehicle machine){
      ArrayList<Vehicle> parked = new ArrayList<Vehicle>();	  
	  parked.add(machine);	  
    }

   
	
  public ArrayList<Vehicle>getList(){
    return parked;	  
  }


  public void bill (ArrayList<Vehicle> list) {
	  for (Vehicle vehicle : list) {
	    if(vehicle.size.equals("big")) {
	      System.out.println("Your bill is $100");  	
	    }
	    else if (vehicle.size.equals("medium")) {
	      System.out.println("Your bill is $100");	
	    }
	    else if (vehicle.size.equals("small")) {
		  System.out.println("Your bill is $20");
	    }
	  }
  }

  public void addVehicle(Vehicle vehicle) {
	  parked.add(vehicle);
  }
  
  public void removeVehicle(Vehicle vehicle) {
	  for(Vehicle machine : parked) {
	    if (machine == vehicle) { 
		  parked.remove(machine);
	    }
	  }
  }

}
    

    
    








