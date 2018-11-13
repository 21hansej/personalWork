package strings;

import java.util.Scanner;

public class TwoNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter 2 names.");
			String name1 = input.next();
			String name2 = input.next();
			
		
		
			System.out.println("The first name is: " + name1);
			System.out.println("The second name is: " + name2);
			System.out.println("Comparison: " + name1.compareTo(name2));
	}

}
