package decisions;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		int counter = 0;
		int num = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		//System.out.println("What is your favorite number?");
			//num = input.nextInt();
			
		for (counter = 1; counter <= 5; counter++){
			System.out.println("Pick a number.");
				num = input.nextInt();
			sum = sum + num;
		}
		System.out.println("The sum of the numbers entered is: " + sum);
	}

}
