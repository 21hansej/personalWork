package arrays;
import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sentence:");
		String sentence = input.next();
			String[] words = sentence.split("");
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i].charAt(0));
			//incorrect
		}
			
		

	}

}
