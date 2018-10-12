package oop;

public class Phone {

	int myPhoneNumber;
	int speedDial;
	int lastNumber;
	int emergencyNum;
	int callsNum;
	double minutesUsed;
	
	public Phone(){
		
		myPhoneNumber = 1234567890;
		speedDial = 1987654320;
		lastNumber = 1283663987;
		emergencyNum = 911;
		callsNum = 234;
		minutesUsed = 5.2; 
		
	}
	
	public void makeCall(){
		
		System.out.println("Calling: " + speedDial);
		System.out.println("You have been on call for: " + minutesUsed + " minutes.");
		
	}
	
	
}
