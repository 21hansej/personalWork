package inputExamples;

import java.util.Scanner;

public class HeightAndWeight {

	public static void main(String[] args) {
		
		int age = 0;
		double weight = 0;
		Scanner input = new Scanner(System.in);
		
	System.out.println("How old are you?");
		age = input.nextInt();
		
	System.out.println("How much do you weigh?");
		weight = input.nextInt();
		
	System.out.println("Your age is " + age + " and your weight is " + weight + ".");
		

	}

}
