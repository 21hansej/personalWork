package mathOperators;

import java.util.Scanner;

public class PullSSNApart {

	public static void main(String[] args) {
		
		int ssn = 0;
		int age = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your social security number? (no dashes)");
			ssn = input.nextInt();
		System.out.println("How old are you?");
			age = input.nextInt();
			
		int eighteenYears = 18 - age;
		int lastDigits = ssn%10000;
		
		System.out.println("Your social security number is " + ssn + ", and your age is " + age + ". You will be eighteen in " + eighteenYears + " years and the last four digits of your social security number are " + lastDigits + ".");
		
	}

}
