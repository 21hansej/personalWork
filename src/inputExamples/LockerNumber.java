package inputExamples;

import java.util.Scanner;

public class LockerNumber {

	public static void main(String[] args) {
		
		int comboA = 0;
		int comboB = 0;
		int comboC = 0;
		Scanner input = new Scanner(System.in);
		
	System.out.println("What is the first number in your locker combination?");
		comboA = input.nextInt();
		
	System.out.println("What is the second number in your locker combination");
		comboB = input.nextInt();
		
	System.out.println("What is the third number in your locker combination?");
		comboC = input.nextInt();
		
		
	System.out.println("Your locker combination is " + comboA + "-" + comboB + "-" + comboC);

	}

}
