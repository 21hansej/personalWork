package decisions;

import java.util.Scanner;

public class DivisorInput {

	public static void main(String[] args) {
		int counter = 0;
		int process = 0;
		int divisor = 0;
		int most = 0;
		int largest = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number.");
			num = input.nextInt();
		for (counter = 1; counter <= num; counter++){
			divisor = 0;
			for (process= 1; process <= counter; process++){
				if (counter % process == 0){
				divisor++;
				}
				if(divisor > most) {
					most = divisor;
					largest = process;
				}
			}
		
		}
		System.out.println("The number with the most divisors from " + num + " is: " + largest);
	}

}

