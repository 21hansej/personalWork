package arrays;
import java.util.Random;
public class Arrays3 {

	public static void main(String[] args) {
		Rectangle[] rectangle = new Rectangle[100];
		Random generator = new Random();
		int width = 0;
		int length = 0;
		int min = 10;
		int max = 56;
		for(int counter = 0; counter < 100; counter++){
			rectangle[counter] = new Rectangle();
			rectangle[counter].setLength(length = min + generator.nextInt(max - min + 1));
			rectangle[counter].setWidth(width = min + generator.nextInt(max - min + 1));
			System.out.println("Width: " + width);
			System.out.println("Length: " + length);
			System.out.println("Area: " + rectangle[counter].area());
			System.out.println("");
		}
	}
}
