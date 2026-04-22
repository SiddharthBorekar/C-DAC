package assign_4;

import java.util.Scanner;

public class BhkMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		TwoBhk arr [] = new TwoBhk[2];

		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter area 1: ");
			double area1 = s.nextDouble();
			System.out.println("Enter area 2: ");
			double area2 = s.nextDouble();
			System.out.println("Enter Hall Area: ");
			double hallArea = s.nextDouble();
			System.out.println("Enter Price: ");
			double price = s
					.nextDouble();
			
			arr[i] = new TwoBhk(area1,area2,hallArea, price);
		}
		
		for(TwoBhk t : arr)
		{
			System.out.println(t);
		}
		
		
		double totalAmt = 0;
		for(int i = 0; i < arr.length; i++)
		{
			totalAmt += arr[i].getPrice();
		}
		System.out.println("The total amount of all flats: "+totalAmt);
	}

}