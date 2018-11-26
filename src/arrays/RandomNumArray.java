package arrays;

import java.util.Random;

public class RandomNumArray {

	public static void main(String[] args) {
		Random generator = new Random();
		int randomNum;
		int min = 0;
		int max = 1000;
		int largest = 0;
		
		for(int counter = 0; counter <= 250; counter++){
		int scores[] = new int[259];
		for(int i = 0; i < 5; i++){
			randomNum = min + generator.nextInt(max - min + 1);
		if (randomNum > largest){
			largest = randomNum;
		}
		
		}
	}
System.out.println(largest);

	}
	}
