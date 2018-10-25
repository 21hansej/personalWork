package decisions;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		int counter = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your favorite number?");
			num = input.nextInt();
			
		for (counter = 1; counter <= 10; counter++){
			System.out.println(num + " Hello.");
		}
		
	}

}
