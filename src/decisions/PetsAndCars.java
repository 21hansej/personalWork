package decisions;

import java.util.Scanner;

public class PetsAndCars {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int pets = 0;
		int cars = 0;
		
		System.out.println("How many pets do you have?");
			pets = input.nextInt();
		System.out.println("How many cars fit in your garage?");
			cars = input.nextInt();
		
		if(pets > 5) {
		 System.out.println("You have more than 5 pets.");	
		}
		if(cars > 3){
			System.out.println("You can fit more than 3 cars in your garage.");
		}
	

	}

}
