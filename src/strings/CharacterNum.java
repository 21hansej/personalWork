package strings;

import java.util.Scanner;

public class CharacterNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index = 0;
		
		
		System.out.println("Write a sentence.");
			String sentence = input.nextLine();
			for(index = 0; index <= sentence.length() - 1; index++){
				System.out.println(sentence.charAt(index));
			
			}
	}

}
