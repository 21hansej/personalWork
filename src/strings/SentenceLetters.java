package strings;
import java.util.Scanner;
public class SentenceLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean contains = false;
		
		System.out.println("Write a sentence.");
			String sentence = input.nextLine();
		
			if (sentence.contains("Bob")){
				contains = true;
			}
			
			
		//System.out.println("The first letter of the sentence is: " + sentence.charAt(0));
		//System.out.println("The third letter of the sentence is: " + sentence.charAt(2));
		System.out.println("The full sentence is: " + sentence);
		System.out.println("Does the sentence contain Bob?: " + contains);

	}

}
