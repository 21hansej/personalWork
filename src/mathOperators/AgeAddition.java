package mathOperators;

import java.util.Scanner;

public class AgeAddition {

	public static void main(String[] args) {
		
		int age = 0;
		
		Scanner input = new Scanner(System.in); 
	
			System.out.println("How old are you?");
		age = input.nextInt();
		
		age = age + 7;
		
			System.out.println("You will be " + age + " in 7 years.");

	}

}
