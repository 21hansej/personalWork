package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNamesArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> students = new ArrayList<String>();
		
		
		for (int i = 0; i < 50; i++){
			System.out.println("Enter a name");
			String name = input.nextLine();
			students.add(name);
			}
		if (students.size() > 0){
		String junkOne = students.remove(0);
		}
		if (students.size() > 0){
			String junkTwo = students.remove(students.size() -1);
			}
		for (int i = 0; i < students.size(); i++){
		System.out.println(students.get(i));
		}
	}

}
