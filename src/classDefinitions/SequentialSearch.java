package classDefinitions;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class SequentialSearch {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 400;
		int max = 1600;
		boolean found = false;
		for (int i = 0; i < 1000; i++){
			scores.add(min + generator.nextInt(max - min + 1));
		}
		System.out.println("Score: ");
			int search = input.nextInt();
		
		for(int i = 0; i < 1000; i++){
			if (scores.get(i) == search){
				found = true;
				
			}
				
		}
		System.out.println("Found: " + found);
	}

}
