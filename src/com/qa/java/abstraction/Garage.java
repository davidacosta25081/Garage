package com.qa.java.abstraction;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    
  private List<Vehicle> parked;
	
  public Garage(){
    super();
	parked = new ArrayList<Vehicle>();	  
  }

  // Adds vehicle to garage
  public void parking(Vehicle vehicle) {
	 parked.add(vehicle); 
  }    

  //Prints vehicles parked and gives a description of each of them.
  public void printParked() {
    for(Vehicle vehicle : parked) {
      System.out.println(vehicle);	
    }  	   
  }   

  // Printing Bills of vehicles and informs its respective id.
  public void bill () {
    for (Vehicle vehicle : parked) {
	  if(vehicle.getSize().equals("big")) {
	    System.out.println("The Bill of Vehicle of id " +vehicle.getId() + " is $200.");  	
	  }
	  else if (vehicle.getSize().equals("medium")) {
		  System.out.println("The Bill of Vehicle of id " +vehicle.getId() + " is $100.");	
	  }
	  else if (vehicle.getSize().equals("small")) {
		  System.out.println("The Bill of Vehicle of id " +vehicle.getId() + " is $50.");
	  }
	}
  }

  //Removes vehicle by ID 
  public void removeVehicleById(int id) {
    for(int i = 0; i < parked.size(); i++) {
	  if (parked.get(i).getId() == id) { 
	    parked.remove(parked.get(id));
	    System.out.println("Vehicle of id " + id + " removed.");
	  }
	 }
  }

//Removes vehicle by size
  public void removeVehicleBySize(String size) {
	    for(int i = 0; i < parked.size(); i++) {
		  if (parked.get(i).getSize() == size) { 
		    parked.remove(parked.get(i));
		    System.out.println("Vehicle of size " + size + " removed.");
		  }
		 }
	  }




}
    

    
    








