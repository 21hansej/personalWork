package strings;
import java.util.Scanner;
public class PasswordVerification {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean verified = false;
		String password;
		String verify;
		
		System.out.println("Enter a password.");
		password = input.nextLine();
		System.out.println("Verify password.");
		verify = input.nextLine();
		
		while (!password.equals(verify)) {
			System.out.println("Passwords do not match.");
			System.out.println("Enter a password.");
			password = input.nextLine();
			System.out.println("Verify password.");
			verify = input.nextLine();
			
		}
		System.out.println("Verified");
	}

}
