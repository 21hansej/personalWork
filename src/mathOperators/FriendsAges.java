package mathOperators;

import java.util.Scanner;

public class FriendsAges {

		public static void main(String[] args) {
			
			int friendOne = 0;
			int friendTwo = 0;
			int friendThree = 0;
			Scanner input = new Scanner(System.in); 

		System.out.println("How old is your first friend?");
			friendOne = input.nextInt();
		
		System.out.println("How old is your second friend?");
			friendTwo = input.nextInt();
			
		System.out.println("How old is your third friend?");
			friendThree = input.nextInt();
			
			int combinedAges = friendOne + friendTwo + friendThree;
		
		System.out.println("Together, your friends are" + combinedAges + "years old.");

		}
	}


