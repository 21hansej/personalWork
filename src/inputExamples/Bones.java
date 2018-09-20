package inputExamples;

import java.util.Scanner;

public class Bones {

	public static void main(String[] args) {
		int bonesBroken = 0;
		Scanner input = new Scanner(System.in);
	System.out.println("How many bones have you broken?");
		bonesBroken = input.nextInt();
	System.out.println("You have broken " + bonesBroken + " bones.");	
	

	}

}
