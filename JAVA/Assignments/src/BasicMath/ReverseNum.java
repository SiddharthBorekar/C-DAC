package BasicMath;
import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter numbers :");
		int num = s.nextInt();

		int rev = 0;
		System.out.println("Reverse of your number :");
		while(num != 0) {
		int digit = num % 10;
		rev = rev * 10 + digit;
		num = num / 10;
		}
		
		
		
		System.out.println(rev);
	}
}
