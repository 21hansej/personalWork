package classDefinitions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearchTwo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 499;
		int found = 0;
		for (int i = 0; i < 100; i++){
			numbers.add(min + generator.nextInt(max - min + 1));
		}
		System.out.println("Number: ");
			int search = input.nextInt();
		
		for(int i = 0; i < 100; i++){
			if (numbers.get(i) == search){
				found++;
			}
				
		}
		System.out.println("Found: " + found);
}
}