package strings;
import java.util.Scanner;
public class Essay {

		Scanner input = new Scanner(System.in);
		String aFName;
		String aLName;
		String text;;
		boolean contain;
		int wordCount;
		int index;
		
		public Essay(){
			contain = false;
			wordCount = 1;
			index = 0;
		}
		public void setName(){
			System.out.println("Enter author's first and last name.");
			aFName = input.next();
			aLName = input.next();
			System.out.println(aFName);
			System.out.println(aLName);
			
		}
		public void setText(){
			System.out.println("Enter your text.");
			text = input.nextLine();
			
			
		}
		public void returnLastName(){
			System.out.println(aLName.toLowerCase());
			
		}
		public void firstNameNum(){
			System.out.println(aFName.length());
		}
		public void xIncluded(){
			if (aFName.contains("X") == true || aLName.contains("X") == true){
			contain = true;
			System.out.println("Name contains X.");
			}
		}
		public void textLengthReturn(){
			for(index = 0; index < text.length(); index++){
				if (text.charAt(index) ==  ' '){
					wordCount++;
			
				}
			}
			System.out.println("Word count: " + wordCount);
		}
		
		
}

	


