package com.qa.java.abstraction;


public class Main {

  public static void main (String[] args) {
    Vehicle prototype = new Motorcycle("Colombia", 1994,4,"big");
    prototype.numberOfTires();	  
    prototype.sizeOfVehicle();		
    prototype.setMadeIn("Raleigh,North Carolina");
    System.out.println(prototype.getMadeIn());
  }
}



/* 
  Garage part 1
 
    1) Using Vehicle as a base class, create three derived classes (car, motorcycle etc.), 
       each derived class should have its own attributes in addition to the normal Vehicle attributes. 
    2) Using a List implementation, store all your vehicles in a Garage class.  

*/







