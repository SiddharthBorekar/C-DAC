package assign_day1;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print factorial");
		int num = s.nextInt();
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
//			System.out.println(i);
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
