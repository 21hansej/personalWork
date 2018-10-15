package oop;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car momsCar = new Car();
		Car dadsCar = new Car();
		Car kidsCar = new Car();
		
		dadsCar.drive();
		momsCar.fillTank();
		kidsCar.drive();
		dadsCar.fillTank();

	}

}
