package BasicMath;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not :");
		int num = s.nextInt();

		for (int i=2;i*i<=num;i++) {
			if (num % i == 0) {
				System.out.println(num+" Not a Prime number");
				return;
			}
		}
		System.out.println(num+" Is a prime number");
	}
}
