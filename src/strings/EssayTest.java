package strings;
import java.util.Scanner;
public class EssayTest {

	public static void main(String[] args) {
		Essay essay = new Essay();
		Scanner input = new Scanner(System.in);
		essay.setName();
		essay.setText();
		input.next();
		essay.returnLastName();
		essay.firstNameNum();
		essay.xIncluded();
		essay.textLengthReturn();

	}

}
