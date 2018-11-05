package decisions;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int num = 0;
		int end = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		num = input.nextInt();
		int product = num * 17;
		
		do{
		System.out.println("Magic product is:" + product);
		System.out.println("Please enter a number. (9999 to quit)");
		num = input.nextInt();
		product = num * 17;
		
		}while (num != 9999);
		
			 
		

	}

}
