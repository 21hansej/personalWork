package decisions;

import java.util.Scanner;
public class WhileCounter {

	public static void main(String[] args) {
		
		int num = 0;
		int end = 0;
		int sum = 0;
		int entered = 0;
		int largest = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter a number. (9999 to quit)");
		num = input.nextInt();
		while (num != 9999){
			if (num > largest){
				largest = num;
			}
			sum = sum + num;
			num = num * 2;
			System.out.println(num);
			System.out.println("Please enter a number. (9999 to quit)");
			num = input.nextInt();
			entered++;
			
		}
		
		double avg = sum / entered;
		System.out.println("The average of the numbers entered is: " + entered);
		System.out.println("The largest of the numbers entered is: " + largest);
		System.out.println("Done.");
	}

}
