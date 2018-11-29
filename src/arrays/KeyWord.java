package arrays;

import java.util.Scanner;

public class KeyWord {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Sentence:");
		String sentence = input.nextLine();
		System.out.println("Keyword:");
		String keyword = input.nextLine();
		String[] words = sentence.split(" ");
		
		
		for(int i = 0; i < words.length; i++){
			if(words[i].contains(keyword) == true){
				count++;
			
			}
		}
		System.out.println(count);

	}

}
