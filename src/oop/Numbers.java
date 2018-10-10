package oop;

public class Numbers {
	
	

	public void sayNumber(double num)
	{
		
		System.out.println("Your number is " + num);
	}
	
	public void sayNumberPlus2(double num)
	{
		System.out.println("");
	}
	public void saySum(double first, double second)
	{
		System.out.println("answer=" +(first + second));
		
	}
	public Double returnSquare(double num){
		
		double answer = num*num;
		return answer;
		
	}
	public Double returnArea(double length, double width){
		
		return length * width;
	}
	public Double returnRoundup(double num){
		
		num = Math.ceil(num);
		return num;
		
	}
	
	
	public Numbers() {
		

			
			
		
		
	}
	
}
