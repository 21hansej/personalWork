package classDefinitions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import arrays.Rectangle;

public class SequentialSearchThree {

	public static void main(String[] args) {
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 499;
		int found = 0;
		int find = 10;
		for (int i = 0; i < 100; i++){
			int length = min + generator.nextInt(max - min + 1);
			int width = min + generator.nextInt(max - min + 1);
			rectangles.add(new Rectangle(length, width));
		}
	
		
		for(int i = 0; i < rectangles.size(); i++){
			Rectangle rect = rectangles.get(i);
			if (rect.getWidth() == 10){
				found++;
				
			}
				
		}
		System.out.println("Found: " + found);
	}

}
