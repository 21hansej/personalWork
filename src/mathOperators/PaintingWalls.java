package mathOperators;

import java.util.Scanner;

public class PaintingWalls {

	public static void main(String[] args) {
	 
		int length = 0;
		int width = 0;
		Scanner input = new Scanner(System.in);
		
			System.out.println("What is the width of the wall?");
				width = input.nextInt();
			System.out.println("What is the length of the wall?");
				length = input.nextInt();
		
		int area = (width * 8) * 2 + (length * 8) * 2;
		double paintCans = area/150;
		paintCans = Math.ceil(paintCans);
			
			System.out.println("The total area of the room is " + (width * length) + " square feet and there is " + area + " square feet in wall space that needs to be covered. This will take " + paintCans + " gallons of paint.");

	}

}
