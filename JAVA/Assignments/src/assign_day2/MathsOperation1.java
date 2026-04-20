package assign_day2;

import java.util.Scanner;

public class MathsOperation1 {
	private int a;
	private int b;
	private float x;
	private float y;
	private float z;
	private double p;
	private int q;
	private int num;
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Integer :");
		a = s.nextInt();
		
		System.out.println("Enter Second Integer :");
		b = s.nextInt();
		
		System.out.println("Enter first float value :");
		x = s.nextFloat();
		
		System.out.println("Enter Second float value :");
		y = s.nextFloat();
		
		System.out.println("Enter Third float value :");
		z = s.nextFloat();
		
		System.out.println("Enter First Double value :");
		p = s.nextDouble();
		
		System.out.println("Enter first int value :");
		q = s.nextInt();
		
		System.out.println("Enter a size of an Array");
		num = s.nextInt();
		
	}
	
	public void multi() {
		int mul = a * b;
		System.out.println(mul);
		
		float mulflot = x * y * z;
		System.out.println(mulflot);
		
		double mulDouble = p * q;
		System.out.println(mulDouble);
		
	}
	public void multiply(int... a)
	{
		int res = 1;
		for(int i =0;i < a.length; i++)
		{
			res = a[i] * res;
		}
		for(int s : a)
		{
			System.out.print(s+" ");
		}
		System.out.println("\nMultiplication of given Array is: "+res);
	}
	
	public static void main(String[] args) {
		MathsOperation1 m1 = new MathsOperation1();
		int arr[] = new int[m1.num];
		for(int i=0;i<=m1.num;i++) {
			System.out.println(i);
		}
		m1.init();
		m1.multi();
		
	}
	
}
