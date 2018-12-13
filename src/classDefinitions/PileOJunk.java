package classDefinitions;
import java.util.Random;
public class PileOJunk {

		private static int idNum = 1;
		private int max;
		private int min;
		private int randomNum;
		
		public PileOJunk(){
			
			Random generator = new Random();
			max = 100;
			min = 10;
			randomNum = min + generator.nextInt(max - min + 1);
		}
		
		public static int idNumber(int one, int two){
			int sum = one + two;
			return sum;
		}
		
		public void randomNum(int randomNum){
			this.randomNum = randomNum;
			
		}

}
