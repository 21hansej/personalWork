package randomNumbers;

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		
		int min = 26;
		int max = 48;
		int randomNum = 0;
		int count = 0;
		int greaterThan3 = 0;
		Random generator = new Random();
		
		for (count = 1; count <= 248; count++){
		randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum / 12 < 3){
				
				greaterThan3++;
			}
		}

			System.out.println(greaterThan3 + " children are taller than 3 feet.");
	} 

}
