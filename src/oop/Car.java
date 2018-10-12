package oop;

//import statements at the top

public class Car {

	//instance fields - data storage
	public double mPG;
	public double tankCapacity;
	public double fuel;
	public double odometer;
	
	
	//constructors - methods for constructing the objects
	
	
	
	//default constructor
	
	
	
	public Car()
	{
	mPG = 20;
	tankCapacity = 20;
	fuel = 20;
	odometer = 0;
		
		
	}
	
	public double fillTank(double fullTank){
		
		fullTank = 20;
		fuel = fullTank;
		System.out.println("The tank is full.");
		return fuel;
	}
	public void drive(double milesDriven){
		
		milesDriven = 2;
		System.out.println("You have driven " + milesDriven + " miles.");
		
	}
	//methods - things the object can do
	
	
}
