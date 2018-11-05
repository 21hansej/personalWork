package decisions;

import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int base = 200;
		
		

		
		System.out.println("How old are you?");
			int age = input.nextInt();
		System.out.println("How much do you weigh?");
			double weight = input.nextDouble();
		System.out.println("Do you smoke? (True or False)");
			boolean smoke = input.nextBoolean();
			
		if (age > 75){
			base += 125;
		}
		if (age < 30){
			base += -25;
		}
		else {
			base += 0;
		}
		if (weight > 700){
			base += 300;
		}
		else {
			base += 0;
		}
		if (smoke = true){
			base += 50;
		}
		if (smoke = false){
			base += -40;
		}
		System.out.println("Insurance cose: " + base);
		}
	}


