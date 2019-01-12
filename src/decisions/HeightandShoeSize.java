package decisions;

import java.util.Scanner;
public class HeightandShoeSize {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height = 0;
		int shoe = 0;
		
		System.out.println("How tall are you? (inches)");
			height = input.nextInt();
		System.out.println("What is your shoe size?");
			shoe = input.nextInt();
		
		if(height < 62) {
		 System.out.println("Your height is less than 62 inches.");	
		}
		if(shoe > 9){
			System.out.println("Your shoe size is larger than 9.");
		}
	
		
	}

}
