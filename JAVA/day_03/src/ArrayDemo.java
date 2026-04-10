import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = s.nextInt();
		int[] a = new int [size];
		
		System.out.println("Enter any"+size+"Elements:");
		for (int i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Array Element are:");
		for(int i:a) {
			System.out.println(i);
		}s.close();
	}
}