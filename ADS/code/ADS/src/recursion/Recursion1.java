package recursion;

public class Recursion1 {
	
	public static void printnum(int n) {
		if(n == 0) 
		return;
		
		System.out.println(n);
		printnum(n-1);
	}

//print numbers from 1 to 5
	public static void printNumbers(int n) {
		if(n == 6)
			return;
		System.out.println(n);
		printNumbers(n+1);
	}

//print sum of n natural numbers
	public static void printsum(int i,int n,int sum) {
		if(i > n) {
//			sum = sum + i;
			System.out.println(sum);
			return;
		}
		sum = sum + i;

		System.out.println(i);
		printsum(i+1,n,sum);
			return;
	}
	
	public static int sum(int a[],int i) {
		if(i >= a.length) {
			return 0;
		}
		
		System.out.println(a[i]);
		return a[i] + sum(a,i+1);
	}
	
	public static int star(int m,int i) {
		if(i == 0)
			return 0;
		System.out.println("*");
		
	}

	public static void main(String[] args) {

		printnum(5);
		System.out.println();
//		printNumbers(1);
		System.out.println();
//		printsum(1, 5, 1);
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int result = sum(arr,0);
		System.out.println("Result = "+result);
	}
}
