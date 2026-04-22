package assign_3;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int[5][];
		int sum = 0;
		System.out.println("Enter number of columns for each row: ");
		for(int i = 0; i < arr.length; i++)
		{
			int col = sc.nextInt();
			arr[i] =  new int[col];
		}
		System.out.println("Enter Array Elements: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j]; 
			}
			System.out.println();
		}
//		for(int i[] : arr)
//		{
//			for(int j : i)
//			{
//				System.out.print(j);
//				 
//			}
//			System.out.println();
//		}
		System.out.println("Sum of elements: "+sum);
		sc.close();
			
	}
}