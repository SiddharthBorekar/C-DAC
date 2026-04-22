package assign_2;

import java.util.Scanner;

public class AreaOfCircle {
	private int radius;
	private double area;
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a radius");
		radius = s.nextInt();
	}
	public void calc() {
		area = 3.14*(radius*radius);
	}
	public void display() {
		System.out.println("Area of Circle is :"+area);	}
		
	public static void main(String[] args) {
		AreaOfCircle ac = new AreaOfCircle();
		ac.init();
		ac.calc();
		ac.display();
	}
}
