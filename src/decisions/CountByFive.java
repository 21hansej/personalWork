package decisions;
import java.util.Scanner;

public class CountByFive {

	public static void main(String[] args) {
		int multiple = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number");
			num = input.nextInt();
		while (multiple <= num){
			System.out.println(multiple);
			multiple = multiple + 5;
		
			
		}
		System.out.println("Highest multiple reached.");
	}

}
