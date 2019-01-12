package oop;

public class Rectangle {

	private double length = 0;
	private double width = 0;
	
	public Rectangle(){
		
	}
	public double getLength(){
		
		return length;
		
	}
	
	public void setLength(double newLength){
		
		length = newLength;
		
	}
	public double getWidth(){
		
		return width;
		
	}
	
	public void setWidth(double newWidth){
		
		width = newWidth;
		
	}
	
	public void perimeter(double perimeter){
		
		perimeter = 2 * length + 2 * width;
	}
	
	public void area(double area){
		area = length * width;
	}
	
}
