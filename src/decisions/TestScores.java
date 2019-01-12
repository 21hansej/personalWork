package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double testA = 0;
		double testB = 0;
		
		System.out.println("What is the first test score?");
			testA = input.nextDouble();
		System.out.println("What is the second test score?");
			testB = input.nextDouble();
			
		if (testA > testB){
			System.out.println("Great job. There are " + (testA - testB) + " points between the two test scores.");
		}
		System.out.println("Have a nice day.");

	}

}
