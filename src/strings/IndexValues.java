package strings;

import java.util.Scanner;

public class IndexValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a sentence using x (lowercase).");
			String sentence = input.nextLine();
		System.out.println("X is first seen at: " + sentence.indexOf('x'));

	}

}
