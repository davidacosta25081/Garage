package com.qa.java.abstraction;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    
  private List<Vehicle> parked;
	
  public Garage(){
    super();
	parked = new ArrayList<Vehicle>();	  
  }

  public void parking(Vehicle vehicle) {
	 parked.add(vehicle); 
  }    
	
  public void printParked() {
    for(Vehicle vehicle : parked) {
      System.out.println(vehicle);	
    }  	   
  }   

  public List<Vehicle> getList(){
    return parked;	  
  }


  public void bill () {
	  for (Vehicle vehicle : parked) {
	    if(vehicle.getSize().equals("big")) {
	      System.out.println("Your bill is $200");  	
	    }
	    else if (vehicle.getSize().equals("medium")) {
	      System.out.println("Your bill is $100");	
	    }
	    else if (vehicle.getSize().equals("small")) {
		  System.out.println("Your bill is $50");
	    }
	  }
  }

  /*  
  public void removeVehicle(Vehicle vehicle) {
	  for(Vehicle machine : parked) {
	    if (machine == vehicle) { 
		  parked.remove(machine);
	    }
	  }
  
 
  
  }
*/
}
    

    
    








