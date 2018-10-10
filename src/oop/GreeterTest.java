package oop;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter joe = new Greeter();
		
		joe.sayHello();
		System.out.println(joe.getAge());
		joe.setAge(67);
		System.out.println(joe.getAge());
	
	}

}
