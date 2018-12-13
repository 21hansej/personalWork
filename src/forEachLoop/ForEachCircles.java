package forEachLoop;
import java.util.Scanner;
import arrays.Circle;
import java.util.ArrayList;
public class ForEachCircles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Circle> radii = new ArrayList<Circle>(10);
		
		for(Circle i : radii){
			System.out.println("What is the radius?");
			double radius = input.nextDouble();
			radii.add(new Circle(radius));
			
		}
		

	}

}
