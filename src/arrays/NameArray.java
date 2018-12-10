package arrays;
import java.util.Scanner;
public class NameArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		for (int i = 0; i < names.length; i++){
			System.out.println("Enter a name.");
			names[i] = input.nextLine();
		}
		System.out.println("Pick a number.");
		int num = input.nextInt();
		
		
		for (int i = 0; i < names.length; i++){
			if(names[i].length() == num){
				System.out.println(names[i]);
			}
		}
	}

}
