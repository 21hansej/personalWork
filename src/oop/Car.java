package oop;

//import statements at the top
import java.util.Scanner;
public class Car {

	//instance fields - data storage
	public double mPG;
	public double tankCapacity;
	public double fuel;
	public double odometer;
	Scanner input = new Scanner(System.in);
	
	//constructors - methods for constructing the objects
	
	
	
	//default constructor
	
	
	
	public Car()
	{
	mPG = 20;
	tankCapacity = 20;
	fuel = 20;
	odometer = 0;
		
		
	}
	
	public double fillTank(){
		
		fuel = 20;
		System.out.println("The tank is full.");
		return fuel;
	}
	public void drive(){
		
		double milesDriven = 0;
		System.out.println("How many miles have you driven?");
		milesDriven = input.nextDouble();
		System.out.println("You have driven " + milesDriven + " miles.");
		
	}
	//methods - things the object can do
	
	
}
