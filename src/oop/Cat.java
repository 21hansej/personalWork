package oop;

public class Cat {
	
	public int age;
	public int sleep;
	
	
	public Cat(){
		age = 2;
		sleep = 8;
		
	}
	
	public int birthday(){
		
		age++;
		System.out.println(age);
		return age;
	}
	public int sleepMore(){
		
		sleep++;
		System.out.println(sleep);
		return sleep;
		
	}
	public int sleepLess(){
		
		sleep--;
		System.out.println(sleep);
		return sleep;
	}
}
