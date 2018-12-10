package forEachLoop;
import java.util.Scanner;
public class ForEachLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int highest = 0;
		
		System.out.println("How many employees work here?");
		int employees = input.nextInt();
		
		int[] wages = new int[employees];
		
		for(int i : wages){
			System.out.println("What is the employee's wage?");
			int wage = input.nextInt();
			if(wage > highest){
				highest = wage;
			}
		}
		System.out.println("Highest wage: " + highest);
	}

}
