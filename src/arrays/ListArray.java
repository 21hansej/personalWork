package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ListArray {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob Smith");
		names.add("Jane Miller");
		names.add(0, "Billy Jones");
		System.out.println("Enter your name");
			names.add(input.nextLine());
		System.out.print(names);

	}

}
