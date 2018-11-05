package decisions;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Pick a number.");
				num = input.nextInt();
			sum = sum + num;
			num = 0;
		}while(sum < 2018);

	}

}
