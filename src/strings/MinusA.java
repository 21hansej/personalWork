package strings;

import java.util.Scanner;

public class MinusA {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int index = 0;
		
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		for(index = 0; index <= sentence.length() - 1; index++){
			if (sentence.charAt(index) == 'a' || sentence.charAt(index) == 'a'){
				
			}
			else {
				System.out.println(sentence.charAt(index));
			}
		}
		
		System.out.println("Your original sentence is: " + sentence);

}

			
}
		




