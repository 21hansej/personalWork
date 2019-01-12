package arrays;
import java.util.ArrayList;
import java.util.Random;
public class ArrayListRectangle {

	public static void main(String[] args) {
		ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
		Random generator = new Random();
		int length = 0;
		int width = 0;
		int max = 70;
		int min = 50;
		int least = 3500;
		
		for (int i = 0; i < 400; i++){
			rectangle.add(new Rectangle(50 + generator.nextInt(20), 50 + generator.nextInt(20)));
			
			System.out.println("Here are the areas of the rectangles");
			for (int j = rectangle.size()-1; j >= 0; j--){
				Rectangle oneRect = rectangle.get(j);
				System.out.println(oneRect.area());
			}
		
		}
	}

}
