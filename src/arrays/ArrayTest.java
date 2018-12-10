package arrays;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int sum = 0;
		
		int[] scores = new int[5];
		for(i = 0; i < 5; i++){
		System.out.println("Input a number.");
			scores[i] = input.nextInt();
			sum = sum + scores[i];

		}
		for(i = 4; i > 0; i--){
			System.out.println(scores[i]);
		}
	System.out.print(sum);
	}
	

}
