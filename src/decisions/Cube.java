package decisions;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int num = 0;
		int cube = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a whole number to cube. Input -1 to exit.");
			num = input.nextInt();
		
		while (num != -1){
			cube = num * num * num;
			System.out.println("Your number cubed is: " + cube);
			System.out.println("Pick a whole number to cube. Input -1 to exit.");
			num = input.nextInt();
			cube = 0;
		}
		System.out.println("You have exited.");
	}

}
