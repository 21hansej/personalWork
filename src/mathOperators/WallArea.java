package mathOperators;

import java.util.Scanner;

public class WallArea {
	public static void main(String[] args) {
		
		int width = 0;
		Scanner input = new Scanner(System.in); 

	System.out.println("What is the width of the wall?");
		width = input.nextInt();
	
		int wallArea = 8 * width;
	
	System.out.println("The area of the wall is " + wallArea + ".");

	}
}
