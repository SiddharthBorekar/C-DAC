package assign_2;

import java.util.Scanner;

public class MathOperation {
	private int X;
	private int Y;
	private double R;
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of X :");
		X = s.nextInt();
		
		System.out.println("Enter value of X :");
		Y = s.nextInt();
	}
	public void add() {
		R = X+Y;
	}
	public void multiply() {
		R = X*Y;
	}
	public void power() {
		R = Math.pow(X,Y);
	}
	public void display() {
		System.out.println(R);
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.init();
		
		m.add();
		m.display();
		
		m.multiply();
		m.display();
		
		m.power();
		m.display();
	}
}
