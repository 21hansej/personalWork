package randomNumbers;
import java.util.Random;
import sun.nio.cs.Surrogate.Generator;

public class CoinFlip {

	public static void main(String[] args) {
		int min = 1;
		int max = 2;
		int randomNum = 0;
		int count = 0;
		int tails = 0;
		int heads = 0;
		Random generator = new Random();
		
		for (count = 1; count <= 1000000; count++){
		randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1){
				
				tails++;
			}
			if (randomNum == 2){
				
				heads++;
			}
		}

			System.out.println("The coin was flipped 100,000 times. It landed on heads " + heads + " times and on tails " + tails + " times.");
	}

}
