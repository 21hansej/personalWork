package arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRectangle2 {

	public static void main(String[] args) {
		ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
		Random generator = new Random();
		int length = 0;
		int width = 0;
		int max = 70;
		int min = 50;
		int least = 3500;
		
		for (int i = 0; i < 400; i++){
			rectangle.add(new Rectangle(70 + generator.nextInt(50), 70 + generator.nextInt(50)));
			
			}
		Rectangle junkOne = rectangle.remove(399 + generator.nextInt(0));
		
		}

	}


