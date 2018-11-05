package decisions;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		
		int num = 0;
		int end = 0;
		int largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		num = input.nextInt();
		if (num > largest){
			largest = num;
		}
		int product = num * 17;
		
		do{
			if (num > largest){
				largest = num;
			}
		System.out.println("Magic product is:" + product);
		System.out.println("Please enter a number. (9999 to quit)");
		num = input.nextInt();
		product = num * 17;
		
		}while (num != 9999);
		System.out.println("The largest number entered was " + largest);
		

	}


}
