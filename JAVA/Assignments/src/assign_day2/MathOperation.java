package assign_day2;

import java.util.Scanner;

public class MathOperation {
	private int X;
	private int Y;
	private double R;
	
	public void init() {
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		System.out.println("Enter value of X :"+X);
		Y = s.nextInt();
		System.out.println("Enter value of X :"+Y);
	}
	public void add() {
		R = X+Y;
	}
	public void multiply() {
		R = X*Y;
	}
	public void power() {
		R = Math.pow(X,R);
	}
	public void display() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.init();
		m.add();
//		m.multiply();
//		m.power();
//		m.display();
	}
}
