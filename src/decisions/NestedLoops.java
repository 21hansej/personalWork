package decisions;

public class NestedLoops {

	public static void main(String[] args) {
		int counter = 0;
		int process = 0;
		int divisor = 0;
		int most = 0;
		int largest = 0;
		
		for (counter = 1; counter <= 1000; counter++){
			divisor = 0;
			for (process= 1; process <= counter; process++){
				if (counter % process == 0){
				divisor++;
				}
				if(divisor > most) {
					most = divisor;
					largest = process;
				}
			}
		
		}
		System.out.println("The number with the most divisors is: " + largest);
	}

}
