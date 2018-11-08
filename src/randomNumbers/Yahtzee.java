package randomNumbers;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 6;
		int randomNum = 0;
		int randomNum2 = 0;
		int randomNum3 = 0;
		int randomNum4 = 0;
		int randomNum5 = 0;
		int yahtzee = 1;
		int rolls = 0;
		Random generator = new Random();
		
		while(yahtzee < 2){
		randomNum = min + generator.nextInt(max - min + 1);
		randomNum2 = min + generator.nextInt(max - min + 1);
		randomNum3 = min + generator.nextInt(max - min + 1);
		randomNum4 = min + generator.nextInt(max - min + 1);
		randomNum5 = min + generator.nextInt(max - min + 1);
			if (randomNum == 5 && randomNum2 == 5 && randomNum3 == 5 && randomNum4 == 5 && randomNum5 == 5){
				
				System.out.println("Yahtzee");
				yahtzee = 2;
			}
			else{
				System.out.println("Roll Again.");
				rolls++;
				
			}
		}
		System.out.println("It took you: " + rolls + " rolls to get yahtzee");

	} 

}
