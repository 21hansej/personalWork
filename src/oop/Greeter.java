package oop;

//import statements at the top

public class Greeter {

	//instance fields - data storage
	
	private int age;
	
	//constructors - methods for constructing the objects
	
	public void sayHello()
	{
		System.out.println("Hello.");
	}
	
	
	//default constructor
	
	public Greeter(int xAge){
	//Statements to initialize the state of the object
		age = xAge;
		
	}
	
	public Greeter(){
	//Statements to initialize the state of the object
		age = -999;
		
	}
	public int getAge(){
		return age;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	//methods - things the object can do
	
	
}
