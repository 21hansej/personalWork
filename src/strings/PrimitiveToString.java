package strings;
import java.util.Scanner;
public class PrimitiveToString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
			int age = input.nextInt();
		input.nextLine();
		System.out.println("What is your name?");
			String name = input.nextLine();
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
	}

}
