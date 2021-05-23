package com.qa.java.abstraction;



public class XLauncher {
	
  public static void main (String[] args) {
    Garage g = new Garage();  
	  
	  
	  
	Vehicle prototype = new Motorcycle("Colombia", 1994,2,"small");
    Vehicle prototype2 = new Car("China", 1993);
    Vehicle prototype3 = new Bus("Argentina", 1998,8,"big");
    
   
    g.parking(prototype);
    g.parking(prototype2);
    g.parking(prototype3);
  
    g.printParked();
    g.bill();
    
    g.removeVehicleById(1);
    g.removeVehicleBySize("small");
    g.printParked();
  }
  
}



/* 
  Garage :
 
    1) Using Vehicle as a base class, create three derived classes (car, motorcycle etc.), 
       each derived class should have its own attributes in addition to the normal Vehicle attributes. 
    2) Using a List implementation, store all your vehicles in a Garage class.  

    3).Create a method in Garage that iterates through each Vehicle, 
       calculating a bill for each type of Vehicle in a different way, depending on the type of vehicle it is.  
       You can decide how this bill is calculated based on any attributes you see fit. (You do not get extra marks for making the calculation overly complex) 

    4)Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle Type) 
       fix Vehicle (Calculate bill) and empty the garage

*/







