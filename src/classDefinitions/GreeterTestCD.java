package classDefinitions;
import oop.Greeter;
import java.util.ArrayList;
import java.util.Scanner;
public class GreeterTestCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many greeters?");
			int greeterNum = input.nextInt();
			
		ArrayList<Greeter> greeters = new ArrayList<Greeter>();
		
		for (int i = 0; i < greeterNum; i++){
			greeters.add(new Greeter());
		}
		for (Greeter i: greeters){
			System.out.println(i.getAge());
		}
	
		

	}

}
