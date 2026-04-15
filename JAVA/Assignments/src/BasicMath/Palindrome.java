package BasicMath;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter numbers :");
		int num = s.nextInt();
		
		int original = num; 
		int rev = 0;
		
		while(num != 0) {
		int digit = num % 10;
		rev = rev * 10 + digit;
		num = num / 10;
		}
		if (original == rev) {
			System.out.println(original+" : is a Palindrome");
		}else {
			System.out.println(original+" : is a not Palindrome");
		}
	}
}
