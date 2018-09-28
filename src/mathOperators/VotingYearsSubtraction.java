package mathOperators;

import java.util.Scanner;

public class VotingYearsSubtraction {

	public static void main(String[] args) {
		
			int age = 0;
			Scanner input = new Scanner(System.in); 
	
		System.out.println("How old are you?");
			age = input.nextInt();
		
			int votingAge = 18 - age;
		
		System.out.println("You will be able to vote in " + votingAge + " years.");

	}

}

