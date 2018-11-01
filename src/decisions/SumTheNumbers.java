package decisions;

import java.util.Scanner;

public class SumTheNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick your first number.");
		num1 = input.nextInt();
		do {
			System.out.println("Pick your second number number.");
				num2 = input.nextInt();
			sum = num1 + num2;
			System.out.println("The sum of your numbers is: " + sum);
			num1 = 0;
			num2 = 0;
			System.out.println("Pick your first number. 999 to quit.");
			num1 = input.nextInt();
		}while(num1 != 999);

	}

}
