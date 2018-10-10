package oop;

public class Employee {
	
	private double wage;
	private int exp;
	
	
	
	public Employee(){
		wage = 12;
		exp = -999;
		
	}
	
	public double getWage(){
		return wage;
	}
	
	public void setWage(double newWage){
		wage = newWage;
	}
	
	
	
	public double getExp(){
		return exp;
	}
	
	public void setExp(int newExp){
		exp = newExp;
	}
	
	public void raise(){
		wage = wage * 1.1;	
	}


}
