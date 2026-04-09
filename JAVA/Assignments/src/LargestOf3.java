//Write a program to find the largest of three numbers. 
import java.util.Scanner;
public class LargestOf3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers :");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if(x > y && x > z) {
			System.out.println("First number is :"+x+"Largest");
		}else if(y > x && y > z) {
			System.out.println("Second number is :"+y+"largest");
		}else {
			System.out.println("Third number is :"+z+"largest");
		}
	}
}