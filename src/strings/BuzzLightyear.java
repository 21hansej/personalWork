package strings;

import java.util.Scanner;

public class BuzzLightyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index = 0;
		
		
			String sentence = "My name is Buzz Lightyear!";
			for(index = 0; index <= sentence.length() - 1; index++){
				System.out.println(sentence.substring(0, index));
			}

	}

}
