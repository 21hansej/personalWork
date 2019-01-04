package classDefinitions;
import java.util.Random;
public class ReviewOne {

	public static void main(String[] args) {
		int roll = 0;
		int[]rolls = new int[487];
		Random generator = new Random();
		int max = 6;
		int min = 1;
		double odd = 0;
		
		for (int j = 0; j < 487; j++){
			rolls[j] = min + generator.nextInt(max - min + 1);
			if ((rolls[j] % 2) != 0){
				odd++;
			}
	}
		for (int j = 486; j >= 0; j--){
			System.out.println(rolls[j]);
		}
		double percentage = (odd/487) * 100;
		System.out.println(percentage);
	}

}
