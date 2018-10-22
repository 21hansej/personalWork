package decisions;

import java.util.Scanner;

public class LargestInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int one = 0;
		int two = 0;
		int three = 0;
		
		
		System.out.println("What is the first number?");
		one = input.nextInt();
	System.out.println("What is the second number?");
		two = input.nextInt();
		System.out.println("What is the third number?");
		three = input.nextInt();
		
		
		if (one > two && one > three){
			System.out.println("The first number is largest.");
		}
		if (two > one && two > three){
			System.out.println("The second number is largest.");
		}
		if (three > one && three > two){
			System.out.println("The third number is largest.");
		}
		if (one == two || two == three || one == three){
			System.out.println("Some numbers are equal.");
		}

	}
}
