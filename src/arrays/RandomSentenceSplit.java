package arrays;

import java.util.Scanner;
import java.util.Random;
public class RandomSentenceSplit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sentence:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		Random generator = new Random();
		int max = words.length;
		int min = 0;
		int randomWord;
		
		
		randomWord = generator.nextInt(max - min + 1);
		System.out.println(words[randomWord]);


	}

}
