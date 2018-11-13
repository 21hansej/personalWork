package strings;

import java.util.Scanner;

public class AllLowerCase {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Write a sentence.");
			String sentence = input.nextLine();
		System.out.println("In lowercase letters, your sentence is: " + sentence.toLowerCase());
		System.out.println("Your original sentence is: " + sentence);


	}

}
