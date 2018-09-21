package inputExamples;

import java.util.Scanner;

public class MonkeyHeight {

	public static void main(String[] args) {
		double height = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is the average monkey in inches?");
		height = input.nextDouble();
		System.out.println("The average monkey is " + height + " inches tall.");

	}

}
