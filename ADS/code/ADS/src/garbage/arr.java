package garbage;

import java.util.Scanner;

public class arr {
	public static void main(String[] args) {
//		int arr[] = {2,3,10,4};
		
//		System.out.println(arr[2]);
		
	
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//		}
		 
		
//		for(int val: arr) {
//			System.out.println(val);
//		}
		
//		int n = arr.length;
//		int sum = 0;
//		for(int i=0;i<n;i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum of Array is :"+sum);
//		
//		int mul = 1;
//		for(int i=0;i<arr.length;i++) {
//			mul = mul * arr[i];
//		}
//		System.out.println(mul);
		
//		int arr[] = {2,3,10,4,-8};
		
//		int max = arr[0];
//		for(int val : arr) {
//			if(val > max)
//				max = val;
//			
//		}
//		System.out.println(max);
		
		
		
//		int min = arr[0];
//		for(int val : arr) {
//			if(min > val)
//				min = val;
//		}
//		System.out.println(min);
		
		
		
		
		//2D array
		
//		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
//		
////		System.out.println(matrix[1][2]);
//		
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j<matrix[i].length;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		//jacked array
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number of row : ");
		int row = s.nextInt();
		System.out.println("Enter number of colomn : ");
		int col = s.nextInt();
		int matrix [][] = new int[row][col];
		
		System.out.println("Enter matrix element :");
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		int [][]arr = new int[5][];
//		int sum = 0;
//		System.out.println("Enter number of columns for each row: ");
//		for(int i = 0; i < arr.length; i++)
//		{
//			int col = sc.nextInt();
//			arr[i] =  new int[col];
//		}
//		System.out.println("Enter Array Elements: ");
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//				sum += arr[i][j]; 
//			}
//			System.out.println();
//		}
////		for(int i[] : arr)
////		{
////			for(int j : i)
////			{
////				System.out.print(j);
////				 
////			}
////			System.out.println();
////		}
//		System.out.println("Sum of elements: "+sum);
//		sc.close();
		
		
		
	}
	
}
